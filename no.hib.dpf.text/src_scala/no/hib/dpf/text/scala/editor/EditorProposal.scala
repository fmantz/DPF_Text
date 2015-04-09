package no.hib.dpf.text.scala.editor

//Scala:
import no.hib.dpf.text.scala.ct._
import no.hib.dpf.text.scala.ct.mutable._
import no.hib.dpf.text.scala.output.EditorOutput
import scala.collection.mutable.{ Set => MSet }
import scala.collection.mutable.{Set => MSet}
import no.hib.dpf.text.scala.output.EclipseLog

/**
 * Prepare all proposals used in the auto completion of the editor
 */
object EditorProposal extends TypeConverter{
  
  /**
   * Propose constraints in a constraint section of a specification
   */
  def getProposal_Constraint(name: String, id: Option[RId], ps_var: List[String]): String = {
    val n = id match {
      case Some(id) => name + "@" + id.formatV
      case None => name
    }
    n + "(" + ps_var.mkString("\"", "\", \"", "\"") + "){}" //Parameter
  }

  /**
   * Propose all possible node types
   */
  def getProposal_AllNodeTypes(s: S): List[String] = {
    var rs: List[String] = Nil;
    val h = new EditorOutput.Helper(S(s.g.tgraph, Nil));
    for (
      n <- s.g.tgraph.nodes.values.filter(_.id match {
        case RId(_) => true;
        case _ => false;
      })
    ) {
      rs = h.getName(n) :: rs
    }
    return rs.sorted
  }

  /**
   * Propose all currently created nodes
   */
  def getProposal_AllNodes(s: S): List[String] = {
    var rs: List[String] = Nil;
    val h = new EditorOutput.Helper(s);
    for (
      n <- s.g.nodes.values.filter(_.id match {
        case RId(_) => true;
        case _ => false;
      })
    ) {
      rs = h.formatNode(n) :: rs
    }
    return rs.sorted
  }

  /**
   * Propose all arrow types staring from a source node with a specific type
   */
  def getProposal_ArrowTypes(srcTypeNode: String, srcTypeNodeId: Option[RId], s: S): List[String] = {
    var rs: List[String] = Nil;
    val h = new EditorOutput.Helper(S(s.g.tgraph, Nil));
    val n: Node = srcTypeNodeId match {
      case Some(rId) => s.g.tgraph.nodes(rId)
      case None => s.g.tgraph.findNode(srcTypeNode).get
    }
    for (
      a <- s.g.tgraph.arrowsOut(n, true).filter(_.id match {
        case RId(_) => true;
        case _ => false;
      })
    ) {
      rs = h.getName(a) :: rs
    }
    return rs.sorted
  }

  /**
   * Propose complete arrows starting from a source node. 
   * Used in the constraint section of a specification to propose graphs to be annotated.
   */
  def getProposal_CompleteArrows(srcNode: String, srcNodeId: Option[RId], s: S): List[String] = {
    var rs: List[String] = Nil;
    val h = new EditorOutput.Helper(s);
    val n: Node = srcNodeId match {
      case Some(rId) => s.g.nodes(rId)
      case None => s.g.findNode(srcNode).get
    }
    for (
      a <- s.g.arrowsOut(n, false).filter(_.id match {
        case RId(_) => true;
        case _ => false;
      })
    ) {
      rs = h.formatArrow(a, false) :: rs
    }
    return rs.sorted
  }

  /**
   * Propose nodes of the current graph which could be valid target nodes of an arrow according to their typing
   */
  def getProposal_ArrowTargetNodes(srcNodeType: String, srcNodeTypeId: Option[RId], arrowType: String, arrowTypeId: Option[RId], s: S): List[String] = {
    var rs: List[String] = Nil;
    val h = new EditorOutput.Helper(S(s.g, Nil));
    val a: Arrow = arrowTypeId match {
      case Some(rId) => s.g.tgraph.arrows(rId)
      case None =>
        val n: Node = srcNodeTypeId match {
          case Some(rId) => s.g.tgraph.nodes(rId)
          case None => s.g.tgraph.findNode(srcNodeType).get
        }
        s.g.tgraph.findArrow(arrowType, n).get
    }
    val targetNodes = MSet[Node]();
    for (
      n <- s.g.nodes.values.filter(_.id match {
        case RId(_) => true;
        case _ => false;
      })
    ) {
      if (s.g.tgraph.compatibleNodes(n.t, a.tg)) {
        targetNodes += n;
      }
    }
    for (n <- targetNodes) {
      rs = h.formatNode(n) :: rs
    }
    return rs.sorted
  }

  /**
   * Propose possible arrow target types for an arrow of a given type
   */
  def getProposal_ArrowTargetTypes(srcNodeType: String, srcNodeTypeId: Option[RId], arrowType: String, arrowTypeId: Option[RId], s: S): List[String] = {
    var rs: List[String] = Nil;
    val h = new EditorOutput.Helper(S(s.g.tgraph, Nil));
    val a: Arrow = arrowTypeId match {
      case Some(rId) => s.g.tgraph.arrows(rId)
      case None =>
        val n: Node = srcNodeTypeId match {
          case Some(rId) => s.g.tgraph.nodes(rId)
          case None => s.g.tgraph.findNode(srcNodeType).get
        }
        s.g.tgraph.findArrow(arrowType, n).get
    }
    val targetNodeTypes = MSet[Node]();
    for (
      n <- s.g.tgraph.nodes.values.filter(_.id match {
        case RId(_) => true;
        case _ => false;
      })
    ) {
      if (s.g.tgraph.compatibleNodes(n, a.tg)) {
        targetNodeTypes += n;
      }
    }
    for (n <- targetNodeTypes) {
      rs = h.getName(n) :: rs
    }
    return rs.sorted
  }
  
  /**
   * Propose all specifications in a directory as meta-specification.
   */
  def getProposal_AllSpecifications(path: String): List[String] = {
     var rs: List[String] = Nil;
     for(s <-Editor.getSpecInfos().filter { i => ((None == i.key.path || i.key.path.get == path) && !i.key.name.startsWith("."))}){
       s.key.version match{
         case Some(v) => rs = s.key.name + EditorOutput.makeVersionShort(v):: rs
         case None => /* do nothing */
       }
     }
     rs.sorted;
 }

  /**
   * Propose all signatures in a directory (to a specification).
   */
  def getProposal_AllSignatures(path: String): List[String] = {
     var rs: List[String] = Nil;
     for(key <-Editor.getSignatureFKeys().filter { k => ((None == k.path || k.path.get == path) && !k.name.startsWith("."))}){
       key.version match{
         case Some(v) => rs = key.name + EditorOutput.makeVersionShort(v):: rs
         case None => /* do nothing */
       }
     }
     rs.sorted;
  }
 
}