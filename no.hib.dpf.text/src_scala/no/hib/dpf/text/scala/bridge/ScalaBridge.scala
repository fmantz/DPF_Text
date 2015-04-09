package no.hib.dpf.text.scala.bridge;

import no.hib.dpf.text.scala.DPFTextCore
import no.hib.dpf.text.scala.editor.Editor
import no.hib.dpf.text.scala.output.EditorOutput
import no.hib.dpf.text.scala.editor.EditorProposal
import no.hib.dpf.text.scala.output.EclipseLog
import no.hib.dpf.text.scala.ct._
import no.hib.dpf.text.scala.ct.mutable._
import no.hib.dpf.text.scala.validation._
import no.hib.dpf.text.scala.bridge.JavaScalaConverter._
import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import scala.collection.mutable.ListBuffer

import no.hib.dpf.text.{ DPFConstants => JConstants }
import no.hib.dpf.text.tdpf.{ DpfId => JDpfId }
import no.hib.dpf.text.tdpf.{ RId => JRId }
import no.hib.dpf.text.tdpf.{ Specification => JSpecification }
import no.hib.dpf.text.tdpf.{ Element => JElement }
import no.hib.dpf.text.tdpf.{ Node => JNode }
import no.hib.dpf.text.tdpf.{ Property => JProperty }
import no.hib.dpf.text.tdpf.{ NodeSimple => JNodeSimple }
import no.hib.dpf.text.tdpf.{ Arrow => JArrow }
import no.hib.dpf.text.tdpf.{ DpfId => JId }
import no.hib.dpf.text.tdpf.{ DataType => JDataType }
import no.hib.dpf.text.tdpf.{ Signature => JSignature }
import no.hib.dpf.text.tdpf.{ Constraint => JConstraint }
import no.hib.dpf.text.util.{ Tuple => JTuple }
import no.hib.dpf.text.util.{ CommonUtil => JCommonUtil }

import org.eclipse.jface.dialogs.{ MessageDialog => JMessageDialog }
import java.util.{ Stack => JStack }
import java.util.{ Set => JSet }
import java.util.{ List => JList }
import java.util.{ LinkedList => JLList }
import java.util.{ Map => JMap }
import java.util.{ HashMap => JHashMap }
import java.io.File
import org.eclipse.core.resources.IFile
import org.eclipse.emf.ecore.EObject

/**
 * Used to Bridge the "Java world" into the "Scala world", where the main data structures are case classes (in this application).
 * The whole process how specifications are transfered into the "Scala world" may be improved one day.
 * The implementation started with a parser using Scala's parser combinators which have been replaced by an XText based parser.
 * This has been a major refactoring which should have been more carefully engineered.
 */
object ScalaBridge extends EditorValidation {

  /**
   * Read a stack of Java specifications into the scala world.
   * Return Tuple: x=Graph as List of Strings, y=Tuple containing the Element that cases the error plus the error message
   */
  def read(stack: JStack[JTuple[String, JSpecification]], path: String): JTuple[JList[String], JList[JTuple[EObject, String]]] = {
    try {

      if (stack.empty()) {
        sys.error("No Specification!");
      }

      //init:
      Editor.initParser();

      var rSpec: JTuple[S, JList[JTuple[EObject, String]]] = null;
      var top: JTuple[String, JSpecification] = null;

      while (!stack.empty()) {
        top = stack.pop();
        try {
          rSpec = read(top.x, path, top.y);
        } catch {
          case ex: Throwable => EclipseLog.log(ex);
        }
      }

      //Create FKey:
      val specification: JSpecification = top.y
      var signatureList: List[FKey] = Nil;
      for (l <- specification.getAtomicConstraints()) {
        signatureList = FKey(
          l.getConstraintSemantic().getId(), path,
          l.getConstraintSemantic().getVersionName()) :: signatureList;
      }
      signatureList = signatureList.reverse;

      val info = Editor.getSpecInfo(top.x, path)

      //Get further information:
      val asPlainGraph: Boolean = (null != specification.getOutput()
        && specification.getOutput().contains("PLAIN"));

      val javaList = EditorOutput.serializeSpecification(rSpec.x, info, asPlainGraph).asJava

      new JTuple(javaList, rSpec.y);

    } catch {
      case ex: Throwable => EclipseLog.log(ex); throw ex;
    }
  }

