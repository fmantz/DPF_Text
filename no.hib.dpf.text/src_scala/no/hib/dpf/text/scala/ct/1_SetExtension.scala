package no.hib.dpf.text.scala.ct;
import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }

/**
 * Category Set
 */

/**
 * Morphism implementation for category set
 */
case class SetMorphism(map: Map[Id, Id], codomain: Set[Id]) extends TMorphism{
    lazy val validate: Boolean          = map.values.toSet subsetOf codomain
    lazy val isMono: Boolean            = map.keySet.size == map.values.toSet.size  
    lazy val isEpi: Boolean             = map.values.toSet == codomain
    lazy val isIso: Boolean             = isMono && isEpi
    lazy val reverseMap:Map[Id,Set[Id]] = map.groupBy(_._2).mapValues(_.map(_._1).toSet)
    def reverseMapF(id:Id):Set[Id]={
    	reverseMap get id match{
    	  case None    => Set()
    	  case Some(v) => v
    	}
    }    
}

/**
 * Span implementation for category set
 */
case class SetSpan(left: SetMorphism, right: SetMorphism) extends TSpan{
  def pushout(gId: Int = GroupIdGen.gen()): SetCospan = {

    val domain: Set[Id]=left.map.keySet
    val codomainDiffLeft = left.codomain -- left.map.values
    val codomainDiffRight = right.codomain  -- right.map.values
    val l: Id => Id=left.map
    val r: Id => Id=right.map

    //For Result:
    val m = MSet[Id]()
    val mapLeft2 = MMap[Id, Id]()
    val mapRight2 = MMap[Id, Id]()

    //Use mutable Maps for Equivalenz classes:
    val left2_tmp = MMap[(Id, String), MSet[(Id, String)]]()
    val right2_tmp = MMap[(Id, String), MSet[(Id, String)]]()
    for (d <- domain) {
      val lV = (l(d), "L")
      val rV = (r(d), "R")
      val poe = MSet(lV, rV)
      left2_tmp.get(lV) match {
        case None => left2_tmp += lV -> poe;
        case Some(pPoe) => pPoe ++= poe;
      }
      right2_tmp.get(rV) match {
        case None => right2_tmp += rV -> poe;
        case Some(pPoe) => pPoe ++= poe;
      }
    }

    //Compute equivalenz classes:
    def merge(): Boolean = {
      var merged = false;
      for (kvL <- left2_tmp; kvR <- right2_tmp) {
        if (kvL._2 != kvR._2 && !(kvL._2 intersect kvR._2).isEmpty) {
          kvL._2 ++= kvR._2;
          right2_tmp += kvR._1 -> kvL._2;
          merged = true;
        }
      }
      merged
    }
    while (merge()) { /*do nothing*/ }

    //Add to real result:
    for (s <- left2_tmp.values) yield m += TId(s.toSet, gId)
    for (kv <- left2_tmp)  mapLeft2 += kv._1._1 -> TId(kv._2.toSet, gId)
    for (kv <- right2_tmp) mapRight2 += kv._1._1 -> TId(kv._2.toSet, gId)

    for (c <- codomainDiffLeft) {
      val poe = TId(Set((c, "L")), gId)
      m += poe
      mapLeft2 += c -> poe
    }
    for (c <- codomainDiffRight) {
      val poe = TId(Set((c, "R")), gId)
      m += poe
      mapRight2 += c -> poe
    }
    val po=m.toSet
    val left2 = SetMorphism(mapLeft2.toMap ,po)
	val right2 = SetMorphism( mapRight2.toMap, po)
	SetCospan(left2, right2)  
  }
  def validate(): Boolean = left.map.keySet == right.map.keySet
}

/**
 * Cospan implementation for category set
 */
case class SetCospan(left: SetMorphism, right: SetMorphism) extends TCospan{
  def pullback(gId: Int = GroupIdGen.gen()): SetSpan = {
    
    val codomain2: Set[Id]=left.map.values.toSet
    val l2: Id => Set[Id] = left.reverseMapF
    val r2: Id => Set[Id] = right.reverseMapF

    val m = MSet[Id]()
    val mapLeft1 = MMap[Id, Id]()
    val mapRight1 = MMap[Id, Id]()

    for (x <- codomain2) {
      val lDomain2 = l2(x)
      val rDomain2 = r2(x)
      //Build cartesian product:
      for (l <- lDomain2; r <- rDomain2) {
        val pbe = TId(Set((l, "L"), (r, "R")), gId)
        mapLeft1  += pbe -> l
        mapRight1 += pbe -> r
        m += pbe
      }
    }
    val left1  = SetMorphism(mapLeft1.toMap,left.map.keySet)
    val right1 = SetMorphism(mapRight1.toMap,right.map.keySet)
    
    SetSpan(left1,right1)
  }
  def validate(): Boolean = (left.map.values.toSet ++ left.codomain) == (right.map.values.toSet ++ right.codomain) 
}

/**
 * Composition implementation for category set
 */
case class SetComposition(m1: SetMorphism, m2: SetMorphism) extends TComposition{
  lazy val compositeMorphism: SetMorphism = {
    val mm = MMap[Id, Id]()
    for (i <- m1.map.keys) {
      mm += i -> m2.map(m1.map(i))
    }
    SetMorphism(mm.toMap, m2.codomain)
  }

  /**
   * Attention: final-pullback-complement for monic matches is not supported for sets.
   */
  def finalPullbackComplementMono(gid: Int = GroupIdGen.gen()): Composition = sys.error("not supported!")

  def pushoutComplement(gid: Int = GroupIdGen.gen()): SetComposition = {

    //Graph transformation book p. 46
    val G: Set[Id]=m2.codomain
    val L: Set[Id]=m2.map.keySet
    val K: Set[Id]=m1.map.keySet
    val l: Id => Id=m1.map
    val m: Id => Id=m2.map

    //Morphism on the other side:
    val m1B = MMap[Id, Id]();
    val m2B = MMap[Id, Id]();

    val xG = for (x <- G) yield {
      val y = TId(Set((x, "G")), gid);
      m2B += y -> x; y
    }
    val m_L = for (x <- L) yield {
      val y = TId(Set((m(x), "G")), gid);
      m2B -= y; y
    }
    val m_l_K = for (x <- K) yield {
      val g = m(l(x))
      val y = TId(Set((g, "G")), gid);
      m1B += x -> y;
      m2B += y -> g; y
    }

    val D: Set[Id] = (xG -- m_L) ++ m_l_K

    val pc=(D, m1B.toMap, m2B.toMap)
                                    
    val s1 = SetMorphism(pc._2, pc._1)
    val s2 = SetMorphism(pc._3, m2.codomain)
    SetComposition(s1, s2);
  }
  
  def validate() = m1.map.values.toSet == m2.map.keySet

}