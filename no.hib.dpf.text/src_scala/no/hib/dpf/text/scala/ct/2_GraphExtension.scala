package no.hib.dpf.text.scala.ct;
import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }

case class ArrowSrTg(sr: Map[Id, Id], tg: Map[Id, Id])

/**
 * Morphism adapter for category (typed) graph (graph in the name has been omitted)
 */
trait Morphism extends TMorphism{

  val ns:SetMorphism 
  val as:(SetMorphism,ArrowSrTg,ArrowSrTg) 
  
  /**
   * Untyped Graph
   */
  trait UGraph {
    val arrow:ArrowSrTg
    def nodes(): Set[Id]
    def arrows(): Set[Id]
    def arrowSr(id:Id) = arrow.sr(id)
    def arrowTg(id:Id) = arrow.tg(id)
  }

  trait Domain extends UGraph {
    val arrow = as._2 
    def nodes(): Set[Id]  = ns.map.keySet 
    def arrows(): Set[Id] = as._1.map.keySet
    //Add navigation from codomain to domain (parameter codomain id)   
    def nodes(id: Id): Set[Id] =  ns.reverseMapF(id)
    def arrows(id: Id): Set[Id] = as._1.reverseMapF(id)
  }

  trait Codomain extends UGraph {
    val arrow = as._3
    def nodes(): Set[Id] = ns.codomain  
    def arrows(): Set[Id] = as._1.codomain
    //Add navigation from domain to codomain (parameter domain id) 
    def node(id: Id): Id  = ns.map(id)
    def arrow(id: Id): Id = as._1.map(id)
  }

  val domain: Domain;
  val codomain: Codomain;

  def isMono(): Boolean = ns.isMono && as._1.isMono  
  def isEpi(): Boolean = ns.isEpi   && as._1.isEpi 
  def isIso(): Boolean = ns.isIso   && as._1.isIso

  lazy val validate: Boolean = {
    //Check if the graph homomorphism property is statisfied:
    def validateGraphHomo(): Boolean = {
      for (a <- domain.arrows()) {
        if (!(
          codomain.node(domain.arrowSr(a)) == codomain.arrowSr(codomain.arrow(a)) &&
          codomain.node(domain.arrowTg(a)) == codomain.arrowTg(codomain.arrow(a)))) {
          return false
        }
      }
      true;
    }
    ns.validate && as._1.validate && validateGraphHomo 
  }

   override def toString() = {
    var rrs: List[String] = Nil
    rrs = "\n\nNodes-Mapping:\n" :: rrs;
    for (n <- domain.nodes()) {
      rrs = n + "  =>  " + codomain.node(n) + "\n" :: rrs
    }
    rrs = "\n\nAdditional Nodes in Codomain:\n" :: rrs;
    for (n <- codomain.nodes()) {
      if (domain.nodes(n).isEmpty) {
        rrs = n + "\n" :: rrs
      }
    }
    rrs = "\n\nArrows-Mapping:\n" :: rrs;
    for (a1 <- domain.arrows()) {
      val a2 = codomain.arrow(a1)
      val s_a1 = domain.arrowSr(a1) + "---" + a1 + "--->" + domain.arrowTg(a1)
      val s_a2 = codomain.arrowSr(a2) + "---" + a2 + "--->" + codomain.arrowTg(a2)
      rrs = s_a1 + "  =>  " + s_a2 + "\n" :: rrs
    }
    rrs = "\n\nAdditional Arrows in Codomain:\n" :: rrs;
    for (a2 <- codomain.arrows()) {
      if (domain.arrows(a2).isEmpty) {
        val s_a2 = codomain.arrowSr(a2) + "---" + a2 + "--->" + codomain.arrowTg(a2)
        rrs = s_a2 + "\n" :: rrs
      }
    }
    rrs.reverse.mkString
  }

}

/**
 * Span implementation for category (typed) graph (graph in the name has been omitted)
 */