  /**
   * Read a Java signature into the scala world.
   * Used to serialize the signature with missing Ids.
   */
  def read(signatureName: String, path: String, js: JSignature): JTuple[JList[String], JList[JTuple[EObject, String]]] = {
    def updateSpecificationCache(): Option[String] = {
      try {
        //Specifications may need an update
        //Remove required specifications from cache so that they are 
        //reread next time:
        var removeSpecs: List[FKey] = Nil;
        for (info <- Editor.getSpecInfos) {
          if (info.key.path == path) {
            for (sigFKey <- info.signatures) {
              //Update constraint set:
              if (sigFKey.name == signatureName) {
                removeSpecs = info.key :: removeSpecs;
              }
            }
          }
        }
        //Update Specs:
        for (k <- removeSpecs) {
          Editor.removeSpec(k)
        }
      } catch {
        case ex: Throwable => EclipseLog.log(ex)
      }
      None
    }
    try {

      if (null == js) {
        sys.error("No Signature!");
      }

      val cs = readConstraintSemantics(js, signatureName, path)

      //Specifications may need an update
      //Remove required specifications from cache so that they are 
      //reread next time:
      updateSpecificationCache();

      val fKey = Editor.getSignatureFKey(signatureName, path)

      val ls = EditorOutput.serializeSignature(cs._1.values.toList, fKey);
      new JTuple(ls, cs._3);

    } catch {
      case ex: Throwable => EclipseLog.log(ex); throw ex;
    }

  }

  /**
   * Read a specification into the scala world.
   * The meta-specifications has to be read before.
   * Note: currently are no recursive meta-specifications supported beside the DPF specification which is recursively defined.
   */
  def read(name: String, path: String, s: JSpecification): JTuple[S, JList[JTuple[EObject, String]]] = {
    try {

      val errors: JList[JTuple[EObject, String]] = new JLList[JTuple[EObject, String]];
      Editor.GCtx.next = s.getVersion().getNextNumber();
      var elements: List[Tuple2[RParseResult, EObject]] = Nil;

      //
      //Read Graph:
      //
      val mmGraphName = s.getType().getId();
      Editor.createGraph(name, path, mmGraphName);

      if (null != s.getGraph() && null != s.getGraph().getElements()) //invariant
        for (e <- s.getGraph().getElements().iterator()) {
          e match {
            case n: JNode =>
              //Consume Node:
              val curNode = convertJNode(n);
              elements = (curNode, n) :: elements

              //Consume Node-inherit:
              if (null != n.getInh()) {
                for (i <- n.getInh()) {

                  //Create node:
                  val curSimpleNode = convertJNodeSimple(i);
                  elements = (curSimpleNode, i) :: elements

                  //Add inheritance:
                  curNode.element match {
                    case Some(rn: RNode) =>
                      curSimpleNode.element match {
                        case Some(superRn: RNode) => elements = (convertRInheritanceRelation(rn, superRn), i) :: elements;
                        case _ => //do nothing
                      }
                    case _ => //do nothing
                  }

                }
              }
              //Consume Node-body:
              if (null != n.getProperties()) {
                for (p <- n.getProperties()) {
                  elements = (convertJProperty(n, p), p) :: elements;
                }
              }
            case a: JArrow =>
              //Consume Arrow:
              elements = (convertJArrow(a), a) :: elements
          }
        }

      def createNodeAndHandleError(e: EObject, rnO: Option[RElement], withId: Boolean) {
        rnO match {
          case Some(rn @ RNode(_, Some(_), _)) =>
            if (withId) {
              createNode(rn) match {
                case ParseResult(None, Some(m2)) => errors.add(new JTuple(e, m2))
                case _ => //do nothing
              }
            }
          case Some(rn @ RNode(_, None, _)) =>
            if (!withId) {
              createNode(rn) match {
                case ParseResult(None, Some(m2)) => errors.add(new JTuple(e, m2))
                case _ => //do nothing
              }
            }
          case _ => /* do nothing */
        }
      }

      //Add nodes with id
      for (e <- elements) {
        e._1 match {
          case RParseResult(rnO @ Some(RNode(_, _, _)), _) => createNodeAndHandleError(e._2, rnO, true)
          case RParseResult(None, Some(m)) => errors.add(new JTuple(e._2, m))
          case RParseResult(Some(ra @ RArrow(_, _, srO, tgO, _, _)), _) =>
            createNodeAndHandleError(e._2, Some(srO), true)
            createNodeAndHandleError(e._2, tgO, true)
          case _ => //do nothing
        }
      }
      //Add nodes without id
      for (e <- elements) {
        e._1 match {
          case RParseResult(rnO @ Some(RNode(_, _, _)), _) => createNodeAndHandleError(e._2, rnO, false)
          case RParseResult(None, Some(m)) => errors.add(new JTuple(e._2, m))
          case RParseResult(Some(ra @ RArrow(_, _, srO, tgO, _, _)), _) =>
            createNodeAndHandleError(e._2, Some(srO), false)
            createNodeAndHandleError(e._2, tgO, false)
          case _ => //do nothing
        }
      }
      //Add arrows with id
      for (e <- elements) {
        e._1 match {
          case RParseResult(Some(ra @ RArrow(_, Some(_), _, _, _, _)), _) =>
            createArrow(ra) match {
              case ParseResult(None, Some(m2)) => errors.add(new JTuple(e._2, m2))
              case _ => //do nothing
            }
          case RParseResult(None, Some(m)) => errors.add(new JTuple(e._2, m))
          case _ => //do nothing
        }
      }
      //Add arrows without id
      for (e <- elements) {
        e._1 match {
          case RParseResult(Some(ra @ RArrow(_, None, _, _, _, _)), _) =>
            createArrow(ra) match {
              case ParseResult(None, Some(m2)) => errors.add(new JTuple(e._2, m2))
              case _ => //do nothing
            }
          case RParseResult(None, Some(m)) => errors.add(new JTuple(e._2, m))
          case _ => //do nothing
        }
      }

      //Return Graph in List of StringBuffer:
      val rGraph = Editor.curMGraph.immutable();
      val cLists = readConstraints(s, path, errors)

      //Save Spec:   
      val spec = S(rGraph, cLists)
      var sName: List[FKey] = Nil;
      for (l <- s.getAtomicConstraints()) {
        sName = FKey(
          l.getConstraintSemantic().getId(), path,
          l.getConstraintSemantic().getVersionName()) :: sName;
      }

      val infoS = SInfo(name, path,
        s.getVersion().getName(),
        s.getVersion().getNumber(),
        Editor.GCtx.next,
        s.getType().getId(),
        s.getType().getVersionName(),
        sName.reverse)

      //Check meta-specification version:
      val vName = s.getType().getVersionName()
      checkSpecVersion(infoS) match {
        case Some(errorMsg) => errors += new JTuple[EObject, String](s.getType(), errorMsg)
        case None => /* do nothing */
      }

      Editor.saveSpec(infoS, spec);
      new JTuple(spec, errors)

    } catch {
      case e: Throwable => EclipseLog.log(e); throw e;
    }
  }

