package no.hib.dpf.text.scala.output

//Scala:
import no.hib.dpf.text.scala.ct._
import no.hib.dpf.text.scala.ct.mutable._
import no.hib.dpf.text.scala.ct.{ Element => DElement }
import no.hib.dpf.text.scala.ct.{ Node => DNode }
import no.hib.dpf.text.scala.ct.{ Arrow => DArrow }

import scala.collection._
import scala.collection.mutable.{ Map => MMap }
import scala.xml._
import scala.xml.{ Node => XNode }

//Java:
import java.io.{ File => JFile }

/**
  * Create Ecore and XMI files by creating XML files directly.
  * Nicer it would have been to use EMF's factory methods for this, however one of my goals was to learn
  * Scala and I wanted to try Scala's native XML support. In addition it has been an advantage to do it like this,
  * I can create XMI files even the corresponding Ecore file may not exist.
  */
object EMFOutput extends TypeConverter {
  
  /**
   * Include for my simple data types
   */
  val simpleDataTypes: xml.Elem =
    <simpleDataTypes>
      <!-- Meta-Level-Types: -->
      <eClassifiers eSuperTypes="#//Element " xsi:type="ecore:EClass" name="DataType"> </eClassifiers>
      <eClassifiers xsi:type="ecore:EClass" name="Attribute" eSuperTypes="#//Element ">
        <eStructuralFeatures xsi:type="ecore:EReference" name="sr" lowerBound="1" eType="#//Element"/>
        <eStructuralFeatures xsi:type="ecore:EReference" name="tg" lowerBound="1" eType="#//DataType"/>
      </eClassifiers>
      <!-- Primitive-Types: -->
      <eClassifiers xsi:type="ecore:EClass" name="PrimitiveType">
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="eKind" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="matched" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBoolean"/>
      </eClassifiers>
      <eClassifiers xsi:type="ecore:EClass" name="Boolean" eSuperTypes="#//PrimitiveType ">
        <eStructuralFeatures xsi:type="ecore:EAttribute" iD="true" name="value" lowerBound="1" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBoolean"/>
      </eClassifiers>
      <eClassifiers xsi:type="ecore:EClass" name="Char" eSuperTypes="#//PrimitiveType ">
        <eStructuralFeatures xsi:type="ecore:EAttribute" iD="true" name="value" lowerBound="1" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EChar"/>
      </eClassifiers>
      <eClassifiers xsi:type="ecore:EClass" name="Byte" eSuperTypes="#//PrimitiveType ">
        <eStructuralFeatures xsi:type="ecore:EAttribute" iD="true" name="value" lowerBound="1" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EByte"/>
      </eClassifiers>
      <eClassifiers xsi:type="ecore:EClass" name="Short" eSuperTypes="#//PrimitiveType ">
        <eStructuralFeatures xsi:type="ecore:EAttribute" iD="true" name="value" lowerBound="1" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EShort"/>
      </eClassifiers>
      <eClassifiers xsi:type="ecore:EClass" name="Int" eSuperTypes="#//PrimitiveType ">
        <eStructuralFeatures xsi:type="ecore:EAttribute" iD="true" name="value" lowerBound="1" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
      </eClassifiers>
      <eClassifiers xsi:type="ecore:EClass" name="Long" eSuperTypes="#//PrimitiveType ">
        <eStructuralFeatures xsi:type="ecore:EAttribute" iD="true" name="value" lowerBound="1" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//ELong"/>
      </eClassifiers>
      <eClassifiers xsi:type="ecore:EClass" name="Float" eSuperTypes="#//PrimitiveType ">
        <eStructuralFeatures xsi:type="ecore:EAttribute" iD="true" name="value" lowerBound="1" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EFloat"/>
      </eClassifiers>
      <eClassifiers xsi:type="ecore:EClass" name="Double" eSuperTypes="#//PrimitiveType ">
        <eStructuralFeatures xsi:type="ecore:EAttribute" iD="true" name="value" lowerBound="1" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDouble"/>
      </eClassifiers>
      <eClassifiers xsi:type="ecore:EClass" name="String" eSuperTypes="#//PrimitiveType ">
        <eStructuralFeatures xsi:type="ecore:EAttribute" iD="true" name="value" lowerBound="1" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      </eClassifiers>
    </simpleDataTypes>

