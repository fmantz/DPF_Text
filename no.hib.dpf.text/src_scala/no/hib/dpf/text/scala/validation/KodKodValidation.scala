package no.hib.dpf.text.scala.validation

import no.hib.dpf.text.scala.ct._

//Util:
import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }
//Eclipse
import java.text.ParseException;
import org.eclipse.core.resources._
//Java:
import java.io.File

/**
 * I had once the plan to also implement KodKod/Sat validation instead of only OCL validation.
 * May be an interesting project in the future. The integration into the tool could be done in the 
 * same manner as OCL validation has been integrated.
 */
object KodKodValidation extends ConstraintValidation {

  /**
   * Validate the instance of a specification. 
   */
  override def validate(is: IS) {
    try {
      import java.io._
      //1. Create and load meta model:

      //2. In create,load and validate instance:
      for (e <- createValidationParts(is)) {

 //TODO
        
      }
    } catch {
      case ex:Throwable => ex.printStackTrace();
    }
  }

}
