package no.hib.dpf.text.scala.ct;
import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }
import scala.collection.{ Map => CMap }
import scala.collection.{ Set => CSet }

/**
 * Helper methods to deal with inheritance in graph morphisms
 */
private object HelperIMorphism {
  
  /**
   * Build complete closure (of inheritance "arrows"):
   */
  def buildClosure(i: Set[Tuple2[Id, Id]]): MMap[Id, MSet[Id]] = {
    val inh = buildInheritanceMap(i)
    //Calculate transitive closure by warshal algorithm:
    //Note sequence of y,x,z is important!
    for (y <- inh.keys)
      for (x <- inh.keys)
        for (z <- inh.keys) {
          if ((inh(x) contains y) && (inh(y) contains z)) {
            inh(x) += z
          }
        }
    inh
  }
  
  /**
   * Compress closure (used to have only as many inheritance "arrows" as needed)
   */
  def compressClosure(i: CSet[Tuple2[Id, Id]]): Set[Tuple2[Id, Id]] = {
    val inh = buildInheritanceMap(i)
    //Compress transitive closure by warshal algorithm:
    //TODO does this really work (?):
    for (y <- inh.keys)
      for (x <- inh.keys)
        for (z <- inh.keys) {
          if ((inh(x) contains y) && (inh(y) contains z) && (inh(x) contains z)) {
            inh(x) -= z
          }
        }
    //Make Set:
    val r = MSet[Tuple2[Id, Id]]();
    for (x <- inh.keys; y <- inh(x)) {
      r += new Tuple2(x, y)
    }
    r.toSet
  }
  
  /**
   * Build simple inheritance map:
   */
  private def buildInheritanceMap(i: CSet[(Id, Id)]): MMap[Id, MSet[Id]] = {
    val inh = MMap[Id, MSet[Id]]()
    //Init:
    for (t <- i) {
      if (inh contains t._1) {
        inh(t._1) += t._2
      } else {
        inh += t._1 -> MSet(t._2)
      }
    }
    inh
  }
  