  /**
   * Include references to my simple data types
   */
  val simpleDataTypeReferences: xml.Elem =
    <simpleDataTypeReferences>
      <!-- Meta-Level-Types: -->
      <eStructuralFeatures xsi:type="ecore:EReference" name="datatypes" upperBound="-1" eType="#//DataType" containment="true"/>
      <eStructuralFeatures xsi:type="ecore:EReference" name="attributes" upperBound="-1" eType="#//Attribute" containment="true"/>
      <!-- Primitive-Types: -->
      <eStructuralFeatures xsi:type="ecore:EReference" name="booleans" upperBound="-1" eType="#//Boolean" containment="true"/>
      <eStructuralFeatures xsi:type="ecore:EReference" name="chars" upperBound="-1" eType="#//Char" containment="true"/>
      <eStructuralFeatures xsi:type="ecore:EReference" name="bytes" upperBound="-1" eType="#//Byte" containment="true"/>
      <eStructuralFeatures xsi:type="ecore:EReference" name="shorts" upperBound="-1" eType="#//Short" containment="true"/>
      <eStructuralFeatures xsi:type="ecore:EReference" name="ints" upperBound="-1" eType="#//Int" containment="true"/>
      <eStructuralFeatures xsi:type="ecore:EReference" name="longs" upperBound="-1" eType="#//Long" containment="true"/>
      <eStructuralFeatures xsi:type="ecore:EReference" name="floats" upperBound="-1" eType="#//Float" containment="true"/>
      <eStructuralFeatures xsi:type="ecore:EReference" name="doubles" upperBound="-1" eType="#//Double" containment="true"/>
      <eStructuralFeatures xsi:type="ecore:EReference" name="strings" upperBound="-1" eType="#//String" containment="true"/>
    </simpleDataTypeReferences>

  /**
    * Write file pretty printed into an UTF8 XML file
    */
  def writeXML(file: JFile, makeXml: () => scala.xml.Elem): Unit = {
    import java.io._
    try {
      val pp = new PrettyPrinter(160, 2)
      println("File:" + file.getPath())
      val writer = new PrintWriter(new BufferedWriter(new FileWriter(file)));
      try {
        writer.println("""<?xml version="1.0" encoding="UTF-8"?>""");
        writer.println(pp.format(makeXml()));
      } finally {
        writer.close()
      }
    } catch {
      case ex: Throwable => ex.printStackTrace()
    }
  }

  //-------------------------------------------------------------------------------------------------------------------------------

