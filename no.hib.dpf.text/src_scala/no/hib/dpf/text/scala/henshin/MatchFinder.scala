package no.hib.dpf.text.scala.henshin

import no.hib.dpf.text.scala.ct._
import no.hib.dpf.text.scala.ct.mutable._
import no.hib.dpf.text.scala.output.EMFOutput

import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }
import scala.collection.JavaConverters.asScalaBufferConverter
import scala.xml.Attribute
import scala.xml.Null
import scala.xml.Text

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.henshin.interpreter.InterpreterFactory
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl
import org.eclipse.emf.henshin.interpreter.impl.MatchImpl
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl
import org.eclipse.emf.henshin.model.Rule
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet


/**
 * The match finder should support to find matches of specifications in specifications.
 * The result should be a morphism. Even I would have preferred to not translate the specifications into EMF presentations, the current 
 * match finder does this and then uses Eclipse Henshin for finding matches.
 * Attention: The match morphisms cannot be printed yet since the implementation is still not finished yet.
 * However matches can already be found.
 */
object MatchFinder {
 
  /**
   * Can be changed for local tests. Is only important for the main method.
   */
  private var path2specs = "/home/hyperion/git/dpf.text/no.hib.dpf.text.resources/models"
  
  /**
   *   If both file Names are the same then the search should find an isomorphism
   */  
  private val searchName = "MPetriNet"  
  
  private val searchDomainName = "MPetriNet"   
  
  // Prepare the engine:
  private val engine = new EngineImpl();
  private val ruleApplication = new RuleApplicationImpl(engine)
  private val monitor = InterpreterFactory.INSTANCE.createApplicationMonitor();

  private var iter: Option[java.util.Iterator[org.eclipse.emf.henshin.interpreter.Match]] = None
  private var matchFound = 0;
  private var messageBuffer:List[String]=Nil;
 
  /**
   * Store a String in a buffer to generate later a console output from it.
   */
  private def myPrint(s:String)={
      messageBuffer=s::messageBuffer;
  }

  /**
   * Main method for completing the implementation without the need of a runtime eclipse instance.
   */
  def main(a: Array[String]): Unit = {
    val t = System.currentTimeMillis()
    val N = 1
    for (x <- 1 to N) {
      println(x + ". Run...");
      try {
      	  println("If not done already ...")
      	  println("Please put a dummyMetaModel.ecore into directory" + path2specs)
      	  println("Please put a dummyModel.xmi into directory" + path2specs)
      	  println("Please put a dummyRule.henshin into directory" + path2specs)
	      println(searchForMatches(null,Map.empty,null,null,false))
      }catch{
      	case ex:Throwable => ex.printStackTrace()
      }
      println("...Stop!");
    }
    val tSpend = (System.currentTimeMillis() - t);
    println("Finished! after milliseconds=" + tSpend)
    println("Average=" + (tSpend / N))
  }

  /**
   * Find all matches of specification by ids of types. 
   * If additionally names of ellements should be considered "nameConditions" does the job.
   */
  def searchForMatches(search:S, nameConditions:Map[Id,String]= Map.empty, into:S, debugDir:String, toEMF:Boolean=true): String = {
    messageBuffer=Nil;
    matchFound = 0;
    if(toEMF){
        path2specs = debugDir;
	    if(search.g.tgraph != into.g.tgraph){
	      myPrint("Search pattern and search domain not typed over the same meta-specfication!")
	      return messageBuffer.reverse.mkString;
	    }
    }
    
    val mFileName =  "dummyModel.xmi";
    val ruleFileName = "dummyRule.henshin";
    
    if(toEMF){
    	makeEMFandHenshinFiles(search, nameConditions, into, mFileName, ruleFileName)  
    }
    
    //Init:

    initRule(initModel(mFileName),ruleFileName);

    // Iterate over all matches and print them on the console:
    myPrint("\n")
    var m = nextMatch()
    
    while (m match {
      case Some(rs) => 
        true
      case None => 
        false
    }) {
      m = nextMatch()
    }

    // Save the model:
    //model.save(null);      
    messageBuffer.reverse.mkString
  }

  /**
   * Translate the problem into EMF and Henshin models
   */
  private def makeEMFandHenshinFiles(search: S, nameConditions: Map[Id,String], into: S, mFileName: String, ruleFileName: String): Unit = {//Translate Metamodel of search domain into Ecore-File: 
    val mmName = "dummyMetaModel";
    val mmFileName = mmName + ".ecore";
    val mmFile = new java.io.File(path2specs + "/" + mmFileName)
    EMFOutput.writeXML(mmFile, () => EMFOutput.graph2EcoreM_Henshin(S(into.g.tgraph,Nil)))    
    
    //Generate search domain into XMI File:
    val mFile = new java.io.File(path2specs + "/" + mFileName)
    EMFOutput.writeXML(mFile, () => EMFOutput.graph2EcoreI_Henshin(into, mmName))

    //Generate Search Pattern into Rule:
    val ruleFile = new java.io.File(path2specs + "/" + ruleFileName)
    EMFOutput.writeXML(ruleFile, () => MatchFinder.makeRule(search, mmName, nameConditions))    
  }

