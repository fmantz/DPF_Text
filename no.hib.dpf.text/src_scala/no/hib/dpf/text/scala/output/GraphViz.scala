package no.hib.dpf.text.scala.output;

import no.hib.dpf.text.{DPFConstants => JConstants}

import no.hib.dpf.text.scala.ct._

import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }

/**
  * Object used to create all GraphViz files (.dot).
  * Minor issue: generated files could be made nicer.
  */
object GraphVizOutput {

  /**
    * Helper class to format specification elements into a GraphViz representation
    */
  private class Helper(g: AbstractGraph, name: String, path: String, printNames: Boolean = true) {

    /**
      * Format a node and write it into a buffer
      */
    def formatNode(l: List[String], n: Node, nl: Boolean): List[String] = {
      var rs = l
      rs = "\"" :: rs
      rs = getName(n, true) :: rs
      rs = ":" :: rs
      rs = getType(n) :: rs
      rs = "\"" :: rs
      //With Node label:
      if (nl) {
        rs = " [label=" :: rs
        rs = "\"" :: rs
        rs = format(n, getName(n)) :: rs
        rs = ":" :: rs
        rs = getType(n) :: rs
        rs = "\"]" :: rs
      }
      rs
    }

    /**
      * Format a node into a "class" presentation
      */
   def formatClass(l: List[String], n: Node): List[String] = {
      var rs = l
      rs = "\"" :: rs
      rs = getName(n, true) :: rs
      rs = ":" :: rs
      rs = getType(n) :: rs
      rs = "\"" :: rs

      //[label="{Comment|+topic\l+user\l+comment\l+creation_date\l}"]
      rs = " [label=" :: rs
      rs = "\"{" :: rs
      rs = format(n, getName(n)) :: rs
      rs = ":" :: rs
      rs = getType(n) :: rs

      //Add Attributes:
      val attr = g.arrowsOut(n).filter(_.t == TypeArrow.TAttribute)
      if (!attr.isEmpty) {
        rs = attr.map(a => getName(a) + ":" + a.tg.id.formatV()).mkString("|","\\l","\\l") :: rs
      }

      //Add Attribute values:
      val vals = g.arrowsOut(n).filter(_ match {
        case Arrow(_, _, _, Arrow(_, _, _, TypeArrow.TAttribute)) => true;
        case _ => false;
      })
      if (!vals.isEmpty) {
         rs = vals.map(a =>  getName(a) + "=" + format(a.tg, getName(a.tg))).mkString("|","\\l","\\l") :: rs
      }

      rs = "}\"]" :: rs
      rs
    }

    /**
      * Format an element as node
      */
    def format(e: Element, s: String): String = {
      //Format String and Char with "" resp. ''  
      e.id match {
        case VString(_) => "\\\"" + s + "\\\""
        case VChar(_) => "\\\'" + s + "\\\'"
        case _ => s
      }
    }

    /**
      * Format an arrow
      */
    def formatArrow(l: List[String], a: Arrow): List[String] = {
      var rs = l
      rs = formatNode(rs, a.sr, false)
      rs = "->" :: rs
      rs = formatNode(rs, a.tg, false)
      rs = " [label=" :: rs
      rs = "\"" :: rs
      rs = getName(a) :: rs
      rs = ":" :: rs
      rs = getType(a) :: rs
      rs = "\"]" :: rs
      rs
    }

    /**
      * Format an arrow a reference (arrow with smaller fonts)
      */
    def formatReference(l: List[String], a: Arrow): List[String] = {
      //edge [ arrowhead=none headlabel="1" taillabel="0..n" fontsize=10 ]
      var rs = l
      rs = formatNode(rs, a.sr, false)
      rs = "->" :: rs
      rs = formatNode(rs, a.tg, false)
      rs = " [label=" :: rs
      rs = "\"" :: rs
      rs = getName(a) :: rs
      rs = ":" :: rs
      rs = getType(a) :: rs
      rs = "\" fontsize=10]" :: rs
      rs
    }
    
