/**
 * This file contains all DPF concepts that aren't graph.
 * I tried to keep all definitions very close to what have been defined in 
 * Adrian Rutle's PhD thesis https://bora.uib.no/handle/1956/4469 with a few exceptions:
 * 1. The constraint semantics (i.e. the OCL) is mapped to a signature and not to the model.
 *    I had it first different but I found it very impractical to keep a "meta-model" and define  
 *    the semantic for predicates model specific.
 * 2. I allow to use different signatures in each specification. 
 *    This allows to group and reuse specifications according to user defined topics.   
 */
package no.hib.dpf.text.scala.ct;

/**
 * A validator for a constraint (as defined in a signature)
 */
case class Validator(id: RId, n: String, ps_var: List[String], arity: List[Element],tLanguage: String, template: String, errorMsg: String)

/**
 * A constraint (as used in a specification)
 */
case class Constraint(ps: List[String], arity_d: List[Element], validator: Validator)

/**
 * A specification ("S" like in Adrian Rutle's thesis)
 */
case class S(g: AbstractGraph, csLists: List[Set[Constraint]]) { //Specification
  private def inv(_g: AbstractGraph, _cs: Set[Constraint]): Boolean = {
    _cs foreach { _p =>
      for (_e <- _p.arity_d) {
        _e match{
          case Arrow(_,sr,tg,TypeArrow.TInheritance) => 
            _g match {
              case ig:IGraph => if(!(ig.inh contains sr)) return false
            		  			if(!(ig.inh(sr) contains tg)) return false
              case _		 => return false  
            }
          case _  => if (!(_g contains _e)) return false
        }
      }
    }
    return true;
  }
  if (!inv(g, cs)) {
    sys.error("not valid specification")
  }
  def cs:Set[Constraint]=csLists.flatten.toSet
  override def toString = "S(\n" + g + "\n\t" + constraintsToString + "\n)";
  protected def constraintsToString = (for (c <- cs) yield format(c))
  protected def elementsToString(es: List[Element]) = (for (e <- es) yield g.format(e))
  def format(c: Constraint): String = c.validator.n + "@" + c.validator.id.v + "(" + c.ps.mkString + ")" + "{Elements(" + elementsToString(c.arity_d) + ")}";
}

/**
 * A specification instance. mm = meta-specification / meta-model
 */
case class IS(mm: S, g: AbstractGraph) { //Instance specification
  private def inv(_mm: S, _g: AbstractGraph): Boolean = _mm.g == _g.tgraph 
  if (!inv(mm, g)) {
    sys.error("not valid instance specification")
  }
}

/**
 * Specification Descriptor
 */
case class SInfo(key:FKey,t:FKey, signatures:List[FKey]);

/**
 * Companion object adding additional "constructors" for case class SInfo
 */
object SInfo { 
   def apply(key:FKey,t:FKey):SInfo = {
     SInfo(key,t,Nil)
   }
   def apply(name: String, path: String,
    version: String,
    vNo: Int,
    vNext: Int,
    tName: String,
    tVersionName: String,
    signatureList: List[FKey] = Nil):SInfo = {
    val id = FKey(name, path, version, vNo, vNext)
    val t = FKey(tName, path,tVersionName)
    val sList = if (null == signatureList) {Nil} else {signatureList}
    SInfo(id, t, sList)  
   }
}

/**
 * The predefined DPF specification containing a node and an arrow
 * Additionally support for attributes have been added. 
 */
object Dpf {
  val Spec = S(Dpf.Graph, Nil)
  case object Graph extends AbstractGraph() {
    val node = Node(RId(Set(0)), TypeNode.TSelf)
    val arrow = Arrow(RId(Set(1)), node, node, TypeArrow.TSelf)
    val datatype = TypeNode.TAttribute
    val attribute = TypeArrow.TAttribute
    override val tKey = FKey("DPF", None, Some(Version("1",1,2)))
    override val tgraph = this
    override val nodes = Map[EId, Node](node.id -> node, datatype.id -> datatype)
    override val arrows = Map[EId, Arrow](arrow.id -> arrow, attribute.id -> attribute)
    override val names = Map[EId, String](node.id -> "Vertex", arrow.id -> "edge", datatype.id -> datatype.toString, attribute.id -> attribute.toString)
    override val in = Map[Node, Map[TypeArrow, Set[Arrow]]](node -> Map(arrow -> Set(arrow)), datatype -> Map(attribute -> Set(attribute)))
    override val out = Map[Node, Map[TypeArrow, Set[Arrow]]](node -> Map(arrow -> Set(arrow), attribute -> Set(attribute)))
    override val toString = super.toString
  }
}