  /**
   * Find the next match
   */
  def nextMatch(): Option[DPFMorphism] = { 
    iter match {
      case Some(i) =>
        if (i.hasNext()) {
          val m = i.next()

          if (m.isComplete()) {
           
            matchFound+=1;
            myPrint(matchFound + ". match found!\n")
            
            val nodes = m.getRule().getLhs().getNodes()
            val myMatch = parseMatch(m, nodes)

            //Print match TODO: morphism must be parsed completely:
            //println(m)

            //Mark as complete:
            ruleApplication.setCompleteMatch(m)
            ruleApplication.execute(monitor)

            return Some(myMatch)
          }
       }
       None
      case None => None
    }
  }

  /**
   * Returns the xmi:id attribute value for the given eObject as a <tt>String</tt>.
   * Returns <b>null</b> in case there's no containing resource or the eObject simply
   * didn't have a xmi:id attribute.
   */
  def getXmiId(eObject: EObject) = {
    val xmiResource = eObject.eResource();
    if (null == xmiResource) {
      null;
    } else {
      xmiResource.asInstanceOf[XMLResource].getID(eObject);
    }
  }

   /**
    * Init model / search domain.
    */
  private def initModel(name: String): (HenshinResourceSet, EGraphImpl) = {

    // Create a resource set for the working directory
    val resourceSet = new HenshinResourceSet(path2specs);

    // Load a model:
    val model = resourceSet.getResource(name);

    // Initialize the graph:
    val graph = new EGraphImpl(model);
    
    (resourceSet, graph)
  }
  
  /**
   * Init Henshin rule.
   */ 
  private def initRule(rsAndGraph: Tuple2[HenshinResourceSet, EGraphImpl], ruleName: String): Unit = {

    // Load the Henshin module:
    val module = rsAndGraph._1.getModule(ruleName);
    
    val rule = module.getUnit("myUnit").asInstanceOf[Rule];

    val partialMatch = new MatchImpl(rule);

    //Init Rule Application:
    ruleApplication.setRule(rule)

    iter = Some(engine.findMatches(rule, rsAndGraph._2, partialMatch).iterator())

  }