case class Span(left: Morphism, right: Morphism) extends TSpan{
  def pushout(gid: Int = GroupIdGen.gen()): Cospan = {
    
    //Pushout Nodes:
    val poN = SetSpan(left.ns, right.ns).pushout(gid)

    //Pushout Arrows:
    val poA = SetSpan(left.as._1, right.as._1).pushout(gid)
    
    //Create arrowSrTg
    val srMap = MMap[Id, Id]()
    val tgMap = MMap[Id, Id]()
    for(a<-left.codomain.arrows()){
      srMap+=poA.left.map(a)->poN.left.map(left.codomain.arrowSr(a))
      tgMap+=poA.left.map(a)->poN.left.map(left.codomain.arrowTg(a))
    }
    for(a<-right.codomain.arrows()){
      srMap+=poA.right.map(a)->poN.right.map(right.codomain.arrowSr(a))
      tgMap+=poA.right.map(a)->poN.right.map(right.codomain.arrowTg(a))
    }
    val codomainArrowSrTg=ArrowSrTg(srMap.toMap, tgMap.toMap)
    
    val leftRs = ArbitraryMorphismWithIds( poN.left, (poA.left, left.codomain.arrow, codomainArrowSrTg),None,Some(gid))
    val rightRs = ArbitraryMorphismWithIds(poN.right,(poA.right, right.codomain.arrow, codomainArrowSrTg),None,Some(gid))
   
    Cospan(leftRs, rightRs);

  }
  def validate() = left.domain.nodes().equals(right.domain.nodes()) && left.domain.arrows().equals(right.domain.arrows())
}

/**
 * Cospan implementation for category (typed) graph (graph in the name has been omitted)
 */
case class Cospan(left: Morphism, right: Morphism) extends TCospan {
  def pullback(gid: Int = GroupIdGen.gen()): Span = {
    
    //Pullback Nodes:
    val pbN = SetCospan(left.ns, right.ns).pullback(gid)

    //Pullback Arrows:
    val pbA = SetCospan(left.as._1, right.as._1).pullback(gid)
    
    //Create arrowSrTg
    val srMap = MMap[Id, Id]()
    val tgMap = MMap[Id, Id]()
    for(a<-left.domain.arrows){
      val domainA=pbA.left.reverseMapF(a);
      if(domainA.size == 1){
    	  srMap+=domainA.head->pbN.left.reverseMap(left.domain.arrowSr(a)).head
    	  tgMap+=domainA.head->pbN.left.reverseMap(left.domain.arrowTg(a)).head
      }	  
    }
    for(a<-right.domain.arrows){
      val domainA=pbA.right.reverseMapF(a);
      if(domainA.size == 1 && 
          (!(srMap contains domainA.head) || srMap(domainA.head) == tgMap(domainA.head))){
    	  srMap+=domainA.head->pbN.right.reverseMap(right.domain.arrowSr(a)).head
    	  tgMap+=domainA.head->pbN.right.reverseMap(right.domain.arrowTg(a)).head
      }	  
    }
    val domainArrowSrTg=ArrowSrTg(srMap.toMap, tgMap.toMap)
    val leftRs = ArbitraryMorphismWithIds(pbN.left, (pbA.left, domainArrowSrTg, left.domain.arrow), Some(gid), None)
    val rightRs = ArbitraryMorphismWithIds(pbN.right, (pbA.right, domainArrowSrTg, right.domain.arrow), Some(gid), None)

    Span(leftRs, rightRs);
  }
  
  def validate() = left.codomain.nodes().equals(right.codomain.nodes()) && left.codomain.arrows().equals(right.codomain.arrows())

}

/**
 * Composition implementation for category (typed) graph (graph in the name has been omitted)
 */
