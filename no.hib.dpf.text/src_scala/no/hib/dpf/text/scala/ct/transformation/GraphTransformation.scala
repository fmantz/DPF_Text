package no.hib.dpf.text.scala.ct.transformation;

import no.hib.dpf.text.scala.ct._

/**
 * A cospan graph transformation rule
 * Attention: need to be implemented!
 */
case class CospanRule(name: String, cospan: TCospan, m: TMorphism, parameter: Map[String, String])

//  def isApplicable(): Boolean = true //TODO Check application condition
//  def repair():CospanRule            //TODO if Category DPF or IGraph and m not match complete, 
                                       //PUT Method maybe somewhere else
//  def apply(gid: Int = GroupIdGen.gen()): CospanTransformation = {
//    if (!isApplicable()) {
//      return None
//    }
//  ....
//
//case class CospanTransformation
//  methods to get all morphisms
//  def resultToGraph() //Use the names either for the model or new ones from the rule
//