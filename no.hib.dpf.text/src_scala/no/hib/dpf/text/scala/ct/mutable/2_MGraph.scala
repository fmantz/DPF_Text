package no.hib.dpf.text.scala.ct.mutable

import no.hib.dpf.text.scala.ct._

import scala.collection._;
import scala.collection.mutable.{ Set => MSet }
import scala.collection.mutable.{ Map => MMap }
import scala.collection.immutable.{ Map => IMap }
import scala.collection.immutable.{ Set => ISet }

/**
 * To construct a (typed directed multi-) graph use this mutable graph implementation
 */
class MGraph(override val tKey: FKey, val idGen: () => RId) extends AbstractGraph() with TypeConverter {

  //Invariant:
  if (null == tgraph) { sys.error("mutable Graph without meta-graph initialized!") }

  //
  //Use mutable data structures:
  //
  
  override val nodes = MMap[EId, Node]()
  override val arrows = MMap[EId, Arrow]()
  override val in = MMap[Node, MMap[TypeArrow, MSet[Arrow]]]()
  override val out = MMap[Node, MMap[TypeArrow, MSet[Arrow]]]()
  override val names = MMap[EId, String]()

  /**
   * Add node to the graph
   */
  def addNode(nameO: Option[String], t: TypeNode, id: EId = idGen()): Option[Node] = {
    def inv(_n: Node): Boolean = {
      null != _n.id && //Id exist
        (t == TypeArrow.TAttribute || //Node has a valid type (Attribute)  
          (tgraph contains _n.t));   //Node has a valid type 
    }
    //New:
    val n = Node(id, t)
    if (inv(n)) {
      nameO match {
        case Some(name) => names += n.id -> name
        case None => if (t != TypeArrow.TAttribute) {
          names += n.id -> "NN"
        }
      }
      nodes += n.id -> n;
      Some(n);
    } else None;
  }
  
  /**
   * Add an arrow to the graph
   */
  def addArrow(name: String, sr: Node, tg: Node, t: TypeArrow, id: EId = idGen()): Option[Arrow] = {
    //Invariant:	
    def inv(_a: Arrow): Boolean = {
      _a.id != null && //Arrow needs id
        tgraph.compatibleNodes(_a.sr.t, _a.t.sr) && //Check source node type compatible 
        tgraph.compatibleNodes(_a.tg.t, _a.t.tg) && //Check target node type compatible
        (tgraph contains _a.t) &&                   //Check if arrow exist in metamodel
        (this contains _a.sr) &&                     //Check if src node exist in graph 
        (this contains _a.tg)                        //Check if tg  node exist in graph
    }
    //New:
    if (t == TypeArrow.TAttribute) {
      addAArrow(name, sr, tg, id)
    } else {
      val a = Arrow(id, sr, tg, t)
      addArrow(a, name, inv)
    }
  }
  
  /**
   * Add an attribute arrow to the graph
   */
  private def addAArrow(name: String, sr: Node, tg: Node, id: EId = idGen()): Option[Arrow] = {
    //Invariant:	
    def inv(_a: Arrow): Boolean = {
      //Check Type of tg node:  
      def check = {
        _a.tg match {
          case Node(_, TypeNode.TAttribute) => true
          case _ => false
        }
      }
      null != _a.id && //Check if id exist
        check && (this contains _a.sr) //Check if sr node exist in graph 								 						    	
    }
    //New:
    val a = Arrow(id, sr, tg, TypeArrow.TAttribute)
    val o = addArrow(a, name, inv)
    o match {
      case Some(_) => /*Save Attributes types like "String" also if they occure*/
        val n = a.tg
        val isAttr = n match {
          case Node(_, TypeNode.TAttribute) => true
          case _ => sys.error("Node is not an attribute node!")
        }
        if (isAttr) {
          nodes += n.id -> n;
          names += n.id -> n.id.formatV
        }
      case _ => /* do nothing */
    }
    o;
  }
  private def addArrow(a: Arrow, name: String, inv: Arrow => Boolean): Option[Arrow] = {
    if (inv(a)) {
      //Add Arrow:
      names += a.id -> name
      arrows += a.id -> a
      update(a, a.sr, out) //Add out arrows
      update(a, a.tg, in)  //Add in arrows	
      Some(a)
    } else {
      None
    }
  }
  
  /**
   * Update in- and outgoing maps for nodes 
   */
  protected def update(_a: Arrow, _n: Node, _h: MMap[Node, MMap[TypeArrow, MSet[Arrow]]]): Unit = {
    if (_h contains _n) {
      val m = _h(_n)
      if (m contains _a.t) {
        m(_a.t) += _a
      } else {
        val s = MSet[Arrow](_a) //put arrow in set s 
        m += _a.t -> s          //put set into hashmap by key arrow-type  
      }
    } else {
      val m = MMap[TypeArrow, MSet[Arrow]]()
      val s = MSet[Arrow](_a) //put arrow in set s
      m += _a.t -> s          //put set into hashmap by key arrow-type  
      _h += _n -> m           //put hashmap in hashmap by key node 
    }
  }
 
  override def arrowsIn(n: Node, t: TypeArrow): Set[Arrow] = if (in contains n) Set(in(n)(t) toSeq: _*) else Set[Arrow]();
  override def arrowsOut(n: Node, t: TypeArrow): Set[Arrow] = if (out contains n) Set(out(n)(t) toSeq: _*) else Set[Arrow]();

  /**
   * Create an immutable graph
   */
  def immutable(): AbstractGraph = {
    val ng = this
    def toInMut(_m: Map[Node, Map[TypeArrow, Set[Arrow]]]): IMap[Node, IMap[TypeArrow, ISet[Arrow]]] = {
      _m.toMap map { v1 => (v1._1, (v1._2.toMap map (v2 => (v2._1, ISet(v2._2 toSeq: _*))))) }
    }
    val i = toInMut(ng.in)
    val o = toInMut(ng.out)
    val n: IMap[EId, String] = IMap(ng.names toSeq: _*)
    Graph(ng.tKey, IMap(ng.nodes toSeq: _*), IMap(ng.arrows toSeq: _*), i, o, n)
  }

  /**
   * Rename any graph element
   */
  //TODO Make available in the editor
  def rename(id: EId, newName: String) {
    names.put(id, newName)
  }

  //
  //Format:
  //
  override def toString = "mutable.Graph(\n\t" + nodesToString + ",\n\t" + arrowsToString + "\n)";
}