  /**
   * Create a Ecore presentation of a specification for using it together with Henshin
   */
  def graph2EcoreM_Henshin(s: S): xml.Elem = {
    val g = s.g
    val nodesWithoutVA = g.nodes.values.filterNot(_ match {
      case DNode(_, DNode(_, TypeNode.TAttribute)) => true; //Values
      case DNode(_, TypeNode.TAttribute) => true; //Attributes      
      case _ => false
    })
    val arrowsWithoutValues = g.arrows.values.filterNot(_ match { case DArrow(_, _, _, DArrow(_, _, _, TypeArrow.TAttribute)) => true; case _ => false })

    //Inheritance Relation:
    val inhO = g match {
      case gra: IGraph => Some(gra.inh)
      case gra: MIGraph => Some(gra.inh)
      case _ => None
    }
    def getInh(n: DNode): String = {
      inhO match {
        case None => sys.error("getInh(): No inheritance defined!");
        case Some(i) =>
          var rs = "#//Element " :: Nil
          for (sn <- i(n)) {
            rs = "#//ID" :: rs
            rs = EcoreHelper.rIdvalue(sn) :: rs
            rs = " " :: rs
          }
          rs.reverse.mkString;
      }
    }
    <ecore:EPackage xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" name="Graph" nsURI="graph" nsPrefix="graph">
      <!-- Containment Relationships: -->
      <eClassifiers xsi:type="ecore:EClass" name="Graph">
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="id" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
        {
          for { e <- nodesWithoutVA ++ arrowsWithoutValues } yield <eStructuralFeatures xsi:type="ecore:EReference" name={ (e.id + "s").toLowerCase } upperBound="-1" eType={ "#//" + e.id } containment="true"/>
        }
        <!-- Simple Dataypes: -->
        { simpleDataTypeReferences.child }
      </eClassifiers>
      <!-- Element: -->
      <eClassifiers xsi:type="ecore:EClass" name="Element" abstract="true">
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="name" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="id" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString" iD="true"/>
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="matched" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EBoolean"/>
        <eStructuralFeatures xsi:type="ecore:EReference" name="extends" upperBound="-1" eType="#//Element"/>
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="eKind" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      </eClassifiers>
      <!-- Nodes: -->
      {
        for { n <- nodesWithoutVA } yield {
          var xn =
            <eClassifiers xsi:type="ecore:EClass" name={ n.id.toString }>
              {
                for { a <- g.arrowsOut(n).filterNot(_ match { case DArrow(_, _, _, DArrow(_, _, _, TypeArrow.TAttribute)) => true; case _ => false }) } yield <eStructuralFeatures xsi:type="ecore:EReference" name={ a.id.toString.toLowerCase } upperBound="-1" eType={ "#//" + a.id }/>
              }
            </eClassifiers>

          //Add inheritance:
          if (None != inhO && (inhO.get contains n)) {
            xn %= Attribute(None, "eSuperTypes", Text(getInh(n)), Null)
          } else {
            xn %= Attribute(None, "eSuperTypes", Text("#//Element "), Null)
          }
          xn
        }
      }
      <!-- Simple Datatypes: -->
      { simpleDataTypes.child }
      <!-- Arrows: -->
      {
        for { a <- arrowsWithoutValues } yield {
          <eClassifiers xsi:type="ecore:EClass" name={ a.id.toString } eSuperTypes="#//Element ">
            <eStructuralFeatures xsi:type="ecore:EReference" name="sr" lowerBound="1" eType={ "#//" + a.sr.id }/>
            <eStructuralFeatures xsi:type="ecore:EReference" name="tg" lowerBound="1" eType={ "#//" + a.tg.id }/>
          </eClassifiers>
        }
      }
    </ecore:EPackage>
  }

