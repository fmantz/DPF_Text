package no.hib.dpf.text.scala.ct;
import scala.collection._;
import scala.collection.mutable.{ Set => MSet }
import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Queue => MQueue }
import scala.collection.immutable.{ Map => IMap }
import scala.collection.immutable.{ Set => ISet }

//
//These classes extends usual multi-graphs by inheritance 
//

/**
 * Helper methods to deal with inheritance in graphs
 */
private object HelperIGraph {

  /**
   * Check if node "sn" is a super node of node "n" 
   */
  def isInClan(n: Node, sn: Node, inh: Map[Node, Set[Node]]): Boolean = {
    val v = MSet[Id]() //Save visited nodes

    def visit(n: Node): Boolean = {
      v += n.id
      n == sn || ((inh contains n) && (inh(n) contains sn))
    }
    def visited(n: Node): Boolean = v contains n.id

    //Simple Breadth-first search
    val q = MQueue[Node]();
    q.enqueue(n)
    while (!q.isEmpty) {
      val y = q.dequeue
      if (visit(y)) {
        return true;
      }
      if (inh contains y) {
        for (sn_y <- inh(y)) {
          if (!visited(sn_y)) {
            q.enqueue(sn_y)
          }
        }
      }
    }
    false;
  }

  /**
   * Calculate the clan of a specific node:
   */
  def calculateClan(n: Node, inh: Map[Node, Set[Node]]): Set[Node] = {
    val rs = MSet[Node](n)
    def visit(n: Node): Unit = {
      if ((inh contains n) && !(rs contains n)) {
        rs ++= inh(n);
        for (sn <- inh(n)) {
          visit(sn)
        };
      }
    }
    rs
  }

}

/**
 * A graph with inheritance support as defined in the paper: 
 * Transformation of Type Graphs with Inheritance for Ensuring Security in E-Government Networks (Long Version)
 * by Hermann, F. and Ehrig, H. and Ermel, C.
 */
case class IGraph(override val tKey: FKey,
  override val nodes: IMap[EId, Node],   //Set node -> Set(super nodes)
  override val arrows: IMap[EId, Arrow], //Set
  override val in: IMap[Node, IMap[TypeArrow, ISet[Arrow]]],
  override val out: IMap[Node, IMap[TypeArrow, ISet[Arrow]]],
  override val names: IMap[EId, String],
  val inh: IMap[Node, ISet[Node]]) extends AbstractGraph() { //NEW inheritance relation

  //In Graph with inheritance the compatible relation is different
  override def compatibleNodes(n: Node, sn: Node): Boolean = HelperIGraph.isInClan(n, sn, inh)
  override def compatibleNodes(n: Node): Set[Node] = HelperIGraph.calculateClan(n, inh)

  override def arrowsOut(n: Node, transitiv: Boolean = false): Set[Arrow] = {
    if (transitiv) {
      val rs = MSet[Arrow]()
      for (epsNode <- HelperIGraph.calculateClan(n, inh)) {
        rs ++= super.arrowsOut(epsNode, false)
      }
      ISet() ++ rs;
    } else {
      super.arrowsOut(n, false)
    }
  }

  //
  //Format:
  //
  override def toString = "IGraph(\n\t" + nodesToString + ",\n\t" + arrowsToString + ",\n\t" + inheritanceToString + "\n)";

  protected def inheritanceToString = (for (n <- inh.keySet; sn <- inh(n)) yield format(n, sn)).toSet

  def format(n: Node, sn: Node): String = "Inherit(" + format(n.id) + "->" + format(sn.id) + ")";

};