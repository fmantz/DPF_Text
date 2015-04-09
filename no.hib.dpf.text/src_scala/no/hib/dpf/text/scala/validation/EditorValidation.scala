package no.hib.dpf.text.scala.validation;

import no.hib.dpf.text.scala.ct._
import no.hib.dpf.text.scala.ct.mutable._
import no.hib.dpf.text.scala.output.EditorOutput
import no.hib.dpf.text.scala.output.EMFOutput
import no.hib.dpf.text.scala.output.GraphVizOutput
import no.hib.dpf.text.scala.editor.Editor

import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }

/**
 * Editor validation produces the error messages in the editor that are shown if e.g.
 * the typing is not correct. How this is done here may be improved in the future.
 * The class is the outcome of a major refactoring from a Scala parser-combinator-based
 * tool to a XText-based tool.
 */
class EditorValidation extends TypeConverter {

  /**
   * "Raw" elements, produced by the validation methods but not added to the graph yet.
   */
  trait RElement
  case class RNode(name: Option[String],
    id: Option[EId],
    t: TypeNode) extends RElement
  case class RArrow(name: String,
    id: Option[EId],
    sr: RNode,
    tg1: Option[RNode],
    tg2: Option[Node],
    t: TypeArrow) extends RElement

  /**
   * Parse Result not added to the graph to be build
   */
  case class RParseResult(element: Option[RElement], error: Option[String]);

  /**
   * Parse Result added to the graph to be build
   */
  case class ParseResult(element: Option[Element], error: Option[String]);

  /**
   * Create a RNode and optionally an error message
   */
  protected def createRNode(name: String, id: Option[EId], t: String, typeId: Option[EId]): RParseResult = {
    typeId match {
      case None =>
        if ("_" == t) {
          RParseResult(Some(RNode(Some(name), id, TypeNode.TJoker)), None);
        } else {
          val result = Editor.curTS.g.findNode(t)
          val ty =
            result match {
              case None => return RParseResult(None, Some("Node Type does not exit! t=" + t));
              case Some(x) => x
            }
          RParseResult(Some(RNode(Some(name), id, ty)), None);
        }
      case Some(tId) =>
        val result = Editor.curTS.g.getNode(tId)
        val ty =
          result match {
            case None => return RParseResult(None, Some("Node Type does not exit! id=" + tId));
            case Some(x) => x
          }
        RParseResult(Some(RNode(Some(name), id, ty)), None);
    }
  }

  /**
   * Create a RArrow and optionally an error message
   */
  protected def createRArrow(name: String, id: Option[EId], n1: RNode, n2: RNode, t: String, typeId: Option[EId]): RParseResult = {
    typeId match {
      case None =>
        if ("_" == t) {
          RParseResult(Some(RArrow(name, id, n1, Some(n2), None, TypeArrow.TJoker)), None);
        } else {
          val result = Editor.curTS.g.findArrow(t, n1.t, n2.t)
          val ty = result match {
            case None => return RParseResult(None, Some("Type does not exit! t=" + t + " sr=" + n1.t + " tg=" + n2.t));
            case Some(x) => x
          }
          RParseResult(Some(RArrow(name, id, n1, Some(n2), None, ty)), None);
        }
      case Some(tId) =>
        val result = Editor.curTS.g.getArrow(tId)
        val ty = result match {
          case None => return RParseResult(None, Some("Type does not exit! id=" + tId))
          case Some(x) => if (!Editor.curTS.g.compatibleNodes(n1.t, x.sr) || !Editor.curTS.g.compatibleNodes(n2.t, x.tg)) {
            return RParseResult(None, Some("Type with id=" + tId + " is not compatible with source or target!"));
          } else x
        }
        RParseResult(Some(RArrow(name, id, n1, Some(n2), None, ty)), None);
    }
  }

  /**
   * Create a RArrow for an inheritance relationship and optionally an error message
   */
  protected def convertRInheritanceRelation(n1: RNode, n2: RNode): RParseResult = {
    if (n1.t != n2.t) return RParseResult(None, Some("Nodes " + n1.t + " and " + n2.t + " must be equal!"));
    RParseResult(Some(RArrow("", None, n1, Some(n2), None, TypeArrow.TInheritance)), None);
  }

  /**
   * Create a RArrow for an attribute and optionally an error message
   */
  protected def convertRAttributeType(name: String, id: Option[EId], n1: RNode, at: TypeNode, t: String): RParseResult = {
    if ("*" != t) return RParseResult(None, Some("Attribute arrow has to have type *"));
    RParseResult(Some(RArrow(name, id, n1, None, Some(at), TypeArrow.TAttribute)), None);
  }

