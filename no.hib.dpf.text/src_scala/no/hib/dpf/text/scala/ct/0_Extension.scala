/**
 * Group Ids are used to create new Ids in the constructions.
 * They help to construct name spaces. 
 * Actually such namespaces would properly not have been necessary,
 * however for debugging purposes they have been introduced. 
 */
package no.hib.dpf.text.scala.ct;

/**
 * Interface for an Morphism 
 */
trait TMorphism{
  
  val domainGId:Option[Int]=None
  val codomainGId:Option[Int]=None

   /**
   * Is the morphism a mono morphism 
   */
  def isMono(): Boolean

  /**
   * Is the morphism an epi morphism 
   */
  def isEpi(): Boolean

   /**
   * Is the morphism an isomorphism 
   */
 def isIso(): Boolean

   /**
   * Is the morphims a valid total morphism
   */ 
  def validate(): Boolean
  
}

/**
 * Interface for a span 
 */
trait TSpan{
  
  /**
   * Construction from category theory.
   */
  def pushout(gId: Int = GroupIdGen.gen()): TCospan
  
   /**
   * Is the span well-defined.
   */
  def validate(): Boolean

}

/**
 * Interface for a cospan
 */
trait TCospan{
  
  /**
   * Construction from category theory.
   */
  def pullback(gId: Int = GroupIdGen.gen()): TSpan

  /**
   * Is the cospan well-defined.
   */
  def validate(): Boolean
}

/**
 * Interface for a composition
 */
trait TComposition{
 
  /**
   * Construction from category theory.
   */
 def finalPullbackComplementMono(gId: Int = GroupIdGen.gen()): TComposition

 /**
   * Construction from category theory.
   */
 def pushoutComplement(gid: Int = GroupIdGen.gen()): TComposition

 /**
   * Is the composition well-defined.
 */
 def validate(): Boolean
}