  /**
   * Calculate the clan of a specific node:
   */
  def calculateClan(n: Id, inh: CMap[Id, CSet[Id]]): MSet[Id] = {
    val rs = MSet[Id](n)
    def visit(n: Id): Unit = {
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
 * Morphism implementation for category Igraph
 */
case class IMorphism(m: Morphism,
  
  domainI: Set[Tuple2[Id, Id]],
  _codomainI: Set[Tuple2[Id, Id]],
  override val domainGId:Option[Int]=None,
  override val codomainGId:Option[Int]=None,
  repair:Boolean=false) extends TMorphism {

  def isMono(): Boolean = m.isMono()
  def isEpi(): Boolean = m.isEpi()
  def isIso(): Boolean = m.isIso()
  
  //Getter for codomain: 
  def codomainI = if(repair){
	  				  _codomainI ++ repaircodomainI
	  			  }else{
	  				  _codomainI
	  			  }   
  private lazy val repaircodomainI:Set[Tuple2[Id, Id]]= {
    val r = MSet[Tuple2[Id, Id]]();
    for (t <- domainI) {
      r+=new Tuple2(m.codomain.node(t._1),m.codomain.node(t._2))
	}
    r.toSet
  }  
  
  def validate(): Boolean = {
    //Check if all nodes and arrows in the domain are mapped:
    def validateSet(domain: Set[Id], codomain: (Id) => Id): Boolean = {
      for (e <- domain) {
        if (null == codomain(e)) {
          return false
        }
      }
      true;
    }
    //Check if all inheritance relations are included in codomain:
    val inh = HelperIMorphism.buildClosure(_codomainI)
    def validateInheritanceInc(): Boolean = {
      for (t <- domainI) {
        if (!((inh contains m.codomain.node(t._1)) && (inh(m.codomain.node(t._1)) contains m.codomain.node(t._2)))) {
          return false
        }
      }
      true;
    }
    //Check if the graph "homomorphism" property is statisfied:
    def validateGraphMorphism(): Boolean = {
      for (a <- m.domain.arrows()) {
        if (!(
          (HelperIMorphism.calculateClan(m.codomain.arrowSr(m.codomain.arrow(a)),inh) contains m.codomain.node(m.domain.arrowSr(a))) &&
          (HelperIMorphism.calculateClan(m.codomain.arrowTg(m.codomain.arrow(a)),inh) contains m.codomain.node(m.domain.arrowTg(a))))) {
          return false
        }
      }
      true;
    }
    return validateSet(m.domain.nodes, m.codomain.node) && 
    			validateSet(m.domain.arrows, m.codomain.arrow) && 
    				(!repair && validateInheritanceInc()) && 
    					validateGraphMorphism()
  }

}

/**
 * Span implementation for category Igraph
 */
case class ISpan(left: IMorphism, right: IMorphism) extends TSpan {
  val span = Span(left.m, right.m)
  def pushout(gid: Int = GroupIdGen.gen()): ICospan = {
    val po = span.pushout(gid)
    //
    //Calculate inheritance set:
    //
    val union = MSet[Tuple2[Id, Id]]();
    {
      def lNode(i: Id) = po.left.codomain.node(i)
      for (i <- left.codomainI) {
        union += new Tuple2(lNode(i._1), lNode(i._2))
      }
    }
    {
      def rNode(i: Id) = po.right.codomain.node(i)
      for (i <- right.codomainI) {
        union += new Tuple2(rNode(i._1), rNode(i._2))
      }
    }
    val u = HelperIMorphism.compressClosure(union)
    ICospan(IMorphism(po.left, left.codomainI, u, None, Some(gid)), IMorphism(po.right, right.codomainI, u, None, Some(gid)))
  }
  def validate:Boolean=span.validate();
}

/**
 * Cospan implementation for category Igraph
 */
case class ICospan(left: IMorphism, right: IMorphism) extends TCospan {
  val cospan = Cospan(left.m, right.m)
  def pullback(gid: Int = GroupIdGen.gen()): ISpan = {
    val pb = cospan.pullback(gid)
    //
    //Calculate inheritance set:
    //
    val nodes = pb.left.domain.nodes()
    def lNode(i: Id) = pb.left.codomain.node(i)
    def rNode(i: Id) = pb.right.codomain.node(i)
    def leftClosure = HelperIMorphism.buildClosure(left.domainI)
    def rightClosure = HelperIMorphism.buildClosure(right.domainI)
    val intersection = MSet[Tuple2[Id, Id]]();
    for (n1 <- nodes; n2 <- nodes) {
      if ((leftClosure contains lNode(n1)) && (leftClosure(lNode(n1)) contains lNode(n2)) &&
        (rightClosure contains rNode(n1)) && (rightClosure(rNode(n1)) contains rNode(n2))) {
        intersection += new Tuple2(n1, n2)
      }
    }
    val i = HelperIMorphism.compressClosure(intersection)
    ISpan(IMorphism(pb.left, i, left.domainI,Some(gid),None), IMorphism(pb.right, i, right.domainI,Some(gid),None))
  }
  def validate:Boolean=cospan.validate();
}

/**
 * Composition implementation for category Igraph
 */
case class IComposition(m1: IMorphism, m2: IMorphism) extends TComposition {
  val composition = Composition(m1.m, m2.m)
  def finalPullbackComplementMono(gid: Int = GroupIdGen.gen()): IComposition = {
    val fpbcM = composition.finalPullbackComplementMono(gid)
    //
    //Calculate inheritance set:
    //       
    val pbc = MSet[Tuple2[Id, Id]]();
    //Add inheritance relations from codomain:
    {
      val closure = HelperIMorphism.buildClosure(m2.codomainI)
      val nodes = fpbcM.m2.domain.nodes()
      def m2Node(i: Id) = fpbcM.m2.codomain.node(i)
      for (n1 <- nodes; n2 <- nodes) {
        if ((closure contains m2Node(n1)) && (closure(m2Node(n1)) contains m2Node(n2))) {
          pbc += new Tuple2(n1, n2)
        }
      }
    }
    val pbci = HelperIMorphism.compressClosure(pbc)
    IComposition(IMorphism(fpbcM.m1, m1.domainI, pbci, None, Some(gid)), IMorphism(fpbcM.m2, pbci, m2.codomainI, Some(gid), None))
  }
  def pushoutComplement(gid: Int = GroupIdGen.gen()): IComposition = {
    val pocM = composition.pushoutComplement(gid)
    //
    //Calculate inheritance set:
    //
    val poc = MSet[Tuple2[Id, Id]]();
    //Add inheritance relations from codomain:
    {
      val closure = HelperIMorphism.buildClosure(m2.codomainI)
      val nodes = pocM.m2.domain.nodes()
      def m2Node(i: Id) = pocM.m2.codomain.node(i)
      for (n1 <- nodes; n2 <- nodes) {
        if ((closure contains m2Node(n1)) && (closure(m2Node(n1)) contains m2Node(n2))) {
          poc += new Tuple2(n1, n2)
        }
      }
    }
    
    val poci = HelperIMorphism.compressClosure(poc)
    IComposition(IMorphism(pocM.m1, m1.domainI, poci, None, Some(gid)), IMorphism(pocM.m2, poci, m2.codomainI, Some(gid), None))
  }
  def validate:Boolean=composition.validate();
}