  /**
   * Helper methods to convert a XText generated data structure into one which has been
   * used before in the Scala parser-combinators implementation (which has been replaced).
   */
  private def convertJNode(a: JNode): RParseResult = {
    val id = a.getId();
    val t = a.getType();
    createRNode(id.getName(), jId2RId(id), t.getName(), jId2RId(t));
  }

  /**
   * Helper methods to convert a XText generated data structure into one which has been
   * used before in the Scala parser-combinators implementation (which has been replaced).
   */
  private def convertJNodeSimple(a: JNodeSimple): RParseResult = {
    val id = a.getId();
    val t = a.getType();
    createRNode(id.getName(), jId2RId(id), t.getName(), jId2RId(t));
  }

  /**
   * Helper methods to convert a XText generated data structure into one which has been
   * used before in the Scala parser-combinators implementation (which has been replaced).
   */
  private def convertJArrow(a: JArrow): RParseResult = {
    //
    //Find out which kind of arrow:
    //
    val id = a.getId();
    val t = a.getType();

    //Src Node:
    val sr = convertJNodeSimple(a.getSr()) match {
      case rs @ RParseResult(None, Some(m)) => return rs;
      case RParseResult(Some(rn: RNode), None) => rn
      case _ => sys.error("convertJArrow -> Programming Error 1")
    }
    if (null != a.getTgNode()) {
      val tg = convertJNodeSimple(a.getTgNode()) match {
        case rs @ RParseResult(None, Some(m)) => return rs;
        case RParseResult(Some(rn: RNode), None) => rn
        case _ => sys.error("convertJArrow -> Programming Error 2")
      }
      //Inheritance:
      if (null != id) {
        createRArrow(id.getName(), jId2RId(id), sr, tg, t.getName(), jId2RId(t))
      } else {
        convertRInheritanceRelation(sr, tg)
      }
    } else if (null != a.getTgValue()) {
      //Value:
      if (null != a.getTgValue().getValue()) {
        createRAttributeValue(id.getName(), jId2RId(id), sr, a.getTgValue().getValue(), false, t.getName(), jId2RId(t))
        //Variable for Value
      } else if (null != a.getTgValue().getVariableId()) {
        createRAttributeValue(id.getName(), jId2RId(id), sr, a.getTgValue().getVariableId(), true, t.getName(), jId2RId(t))
      } else {
        sys.error("Programming error")
      }
    } else {
      //Is is an AttributeType:
      convertRAttributeType(id.getName(), jId2RId(id), sr, jDT2TyeP(a.getTgDataType()), "*")
    }
  }