  /**
   * Create a XMI presentation of a specification for using it together with Henshin
   */
  def graph2EcoreI_Henshin(s: S, ecoreName: String): xml.Elem = {
    val g = s.g
    implicit val ns = EcoreHelper.split(g.iteratorNodes)
    val as = EcoreHelper.split(g.iteratorArrows)
    var xn =
      <graph:Graph xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:graph="graph" xsi:schemaLocation={ "graph " + ecoreName + ".ecore" }>
        
    	<!--Nodes (non primitives) with inheritance relations: -->
        {
          //Inheritance Relation:
          val inhO = g match {
            case gra: IGraph => Some(gra.inh)
            case gra: MIGraph => Some(gra.inh)
            case _ => None
          }
          def getInh(n: DNode): String = {
            inhO match {
              case None => sys.error("getInh(): No inheritance defined!");
              case Some(i) =>
                var rs = "" :: Nil
                for (sn <- i(n)) {
                  rs = EcoreHelper.rIdvalue(sn) :: rs
                  rs = " " :: rs
                }
                rs.reverse.mkString;
            }
          }
          //None Attributes:
          for (
            n <- ns._1.values.flatten.filterNot(_ match {
                case DNode(_, DNode(_, TypeNode.TAttribute)) => true;
                case _ => false
              })
          ) yield {

            var xn = <DUMMY/>.copy(label = (n.t.id + "s").toLowerCase)
            xn %= Attribute(None, "id", Text(EcoreHelper.rIdvalue(n)), Null)
            xn %= Attribute(None, "name", Text(g.names(n.id)), Null)
            xn %= Attribute(None, "eKind", Text("N"), Null)
            if (None != inhO && (inhO.get contains n)) {
              xn %= Attribute(None, "extends", Text(getInh(n)), Null)
            }

            //All non attributes grouped by their type (arrow direction)
            for (
              e <- g.arrowsOut(n).filterNot(_ match {
                case DArrow(_, _, _, TypeArrow.TAttribute) => true;
                case _ => false
              }).groupBy(_.t)
            ) {
              val links = for (a <- e._2) yield { EcoreHelper.arrowtrRef(a) + " " }
              xn %= Attribute(None, e._1.id.toString.toLowerCase, Text(links.reduceLeft(_ + _)), Null);
            }
            xn
          }
        }        
        <!--Nodes (primitives): -->
        {
          for (
            n <- ns._1.values.flatten.filter(_ match {
              case DNode(_, DNode(_, TypeNode.TAttribute)) => true;
              case _ => false
            })
          ) yield {
            var xn = <DUMMY/>.copy(label = (n.t.id + "s").toLowerCase())
            xn %= Attribute(None, "value", Text(EcoreHelper.value(n)), Null)
            xn %= Attribute(None, "eKind", Text("P"), Null)
            xn
          }
        }

        <!--Arrows: -->
        {
          for (a <- as._1.values.flatten) yield {
            var xn = <DUMMY/>.copy(label = (a.t.id + "s").toLowerCase)
            xn %= Attribute(None, "id", Text(EcoreHelper.rIdvalue(a)), Null)
            xn %= Attribute(None, "name", Text(g.names(a.id)), Null)
            xn %= Attribute(None, "eKind", Text("A"), Null)
            xn %= Attribute(None, "sr", Text(EcoreHelper.rIdvalue(a.sr)), Null);
            xn %= Attribute(None, "tg", EcoreHelper.arrowtrRef(a), Null);
            xn
          }
        }
        
        <!--
        	Special handling for Attributes:
        -->

        <!--Nodes (attributes): -->        
        {
        	for(
        	 n<-g.iteratorNodes.filter(_ match {
              case DNode(_,TypeNode.TAttribute) => true;
              case _ => false
            })
          ) yield {
            var xn = <datatypes/>
            xn %= Attribute(None, "id", Text(n.id.toString), Null)
            xn %= Attribute(None, "name", Text(n.id.toString), Null)
            xn %= Attribute(None, "eKind", Text("NP"), Null)
            xn
        	}
        }

        <!--Arrows (attributes): -->        
        {
        	for(
        	 a<-g.iteratorArrows.filter(_ match {
              case DArrow(_,_,_,TypeArrow.TAttribute) => true;
              case _ => false
            })
          ) yield {
            var xn = <attributes/>
                xn %= Attribute(None, "id", Text(EcoreHelper.rIdvalue(a)), Null)
                xn %= Attribute(None, "name", Text(g.names(a.id)), Null)
                xn %= Attribute(None, "eKind", Text("AP"), Null)
                xn %= Attribute(None, "sr", Text(EcoreHelper.rIdvalue(a.sr)), Null);
            	xn %= Attribute(None, "tg", Text(a.tg.id.toString), Null);
            xn
        	}
        }

      </graph:Graph>
    xn %= Attribute(None, "id", Text(ecoreName + "_Instance:" + new java.util.Date), Null)
    xn
  }

  //-------------------------------------------------------------------------------------------------------------------------------

