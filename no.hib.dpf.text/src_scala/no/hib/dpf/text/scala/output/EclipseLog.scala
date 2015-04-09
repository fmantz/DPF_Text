package no.hib.dpf.text.scala.output;

import java.io.File
import java.io.FileWriter
import java.io.BufferedWriter
import scala.util.control.Exception

//TODO: Encapsulate Apache or Eclipse logger

/**
 * Very simple logger for debugging.
 * TODO: Encapsulate Apache or Eclipse logger
 */
object EclipseLog {

  val file = new File("myEclipse.log");
  
  /**
   * Log an error or an exception
   */
  def log(t: Throwable) = {
      val a = t.getStackTrace();
	  printToFile(file) { p => a.foreach(p.println)}
  }

  /**
   * Log an string
   */
  def log(s: String) = {
	  printToFile(file) { p => p.println(s)}
  }

  /**
   * Write to a text file.
   */
  private def printToFile(f: java.io.File)(op: java.io.PrintWriter => Unit) {
    val p = new java.io.PrintWriter(new BufferedWriter(new FileWriter(f, true)))
    try { op(p) } finally { p.close() }
  }

}