  /**
   * Helper methods to convert a XText generated data structure into one which has been
   * used before in the Scala parser-combinators implementation (which has been replaced).
   */
  private def convertJProperty(root: JNode, a: JProperty): RParseResult = {
    //
    //Find out which kind of arrow:
    //
    val id = a.getId();
    val t = a.getType();
    //Src Node:
    val sr = convertJNode(root) match {
      case rs @ RParseResult(None, Some(m)) => return rs;
      case RParseResult(Some(rn: RNode), None) => rn
      case _ => sys.error("convertJProperty -> Programming Error 1")
    }
    if (null != a.getTgNode()) {
      val tg = convertJNodeSimple(a.getTgNode()) match {
        case rs @ RParseResult(None, Some(m)) => return rs;
        case RParseResult(Some(rn: RNode), None) => rn
        case _ => sys.error("convertJProperty -> Programming Error")
      }
      createRArrow(id.getName(), jId2RId(id), sr, tg, t.getName(), jId2RId(t))
    } else if (null != a.getTgValue()) {
      //Value:
      if (null != a.getTgValue().getValue()) {
        createRAttributeValue(id.getName(), jId2RId(id), sr, a.getTgValue().getValue(), false, t.getName(), jId2RId(t))
        //Variable for Value
      } else if (null != a.getTgValue().getVariableId()) {
        createRAttributeValue(id.getName(), jId2RId(id), sr, a.getTgValue().getVariableId(), true, t.getName(), jId2RId(t))
      } else {
        sys.error("Programming error")
      }
    } else {
      //Is is an AttributeType:
      convertRAttributeType(id.getName(), jId2RId(id), sr, jDT2TyeP(a.getTgDataType()), "*")
    }
  }

  /**
   * Check a specification for the constraints defined in its meta-specification.
   * Returns a list of errors mapped to element ids in a String representation plus further global errors that may have been occurred.
   */
  def checkAllConstraints(s: JSpecification, path: String): JTuple[JMap[String, String], JList[String]] = {
    val rs1 = new JHashMap[String, String]();
    val rs2 = new JLList[String]();
    try {
      //Init:
      Editor.initParser();

      //Set curTS:
      val name = s.getType().getId();
      Editor.curTS = Editor.getSpec(name, path)

      val tempName = ".DummyName";
      read(tempName, path, s)

      val is = IS(Editor.curTS, Editor.getSpec(tempName, path).g)

      //Validate: //Maybe validation should not be a singleton
      if (!Editor.curTS.cs.isEmpty) {
        val validator = Editor.curTS.cs.head.validator
        validator.tLanguage match {
          case "KodKod" => KodKodValidation.synchronized {
            println("Verfiy with KodKod")

            //Empty errors:
            KodKodValidation.Errors.init();

            //Validate:
            KodKodValidation.validate(is);

            //Collect errors:
            for (e <- KodKodValidation.Errors.getErrors) {
              e._1 match {
                case rid @ RId(_) => rs1.put(rid.vToString, e._2);
                case _ => rs1.put(e._1.formatV, e._2);
              }
            }

            //Collect errors:
            for (e <- KodKodValidation.Errors.getGlobalErrors) {
              rs2.add(e);
            }
          }
          case _ => OCLValidation.synchronized {
            println("Verfiy with OCL")

            //Empty errors:
            OCLValidation.Errors.init();

            //Validate:
            OCLValidation.validate(is);

            //Collect errors:
            for (e <- OCLValidation.Errors.getErrors) {
              e._1 match {
                case rid @ RId(_) => rs1.put(rid.vToString, e._2);
                case _ => rs1.put(e._1.formatV, e._2);
              }
            }

            //Collect errors:
            for (e <- OCLValidation.Errors.getGlobalErrors) {
              rs2.add(e);
            }
          }
        }
      }

    } catch {
      case ex: Throwable =>
        rs2.add("checkConstraints() " + ex.getMessage());
        ex.printStackTrace();
    }
    new JTuple(rs1, rs2);
  }