  /**
   * Create a simple Ecore presentation of a specification for using it together with OCL
   */
  def graph2EcoreM_OCL(g: AbstractGraph, ecoreName: String): xml.Elem = {

    val nodesWithoutVA = g.nodes.values.filterNot(_ match {
      case DNode(_, DNode(_, TypeNode.TAttribute)) => true; //Values
      case DNode(_, TypeNode.TAttribute) => true; //Attributes
      case _ => false
    })
    val arrowsWithoutValues = g.arrows.values.filterNot(_ match {
      case DArrow(_, _, _, DArrow(_, _, _, TypeArrow.TAttribute)) => true;
      case _ => false
    })

    //Inheritance Relation:
    val inhO = g match {
      case gra: IGraph => Some(gra.inh)
      case gra: MIGraph => Some(gra.inh)
      case _ => None
    }

    def getInh(n: DNode): String = {
      inhO match {
        case None => sys.error("getInh(): No inheritance defined!");
        case Some(i) =>
          var rs = "#//Element " :: Nil
          for (sn <- i(n)) {
            rs = "#//ID" :: rs
            rs = EcoreHelper.rIdvalue(sn) :: rs
            rs = " " :: rs
          }
          rs.reverse.mkString;
      }
    }

    <ecore:EPackage xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" name="Graph" nsURI="graph" nsPrefix="graph">
      <!-- Containment Relationships: -->
      <eClassifiers xsi:type="ecore:EClass" name="Graph">
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="id" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
        {
          for { e <- nodesWithoutVA } yield <eStructuralFeatures xsi:type="ecore:EReference" name={ (e.id + "s").toLowerCase } upperBound="-1" eType={ "#//" + e.id } containment="true"/>
        }
        <!-- Simple Dataypes: -->
        { simpleDataTypeReferences.child }
      </eClassifiers>
      <!-- Element: -->
      <eClassifiers xsi:type="ecore:EClass" name="Element" abstract="true">
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="name" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="id" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString" iD="true"/>
      </eClassifiers>
      <!-- Nodes: -->
      {
        for { n <- nodesWithoutVA } yield {
          var xn = {
            <eClassifiers xsi:type="ecore:EClass" name={ n.id.toString }>
              {
                //References:
                for {
                  a <- g.arrowsOut(n).filterNot(_ match {
                    case DArrow(_, _, _, DArrow(_, _, _, TypeArrow.TAttribute)) => true; //Attributes
                    case DArrow(_, _, _, TypeArrow.TAttribute) => true; //Values
                    case _ => false
                  })
                } yield <eStructuralFeatures xsi:type="ecore:EReference" name={ a.id.toString } eOpposite={ "#//" + a.tg.id + "/O" + a.id.toString } upperBound="-1" eType={ "#//" + a.tg.id }/>
              }
              {
                //References to Attributes:
                for {
                  a <- g.arrowsOut(n).filter(_ match {
                    case DArrow(_, _, _, TypeArrow.TAttribute) => true;
                    case _ => false
                  })
                } yield <eStructuralFeatures xsi:type="ecore:EReference" name={ a.id.toString } upperBound="-1" eType={ "#//" + a.tg.id }/>
              }
              {
                //Opposite References:
                for {
                  a <- g.arrowsIn(n)
                } yield <eStructuralFeatures xsi:type="ecore:EReference" name={ "O" + a.id.toString } eOpposite={ "#//" + a.sr.id + "/" + a.id.toString } upperBound="-1" eType={ "#//" + a.sr.id }/>
              }
            </eClassifiers>
          }
          //Add inheritance:
          if (None != inhO && (inhO.get contains n)) {
            xn %= Attribute(None, "eSuperTypes", Text(getInh(n)), Null)
          } else {
            xn %= Attribute(None, "eSuperTypes", Text("#//Element "), Null)
          }
          xn
        }
      }
      <!-- Simple Datatypes: -->
      { simpleDataTypes.child }
    </ecore:EPackage>
  }

