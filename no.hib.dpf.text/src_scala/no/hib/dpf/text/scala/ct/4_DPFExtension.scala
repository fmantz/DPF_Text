package no.hib.dpf.text.scala.ct;

/**
 * Morphism implementation for category DPF*.
 * Star, because I use category IGraph instead of category graph here. 
 * However category IGraph without using inheritance relations is equivalent to category graph.
 */
case class DPFMorphism(m: IMorphism, 
					   domainCs: Set[Constraint], codomainCs: Set[Constraint]) 
					   extends TMorphism {
  def isMono(): Boolean = m.isMono()
  def isEpi(): Boolean = m.isEpi()
  def isIso(): Boolean = m.isIso()
  def validate(): Boolean = m.validate()
  
}

/**
 * Span implementation for category DPF*.
 * Attention: unfinshed! Behaves at the moment like ISpan.
 */
case class DPFSpan(left: DPFMorphism, right: DPFMorphism) extends TSpan {
  val ispan = ISpan(left.m,right.m)
  def pushout(gid: Int = GroupIdGen.gen()): DPFCospan = {
    val ipo = ispan.pushout(gid);
    //TODO handle constraints
    DPFCospan(
        DPFMorphism(ipo.left,Set(),Set()),
        DPFMorphism(ipo.right,Set(),Set())
    )
  }
  def validate(): Boolean = ispan.validate()
}

/**
 * Cospan implementation for category DPF*.
 * Attention: unfinshed! Behaves at the moment like ICospan.
 */
case class DPFCospan(left: DPFMorphism, right: DPFMorphism) extends TCospan {
  val icospan = ICospan(left.m,right.m)
  def pullback(gid: Int = GroupIdGen.gen()): DPFSpan = {
    val ipb = icospan.pullback(gid);
    //TODO handle constraints
    DPFSpan(
        DPFMorphism(ipb.left,Set(),Set()),
        DPFMorphism(ipb.right,Set(),Set())
    )    
  }
  def validate(): Boolean = icospan.validate()
}

/**
 * Composition implementation for category DPF*.
 * Attention: unfinshed! Behaves at the moment like ICospan.
 */
case class DPFComposition(m1: DPFMorphism, m2: DPFMorphism) extends TComposition {
  val icomposition = IComposition(m1.m,m2.m)
  def finalPullbackComplementMono(gid: Int = GroupIdGen.gen()): DPFComposition = {
    val ifpbc = icomposition.finalPullbackComplementMono(gid);
    //TODO handle constraints
    DPFComposition(
        DPFMorphism(ifpbc.m1,Set(),Set()),
        DPFMorphism(ifpbc.m2,Set(),Set())
    )        
  }
  def pushoutComplement(gid: Int = GroupIdGen.gen()): DPFComposition = {
    val ipoc = icomposition.pushoutComplement(gid);
    //TODO handle constraints
    DPFComposition(
        DPFMorphism(ipoc.m1,Set(),Set()),
        DPFMorphism(ipoc.m2,Set(),Set())
    )            
  }
  def validate(): Boolean = icomposition.validate()
}

