package no.hib.dpf.text.scala.bridge;

import java.util.{ Set => JSet }
import java.util.{ List => JList }
import java.util.{ Map => JMap }

import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import scala.collection.mutable.ListBuffer

import no.hib.dpf.text.scala.ct._

import no.hib.dpf.text.tdpf.{ DpfId => JId }
import no.hib.dpf.text.tdpf.{ DataType => JDataType }

/**
 * Some useful methods to convert the XText-generated classes into 
 * equivalent Scala case classes.  
 */
object JavaScalaConverter {

  /**
   * Transfer a set of integer into a RId
   */
  def jSet2RId(i: JSet[Integer]): Option[RId] = {
    if (null == i || i.isEmpty()) {
      return None
    } else {
      return Some(RId(i.asScala.map(_.intValue())))
    }
  }

  /**
   * Transfer a XText generated JId into a RId
   */
  def jId2RId(d: JId): Option[RId] = {
    if (null != d && null != d.getId() && !d.getId().getNums().isEmpty()) {
      Some(RId(Set(d.getId().getNums().toSeq.asInstanceOf[Seq[Int]]: _*)));
    } else {
      None
    }
  }

  /**
   * Transfer a Java list into a Scala List.
   */
  def jList2List(l: JList[String]): List[String] = {
    l.toList
  }

  /**
   * Transfers a XText generated data type into a Scala case class data type
   */
  def jDT2TyeP(dt: JDataType) = dt match {
    case JDataType.TBOOLEAN => TypeP.TBoolean
    case JDataType.TCHAR => TypeP.TChar
    case JDataType.TBYTE => TypeP.TByte
    case JDataType.TSHORT => TypeP.TShort
    case JDataType.TINT => TypeP.TInt
    case JDataType.TLONG => TypeP.TLong
    case JDataType.TFLOAT => TypeP.TFloat
    case JDataType.TDOUBLE => TypeP.TDouble
    case JDataType.TSTRING => TypeP.TString
    case _ => sys.error("convertDT-> Programming Error: Datatype Error!");
  }

}