  /**
   * Read constraint semantics i.e. Signature.
   * Returns a map of validators and a list of errors that may have been occurred.
   * Furthermore a the counter for the next new Id is returned.
   * (The counter information may be removed since this information is not also saved by a call to "Editor.saveSignatureFKey")
   */
  private def readConstraintSemantics(cs: JSignature, sName: String, path: String): (Map[Id, Validator], Int, JList[JTuple[EObject, String]]) = {
    try {

      var nId = cs.getVersion().getNextNumber()
      def getNewId(): RId = { val newId = RId(Set(nId)); nId += 1; newId }

      //Vals:
      val rs = MMap[Id, Validator]();
      val errors = new JLList[JTuple[EObject, String]];

      for (jv <- cs.getValidators()) {
        try {
          val idO = jId2RId(jv.getId());
          val n = jv.getId().getName();
          var rList: List[RElement] = Nil;
          var errorFound = false;
          for (e <- jv.getArity()) {
            e match {
              case n: JNodeSimple =>
                //Consume Node:
                convertJNodeSimple(n) match {
                  case rs @ RParseResult(None, Some(m)) => errors.add(new JTuple(n, m)); errorFound = true;
                  case RParseResult(Some(rn: RNode), None) => rList = rn :: rList;
                  case _ => EclipseLog.log("readConstraintSemantics(cs:JSignature) Error 1")
                }
              case a: JArrow =>
                //Consume Arrow:
                convertJArrow(a) match {
                  case rs @ RParseResult(None, Some(m)) => errors.add(new JTuple(a, m)); errorFound = true;
                  case RParseResult(Some(ra: RArrow), None) => rList = ra :: rList;
                  case _ => EclipseLog.log("readConstraintSemantics(cs:JSignature) Error 2")
                }
              case _ => EclipseLog.log("readConstraintSemantics(cs:JSignature) Error 3")
            }
          }
          //Resolve new or existing rid
          val id = idO match {
            case Some(exId) => exId
            case None => getNewId()
          }
          createValidator(id, n, jv.getParameter_vars().toList, rList.reverse, cs.getInput().getName(), jv.getOcl(), jv.getErrorMsg()) match {
            case (Some(validator), None) => rs += (validator.id -> validator)
            case (None, Some(msg)) => errors.add(new JTuple(jv.getId(), msg));
            case _ => EclipseLog.log("readConstraintSemantics(cs:JSignature) Error 4")
          }
        } catch {
          case ex: Throwable => //ex.printStackTrace();
            EclipseLog.log(ex);
            errors.add(new JTuple(jv.getId(), ex.getMessage()));
        }
      }

      //Save SignatureKey
      try {
        Editor.saveSignatureFKey(sName, path,
          cs.getVersion().getName(),
          cs.getVersion().getNumber(), nId)
      } catch {
        case t: Throwable => EclipseLog.log(t);
      }

      (rs.toMap, nId, errors); //Constraints, next constraintId, errors
    } catch {
      case t: Throwable =>
        EclipseLog.log(t);
        throw t;
    }
  }