  /**
   * Create a RArrow for an attribute value and optionally an error message
   */
  protected def createRAttributeValue(name: String, id: Option[EId], n1: RNode, rav: String, isVariable: Boolean, t: String, typeId: Option[EId]): RParseResult = {
    val result = typeId match {
      case None => Editor.curTS.g.findArrow(t, n1.t)
      case Some(tId) => Editor.curTS.g.getArrow(tId)
    }
    val ty = result match {
      case None => return RParseResult(None, Some("Attribute does not exit! t=" + t + " sr=" + n1.t));
      case Some(x) => x
    }
    //Variable:
    if (isVariable) {
      val variable = RNode(None, Some(AVariable(rav)), ty.tg)
      return RParseResult(Some(RArrow(name, id, n1, Some(variable), None, ty)), None); //
      //Value:
    } else {
      try {
        val value = TypeP.toValue(ty.tg, rav)
        val v = RNode(None, Some(value), ty.tg) //Only return inside Arrow (is not a problem here)
        return RParseResult(Some(RArrow(name, id, n1, Some(v), None, ty)), None); //
      } catch {
        case ex: Throwable => RParseResult(None, Some(ex.getMessage()));
      }
    }
  }

  /**
   * Create an graph node and optionally an error message
   */
  protected def createNode(rn: RNode): ParseResult = {
    rn match {
      case RNode(Some(name), Some(nId), ty) =>
        Editor.curMGraph.getNode(nId) match {
          case Some(n) => if (name != Editor.curMGraph.names(n.id)) {
            ParseResult(None, Some("Node with id=" + n.id + " must have a unique name."));
          } else {
            ParseResult(Some(n), None);
          }
          case None => Editor.curMGraph.addNode(Some(name), ty, nId) match {
            case None => ParseResult(None, Some("Node could be created:" + name + ":" + ty));
            case Some(x) => ParseResult(Some(x), None);
          }
        }
      case RNode(Some(name), None, ty) =>
        Editor.curMGraph.findNode(name) match {
          case Some(x) => ParseResult(Some(x), None);
          case None => Editor.curMGraph.addNode(Some(name), ty) match {
            case None => ParseResult(None, Some("Node could be created:" + name + ":" + ty));
            case Some(x) => ParseResult(Some(x), None);
          }
        }
      case RNode(None, Some(value), ty) =>
        Editor.curMGraph.addNode(None, ty, value) match {
          case Some(x) => ParseResult(Some(x), None);
          case None => sys.error("Programming sys.error")
        }
      case _ => sys.error("Programming sys.error")
    }
  }