 /**
   * Create a simple XMI presentation of a specification for using it together with OCL
   */
  def graph2EcoreI_OCL(g: AbstractGraph, mmName: String): xml.Elem = {
    implicit val ns = EcoreHelper.split(g.iteratorNodes)
    val as = EcoreHelper.split(g.iteratorArrows)
    var xn =
      <graph:Graph xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:graph="graph" xsi:schemaLocation={ "graph " + mmName + ".ecore" }>
        <!--Nodes (no primitives): -->
        {
          for (n <- ns._1.values.flatten.filterNot(_ match { case DNode(_, DNode(_, TypeNode.TAttribute)) => true; case _ => false })) yield {
            var xn = <DUMMY/>.copy(label = (n.t.id + "s").toLowerCase)

            xn %= Attribute(None, "id", Text(EcoreHelper.rIdvalue(n)), Null)
            xn %= Attribute(None, "name", Text(g.names(n.id)), Null)

            //All non attributes grouped by their type (arrow direction)
            for (
              e <- g.arrowsOut(n).filterNot(_ match {
                case DArrow(_, _, _, TypeArrow.TAttribute) => true;
                case _ => false
              }).groupBy(_.t)
            ) {
              val links = for (a <- e._2) yield { EcoreHelper.arrowtrRef(a) + " " }
              xn %= Attribute(None, e._1.id.toString, Text(links.reduceLeft(_ + _)), Null);
            }
            //(opposite arrow direction)
            for (
              e <- g.arrowsIn(n).filterNot(_ match {
                case DArrow(_, _, _, TypeArrow.TAttribute) => true;
                case _ => false
              }).groupBy(_.t)
            ) {
              val links = for (a <- e._2) yield { EcoreHelper.arrowsrRef(a) + " " }
              xn %= Attribute(None, "O" + e._1.id.toString, Text(links.reduceLeft(_ + _)), Null);
            }

            xn
          }
        }
        <!--Nodes (primitives): -->
        {
          for (n <- ns._1.values.flatten.filter(_ match { case DNode(_, DNode(_, TypeNode.TAttribute)) => true; case _ => false })) yield {
            var xn = <DUMMY/>.copy(label = (n.t.id + "s").toLowerCase())
            xn %= Attribute(None, "value", Text(EcoreHelper.value(n)), Null)
            xn
          }
        }
      </graph:Graph>
    xn %= Attribute(None, "id", Text(mmName + "_Instance:" + new java.util.Date), Null)
    xn
  }

  //-------------------------------------------------------------------------------------------------------------------------------

  /**
   * Create a Ecore presentation of a specification for a user (as export in a batch file) 
   */
  def spec2EcoreM_User(s: S): xml.Elem = {
    val g = s.g;
    val h = new UserOutputHelper(g);

    //Inheritance Relation:
    val inhO = g match {
      case gra: IGraph => Some(gra.inh)
      case gra: MIGraph => Some(gra.inh)
      case _ => None
    }
    def getInh(n: DNode): String = {
      inhO match {
        case None => sys.error("getInh(): No inheritance defined!");
        case Some(i) =>
          var rs: List[String] = Nil
          for (sn <- i(n)) {
            rs = "#//" :: rs
            rs = h.getName(sn) :: rs
            rs = " " :: rs
          }
          rs.reverse.mkString;
      }
    }
    <ecore:EPackage xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" name="Graph" nsURI="graph" nsPrefix="graph">
      <!-- Containment Relationships: -->
      <eClassifiers xsi:type="ecore:EClass" name="Graph">
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="id" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
        {
          for { e <- h.nodesWithoutVA } yield <eStructuralFeatures xsi:type="ecore:EReference" name={ (h.getName(e) + "s").toLowerCase } upperBound="-1" eType={ "#//" + h.getName(e) } containment="true"/>
        }
      </eClassifiers>
      <!-- Element: -->
      <eClassifiers xsi:type="ecore:EClass" name="Element" abstract="true">
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="id" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString" iD="true"/>
        <eStructuralFeatures xsi:type="ecore:EAttribute" name="name" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
      </eClassifiers>
      <!-- Nodes: -->
      {
        for { n <- h.nodesWithoutVA } yield {
          var xn = {
            <eClassifiers xsi:type="ecore:EClass" name={ h.getName(n) }>
              {
                //References:
                for {
                  a <- g.arrowsOut(n).filterNot(_ match {
                    case DArrow(_, _, _, DArrow(_, _, _, TypeArrow.TAttribute)) => true; //Attributes
                    case DArrow(_, _, _, TypeArrow.TAttribute) => true; //Values
                    case _ => false
                  })
                } yield <eStructuralFeatures xsi:type="ecore:EReference" name={ h.getName(a) } upperBound="-1" eType={ "#//" + h.getName(a.tg) }/>
              }
              {
                //References to Attributes:
                for {
                  a <- g.arrowsOut(n).filter(_ match {
                    case DArrow(_, _, _, TypeArrow.TAttribute) => true;
                    case _ => false
                  })
                } yield <eStructuralFeatures xsi:type="ecore:EAttribute" name={ h.getName(a) } upperBound="-1" ordered="false" unique="false" eType={ "ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//" + h.getName(a.tg) }/>
              }
            </eClassifiers>
          }
          //Add inheritance:
          if (None != inhO && (inhO.get contains n)) {
            xn %= Attribute(None, "eSuperTypes", Text(getInh(n)), Null)
          } else {
            xn %= Attribute(None, "eSuperTypes", Text("#//Element "), Null)
          }
          xn
        }
      }
    </ecore:EPackage>
  }