case class Composition(m1: Morphism, m2: Morphism) extends TComposition{

  lazy val compositeMorphism: Morphism = {

    val nodes = MMap[Id, Id]()
    val arrows = MMap[Id, Id]()

    for (n <- m1.domain.nodes()) {
      nodes += n -> m2.codomain.node(m1.codomain.node(n))
    }

    for (a <- m1.domain.arrows()) {
      arrows += a -> m2.codomain.arrow(m1.codomain.arrow(a))
    }

    val nodesSetM = SetMorphism(nodes.toMap, m2.codomain.nodes())
    val arrowsSetM = SetMorphism(arrows.toMap, m2.codomain.arrows())

    ArbitraryMorphismWithIds(nodesSetM, (arrowsSetM, m1.domain.arrow, m2.codomain.arrow))
  }

  
  def pushoutComplement(gid: Int = GroupIdGen.gen()): Composition = {

	//Nodes:
    val pcN = SetComposition(m1.ns,m2.ns).pushoutComplement(gid)	
      
    //Arrows:
    val pcA = SetComposition(m1.as._1,m2.as._1).pushoutComplement(gid)

    //Fix arrows:
    val arrowSr = MMap[Id, Id]();
    val arrowTg = MMap[Id, Id]();

    for(a<-pcA.m1.map.keys){
      arrowSr+=pcA.m1.map(a)->pcN.m1.map(m1.domain.arrowSr(a));
      arrowTg+=pcA.m1.map(a)->pcN.m1.map(m1.domain.arrowTg(a));
    }

    val unmappedA=pcA.m1.codomain -- pcA.m1.map.values
    for(a<-unmappedA){
      arrowSr+=a->pcN.m2.reverseMap(m2.codomain.arrowSr(pcA.m2.map(a))).head;
      arrowTg+=a->pcN.m2.reverseMap(m2.codomain.arrowTg(pcA.m2.map(a))).head;
    }

    val arrowsSrTg_D = ArrowSrTg(arrowSr.toMap, arrowTg.toMap);
    val m1B = ArbitraryMorphismWithIds(pcN.m1, (pcA.m1, m1.domain.arrow, arrowsSrTg_D), None, Some(gid))
    val m2B = ArbitraryMorphismWithIds(pcN.m2, (pcA.m2, arrowsSrTg_D, m2.codomain.arrow), Some(gid), None)

    Composition(m1B, m2B);
  }

  
  /**
   * Final-Pullback-Complement for Monic matches
   */
  def finalPullbackComplementMono(gid: Int = GroupIdGen.gen()): Composition = {
    //From: Sesqui-pushout rewriting (Corradini et. al) 

    //Construction 6
    val V_A = m2.codomain.nodes();
    val V_L = m2.domain.nodes();
    val V_K = m1.domain.nodes();
    val m_V = m2.ns.map;
    val i_V = MMap[Id, Id]();
    val V_D = MSet[TId]();

    //Compute V_D and i_V:
    for (v <- V_A) {
      V_D += TId(Set((v, "A")), gid)
    }
    for (v <- V_L) {
      V_D -= TId(Set((m_V(v), "A")), gid)
    }
    for (v <- V_K) {
      val n = TId(Set((v, "K")), gid)
      V_D += n;
      i_V += v -> n;
    }

    //Compute y_v:
    val a_V = m1.codomain.node(_);
    val y_V = MMap[Id, Id]();
    for (v <- V_D) {
      val u = v.v.head
      u._2 match {
        case "K" => y_V += v -> m_V(a_V(u._1))
        case "A" => y_V += v -> u._1
        case _ => sys.error("Programming error")
      }
    }

    //Compute E_D and i_E
    val E_A = m2.codomain.arrows();
    val m_E_image = m2.domain.arrows(_: Id);
    val src_A = m2.codomain.arrowSr(_);
    val tgt_A = m2.codomain.arrowTg(_);
    val E_K = m1.domain.arrows();
    val i_E = MMap[Id, Id]();
    val E_D = MSet[TId]();
    for (e <- E_A) {
      if (m_E_image(e).isEmpty) {
        for (
          u <- V_D;
          v <- V_D
        ) {
          if (src_A(e) == y_V(u) && tgt_A(e) == y_V(v)) {
            E_D += TId(Set((e, "A"), (u, "uD"), (v, "vD")), gid)
          }
        }
      }
    }
    for (e <- E_K) {
      val a = TId(Set((e, "K")), gid);
      E_D += a;
      i_E += e -> a;
    }

    //Compute y_E and src_D(e) and tgt_D(e):
    val m_E = m2.as._1.map;
    val a_E = m1.as._1.map;
    val src_K = m1.domain.arrowSr(_);
    val tgt_K = m1.domain.arrowTg(_);
    val y_E = MMap[Id, Id]();
    val src_D = MMap[Id, Id]();
    val tgt_D = MMap[Id, Id]();
    for (e <- E_D) {
      val e_set = e.v
      if (3 == e_set.size) {

        val e_A = e_set.find(x => "A" == x._2).get
        y_E += e -> e_A._1

        val e_uD = e_set.find(x => "uD" == x._2).get
        src_D += e -> e_uD._1

        val e_vD = e_set.find(x => "vD" == x._2).get
        tgt_D += e -> e_vD._1

      } else {
        val e2 = e_set.head
        if ("K" != e2._2) {
          sys.error("Programming error")
        }
        y_E += e -> m_E(a_E(e2._1))

        src_D += e -> TId(Set((src_K(e2._1), e2._2)), gid)

        tgt_D += e -> TId(Set((tgt_K(e2._1), e2._2)), gid)
      }
    }

//TODO: Still needed?
//    //
//    //Remove SetIds from domain i_E (exist only because of construction of set ids)
//    //
//    val y_E_cleared = MMap[Id, Id]();
//    for (e <- y_E) {
//      e._2 match {
//        case s @ SetId(_, _) =>
//          if (s.ids.size != 1) {
//            sys.error("Programming error!" + s)
//          } else {
//            y_E_cleared += e._1 -> s.ids.head
//          }
//        case _ => y_E_cleared += e._1 -> e._2
//      }
//    }
//
//println("------------") 
//println(y_E.keySet);
//println(i_E.values.toSet);
//println("------------")     
    
    val ns1 = SetMorphism(i_V.toMap, V_D.toSet)
    val ns2 = SetMorphism(y_V.toMap, V_A)

    val as1 = SetMorphism(i_E.toMap, E_D.toSet)
//    val as2 = SetMorphism(y_E_cleared.toMap, E_A)
    val as2 = SetMorphism(y_E.toMap, E_A)

    val arrowsSrTg_D = ArrowSrTg(src_D.toMap, tgt_D.toMap);
    val m1B = ArbitraryMorphismWithIds(ns1, (as1, m1.domain.arrow, arrowsSrTg_D), None, Some(gid))
    val m2B = ArbitraryMorphismWithIds(ns2, (as2, arrowsSrTg_D, m2.codomain.arrow), Some(gid), None)

    Composition(m1B, m2B);
  }

  def validate() = m1.codomain.nodes().equals(m2.domain.nodes()) && m1.codomain.arrows().equals(m2.domain.arrows())
}