  /**
   * Create an graph arrow and optionally an error message
   */
  protected def createArrow(ra: RArrow): ParseResult = {
    ra match {

      //Inheritance Relation:  
      case RArrow(_, None, rn1, Some(rn2), None, TypeArrow.TInheritance) =>

        val n1 = createNode(rn1) match {
          case ParseResult(Some(n), None) => n.asInstanceOf[Node];
          case r @ ParseResult(None, _) => return r;
          case _ => sys.error("Programming sys.error");
        }
        val n2 = createNode(rn2) match {
          case ParseResult(Some(n), None) => n.asInstanceOf[Node];
          case r @ ParseResult(None, _) => return r;
          case _ => sys.error("Programming sys.error");
        }

        Editor.curMGraph.addInheritance(n1, n2) match {
          case None => ParseResult(None, Some("Inheritance Relation could not be established:" + n1 + "->" + n2))
          case Some(x) => ParseResult(None, None);
        }

      //Usual arrow:
      case RArrow(name, None, rn1, Some(rn2), None, ty) =>

        val n1 = createNode(rn1) match {
          case ParseResult(Some(n), None) => n.asInstanceOf[Node];
          case r @ ParseResult(None, _) => return r;
          case _ => sys.error("Programming sys.error");
        }
        val n2 = createNode(rn2) match {
          case ParseResult(Some(n), None) => n.asInstanceOf[Node];
          case r @ ParseResult(None, _) => return r;
          case _ => sys.error("Programming sys.error");
        }

        Editor.curMGraph.findArrow(name, n1, n2) match {
          case Some(x) => ParseResult(Some(x), None);
          case None =>
            Editor.curMGraph.addArrow(name, n1, n2, ty) match {
              case None => ParseResult(None, Some("Arrow could not be created:" + name + " " + n1 + "->" + n2 + ":" + ty))
              case Some(x) => ParseResult(Some(x), None);
            }
        }
      case RArrow(name, Some(id), rn1, Some(rn2), None, ty) =>

        val n1 = createNode(rn1) match {
          case ParseResult(Some(n), None) => n.asInstanceOf[Node];
          case r @ ParseResult(None, _) => return r;
          case _ => sys.error("Programming sys.error");
        }
        val n2 = createNode(rn2) match {
          case ParseResult(Some(n), None) => n.asInstanceOf[Node];
          case r @ ParseResult(None, _) => return r;
          case _ => sys.error("Programming sys.error");
        }

        Editor.curMGraph.getArrow(id) match {
          case Some(x) => if (x.sr != n1 || x.tg != n2 || x.t != ty || Editor.curMGraph.names(id) != name) {
            ParseResult(None, Some("Arrow with id" + id + " must have a unique definition!"))
          } else {
            ParseResult(Some(x), None);
          }
          case None =>
            Editor.curMGraph.addArrow(name, n1, n2, ty, id) match {
              case None => ParseResult(None, Some("Arrow could not be created:" + name + " " + n1 + "->" + n2 + ":" + ty))
              case Some(x) => ParseResult(Some(x), None);
            }
        }

      //Attribute Type:		  
      case RArrow(name, None, rn1, None, Some(at), TypeArrow.TAttribute) =>
        val n1 = createNode(rn1) match {
          case ParseResult(Some(n), None) => n.asInstanceOf[Node];
          case r @ ParseResult(None, _) => return r;
          case _ => sys.error("Programming sys.error");
        }

        Editor.curMGraph.findArrow(name, n1, at) match {
          case Some(x) => ParseResult(Some(x), None);
          case None =>
            Editor.curMGraph.addArrow(name, n1, at, TypeArrow.TAttribute) match {
              case None => ParseResult(None, Some("Attribute-Arrow could not be created:" + name + " " + n1 + "->" + at + ":" + TypeArrow.TAttribute))
              case Some(x) => ParseResult(Some(x), None);
            }
        }

      case RArrow(name, Some(id), rn1, None, Some(at), TypeArrow.TAttribute) =>

        val n1 = createNode(rn1) match {
          case ParseResult(Some(n), None) => n.asInstanceOf[Node];
          case r @ ParseResult(None, _) => return r;
          case _ => sys.error("Programming sys.error");
        }

        Editor.curMGraph.getArrow(id) match {
          case Some(x) => if (x.sr != n1 || x.tg != at || x.t != TypeArrow.TAttribute || Editor.curMGraph.names(id) != name) {
            ParseResult(None, Some("Arrow with id" + id + " must have a unique definition!"));
          } else {
            ParseResult(Some(x), None);
          }
          case None =>
            Editor.curMGraph.addArrow(name, n1, at, TypeArrow.TAttribute, id) match {
              case None => ParseResult(None, Some("Attribute-Arrow could not be created:" + name + " " + n1 + "->" + at + ":" + TypeArrow.TAttribute));
              case Some(x) => ParseResult(Some(x), None);
            }
        }

      case _ => sys.error("Programming sys.error")
    }
  }

  /**
   * Create a Validator or a an error message.
   * Since a validator is not an Element a tuple has been used as return object instead of a ParseResult.
   */
  protected def createValidator(id: RId, n: String, ps_var: List[String], rarity: List[RElement], tLanguage: String, template: String, errorMsg: String): Tuple2[Option[Validator], Option[String]] = {
    var arity = for (re <- rarity) yield {
      re match {
        case RNode(Some(n), _, t) => Node(CId(n), t)
        case RArrow(name, _, RNode(Some(n1), _, t1), Some(RNode(Some(n2), _, t2)), _, ty) => Arrow(CId(name), Node(CId(n1), t1), Node(CId(n2), t2), ty)
        case RArrow(name, _, RNode(Some(n1), _, t1), _, Some(n2), ty) => Arrow(CId(name), Node(CId(n1), t1), n2, ty)
        case _ =>
          sys.error("Programming sys.error: createValidator failed!")
          return (None, Some("Validator " + n + " could not be created!"))
      }
    }
    (Some(Validator(id, n, ps_var, arity, tLanguage, template, errorMsg)), None)
  }

