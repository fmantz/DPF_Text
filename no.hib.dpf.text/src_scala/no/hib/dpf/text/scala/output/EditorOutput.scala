package no.hib.dpf.text.scala.output;

import no.hib.dpf.text.scala.ct._;
import no.hib.dpf.text.scala.ct.mutable._;
import no.hib.dpf.text.scala.editor.Editor;

import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }

import no.hib.dpf.text.{ DPFConstants => JConstants };

/**
 * Serializes specifications and signatures to write them into a file. 
 */
object EditorOutput extends TypeConverter {
  
  /**
   * Helper for formatting elements for output.
   * Also used for code completion/proposals in the editor.
   */
  class Helper(s: S) {

    /**
     * Format any node or arrow.
     */
    def formatElement(e: Element): String = e match {
      case n: Node => formatNode(n);
      case a: Arrow => formatArrow(a);
      case _ => sys.error("Programming error")
    }

    /**
     * Format a node.
     */
    def formatNode(n: Node): String = {
      n match {
        //Value:
        case Node(id, Node(_, TypeNode.TAttribute)) => formatValue(id)
        //Attribute:
        case Node(id, TypeNode.TAttribute) => id.toString()
        //Default:
        case _ =>
          var rs: List[String] = Nil
          rs = getName(n) :: rs
          rs = ":" :: rs
          rs = getType(n) :: rs
          rs.reverse.mkString
      }
    }

    /**
     * Format a name with its id of any element.
     */
    def getName(e: Element): String = {
      e.id match {
        case rId @ RId(_) => s.g.names.get(e.id) match {
          case Some(n) => n + "@" + rId.formatV
          case _ => sys.error("(1) Name is missing!" + e + " ")
        }
        case ex @ _ => sys.error("Id not supported:" + ex)
      }
    }

    /**
     * Format a type name with its id of any element.
     */
    def getType(e: Element): String = {
      e.id match {
        case _ => s.g.tgraph.names.get(e.t.id) match {
          case Some(n) =>
            e.t.id match {
              case rid @ RId(_) => n + "@" + rid.formatV
              case _ => n
            }
          case _ => sys.error("(2) Name is missing!" + e)
        }
      }
    }

    /**
     * Format a value as String.
     */
    def formatValue(id: Id): String = {
      id match {
        case AVariable(x) => x
        case _ => "\"" + id.formatV.replaceAll("\"", "\\\\\"") + "\""
      }
    }

    /**
     * Format an arrow.
     */
    def formatArrow(a: Arrow, withSrcNode: Boolean = true): String = {
      var rs: List[String] = Nil
      if (withSrcNode) {
        rs = formatNode(a.sr) :: rs
        rs = "-" :: rs
      }
      a match {
        case Arrow(_, _, _, TypeArrow.TInheritance) =>
          rs = "i" :: rs
        case Arrow(_, _, _, TypeArrow.TAttribute) =>
          rs = getName(a) :: rs
          rs = ":" :: rs
          rs = "*" :: rs
        case _ =>
          rs = getName(a) :: rs
          rs = ":" :: rs
          rs = getType(a) :: rs
      }
      rs = "->" :: rs
      rs = formatNode(a.tg) :: rs
      rs.reverse.mkString
    }

    /**
     * Format an property.
     */
    def formatProperty(a: Arrow): String = {
      var rs: List[String] = Nil
      rs = getName(a) :: rs
      rs = ":" :: rs
      a match {
        case Arrow(_, _, _, TypeArrow.TAttribute) =>
          rs = "*" :: rs
        case _ =>
          rs = getType(a) :: rs
      }
      rs = "->" :: rs
      rs = formatNode(a.tg) :: rs
      rs.reverse.mkString
    }

    /**
     * Format an inheritance relationship/"arrow"
     */
    def formatInheritanceRelation(n: Node, sn: Node): String = {
      var rs: List[String] = Nil
      rs = formatNode(n) :: rs
      rs = "-|>" :: rs
      rs = formatNode(sn) :: rs
      rs.reverse.mkString
    }

