package no.hib.dpf.text.scala.ct.mutable

import no.hib.dpf.text.scala.ct._
import scala.collection._;
import scala.collection.mutable.{ Set => MSet }
import scala.collection.mutable.{ Map => MMap }
import scala.collection.immutable.{ Map => IMap }
import scala.collection.immutable.{ Set => ISet }

/**
 * To construct a Igraph use this mutable Igraph implementation
 */
class MIGraph(override val tKey: FKey, 
              override val idGen: () => RId) extends MGraph(tKey, idGen) {

  val inh = MMap[Node, MSet[Node]](); //NEW inheritance relation

  //In Graph with inheritance the compatible relation is different
  override def compatibleNodes(n: Node, sn: Node): Boolean = HelperIGraph.isInClan(n, sn, inh)
  override def compatibleNodes(n: Node): Set[Node] = HelperIGraph.calculateClan(n, inh)

  /**
   * Outgoing arrows with or without the inherited once.
   */
  override def arrowsOut(n: Node, transitiv: Boolean = false): Set[Arrow] = {
    if (transitiv) {
      val rs = MSet[Arrow]()
      for (epsNode <- HelperIGraph.calculateClan(n, inh)) {
        rs ++= super.arrowsOut(epsNode, false)
      }
      rs;
    } else {
      super.arrowsOut(n, false)
    }
  }

  /**
   * Add inheritance "arrow". To be more exact it is a relationship since the 
   * "arrow" does not have a id.
   */
  def addInheritance(n: Node, sn: Node): Option[Tuple2[Node, Node]] = {
    def inv(_n: Node, _sn: Node): Boolean = {
      //Check if types are the same (required?)
      _n.t == _sn.t
    }
    if (inv(n, sn)) {
      if (inh contains n) {
        inh(n) += sn
      } else {
        inh += n -> MSet(sn)
      }
      Some((n, sn))
    } else {
      None
    }
  }

  /**
   * Create an immutable IGraph
   */
  override def immutable(): AbstractGraph = {
    val g = super.immutable().asInstanceOf[Graph]
    val i = inh.toMap map { v1 => (v1._1, v1._2.toSet) }
    IGraph(g.tKey, g.nodes, g.arrows, g.in, g.out, g.names, i)
  }

  //
  //Format:
  //
  override def toString = "mutable.IGraph(\n\t" + nodesToString + ",\n\t" + arrowsToString + ",\n\t" + inheritanceToString + "\n)";

  protected def inheritanceToString = (for (n <- inh.keySet; sn <- inh(n)) yield format(n, sn)).toSet

  def format(n: Node, sn: Node): String = "Inherit(" + format(n.id) + "->" + format(sn.id) + ")";

}