  /**
   * Find an existing graph node for an parsed node
   */
  protected def findNode(rn: RNode, searchGraph: AbstractGraph = Editor.curMGraph): Tuple2[Option[Node], Option[String]] = {
    rn match {
      case RNode(_, Some(nId), ty) =>
        searchGraph.getNode(nId) match {
          case Some(n) => (Some(n), None)
          case None => (None, Some("Node not found:" + rn))
        }
      case RNode(Some(name), None, ty) =>
        searchGraph.findNode(name) match {
          case Some(x) => (Some(x), None)
          case None => (None, Some("Node not found:" + rn))
        }
      case _ => sys.error("Programming sys.error findNode")
    }
  }

  /**
   * Find an existing graph arrow for an parsed node
   */
  protected def findArrow(ra: RArrow, searchGraph: AbstractGraph = Editor.curMGraph): Tuple2[Option[Arrow], Option[String]] = {
    ra match {
      //Usual arrow:
      case RArrow(name, None, rn1, Some(rn2), None, ty) =>
        val n1 = findNode(rn1, searchGraph) match {
          case (Some(n), None) => n
          case (None, Some(s)) => return (None, Some(s))
          case _ => sys.error("Programming sys.error in findArrow")
        }
        val n2 = findNode(rn2, searchGraph) match {
          case (Some(n), None) => n
          case (None, Some(s)) => return (None, Some(s))
          case _ => sys.error("Programming sys.error in findArrow")
        }
        searchGraph.findArrow(name, n1, n2) match {
          case Some(x) => (Some(x), None)
          case None => (None, Some("Arrow could not be found:" + name + " " + n1 + "->" + n2 + ":" + ty))
        }
      case RArrow(name, Some(id), rn1, Some(rn2), None, ty) =>
        val n1 = findNode(rn1, searchGraph) match {
          case (Some(n), None) => n
          case (None, Some(s)) => return (None, Some(s))
          case _ => sys.error("Programming sys.error in findArrow")
        }
        val n2 = findNode(rn2, searchGraph) match {
          case (Some(n), None) => n
          case (None, Some(s)) => return (None, Some(s))
          case _ => sys.error("Programming sys.error in findArrow")
        }
        searchGraph.getArrow(id) match {
          case Some(x) => if (x.sr != n1 || x.tg != n2 || x.t != ty || searchGraph.names(id) != name) {
            (None, Some("Arrow with id" + id + " must have a unique definition!"));
          } else {
            (Some(x), None)
          }
          case None => (None, Some("Arrow could not be found:" + name + " " + n1 + "->" + n2 + ":" + ty))
        }
      //Attribute Type:		  
      case RArrow(name, None, rn1, None, Some(at), TypeArrow.TAttribute) =>
        val n1 = findNode(rn1, searchGraph) match {
          case (Some(n), None) => n
          case (None, Some(s)) => return (None, Some(s))
          case _ => sys.error("Programming sys.error in findArrow")
        }
        searchGraph.findArrow(name, n1, at) match {
          case Some(x) => (Some(x), None)
          case None => (None, Some("Attribute-Arrow could not be found:" + name + " " + n1 + "->" + at + ":" + TypeArrow.TAttribute))
        }
      case RArrow(name, Some(id), rn1, None, Some(at), TypeArrow.TAttribute) =>
        val n1 = findNode(rn1, searchGraph) match {
          case (Some(n), None) => n
          case (None, Some(s)) => return (None, Some(s))
          case _ => sys.error("Programming sys.error in findArrow")
        }
        searchGraph.getArrow(id) match {
          case Some(x) => if (x.sr != n1 || x.tg != at || x.t != TypeArrow.TAttribute || searchGraph.names(id) != name) {
            (None, Some("Arrow with id" + id + " must have a unique definition!"))
          } else {
            (Some(x), None)
          }
          case None => (None, Some("Attribute-Arrow could not be found:" + name + " " + n1 + "->" + at + ":" + TypeArrow.TAttribute))
        }
      case _ => sys.error("Programming sys.error")
    }
  }