  /**
   * Create a XMI presentation of a specification for a user (as export in a batch file) 
   */
  def spec2EcoreI_User(s: S, mmName: String): xml.Elem = {
    //Var:	  
    val g = s.g
    implicit val ns = EcoreHelper.split(g.iteratorNodes)
    val as = EcoreHelper.split(g.iteratorArrows)
    val h = new UserOutputHelper(s.g.tgraph);

    def addChild(n: XNode, newChild: XNode) = n match {
      case Elem(prefix, label, attribs, scope, child @ _*) => Elem(prefix, label, attribs, scope, child ++ newChild: _*)
      case _ => error("Can only add children to elements!")
    }

    var xn =
      <graph:Graph xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:graph="graph" xsi:schemaLocation={ "graph " + mmName + ".ecore" }>
        <!--Nodes (no primitives): -->
        {
          for (n <- ns._1.values.flatten.filterNot(_ match { case DNode(_, DNode(_, TypeNode.TAttribute)) => true; case _ => false })) yield {
            var xn = <DUMMY/>.copy(label = (h.getName(n.t) + "s").toLowerCase)

            xn %= Attribute(None, "name", Text(g.names(n.id)), Null)
            xn %= Attribute(None, "id", Text(EcoreHelper.rIdvalue(n)), Null)

            //All references to all "classes":
            for (
              e <- g.arrowsOut(n).filterNot(_ match {
                case DArrow(_, _, _, TypeArrow.TAttribute) => true; //No Attributes          
                case DArrow(_, _, _, DArrow(_, _, _, TypeArrow.TAttribute)) => true; //No Values
                case _ => false
              }).groupBy(_.t)
            ) {
              val links = for (a <- e._2) yield { EcoreHelper.arrowtrRef(a) + " " }
              xn %= Attribute(None, h.getName(e._1), Text(links.reduceLeft(_ + _)), Null);
            }

            //Add all values: -->
            for (
              e <- g.arrowsOut(n).filter(_ match {
                case DArrow(_, _, _, DArrow(_, _, _, TypeArrow.TAttribute)) => true; //No Values
                case _ => false
              }).groupBy(_.t)
            ) {
              for (a <- e._2) {
                val cName = h.getName(a.t);
                var child: XNode = scala.xml.XML.loadString("<" + cName + ">" + a.tg.id.formatV + "</" + cName + ">")
                xn = addChild(xn, child)
              }
            }
            xn
          }
        }
      </graph:Graph>
    xn %= Attribute(None, "id", Text(mmName + "_Instance:" + new java.util.Date), Null)
    xn
  }

  //-------------------------------------------------------------------------------------------------------------------------------
  //-------------------------------------------------------------------------------------------------------------------------------
  //------------------------------------------------------------------------------------------------------------------------------- 
  
	/**
	 * Helper methods to create a unique names from ids
	 */
	private class UserOutputHelper(g: AbstractGraph) {
	  
    val nodesWithoutVA = g.nodes.values.filterNot(_ match {
	    case DNode(_, DNode(_, TypeNode.TAttribute)) => true; //Values
	    case DNode(_, TypeNode.TAttribute) => true; //Attributes
	    case _ => false
	  })
	  val arrowsWithoutValues = g.arrows.values.filterNot(_ match {
	    case DArrow(_, _, _, DArrow(_, _, _, TypeArrow.TAttribute)) => true;
	    case _ => false
	  })
	
	  //All names that are assigned to more than one id:
	  val mapNames = g.names groupBy { _._2 } map { case (key, value) => (key, value.unzip._1) }
	  val dnames: Set[String] = Set((mapNames filter {
	    case (value, keys) => keys.size > 1;
	    case _ => false;
	  }).keys.toSeq: _*)
	
