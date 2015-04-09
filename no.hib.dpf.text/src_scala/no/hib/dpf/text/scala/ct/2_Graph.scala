package no.hib.dpf.text.scala.ct;
import scala.collection._;
import scala.collection.mutable.{ Set => MSet }
import scala.collection.mutable.{ Map => MMap }
import scala.collection.immutable.{ Map => IMap }
import scala.collection.immutable.{ Set => ISet }


/**
 * Elements are either nodes or errors
 */
sealed trait Element {
  val id: EId
  val t: Type
}

sealed trait Type extends Element
sealed trait TypeArrow extends Type
sealed trait TypeNode extends Type


/**
 * A graph node (it can also be used as type of a node)
 */
case class Node(override val id: EId, override val t: TypeNode) extends Element with TypeNode {
  override def equals(o: Any) = o match {
    case n: Node => n.id == id
    case _ => false
  }
}

/**
 * A graph arrow (it can also be used as type of an arrow)
 */
case class Arrow(override val id: EId, sr: Node, tg: Node, override val t: TypeArrow) extends Element with TypeArrow {
  override def equals(o: Any) = o match {
    case a: Arrow => a.id == id
    case _ => false
  }
}

/**
 * A (typed) directed multi-graph
 */
case class Graph(override val tKey: FKey,
  override val nodes: IMap[EId, Node],   //Set  
  override val arrows: IMap[EId, Arrow], //Set
  override val in: IMap[Node, IMap[TypeArrow, ISet[Arrow]]],
  override val out: IMap[Node, IMap[TypeArrow, ISet[Arrow]]],
  override val names: IMap[EId, String]) extends AbstractGraph() {
  override lazy val toString = super.toString
};


/**
 * File Key, used to decouple specifications and meta-specifications
 * By the file key the meta-specifications can be retrieved. 
 * However, file keys are more general and also used for signatures.
 */
trait FKey{def name: String; def path: Option[String]; def version: Option[Version]};
object FKey { 
   def apply(name: String, path: Option[String], version: Option[Version]): FKey = { 
      if("DPF" == name){
        FKeyImpl(name,None,version) 
      }else{
        FKeyImpl(name,path,version)         
      }
   }
   def apply(name: String, path: String, version: String = null, vNo: Int = (-1), vNext: Int = (-1)): FKey = { 
      //Path for File:
      val p = if (null == path || path.isEmpty()) {
        None
      } else {
        Some(path)
      }
      //Version:
      val v = if (null != version && !version.isEmpty()) {
        Some(Version(version, vNo, vNext))
      } else {
        None
      }
      FKey(name, p, v)
   }
   private case class FKeyImpl(name: String, path: Option[String]=None, version: Option[Version]=None) extends FKey{
	    override def hashCode(): Int = (name.hashCode() + path.hashCode()) / 3;
	    override def equals(obj:Any): Boolean = {
		    if(obj.isInstanceOf[FKeyImpl]) {
		        	val o = obj.asInstanceOf[FKey]
		        	return name  == o.name && path  == o.path;  
		        }else{
		        	return false;
		    }
	    }
	}
}

/**
 * A version for a File i.e Specification or Signature.
 */
case class Version(name:String="0", no:Int=0, next:Int=1){
  def isDirty():Boolean={1 != next-no}
}


/**
 * Contains general methods useful for (typed) graphs 
 */
trait AbstractGraph {

  /**
   * All incoming arrows to a node grouped by their types
   */
  val in: Map[Node, Map[TypeArrow, Set[Arrow]]]

  /**
   * All outgoing arrows of a node grouped by their types
   */
  val out: Map[Node, Map[TypeArrow, Set[Arrow]]]

  /**
   * Set of nodes as Map for direct access
   */
  val nodes: Map[EId, Node]     		  

   /**
   * Set of arrows as Map for direct access
   */
  val arrows: Map[EId, Arrow] 

  /**
   * Names for a human reader for all elements
   */
  val names: Map[EId, String]
  
  
  /**
   * Key to the meta-"specification"
   */
  val tKey: FKey             //Key for type graph
  