/*-------------------------- c o n c r e t e --- g r a p h - m o r p h i s m --- e a s y --- to --- c r e a t e: ------------------------*/

/**
 * Concrete morphism for category (typed) graph using set morphisms
 */
case class ArbitraryMorphismWithIds(
			override val ns: SetMorphism, 
			override val as: (SetMorphism, ArrowSrTg, ArrowSrTg), 
			override val domainGId:Option[Int]=None, 
			override val codomainGId:Option[Int]=None) extends Morphism {
  val domain = new Domain {}
  val codomain = new Codomain {}
}

/**
 * Concrete morphism for category (typed) graph using mappings of nodes and arrows presented as tuple sets
 */
case class ArbitraryMorphism(
    inputNodes:  Set[(Option[Node], Node)], 
    inputArrows: Set[(Option[Arrow], Arrow)]) extends Morphism {

  //Nodes:
  private val nsMap      =  MMap[Id,Id]()
  private val nsCodomain =  MSet[Id]()
  
  //Arrows:
  private val asMap            =  MMap[Id,Id]()
  private val asCodomain       =  MSet[Id]()
  private val asDomainSr       =  MMap[Id,Id]()
  private val asDomainTg       =  MMap[Id,Id]()
  private val asCodomainSr     =  MMap[Id,Id]()
  private val asCodomainTg     =  MMap[Id,Id]()
  
  private def insertNsMap(k:Id,v:Id){
    nsMap get k match{
      case Some(kv) => if(kv != v) sys.error("Node with Id=" + k + " mapped twice!") 
      case None     =>
    }
    nsMap+=k->v
  }
  private def insertAsMap(k:Id,v:Id){
    asMap get k match{
      case Some(kv) => if(kv != v) sys.error("Arrow with Id=" + k + " mapped twice!") 
      case None     =>
    }
    asMap+=k->v
  }
  
  for(i<-inputNodes){
    i._1 match {
      case Some(x) => insertNsMap(x.id,i._2.id) 
      case None    => /*do nothing*/
    }
    nsCodomain+=i._2.id
  }  
  
  for(i<-inputArrows){
    i._1 match {
      case Some(x) => insertAsMap(x.id,i._2.id)

    		  		  asDomainSr+=x.id -> x.sr.id  
                      asDomainTg+=x.id -> x.tg.id  
             
                      insertNsMap(x.sr.id, i._2.sr.id)
                      insertNsMap(x.tg.id, i._2.tg.id)
                      
      case None    => /*do nothing*/
    }
    asCodomain+=i._2.id
    asCodomainSr+=i._2.id -> i._2.sr.id  
    asCodomainTg+=i._2.id -> i._2.tg.id  
    
    nsCodomain+=i._2.sr.id 
    nsCodomain+=i._2.tg.id 
  }  

  override val ns =  SetMorphism(nsMap.toMap,nsCodomain.toSet) 
  override val as = (SetMorphism(asMap.toMap,asCodomain.toSet), 
                     ArrowSrTg(asDomainSr.toMap,asDomainTg.toMap),
                     ArrowSrTg(asCodomainSr.toMap,asCodomainTg.toMap)) 


  val domain = new Domain {}
  val codomain = new Codomain {}

}

