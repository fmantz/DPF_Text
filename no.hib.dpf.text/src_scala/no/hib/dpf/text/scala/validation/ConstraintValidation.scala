package no.hib.dpf.text.scala.validation

import scala.collection.mutable.{ Map => MMap }
import scala.collection.Map
import scala.collection.Set
import no.hib.dpf.text.scala.output.EclipseLog
import no.hib.dpf.text.scala.ct._
import no.hib.dpf.text.scala.ct.mutable._

/**
 * SimpleGraph is usual graph but it is created without doing all the checks which are usually needed.
 * It is used only in the validation package with input graphs which have been already validated before.
 */
class SimpleGraph private[validation] (g: AbstractGraph) extends MIGraph(g.tKey, null) with TypeConverter {
  import scala.collection._;

  //Add all names:
  names ++= g.names
  def addNode(n: Node) = {
    //Add nodes and arrows only by arrows without any validation (ATTENTION):
    nodes += n.id -> n;
  }
  def addArrow(a: Arrow) = {
    //Add nodes and arrows only by arrows without any validation (ATTENTION):
    nodes += a.sr.id -> a.sr
    nodes += a.tg.id -> a.tg
    update(a, a.sr, out) //Add out arrows
    update(a, a.tg, in) //Add in arrows		
    arrows += a.id -> a;
  }
  override def toString = "SimpleGraph(\n\t" + nodesToString + ",\n\t" + arrowsToString + ",\n\t" + inheritanceToString + "\n)";
}

/**
 * Base functionality to validate constraints. 
 * Contains functions to fill constraint templates and work with error messages.
 */
trait ConstraintValidation extends TypeConverter {

  /**
   * Singleton container for error messages that occured through validation
   * May be moved to Editor since all other global application data is stored there.
   */
  object Errors {
    private var globalErrors: List[String] = Nil;
    private val errors: MMap[Id, String] = MMap();
    def add(e: String) = globalErrors = e :: globalErrors;
    def add(id: Id, e: String) = errors += id -> e;
    def getGlobalErrors: List[String] = globalErrors.reverse;
    def getErrors: Map[Id, String] = errors.toMap;
    def init()() = {
      globalErrors = Nil;
      errors.clear;
    }
  }
  
  /**
   * Clear all errors
   * Shortcut to the Errors object method since the object itself
   * cannot be so easily accessed in the Java Code (DPFTextCore).
   */
  def clearErrors() = Errors.init();
  
  /**
   * Validate an instance specification
   */
  def validate(is: IS):Unit;

  /**
   * Create tuples with pullbacks for each predicate and concrete OCL expression
   */
  def createValidationParts(is: IS): List[(String, AbstractGraph, String)] = {
    val cs: Set[Constraint] = is.mm.cs
    val g: AbstractGraph = is.g
    var ret: List[(String, AbstractGraph,String)] = Nil

    for (c <- cs) {

      //
      //Fast "dirty" Pullback (simply filter elements)
      //
      val temp = new SimpleGraph(g)
      val as = c.arity_d.filter(_ match { case a: Arrow => true; case _ => false }).asInstanceOf[List[Arrow]]
      val ns = c.arity_d.filter(_ match { case a: Node => true; case _ => false }).asInstanceOf[List[Node]]

      //Nodes:
      for (n <- g.iteratorNodes) {
        if (as.exists(x => g.tgraph.compatibleNodes(n.t, x.sr) || g.tgraph.compatibleNodes(n.t, x.tg))) {
          temp.addNode(n);
        }
        if (ns.exists(x => g.tgraph.compatibleNodes(n.t, x))) {
          temp.addNode(n);
        }
      }
      //Arrows:
      for (a <- g.iteratorArrows) {
        if (as.exists(x => x.id == a.t.id)) {
          temp.addArrow(a)
        }
      }

      //
      //End Pullback
      //

      //Build OCL:
      ret = (fillTemplate(c), temp.asInstanceOf[AbstractGraph], c.validator.errorMsg) :: ret
    }
    //println(ret);
    ret
  }

  /**
   * Fill (OCL) template with values so that it becomes a valid concrete (OCL) expression
   */
  def fillTemplate(c: Constraint): String = {
    try {
      
      //Create Map Variables To Vlaues: 
      val var2val = MMap[String, String]();
      val values: Array[Element] = c.arity_d.toArray
      var i = 0;

      //Add node and arrow vars:
      def id2String(id: Id): String = id.toString
      for (variable: Element <- c.validator.arity) {
        val value = values(i)
        i += 1; //next
        variable match {
          case Node(CId(varNode), _) =>
            value match {
              case Node(valNodeId, _) => var2val += varNode -> id2String(valNodeId)
              case _ => sys.error("programming error1: arity not checked!> " + variable + " to " + value)
            }
          case Arrow(CId(varArrow), Node(CId(varSrc), _), trgVar, _) =>
            value match {
              case Arrow(valArrowId, Node(valSrcId, _), Node(valTrgId, _), _) =>
                var2val += varArrow -> id2String(valArrowId)
                var2val += varSrc -> id2String(valSrcId)
                trgVar match {
                  case Node(CId(varTrg), _) => var2val += varTrg -> id2String(valTrgId)
                  case _ => sys.error("programming error2: arity not checked!> " + variable + " to " + value)
                }
              case _ =>

                sys.error("programming error3: arity not checked!> " + variable + " to " + value)
            }
          case _ => sys.error("programming error4: arity not checked!> " + variable + " to " + value)
        }
      }
      //Add parameters:
      i = 0;
      val parameter = c.ps.toArray
      for (variable: String <- c.validator.ps_var) {
        var2val += variable -> parameter(i)
        i += 1;
      }

      //Fill template:
      val oclToken = c.validator.template.split("#")
      val r = new StringBuilder;
      var oddToken = false
      for (s <- oclToken) {
        if (oddToken) {
          r ++= var2val(s);
        } else {
          r ++= s;
        }
        oddToken = !oddToken
      }
      val ret = r.mkString;
      //println(ret);
      ret;
    } catch {
      case ex:Throwable =>
        EclipseLog.log(ex)
        "Programming Error in fillOcl"
    }
  }
}