    /**
     * Write a specification to a file.
     */
    //TODO: properly not used anymore.
    def writeFile(f: List[String],info:SInfo) {
      import java.io._
      val fname = info.key.path.get + "/" + info.key.name + JConstants.SPECIFICATION_FILE_EXTENSION
      //EclipseLog.log("Write file:>" + fname)
      val writer = new java.io.PrintWriter(fname)
      val mm = new ByteArrayOutputStream()
      try {
        for (s <- f) {
          writer.append(s)
        }
      } catch {
        case ex: Throwable => ex.printStackTrace()
      } finally {
        writer.close
      }
    }

  }

  /**
   * Serialize Graph into the same representation as they are stored in a file.
   */
  def serializeSpecification(
    s: S, 
    info: SInfo, 
    asPlainGraph: Boolean = false, 
    header: List[String] = Nil, write: Boolean = false): List[String] = {//EclipseLog.log("serializeSpecification:=" + gKey)
 
      val h = new Helper(s)
      
      //Load tKey info since Version may be missing in info.t
      val t = Editor.getSpecInfo(s.g.tKey)
      
      var rs: List[String] = Nil

      //Specification Header:
      rs = "Specification" :: rs
      rs = makeVersionLong(rs,info.key.version.get)
      rs = ":" :: rs
      rs = t.key.name :: rs
      rs = makeVersionShort(rs,t.key.version.get)
      if (asPlainGraph) {
        rs = "<PLAIN>" :: rs
      }
      rs = "{\n" :: rs
      rs = rs.reverse
      if (asPlainGraph) {
        rs ++= (writeGraph1(s, h) :: Nil);
      } else {
        rs ++= (writeGraph2(s, h) :: Nil);
      }
      rs ++= (writeConstraints(s, h, info) :: Nil);
      rs ++= "}\n" :: Nil

      //Save:
      if (write) {
        h.writeFile(header ++ rs, info)
      }

      //Return Result:
      rs;
    }

  /**
   * Write the version string of a specification/signature into a buffer.
   */
  private def makeVersionLong(in:List[String], v:Version):List[String] = {
    var rs = "<version=\"" :: in;
    rs = v.name :: rs;
    rs = "\"," :: rs;
    rs = v.no.toString :: rs;
    rs = "," :: rs;
    rs = v.next.toString :: rs;
    rs = ">" :: rs;
    rs
  }

  /**
   * Write the version string of a specification/signature refered to into a buffer.
   */
  private def makeVersionShort(in:List[String], v:Version):List[String] = {
    var rs = "<version=\"" :: in;
    rs = v.name :: rs;
    rs = "\">" :: rs;
    rs
  }
 
  /**
   * Write the version string of a specification/signature refered to into a string.
   */
  def makeVersionShort(v:Version):String=makeVersionShort(Nil,v).reverse.mkString
  
  /**
   * Serialize a graph as a list of nodes, arrows and inheritance relationships
   */
  def writeGraph1(s: S, h: Helper): String = {
    //Graph:
    var rs: List[String] = Nil

    //Arrows:
    for (a: Arrow <- s.g.arrows.values.toSet) {
      rs = h.formatArrow(a) :: rs
    }

    //Inheritance Relation:
    val inhO = s.g match {
      case gra: IGraph => Some(gra.inh)
      case gra: MIGraph => Some(gra.inh)
      case _ => None
    }

    inhO match {
      case Some(inh) =>
        for (n <- inh.keySet; sn <- inh(n)) {
          rs = h.formatInheritanceRelation(n, sn) :: rs
        }
      case None => //do nothing
    }

    //Nodes:
    for (n: Node <- s.g.nodes.values.toSet) {
      if (s.g.arrowsIn(n).isEmpty && s.g.arrowsOut(n).isEmpty /*Node will not be printed by arrow*/
        || (inhO != None && (inhO.get contains n))){          /*Node will not be printed by inheritance relation*/
        rs = h.formatNode(n) :: rs
      }
    }
    rs = rs.sorted
    " Graph {\n" + rs.mkString("   ", ",\n   ", "") + "\n }\n";
  }

