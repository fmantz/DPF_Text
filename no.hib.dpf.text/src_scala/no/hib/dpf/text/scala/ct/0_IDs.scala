package no.hib.dpf.text.scala.ct;

import scala.collection._;
import scala.collection.mutable.{ Set => MSet }
import scala.collection.mutable.{ Map => MMap }
import scala.collection.immutable.{ Map => IMap }
import scala.collection.immutable.{ Set => ISet }

/**
 * General Identifier 
 */
sealed trait Id {
  val v: Any
  def formatV() = v.toString()
}

/**
 * Element Ids are used to identify nodes and edges 
 */
trait EId extends Id 

/**
 * Most Elements Ids are regular Ids (RIds), 
 * only if the id has a special purpose then it is not a RId
 * e.g. values have special ids equivalent to their value.
 */
case class RId(v: Set[Int]) extends EId {
  override def formatV = v.toList.sorted.mkString(",");
  override def toString = "ID" + vToString;
  def vToString = v.toList.sorted.mkString("_");
}

/**
 * Companion object for RId adding aditional builders.
 */
object RId{
   def apply(vToString: String):RId = RId(vToString.split("_").toList.map(_.toInt).toSet)
}


/**
 * Attribute type identifier: used for primitive types e.g. String, Double ...
 */
case class AId(v: String, default: AValue) extends EId {
  override def toString = v;
}

/**
 * Attribute value identifier: used for primitive data values
 */
sealed trait AValue extends EId
case class AVariable(v: String) extends AValue
case class VBoolean(v: Boolean) extends AValue
case class VChar(v: Char) extends AValue
case class VByte(v: Byte) extends AValue
case class VShort(v: Short) extends AValue
case class VInt(v: Int) extends AValue
case class VLong(v: Long) extends AValue
case class VFloat(v: Float) extends AValue
case class VDouble(v: Double) extends AValue
case class VString(v: String) extends AValue

/**
 * Special Id used as identifier in some predefined nodes and arrows
 */
case class SId(v: Int) extends EId {
  override def toString = "SID" + v;
}

/**
 * Constraint identifier: used to specify shape graphs for constraints
 */
case class CId(v: String) extends EId{
  override def toString = "CID" + v;
}

//----------------------------------------------------------------------

/**
 * Generator to generate new group identifier 
 */
object GroupIdGen {
  private var i = 100;
  def gen(): Int = { i += 1; i; }
}

/**
 * Temporary Ids (required for categorical constructions)
 * After categorical constructions e.g. graph transformation rule applications such identifier
 * have to be translated into Element identifier to create valid graph objects
 */
case class TId(v: Set[(Id, String)], gId: Int) extends Id {
  override lazy val toString = "TID" + formatV + " gId=" + gId;
}
//----------------------------------------------------------------------