 	/**
 	  * Format a inheritance arrow with a specific arrow head.
 	  */
    def formatInheritanceArrow(l: List[String], sr: Node, tg: Node): List[String] = {
      var rs = l
      rs = formatNode(rs, sr, false)
      rs = "->" :: rs
      rs = formatNode(rs, tg, false)
      rs = " [arrowhead=onormal]" :: rs
      rs
    }

 	/**
 	  * Format an arrow with an little diamond that a constraint can be attached.
 	  */
    def formatArrowForConstraint(l: List[String], a: Arrow): List[String] = {
      var rs = l

      //Add diamond:
      rs = "\"" :: rs
      rs = a.id.toString :: rs
      rs = "\"" :: rs
      rs = " [shape=diamond,style=filled,label=\"\",height=.2,width=.2];\n" :: rs

      //To diamond
      rs = formatNode(rs, a.sr, false)
      rs = "->" :: rs
      rs = "\"" :: rs
      rs = a.id.toString :: rs
      rs = "\"" :: rs
      rs = " [dir=none,weight=2];\n" :: rs

      //To target node
      rs = "\"" :: rs
      rs = a.id.toString :: rs
      rs = "\"" :: rs
      rs = "->" :: rs
      rs = formatNode(rs, a.tg, false)
      rs = " [label=" :: rs
      rs = "\"" :: rs
      rs = getName(a) :: rs
      rs = ":" :: rs
      rs = getType(a) :: rs
      rs = "\", weight=1]" :: rs
      rs
    }

    /**
      * Format a constraint.
      */
    def formatConstraint(l: List[String], c: Constraint): List[String] = {
      var rs = l

      //Add Constraint label node
      rs = "\"" :: rs
      rs = c.toString :: rs
      rs = "\"" :: rs

      //With Node label:
      rs = " [label=" :: rs
      rs = "\"" :: rs
      rs = c.validator.n :: rs

      //Add Parameter
      rs = "(" :: rs
      if (0 < c.ps.size) {
        rs = c.ps.mkString(",") :: rs
      }
      rs = ")" :: rs
      rs = "\", shape=note, regular=1, style=filled, fillcolor=white]" :: rs
      rs = ";\n" :: rs

      //Add arrows to labelNode
      var i = 0
      for (e <- c.arity_d) {
        //From label node:
        rs = "\"" :: rs
        rs = c.toString :: rs
        rs = "\"" :: rs
        rs = "->" :: rs
        //To diamond:
        rs = "\"" :: rs
        rs = e.id.toString :: rs
        rs = "\"" :: rs
        rs = " [dir=none,label=\"" :: rs
        rs = i.toString :: rs; i += 1 //Label with arrow number in list
        rs = "\"]; \n" :: rs
      }
      rs
    }

    /**
      * Get the name of an element
      */ 
    def getName(e: Element, p: Boolean = printNames): String = {
      if (p) {
        e.id match {
          case TypeNode.TAttribute.id => "DataType";
          case TypeArrow.TAttribute.id => "attribute";
          case SId(_) => e.toString()
          case _ => g.names.get(e.id) match {
            case Some(n) => n
            case _ => e.id.formatV.replaceAll("\"", "")
          }
        }
      } else ""
    }

    /**
      * Get the type name of an element
      */ 
    def getType(e: Element): String = {
      e.t.id match {
        case TypeNode.TAttribute.id => "DataType";
        case TypeArrow.TAttribute.id => "attribute";
        case SId(_) => e.t.toString()
        case _ => g.tgraph.names(e.t.id);
      }
    }