  /**
   * Serialize a graph more like in programming i.e. as list of "classes"
   */
  def writeGraph2(s: S, h: Helper): String = {

    //Inheritance Relation:
    val inhO = s.g match {
      case gra: IGraph => Some(gra.inh)
      case gra: MIGraph => Some(gra.inh)
      case _ => None
    }

    def body(n: Node): String = {
      var b = "";
      if (!inhO.isEmpty && (inhO.get contains n)) {
        b += inhO.get(n).map(h.formatNode(_)).toList.sortWith(_ < _).mkString(" extends ", " and ", "")
      }
      if (!s.g.arrowsOut(n, false).isEmpty) {
        b += s.g.arrowsOut(n, false).map(h.formatProperty(_)).toList.sortWith(_ < _).mkString("{\n      ", ",\n      ", "\n   }")
      }
      b
    }

    val nodes = s.g.nodes.filterNot(_._2 match {
      case Node(_, Node(_, TypeNode.TAttribute)) => true; //No Attribues
      case Node(_, TypeNode.TAttribute) => true; //No Values
      case _ => false
    } //No nodes that can be presented as attributes:
    ).filter(x => (!s.g.arrowsOut(x._2).isEmpty) || (s.g.arrowsIn(x._2).isEmpty) || (inhO != None && (inhO.get contains x._2)))
    var ns = (nodes.map(x => (h.formatNode(x._2), x._2))).toList.sortWith(_._1 < _._1)
    " Graph {\n" + ns.map(x => x._1 + body(x._2)).mkString("   ", ",\n   ", "") + "\n }\n";
  }

  /**
   * Write one constraint section of a specification into an buffer.
   */
  def writeConstraints(s: S, h: Helper, fKey:SInfo): String = {
    var rs: String = "";
      //Constraints:
      var i = 0;
      for(l <- s.csLists){
          var rs1: List[String] = Nil;
	      for(c: Constraint <- l) {
	        
	        //Signature:
	        var r = c.validator.n + "@" + c.validator.id.formatV
	
	        r += "(" + c.ps.map("\"" + _ + "\"").mkString(",") + ")"
	
	        //Arrows:
	        r += "{" + c.arity_d.map(h.formatElement(_)).mkString(",") + "}"
	        rs1 = r :: rs1
	      }
	      rs1 = rs1.sorted
	      rs +=(" Constraints!" 
	         + fKey.signatures(i).name 
           + makeVersionShort(fKey.signatures(i).version.get)
	         +"{\n" + rs1.mkString("   ", ",\n   ", "") + "\n }\n");
	      i+=1;
      }
      return rs
  }

  /**
   * Serialize signature for writing it into a text file.
   */
  def serializeSignature(validator: List[Validator], key: FKey): List[String] = {

    def formatValidator(v: Validator): String = {
      var l = v.n + "@" + v.id.formatV :: Nil //Name + id
      l = "(" + v.ps_var.mkString(",") + ")" :: l //Parameter
      l = "{" + v.arity.map(formatElement(_)).mkString(",") + "}" :: l //Add Arity
      l = "=\"" + v.template.replaceAll("\"", "\\\\\"") + "\"" :: l    //e.g. OCL
      l = " errorMsg=\"" + v.errorMsg.replaceAll("\"", "\\\\\"") + "\"" :: l //User message
      l.reverse.mkString
    }

    def formatElement(e: Element): String = {
      e match {
        case n: Node  => formatNode(n)
        case a: Arrow => formatArrow(a)
        case _        => error("Programming error");
      }
    }

    //
    //TODO Should typed signature be supported??? 
    //If yes, signature need to get a meta-model therefore
    //
    def formatNode(n: Node): String = {
      if (TypeNode.TJoker == n.t) {
        n.id.formatV + ":_"
      } else {
        n.id.formatV + ":" + n.t.id.formatV
      }
    }
    def formatArrow(a: Arrow): String = {
      var l = formatNode(a.sr) :: Nil
      if (TypeArrow.TJoker == a.t) {
        l = "-" + a.id.formatV + ":_->" :: l
      } else if (TypeArrow.TInheritance == a.t) {
        l = "-|>" :: l
      } else {
        l = "-" + a.id.formatV + ":" + a.t.id.formatV + "->" :: l
      }
      l = formatNode(a.tg) :: l
      l.reverse.mkString
    }

    //Make Signature:
    val tlanguage = validator match {
      case Nil => "OCL"
      case _ => validator.head.tLanguage
    }
    var rs: List[String] = Nil
    rs = "Signature" :: rs
    rs = makeVersionLong(rs,key.version.get)
    rs = "<" :: rs
    rs = tlanguage :: rs
    rs = "> {\n" :: rs
    rs = validator.map(formatValidator(_)).toList.sorted.mkString("\t", ",\n\t", "\n") :: rs
    rs = "}\n" :: rs
    return rs.reverse;
  }


}