  /**
   * Type graph
   */
  def tgraph: AbstractGraph =  AbstractGraph.getGraph(tKey,this)

  
  def contains(e: Element): Boolean = e match {
    case n: Node => contains(n)
    case a: Arrow => contains(a)
    case _ => sys.error("Programming error, not allowed:" + e)
  }
  def contains(a: Arrow): Boolean = (arrows contains a.id) && arrows(a.id) == a;
  def contains(n: Node): Boolean = (nodes contains n.id) && nodes(n.id) == n;

  /**
   * In Graph with inheritance the compatible relation is different, there n is compatible to sn iff n inherits from sn.
   * Hence this method is overriden in for IGraphs
   */
  def compatibleNodes(n: Node, sn: Node): Boolean = n == sn
  def compatibleNodes(n: Node): Set[Node] = Set(n)

  def findArrow(n: String, s: Node, t: Node): Option[Arrow] = arrows.values find { e => n == names(e.id) && compatibleNodes(s, e.sr) && compatibleNodes(t, e.tg) }
  def findArrow(n: String, s: Node): Option[Arrow] = arrows.values find { e => n == names(e.id) && compatibleNodes(s, e.sr) } //ForAttributeTypes
  def findNode(n: String): Option[Node] = nodes.values find { e => !e.id.isInstanceOf[AValue] && n == names(e.id) }

  def getArrow(id: EId): Option[Arrow] = arrows.get(id)
  def getNode(id: EId): Option[Node] = nodes.get(id)

  def iteratorNodes(): Iterator[Node] = nodes.values.iterator
  def iteratorArrows(): Iterator[Arrow] = arrows.values.iterator

  def arrowsIn(n: Node): Set[Arrow] = if (in contains n) Set((in(n) map { _._2 }).flatten toSeq: _*) else Set[Arrow]();
  def arrowsIn(n: Node, t: TypeArrow): Set[Arrow] = if (in contains n) in(n)(t) else Set[Arrow]();
  def arrowsOut(n: Node, transitiv: Boolean = false): Set[Arrow] = if (out contains n) Set((out(n) map { _._2 }).flatten toSeq: _*) else Set[Arrow]();
  def arrowsOut(n: Node, t: TypeArrow): Set[Arrow] = if (out contains n) out(n)(t) else Set[Arrow]();

  //
  //Format:
  //
  override def toString = "Graph(\n\t" + nodesToString + ",\n\t" + arrowsToString + "\n)";

  protected def nodesToString = (for (n <- nodes.values) yield format(n)).toSet
  protected def arrowsToString = (for (a <- arrows.values) yield format(a)).toSet

  def format(e: Element): String = e match {
    case n: Node => format(n);
    case a: Arrow => format(a);
    case _ => sys.error("Programming error, not allowed:" + e)    
  }

  def format(n: Node): String = "Node(" + format(n.id) + "," + tgraph.format(n.t) + ")";
  protected def format(n: TypeNode): String = n match {
    case n: Node => format(n)
    case o: TypeNode => o.toString
  }

  def format(a: Arrow): String = "Arrow(" + format(a.id) + "," + format(a.sr) + "->" + format(a.tg) + ":" + tgraph.format(a.t) + ")";
  protected def format(a: TypeArrow): String = a match {
    case a: Arrow => format(a)
    case o: TypeArrow => o.toString
  }

  protected def format(id: Id) = {
    id match {
      case i: RId => names(i) + "@" + i
      case o: Id => o.toString
    }
  }
  
}

/**
 * Companion object for graphs. Holds the cache of all graphs.
 * Used to retrieve type graphs.
 */
object AbstractGraph{
  var cache:(FKey => Option[AbstractGraph]) = null;
  def getGraph(k:FKey,me:AbstractGraph):AbstractGraph={
    cache(k) match{
      case Some(g) => g;
      case None    => me; //If graph is not in cache assume reflesiv graph 
    }
  }
}

/**
 * Special arrow types to deal with inheritance, attributes and self-references 
 */