  /**
   * Check if there exist an inheritance relationship in the graph to be constructed.
   * Equivalent to the find methods above, however since inheritance relationships do not
   * have an Id in IGraphs only existence for inheritance relationships can be checked.
   */
  protected def checkInheritanceArrow(ra: RArrow, graph: AbstractGraph = Editor.curMGraph): ParseResult = {
    findNode(ra.sr, graph) match {
      case (Some(n1), None) =>
        ra.tg1 match {
          case Some(tRn) => findNode(tRn, graph) match {
            case (Some(n2), None) =>
              Editor.curMGraph.inh.get(n1) match {
                case None =>
                  ParseResult(None, Some("Inheritance relation does not exist! (A)"))
                case Some(sNodes) => if (!(sNodes contains n2)) {
                  ParseResult(None, Some("Inheritance relation does not exist! (B)"))
                } else {
                  //Create "real" arrow:
                  ParseResult(Some(Arrow(RId(Set[Int]()), n1, n2, TypeArrow.TInheritance)), None) /* no error */
                }
              }
            case (None, Some(m)) =>
              ParseResult(None, Some(m))
            case _ => sys.error("Programming error checkInheritanceArrow A")
          }
          case None => Editor.curMGraph.inh.get(n1) match {
            case None =>
              ParseResult(None, Some("Inheritance relation does not exist! (C)"))
            case Some(sNodes) => if (!(sNodes contains ra.tg2.get)) {
              ParseResult(None, Some("Inheritance relation does not exist! (D)"))
            } else {
              //Create "real" arrow:
              ParseResult(Some(Arrow(RId(Set[Int]()), n1, ra.tg2.get, TypeArrow.TInheritance)), None) /* no error */ }
          }
        }
      case (None, Some(m)) =>
        ParseResult(None, Some(m))
      case _ => sys.error("Programming error checkInheritanceArrow B")
    }
  }

  /**
   * Check if a constraints is mapped by a valid graph homorphism to the shape graph
   * of an validator. Returns an error message or None.
   */
  protected def checkConstraintArity(c: Constraint): Option[String] = {

    //Check numbers:
    if (c.validator.ps_var.length != c.ps.length) return Some("Number of parameter does not fit!")
    if (c.validator.arity.length != c.arity_d.length) return Some("Arity does not fit!")

    //Check types compatible:
    for (i <- Range(0, c.validator.arity.length)) {
      c.validator.arity(i) match {
        case Node(_, t1) =>
          c.arity_d(i) match {
            case Node(_, t2) => if (t1 != TypeNode.TJoker && t1 != t2) {
              "Node is not assigned to node of correct type!";
            }
            case _ => "One node of the arity is assigned an arrow!";
          }
        case Arrow(_, sr, tg, t1) =>
          c.arity_d(i) match {
            case Arrow(_, sr, tg, t2) => if (t1 != TypeNode.TJoker && t1 != t2) {
              "Arrow is not assigned to arrow of correct type!";
            }
            case _ => "One arrow of the arity is assigned a node!";
          }
        case _ => sys.error("Programming error!checkConstraintArity")
      }
    }
    //Check graph homomorphism:
    val domainArrows = c.validator.arity.filter(_.isInstanceOf[Arrow]).asInstanceOf[List[Arrow]]
    val codomainArrows = c.arity_d.filter(_.isInstanceOf[Arrow]).asInstanceOf[List[Arrow]]
    val mArrow = (domainArrows zip codomainArrows) toMap
    val mNode = MMap[Node, Node]();
    for (i <- Range(0, domainArrows.size)) {
      mNode += domainArrows(i).sr -> codomainArrows(i).sr
      mNode += domainArrows(i).tg -> codomainArrows(i).tg
    }
    for (a <- domainArrows) {
      if (!(
        mNode(a.sr) == mArrow(a).sr &&
        mNode(a.tg) == mArrow(a).tg)) {
        return Some("Signature morphism is not a valid graph homomorphism!");
      }
    }
    return None;
  }

 /**
  * Check if the version of the meta-specification is the same one as the 
  * referenced specification in the corresponding directory
  */
  protected def checkSpecVersion(info: SInfo): Option[String] = {
    try {
      val i = Editor.getSpecInfo(info.t.name, info.key.path.get)
      if (i.key.version.get.name != info.t.version.get.name) {
        return Some("meta-specification has the wrong version!")
      }
      if (i.key.version.get.isDirty()) {
        return Some("meta-specification has not been versioned yet!")
      }
    } catch {
      case t: Throwable =>
        return Some("meta-specification does not exist!")
    }
    None
  }

 /**
  * Check if the version of the signature (e.g. referenced in the specification) is the same one as the 
  * corresponding signature in the directory has 
  */
 protected def checkSignatureVersion(key: FKey): Option[String] = {
    try {
      val k = Editor.getSignatureFKey(key.name, key.path.get);
      if (key.version.get.name != k.version.get.name) {
        return Some("signature has the wrong version!")
      }
      if (k.version.get.isDirty()) {
        return Some("signature has not been versioned yet!")
      }
    } catch {
      case t: Throwable => return Some("signature does not exist!")
    }
    None
  }

}