  /**
   * Create a Henshin rule by creating the XML file for the rule directly.
   * Nicer it would have been to use Henshins factory methods for this, however one of my goals was to learn
   * Scala and I wanted to try Scala's native XML support.
   */
  //TODO build in value calculations (attribute conditions, minor priority):
  def makeRule(s: S, mmName: String, names: Map[Id, String]): xml.Elem = {
    try {
      import scala.xml.Attribute
      import scala.xml.Text
      import scala.xml.Null
      val g = s.g;
      var c = 0;

      //Inheritance Relation:
      val inhO = g match {
        case gra: IGraph => Some(gra.inh)
        case gra: MIGraph => Some(gra.inh)
        case _ => None
      }

      def makeGraph(side: String): xml.Elem = {

        def useSpecialAttributeIds(id: Id): String = {
          id match {
            case TypeNode.TAttribute.id => "DataType"
            case TypeArrow.TAttribute.id => "Attribute"
            case _ => id.toString
          }
        }

        <DUMMY>
          <!-- Nodes: -->
          {
            for (n <- g.nodes.values) yield {
              val matchedVar: String = if (TypeNode.TAttribute == n.t.t) { "PrimitiveType" } else { "Element" }
              var xn =
                <nodes xmi:id={ side + "__" + n.id }>
                  <type href={ mmName + ".ecore#//" + useSpecialAttributeIds(n.t.id) }/>
                  {
                    if ("lhs" != side) {
                      <attributes xmi:id={ "m_" + side + "__" + n.id } value="true">
                        <type href={ mmName + ".ecore#//" + matchedVar + "/matched" }/>
                      </attributes>
                    }
                  }{
                    if (names contains n.id) {
                      <attributes xmi:id={ "name_" + side + "__" + n.id } value={ "\"" + names(n.id) + "\"" }>
                        <type href={ mmName + ".ecore#//Element/name" }/>
                      </attributes>
                    }
                  }
                </nodes>

              //Add outgoing arrows (since arrows are internally encoded as nodes):      
              var incoming = "";
              val aOut = g.arrowsOut(n)
              if (aOut.size > 0) {
                val out = (for (a <- aOut) yield { "sr_" + side + "__" + a.id + " " }).reduceLeft(_ + _)
                incoming += out;
              }
              //Add incoming arrows:      
              val aIn = g.arrowsIn(n);
              if (aIn.size > 0) {
                val in = (for (a <- aIn) yield { " tg_" + side + "__" + a.id + " " }).reduceLeft(_ + _)
                incoming += in
              }
              //Add inhertiance arrows (incoming):                  
              var outgoing = "";
              if (None != inhO) {
                val inh = inhO.get
                //Get incoming:
                for (from <- inh.keys; to <- inh(from)) yield {
                  if (to.id == n.id) {
                    incoming += " " + side + "__" + from.id + "__" + to.id
                  }
                }
                //Get Outgoing:
                if (inh contains n) {
                  for (to <- inh(n)) yield {
                    outgoing += " " + side + "__" + n.id + "__" + to.id
                  }
                }
              }
              if ("" != incoming) {
                xn %= Attribute(None, "incoming", Text(incoming), Null);
              }
              //Add inhertiance arrows (outgoing):                  
              if ("" != outgoing) {
                xn %= Attribute(None, "outgoing", Text(outgoing), Null);
              }
              xn
            }
          }
          <!-- Arrows (also nodes here): -->
          {
            for (a <- g.arrows.values) yield {
              val matchedVar: String = if (TypeArrow.TAttribute == a.t.t) { "DataType" } else { "Element" }
              var xn =
                <nodes xmi:id={ side + "__" + a.id } outgoing={ "sr_" + side + "__" + a.id + " tg_" + side + "__" + a.id }>
                  <type href={ mmName + ".ecore#//" + useSpecialAttributeIds(a.t.id) }/>
                  {
                    if ("lhs" != side) {
                      <attributes xmi:id={ "m_" + side + "__" + a.id } value="true">
                        <type href={ mmName + ".ecore#//" + a.t.id + "/matched" }/>
                      </attributes>
                    }
                    if (names contains a.id) {
                      <attributes xmi:id={ "name_" + side + "__" + a.id } value={ "\"" + names(a.id) + "\"" }>
                        <type href={ mmName + ".ecore#//Element/name" }/>
                      </attributes>
                    }
                  }
                </nodes>
              xn
            }
          }
          <!-- For each Arrow create two edges for "sr" and "tg": -->
          {
            for (a <- g.arrows.values) yield {
              <edges xmi:id={ "sr_" + side + "__" + a.id } source={ side + "__" + a.id } target={ side + "__" + a.sr.id }>
                <type href={ mmName + ".ecore#//" + useSpecialAttributeIds(a.t.id) + "/sr" }/>
              </edges>
              <edges xmi:id={ "tg_" + side + "__" + a.id } source={ side + "__" + a.id } target={ side + "__" + a.tg.id }>
                <type href={ mmName + ".ecore#//" + useSpecialAttributeIds(a.t.id) + "/tg" }/>
              </edges>
            }
          }
          <!-- For each Extends relation create an arrow: -->
          {
            if (None != inhO) {
              val inh = inhO.get
              for (from <- inh.keys; to <- inh(from)) yield {
                <edges xmi:id={ side + "__" + from.id + "__" + to.id } source={ side + "__" + from.id } target={ side + "__" + to.id }>
                  <type href={ mmName + ".ecore#//Element/extends" }/>
                </edges>
              }
            }
          }
        </DUMMY>
      }
      
      //
      //Make Henshin Rule:
      //
      
      <henshin:Module xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:henshin="http://www.eclipse.org/emf/2011/Henshin" xmi:id="myModule">
        <imports href={ mmName + ".ecore#/" }/>
        <units xsi:type="henshin:Rule" xmi:id="myUnit" name="myUnit">
          <lhs xmi:id="lhs" name="lhs">
            { makeGraph("lhs").child }
            <formula xsi:type="henshin:Not" xmi:id="henshinNot">
              <child xsi:type="henshin:NestedCondition" xmi:id="NestedCondition">
                <conclusion xmi:id="conclusion">
                  { makeGraph("not").child }
                </conclusion>
                {
                  for { id <- g.nodes.keySet ++ g.arrows.keySet } yield {
                    c += 1
                    val xNode = <mappings xmi:id={ c.toString } origin={ "lhs__" + id } image={ "not__" + id }/>
                    xNode
                  }
                }
              </child>
            </formula>
          </lhs>
          <rhs xmi:id="rhs" name="rhs">
            { makeGraph("rhs").child }
          </rhs>
          {
            for { id <- g.nodes.keySet ++ g.arrows.keySet } yield {
              c += 1
              val xNode = <mappings xmi:id={ c.toString } origin={ "lhs__" + id } image={ "rhs__" + id }/>
              xNode
            }
          }
        </units>
      </henshin:Module>
    } catch {
      case ex: Throwable =>
        ex.printStackTrace();
        <error/>
    }
  }
  