object TypeArrow {
  object TSelf extends TypeArrow {
    override val id = SId(1)
    override val t = this
    override def toString = "Self";
  }
  val TAttribute = Arrow(SId(2),Node(RId(Set(0)), TypeNode.TSelf), TypeNode.TAttribute, TSelf)
  object TJoker extends TypeArrow {
    override val id = SId(3)
    override val t = TSelf
    override def toString = "_";
  }
  //Dummy:
  object TInheritance extends TypeArrow {
    override val id = SId(4)
    override val t = TypeArrow.TSelf
    override def toString = "<i>";
  }
}

/**
 * Special node types to deal with attributes and self-references 
 */
object TypeNode {
  //Typed by itself:
  object TSelf extends TypeNode {
    override val id = SId(0)
    override val t = this
    override def toString = "Self";
  }
  val TAttribute = Node(SId(10), TSelf)
  object TJoker extends TypeNode {
    override val id = SId(20)
    override val t = TSelf
    override def toString = "_";
  }
}

/**
 * Special node types for data types and values 
 */
object TypeP {

  val TBoolean = Node(AId("Boolean", VBoolean(true)), TypeNode.TAttribute)
  val TChar = Node(AId("Char", VChar(' ')), TypeNode.TAttribute)
  val TByte = Node(AId("Byte", VByte(0)), TypeNode.TAttribute)
  val TShort = Node(AId("Short", VShort(0)), TypeNode.TAttribute)
  val TInt = Node(AId("Int", VInt(0)), TypeNode.TAttribute)
  val TLong = Node(AId("Long", VLong(0)), TypeNode.TAttribute)
  val TFloat = Node(AId("Float", VFloat(0)), TypeNode.TAttribute)
  val TDouble = Node(AId("Double", VDouble(0)), TypeNode.TAttribute)
  val TString = Node(AId("String", VString("")), TypeNode.TAttribute)

  def nameToTypeP(n:String):Option[Node] = n match {
    case "String"  => Some(TString)
    case "Long"    => Some(TLong)
    case "Int"     => Some(TInt)
    case "Boolean" => Some(TBoolean)
    case "Byte"    => Some(TByte)
    case "Short"   => Some(TShort)
    case "Float"   => Some(TFloat)
    case "Double"  => Some(TDouble)
    case _ => None
  }  
  
  def toValue(n: TypeNode, rs: String) = {
    if (null == rs) {
      sys.error("Attribute value is null!")
    } else {
      val s = rs.replaceAll("\\\\\"", "\"")
      n match {
        case Node(AId("Char", _), TypeNode.TAttribute) => s match {
          case "\"" => VChar('"')
          case _ =>
            if (s.length() != 1) {
              sys.error(s + " is not a character!")
            }
            VChar(s.toCharArray()(0))
        }
        case Node(_, TypeNode.TAttribute) =>
          try {
            n match {
              case Node(AId("Boolean", _), _) => VBoolean(s.toBoolean)
              case Node(AId("Byte", _), _) => VByte(s.toByte)
              case Node(AId("Short", _), _) => VShort(s.toShort)
              case Node(AId("Int", _), _) => VInt(s.toInt)
              case Node(AId("Long", _), _) => VLong(s.toLong)
              case Node(AId("Float", _), _) => VFloat(s.toFloat)
              case Node(AId("Double", _), _) => VDouble(s.toDouble)
              case Node(AId("String", _), _) => VString(s)
              case _ => sys.error("Programming error = Datatype does not exist: " + n);
            }
          } catch {
            case _:Throwable => sys.error(s + " is not a valid input for " + n);
          }
        case _ => sys.error("Programming error = is not a datatype: " + n);
      }
    }
  }
}

/**
 * Convert a TypeNode to a usual node or through an exception
 */
trait TypeConverter {
  implicit def typeNode2node(i: TypeNode): Node = i match {
    case n: Node => n
    case _ =>
      sys.error("TypeNode not matched: " + i)
      throw new ClassCastException
  }
  implicit def typeArrow2arrow(i: TypeArrow): Arrow = i match {
    case a: Arrow => a
    case _ =>
      sys.error("TypeArrow not matched: " + i)
      throw new ClassCastException
  }
}