    /**
      * Get a name for a DPF Element
      */
	  def getName(e: DElement): String = {
	    e match {
	      case TypeP.TString => "EString"
	      case TypeP.TLong => "ELong"
	      case TypeP.TInt => "EInt"
	      case TypeP.TFloat => "EFloat"
	      case TypeP.TDouble => "EDouble"
	      case TypeP.TBoolean => "EBoolean"
	      case TypeP.TChar => "EChar"
	      case TypeP.TShort => "EShort"
	      case TypeP.TByte => "EByte"
	      case node: DNode => g.names.get(e.id) match {
	        case None => e.id.toString
	        case Some(n) =>
	          if (!(dnames contains n)) {
	            n
	          } else {
	            //Check if only node:
	            var c = 0;
	            for (i <- mapNames(n)) {
	              if (g.nodes contains i) {
	                c += 1
	                if (1 < c) {
	                  return n + "_" + e.id.toString
	                }
	              }
	            }
	            return n
	          }
	      }
	      case arrow: DArrow => g.names.get(e.id) match {
	        case None => e.id.toString
	        case Some(n) =>
	          if (!(dnames contains n)) {
	            n
	          } else {
	            //Check if only one arrow with same source:
	            for (i <- mapNames(n)) {
	              if (g.arrows contains i) {
	                val tA = g.arrows(i);
	                if (tA.id != arrow.id && arrow.sr == tA.sr) {
	                  return n + "_" + e.id.toString
	                }
	              }
	            }
	            return n
	          }
	      }
	      case _ => sys.error("Programming error")
	    }
	  }
	}  
  
	
/**
 * Helper methods to translate ids into positions in the XML/XMI-file
 */
private object EcoreHelper {
  def split[T <: DElement](i: Iterator[T]) = {
    val elems = MMap[Type, List[T]]()
    //Split Elements according to their types:
    for (e <- i) {
      if (elems contains e.t) {
        //Filterout values:
        e.t match {
          case TypeNode.TAttribute =>
          case TypeArrow.TAttribute =>
          case _ => elems += e.t -> (e :: elems(e.t))
        }
      } else {
        //Filterout values:
        e.t match {
          case TypeNode.TAttribute =>
          case TypeArrow.TAttribute =>
          case _ => elems += e.t -> (e :: Nil)
        }
      }
    }
    //Save positions to ids
    val pos = MMap[Id, Int]()
    for (l <- elems.values) {
      var c = 0
      for (e <- l) {
        pos += e.id -> c
        c += 1
      }
    }
    (elems, pos)
  }
  def lfirstChar(s: String) = s.head.toString.toLowerCase + s.tail

  /**
    * Node contains a value
    */
  def value(n: DNode) = n match {
    case DNode(v: AValue, _) => v.formatV
    case _ => sys.error("Programming error!")
  }
  /**
    * Node a "usual" node
    */
  def rIdvalue(e: DElement) = e match {
    case DNode(rid @ RId(_), _) => rid.vToString
    case DArrow(rid @ RId(_), _, _, _) => rid.vToString
    case _ => sys.error("Programming error! RId not found:" + e)
  }
  /**
    * A reference to the source of an arrow
    */
  def arrowsrRef(a: DArrow)(implicit ns: (MMap[Type, List[DNode]], MMap[Id, Int])) = a match {
    case DArrow(_, _, _, DArrow(_, _, _, TypeArrow.TAttribute)) => Text("//@" + lfirstChar("" + a.sr.t.id) + "s." + ns._2(a.sr.id))
    case DArrow(_, sr, _, _) => Text(rIdvalue(sr))
    case _ => sys.error("Programming error! RId not found:" + a)
  }
  /**
    * A reference to the target of an arrow
    */
  def arrowtrRef(a: DArrow)(implicit ns: (MMap[Type, List[DNode]], MMap[Id, Int])) = a match {
    case DArrow(_, _, _, DArrow(_, _, _, TypeArrow.TAttribute)) => Text("//@" + lfirstChar("" + a.tg.t.id) + "s." + ns._2(a.tg.id))
    case DArrow(_, _, tg, _) => Text(rIdvalue(tg))
    case _ => sys.error("Programming error! RId not found:" + a)
  }
}
	
}