     /**
      * Write to file and call GraphViz dot command. 
      * Attention: the dot command need to be available on the console.
      */   
    def writeFile(f: List[String], fileName: String, fileType: String) {
      import java.io._
      val fname = path + "/" + fileName + ".dot"
      val writer = new java.io.PrintWriter(fname)
      val mm = new ByteArrayOutputStream()
      try {
        for (s <- f) {
          writer.print(s)
        }
      } catch {
        case ex:Throwable => EclipseLog.log(ex);
      } finally {
        writer.close
      }
      //EclipseLog.log("File created: " + fname)
    }

  }
  
  /**
    * Print an image of the specification (i.e. as graph with constraints)
    */
  def printSpecification(s: S, name: String, path: String, fileType: String = "png", printNames: Boolean = true) = {

    //println("\n\n" + name + " " + g)
    val arrowsWithConstraints = MSet[Id]();

    //Get all ids from arrows that have a constraints:
    for (c <- s.cs; a <- c.arity_d) {
      arrowsWithConstraints += a.id
    }

    val h = new Helper(s.g, name, path, printNames)

    var rs: List[String] = Nil
    rs = "digraph " :: rs
    rs = name :: rs
    rs = "\n{\n" :: rs
    rs = "graph [nodesep=\"0.7\"];\n" :: rs
    rs = "node [label=\"\\N\", shape=box];\n" :: rs

    //Nodes:
    for (n: Node <- s.g.nodes.values.toSet) {
      rs = h.formatNode(rs, n, true)
      rs = ";\n" :: rs
    }

    //Arrows:
    for (a: Arrow <- s.g.arrows.values.toSet) {
      if (arrowsWithConstraints contains a.id) {
        rs = h.formatArrowForConstraint(rs, a)
      } else {
        rs = h.formatArrow(rs, a)
      }
      rs = ";\n" :: rs
    }

    //Inheritance arrows:
    s.g match {
      case ig: IGraph =>
        for (i <- ig.inh.keySet; j <- ig.inh(i)) {
          rs = h.formatInheritanceArrow(rs, i, j);
        }
      case _ => /*do nothing */
    }

    //Constraints:
    for (c <- s.cs) {
      rs = h.formatConstraint(rs, c)
    }

    rs = "}\n" :: rs
    rs = rs.reverse

    h.writeFile(rs, JConstants.GRAHVIZ_IMAGE_PREFIX + name, fileType)

  }

  /**
    * Print a diagram of the graph of the specification (more like a class diagram)
    */
  def printDiagram(s: S, name: String, path: String, fileType: String = "png", printNames: Boolean = true) = {
    val h = new Helper(s.g, name, path, printNames)

    var rs: List[String] = Nil
    rs = "digraph " :: rs
    rs = name :: rs
    rs = "\n{\n" :: rs
    rs = "graph [ rankdir=BT ]\n" :: rs
    rs = "node [ shape=record ]\n" :: rs

    //Classes:
    val classes = s.g.nodes.values.toSet.filter(_ match {
      case Node(_, TypeNode.TAttribute) => false; //No Attributes
      case Node(_, Node(_, TypeNode.TAttribute)) => false; //No Values
      case _ => true;
    })
    for (n: Node <- classes) {
      rs = h.formatClass(rs, n)
      rs = ";\n" :: rs
    }

    //References:
    val refs = s.g.arrows.values.toSet.filter(_ match {
      case Arrow(_, _, _, TypeArrow.TAttribute) => false; //No Attributes
      case Arrow(_, _, _, Arrow(_, _, _, TypeArrow.TAttribute)) => false; //No Values
      case _ => true;
    })
    for (a: Arrow <- refs) {
      rs = h.formatReference(rs, a)
      rs = ";\n" :: rs
    }

    //Inheritance arrows:
    s.g match {
      case ig: IGraph =>
        for (i <- ig.inh.keySet; j <- ig.inh(i)) {
          rs = h.formatInheritanceArrow(rs, i, j);
        }
      case _ => /*do nothing */
    }

    rs = "}\n" :: rs
    rs = rs.reverse

    h.writeFile(rs, JConstants.GRAHVIZ_DIAGRAM_PREFIX + name, fileType)

  }

}