  /**
   * Read all constraint sections (there can be more than one) of a specification into Scala case classes.
   */
  private def readConstraints(s: JSpecification, path: String, errors: JList[JTuple[EObject, String]]): List[Set[Constraint]] = {

    //
    //Read constraint semantics:   
    //
    var validatorList: List[Map[Id, Validator]] = Nil;
    for (sT <- DPFTextCore.readSignatures(s, JCommonUtil.iResourceFromDirectory(path))) {
      try {
        validatorList = readConstraintSemantics(sT.y, sT.x, path)._1 :: validatorList
      } catch {
        case ex: Throwable =>
          val msg = "Signature could not be read! " + ex.getMessage();
          errors.add(new JTuple(s, msg));
          println(msg)
        //ex.printStackTrace();
      }
    }
    validatorList = validatorList.reverse

    //Check versions of constraint semantics
    for (l <- s.getAtomicConstraints()) {
      val key = FKey(l.getConstraintSemantic().getId(), path, l.getConstraintSemantic().getVersionName())
      checkSignatureVersion(key) match {
        case Some(errorMsg) => errors += new JTuple[EObject, String](l.getConstraintSemantic(), errorMsg)
        case None => /* do nothing */
      }
    }

    //
    //Read constraints + add semantics: 
    //(also check if arrow with type inheritance are correctly read)
    //
    var rs: List[Set[Constraint]] = Nil;
    var i = 0;
    for (l <- s.getAtomicConstraints()) { //invariant
      val cSet = MSet[Constraint]();
      val validator = validatorList(i);
      i += 1;
      for (c <- l.getConstraints()) {
        var arity_d: List[Element] = Nil;
        try {
          var errorFound = false;
          for (e <- c.getArity_d()) {
            e match {
              case n: JNodeSimple =>
                //
                //Consume Node:
                //
                convertJNodeSimple(n) match {
                  case rs @ RParseResult(None, Some(m)) => errors.add(new JTuple(e, m)); errorFound = true;
                  case RParseResult(Some(rn: RNode), None) => findNode(rn) match {
                    case (Some(n), None) => arity_d = n :: arity_d;
                    case (None, Some(m)) => errors.add(new JTuple(e, m)); errorFound = true;
                    case _ => sys.error("Constraint Programming Error 1")
                  }
                  case _ => sys.error("Constraint Programming Error 2")
                }
              case a: JArrow =>
                //
                //Consume Arrow:
                //
                convertJArrow(a) match {
                  case rs @ RParseResult(None, Some(m)) => errors.add(new JTuple(e, m)); errorFound = true;
                  case RParseResult(Some(ra: RArrow), None) =>
                    //Inheritance arrow:
                    if (ra.t == TypeArrow.TInheritance) {
                      checkInheritanceArrow(ra) match {
                        case ParseResult(Some(a), None) => arity_d = a :: arity_d;
                        case ParseResult(None, Some(m)) => errors.add(new JTuple(e, m)); errorFound = true;
                        case _ => sys.error("Constraint Programming Error 3")
                      }
                    } else {
                      //Usual arrow:
                      findArrow(ra) match {
                        case (Some(a), None) => arity_d = a :: arity_d;
                        case (None, Some(m)) => errors.add(new JTuple(e, m)); errorFound = true;
                        case _ => sys.error("Constraint Programming Error 4")
                      }
                    }
                  case _ => sys.error("Constraint Programming Error 5")
                }
              case _ => sys.error("Constraint Programming Error 6")
            }
          }
          if (!errorFound) {
            jId2RId(c.getType()) match {
              case Some(id) =>
                //
                //Add validator by id:
                //
                try {
                  val newC = Constraint(List(c.getParameter(): _*), arity_d.reverse, validator(id))
                  val msgO = checkConstraintArity(newC);
                  msgO match {
                    case None => cSet += newC
                    case Some(msg) => errors.add(new JTuple(c, msg));
                  }
                } catch {
                  case ex: Throwable => errors.add(new JTuple(c, "Constraint not found!"));
                }
              case None =>
                //
                //Find validator by name:
                //
                validator.values.find(_.n == c.getType().getName()) match {
                  case Some(v) =>
                    //Add found validator by name:
                    try {
                      val newC = Constraint(List(c.getParameter(): _*), arity_d.reverse, v)
                      val msgO = checkConstraintArity(newC);
                      msgO match {
                        case None => cSet += newC
                        case Some(msg) => errors.add(new JTuple(c, msg));
                      }
                    } catch {
                      case ex: Throwable => errors.add(new JTuple(c, "Constraint not found!"));
                    }
                  case None =>
                    errors.add(new JTuple(c, "Constraint does not have a validator!"));
                }
            }
          } else {
            EclipseLog.log("1. Warning: Constraint not added:>" + c.getParameter())
          }
        } catch {
          case ex: Throwable =>
            EclipseLog.log("2. Warning: Constraint not added:>" + ex.getMessage()) /* do nothing */
            EclipseLog.log(ex);
        }
      }
      rs = cSet.toSet :: rs;
    }
    rs.reverse;
  }

}