  /**
   * Get the morphism from the Henshin match.
   * Attention: this is basically the method which need to be finished. 
   */
  private def parseMatch(m: org.eclipse.emf.henshin.interpreter.Match, nodes: org.eclipse.emf.common.util.EList[org.eclipse.emf.henshin.model.Node]): DPFMorphism = {

    //Vars:
    val nodeMap = MMap[Id, Id]()
    val codomainNodes = MSet[Id]()
    val arrowMap = MMap[Id, Id]()
    val codomainArrows = MSet[Id]()

    for (n <- nodes.asScala) yield {

      //Domain:
      val srN: String = getXmiId(n).toString.split("__")(1);

      //Codomain: 
      val mElement = m.getNodeTarget(n)
      val attrEKind = mElement.eGet(mElement.eClass().getEStructuralFeature("eKind")).toString()

      //Get Ids:
      val srId = parseDomainId(srN, attrEKind)
      val trId = parseCodomainId(mElement, attrEKind)

      //println(srId + " -> " + trId) 
      
      //
      //Nodes:
      //
      if ((attrEKind startsWith "N") || (attrEKind startsWith "P")) {
        nodeMap += (srId -> trId)
      
      //  
      //Arrows:
      //  
      } else if (attrEKind startsWith "A") {
        arrowMap += (srId -> trId)
        
      //
      //Error:
      //  
      } else {
        sys.error("Not handled:" + attrEKind)
      }

      //************************************************************

      //TODO to be implemented:
      
      //Inheritance:
      //(x,y) -> (m(x),y(y))      

      //Constraints:
      //(x,y) -> (m(x),y(y))

      //     println(attrEKind + "\t:"+ srN + "\t => \t" + mId)

    }
    val nodesSM = SetMorphism(nodeMap.toMap, codomainNodes.toSet)
    val arrowsSM = SetMorphism(arrowMap.toMap, codomainArrows.toSet)
    
    //TODO: Without sr and tg maps morphisms cannot be print and used!
    val domainSrTg = ArrowSrTg(Map[Id, Id](), Map[Id, Id]())  //TODO sr map, tr map    
    val codmainSrTg = ArrowSrTg(Map[Id, Id](), Map[Id, Id]()) //TODO sr map, tr map
    
    
    val gM = ArbitraryMorphismWithIds(nodesSM, (arrowsSM, domainSrTg, codmainSrTg))
    
    val igM = IMorphism(gM, Set(), Set())     //TODO handle inheritance
    val retM = DPFMorphism(igM, Set(), Set()) //TODO handle constraints
    
    //println(retM)
    
    retM
  }

  /**
   * Get the element id for the graph element in the rule:
   */
  private def parseDomainId(srN: String, attrEKind: String): Id = {
    val mId = if (attrEKind == "A" || attrEKind == "N" || attrEKind == "AP") {
      RId(srN.substring(2))
    } else if (attrEKind == "P") {
      val v = srN.substring(srN.indexOf('(') + 1, srN.lastIndexOf(')'))
      srN.splitAt(srN.indexOf('('))._1 match {
        case "VString" => VString(v)
        case "VLong" => VLong(v.toLong)
        case "VInt" => VInt(v.toInt)
        case "VBoolean" => VBoolean(v.toBoolean)
        case "VByte" => VByte(v.toByte)
        case "VShort" => VShort(v.toShort)
        case "VFloat" => VFloat(v.toFloat)
        case "VDouble" => VDouble(v.toDouble)
        case "AVariable" => AVariable(v)
      }
    } else if (attrEKind == "NP") {
      TypeP.nameToTypeP(srN) match {
        case Some(t) => t.id
        case None => sys.error("Type does not exists 1")
      }
    } else {
      sys.error("Programming error 1: Missing case!")
    }
    mId
  }

  /**
   * Get the element id for the graph element that is matched:
   */
  private def parseCodomainId(mElement: org.eclipse.emf.ecore.EObject, attrEKind: String): Id = {

    //Get from codomain element, id and type:
    val attrId = mElement.eGet(mElement.eClass().getEIDAttribute()).toString()
    val nodeType = mElement.eClass().getName()

    val mId = if (attrEKind == "A" || attrEKind == "N" || attrEKind == "AP") {
      RId(attrId)
    } else if (attrEKind == "P") {
      val v = attrId
      TypeP.nameToTypeP(nodeType) match {
        case Some(t) => TypeP.toValue(t, v)
        case None => sys.error("Type does not exists 2")
      }
    } else if (attrEKind == "NP") {
      TypeP.nameToTypeP(attrId) match {
        case Some(t) => t.id
        case None => sys.error("Type does not exists 3")
      }
    } else {
      sys.error("Programming error 2: Missing case!")
    }
    mId
  }

}