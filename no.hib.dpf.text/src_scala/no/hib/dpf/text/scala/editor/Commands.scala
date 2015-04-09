package no.hib.dpf.text.scala.editor;

import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }

import no.hib.dpf.text.scala.output._
import no.hib.dpf.text.scala.henshin.MatchFinder


/**
 * All available editor commands that can be used in a batch file
 */
object EditorCommands{    
    
    /**
     * Make an image of a specification (including constraints) by use of GraphViz.  
     */
    def makeImage(name: String, path: String, fileType: String, outDir: String) = {
    try {
      if (null == fileType || fileType.isEmpty()) {
         GraphVizOutput.printSpecification(Editor.getSpec(name, path), name, outDir)
      } else {
         GraphVizOutput.printSpecification(Editor.getSpec(name, path), name, outDir, fileType)
      }
    } catch {
      case ex: Throwable => EclipseLog.log(ex);
    }
  }

  /**
   * Make a "class" diagram for the graph of a specification (without constraints) by use of GraphViz.  
   */
  def makeDiagram(name: String, path: String, fileType: String, outDir: String) = {
    try {
      if (null == fileType || fileType.isEmpty()) {
        GraphVizOutput.printDiagram(Editor.getSpec(name, path), name, outDir)
      } else {
        GraphVizOutput.printDiagram(Editor.getSpec(name, path), name, outDir, fileType)
      }
    } catch {
      case ex: Throwable => EclipseLog.log(ex);
    }
  }

  /**
   * Make an Ecore File for a specification 
   * Attention: does not consider constraints such as multiplicity constraints up to now!
   */
  def makeEcore(name: String, path: String, outDir: String) = {
    import java.io.File
    try {
      val fname = name + ".ecore"
      val file: File = new File(outDir + "/" + fname)
      EMFOutput.writeXML(file,()=>EMFOutput.spec2EcoreM_User(Editor.getSpec(name, path))) //Comment in was only test!
    } catch {
      case ex: Throwable => EclipseLog.log(ex);
    }

  }

  /**
   * Make an EMF XMI File for a specification 
   * Attention: to load the XMI file the corresponding Ecore file should have been generated.
   */
  def makeEMF(name: String, mmName: String, path: String, outDir: String) = {
    import java.io.File
    try {
      val fname = name + ".xmi"
      val file: File = new File(outDir + "/" + fname)
      EMFOutput.writeXML(file,()=>EMFOutput.spec2EcoreI_User(Editor.getSpec(name, path),mmName)) //Comment in was only test!
    } catch {
      case ex: Throwable => EclipseLog.log(ex);
    }
  }
  
  /**
   * Find all injective matches of a graph in another graph (just a test).
   * Uses Eclipse Henshin for this.
   */
  def testMatch(search: String, into: String, path: String, debugDir: String):String = {
    try {
        val s = Editor.getSpec(search, path);
        val i = Editor.getSpec(into, path)
    	MatchFinder.searchForMatches(s,Map.empty,i,debugDir);
    } catch {
      case ex: Throwable => EclipseLog.log(ex);ex.getMessage(); 
    }
  }
   
}