/**
 * Concrete morphism for category (typed) graph using the typing to create the morphism
 */
case class TypingMorphism(input: AbstractGraph) extends Morphism {

  private val nodes = MMap[Id,Id]()
  for(n <- input.nodes.values){
    nodes+=n.id->n.t.id
  }
  val ns= SetMorphism(nodes.toMap,input.tgraph.nodes.keySet.toSet)
  
  private val arrows = MMap[Id,Id]()
  private val asDomainSr       =  MMap[Id,Id]()
  private val asDomainTg       =  MMap[Id,Id]()
  
  for(a <- input.arrows.values){
    arrows+=a.id->a.t.id
    asDomainSr+=a.id->a.sr.id
    asDomainTg+=a.id->a.tg.id
  }
  
  private val asCodomainSr     =  MMap[Id,Id]()
  private val asCodomainTg     =  MMap[Id,Id]()
  
  for(a <- input.tgraph.arrows.values){
    asCodomainSr+=a.id->a.sr.id
    asCodomainTg+=a.id->a.tg.id
  }
  
  val as=  (SetMorphism(arrows.toMap,input.tgraph.arrows.keySet.toSet),
            ArrowSrTg(asDomainSr.toMap,asDomainTg.toMap),
            ArrowSrTg(asCodomainSr.toMap,asCodomainTg.toMap))
  
  val domain = new Domain {}
  val codomain = new Codomain {}
  
  override lazy val validate = true
  
}

/**
 * Concrete morphism for category (typed) graph creating simply identity mappings
 */
case class IdMorphismGraph(input: AbstractGraph) extends Morphism {

  private val nodes = MMap[Id,Id]()
  for(n <- input.nodes.values){
    nodes+=n.id->n.id
  }
  val ns= SetMorphism(nodes.toMap,input.nodes.keySet.toSet)
  
  private val arrows = MMap[Id,Id]()
  private val asSr       =  MMap[Id,Id]()
  private val asTg       =  MMap[Id,Id]()
  
  for(a <- input.arrows.values){
    arrows+=a.id->a.id
    asSr+=a.id->a.sr.id
    asTg+=a.id->a.tg.id
  }
  private val aSrTg = ArrowSrTg(asSr.toMap,asTg.toMap)
  
  val as=  (SetMorphism(arrows.toMap,input.arrows.keySet.toSet),aSrTg,aSrTg)
  
  val domain = new Domain {}
  val codomain = new Codomain {}
  
  override lazy val validate = true

}




