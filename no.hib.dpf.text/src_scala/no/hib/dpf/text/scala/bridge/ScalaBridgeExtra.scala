package no.hib.dpf.text.scala.bridge;

//Scala:
import no.hib.dpf.text.scala.output.EditorOutput
import no.hib.dpf.text.scala.ct._
import no.hib.dpf.text.scala.ct.mutable._
import no.hib.dpf.text.scala.output.EclipseLog
import no.hib.dpf.text.scala.bridge.JavaScalaConverter._

import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import scala.collection.mutable.ListBuffer


//Java
import no.hib.dpf.text.{ DPFConstants => JConstants }
import no.hib.dpf.text.tdpf.{ DpfId => JDpfId }
import no.hib.dpf.text.tdpf.{ RId => JRId }
import no.hib.dpf.text.tdpf.{ Specification => JSpecification }
import no.hib.dpf.text.tdpf.{ Element => JElement }
import no.hib.dpf.text.tdpf.{ Node => JNode }
import no.hib.dpf.text.tdpf.{ Property => JProperty }
import no.hib.dpf.text.tdpf.{ NodeSimple => JNodeSimple }
import no.hib.dpf.text.tdpf.{ Arrow => JArrow }
import no.hib.dpf.text.tdpf.{ DpfId => JId }
import no.hib.dpf.text.tdpf.{ DataType => JDataType }
import no.hib.dpf.text.tdpf.{ Signature => JSignature }
import no.hib.dpf.text.tdpf.{ Constraint => JConstraint }
import no.hib.dpf.text.util.{ Tuple => JTuple }
import no.hib.dpf.text.util.{ CommonUtil => JCommonUtil }

import org.eclipse.jface.dialogs.{ MessageDialog => JMessageDialog }
import java.util.{ Stack => JStack }
import java.util.{ Set => JSet }
import java.util.{ List => JList }
import java.util.{ LinkedList => JLList }
import java.util.{ Map => JMap }
import java.util.{ HashMap => JHashMap }
import org.eclipse.core.resources.IFile
import org.eclipse.emf.ecore.EObject

/**
 * This work has been the result of a unqualified comment to one of our formal papers.
 * The topic was meta-model evolution and the reviewer criticized that we did not consider the case that the meta-model may have been lost. 
 * This object contains a generator for a "lost" meta-model from an instance model.
 */
object ScalaBridgeExtra{

   /**
   * Method is only called if meta-specification got lost. Then automatically a new one is generated typed by the standard DPF metamodel.
   */
  def generateSpecification(f: IFile, js: JSpecification): Unit = {
    try {
      
      val yes = JMessageDialog.openConfirm(null, "Warning", "Meta-Specification does not exist: " + f.getFullPath().toOSString() + "\n\nTry to generate Specification...");
      if(!yes){
        return
      }
      
      //Generate Specification:
      EclipseLog.log("Try to generate meta-specification " + f.getFullPath().toOSString());


      //Arrows with same id need to be moved to the same superclass:
      val inh = MMap[EId, MSet[EId]]()
      val names = MMap[EId, String]()
      var nodes = List[Node]()
      var arrows = List[Arrow]()
      val g = js.getGraph();

      //Get max id:
      var maxId = 0;
      for (e <- g.getElements()) {
        e match {
          case n: JNode =>
            setMaxId(getMaxId(n.getType()))
            for (sn <- n.getInh()) {
              setMaxId(getMaxId(sn.getType()))
            }
            for (p <- n.getProperties()) {
              setMaxId(getMaxId(p.getType()))
              if (null != p.getTgNode()) {
                setMaxId(getMaxId(p.getTgNode().getType()))
              }
            }
          case a: JArrow =>
            setMaxId(getMaxId(a.getSr().getType()))
            setMaxId(getMaxId(a.getType()))
            if (null != a.getTgNode()) {
              setMaxId(getMaxId(a.getTgNode().getType()))
            }
        }
      }
      //Helper for handling ids:
      def getMaxId(id: JDpfId): Int = {
        if (null == id) {
          return -1;
        }
        jId2RId(id) match {
          case Some(RId(s)) => s.toList.sortBy(-_).head
          case None => -1
        }
      }
      def setMaxId(id: Int) = {
        if (id > maxId) {
          maxId = id;
        }
      }
      def newId() = {
        maxId += 1;
        RId(Set(maxId));
      }
      //Helper for sending nodes and arrows:
      def saveArrow(id: JDpfId, sr: JDpfId, tg: JDpfId): Unit = {
        val srNode = saveNode(sr)
        val tgNode = saveNode(tg)
        if (null != id && null != id.getName()) { //inheritance arrows does not need to be considered
          val rid = jId2RId(id) match {
            case Some(i) => i
            case None => newId()
          }
          names += rid -> id.getName();
          arrows = Arrow(rid, srNode, tgNode, Dpf.Graph.arrow) :: arrows;
        }
      }
      def saveNode(id: JDpfId): Node = {
        val rid = jId2RId(id) match {
          case Some(i) => i
          case None => newId()
        }
        if (null != id) {
          names += rid -> id.getName();
        } else {
          names += rid -> "NN";
        }
        val node = Node(rid, Dpf.Graph.node);
        nodes = node :: nodes
        node
      }
      def saveAttribute(id: JDpfId, sr: JDpfId): Unit = {
        val srNode = saveNode(sr)
        val rid = jId2RId(id) match {
          case Some(i) => i
          case None => newId()
        }
        names += rid -> id.getName();
        arrows = Arrow(rid, srNode, TypeP.TString, TypeArrow.TAttribute) :: arrows;
      }

      //Save elements:
      for (e <- g.getElements()) {
        e match {
          case n: JNode =>
            saveNode(n.getType())
            for (sn <- n.getInh()) {
              saveNode(sn.getType())
            }
            for (p <- n.getProperties()) {
              if (null != p.getTgNode()) {
                saveArrow(p.getType(), n.getType(), p.getTgNode().getType())
              } else if (null != p.getTgValue()) {
                saveAttribute(p.getType(), n.getType())
              }
              if (null != p.getTgNode()) {
                setMaxId(getMaxId(p.getTgNode().getType()))
              }
            }
          case a: JArrow =>
            if (null != a.getTgNode()) {
              saveArrow(a.getType(), a.getSr().getType(), a.getTgNode().getType())
            } else if (null != a.getTgValue()) {
              saveAttribute(a.getType(), a.getSr().getType())
            }
        }
      }

      val aCache = MMap[Id, Tuple2[Arrow, Boolean]]()
      var counterSNodes = 0
      for (a <- arrows) {
        if (aCache contains a.id) {
          val tA = aCache(a.id)
          if (a.sr == tA._1.sr && a.tg == tA._1.tg) { //Just duplicate
          } else if (a.sr != tA._1.sr && !tA._2) {

            //
            //Check if there is already a common superclass:
            //
            val cSuper = if ((inh contains tA._1.sr.id) && (inh contains a.sr.id)) {
              inh(tA._1.sr.id).intersect(inh(a.sr.id))
            } else {
              Set();
            }
            var sId: EId = null;
            if (!cSuper.isEmpty) {
              sId = cSuper.toList.head
            } else {
              sId = newId()
            }
            val nSuper = Node(sId, Dpf.Graph.node)
            nodes = nSuper :: nodes;
            counterSNodes += 1
            names += sId -> ("SNode" + counterSNodes)

            //
            //Replace arrow by super arrow:  
            //
            aCache.remove(a.id)
            aCache += a.id -> (Arrow(a.id, nSuper, a.tg, a.t), true)

            //
            //Save inheritance relation:
            //
            inh.get(a.sr.id) match {
              case None => inh += a.sr.id -> MSet(nSuper.id)
              case Some(s) => s += nSuper.id
            }
            inh.get(tA._1.sr.id) match {
              case None => inh += tA._1.sr.id -> MSet(nSuper.id)
              case Some(s) => s += nSuper.id
            }

          } else {
            //Add inheritance relation:
            inh.get(a.sr.id) match {
              case None => inh += a.sr.id -> MSet(tA._1.sr.id)
              case Some(s) => s += tA._1.sr.id
            }
          }
        } else {
          aCache += a.id -> (a, false) //no superclass
        }
      }
      //Put elements from nodes and aChache and inh to a IGraph
      val graph = new MIGraph(Dpf.Graph.tKey, newId)
      for (n <- nodes) {
        graph.addNode(names.get(n.id), n.t, n.id)
      }
      for ((a, _) <- aCache.values) {
        graph.addArrow(names(a.id), a.sr, a.tg, a.t, a.id)
      }
      for (i <- inh.keys; j <- inh(i)) {
        graph.addInheritance(graph.nodes(i), graph.nodes(j))
      }
      //Serialize to file
      val path: String = f.getParent().getLocation().toOSString();
      val s = S(graph, Nil);
      val header =
        List(
          "//**********************************************************************************\n",
          "//Automatically generated from specification:" + JCommonUtil.eObject2IFile(js).getLocation().toOSString() + "\n",
          "//Date:" + new java.util.Date() + "\n",
          "//**********************************************************************************\n\n\n");

      val info = SInfo(js.getType().getId(), path, //name and path
                                    "?",           //Version       
                                     0,            //VersionNo      
                                    newId().v.head,//NextVersionNo
                       Dpf.Graph.tKey.name, 
                       Dpf.Graph.tKey.version.get.name)
      
      
      EditorOutput.serializeSpecification(s, info , false, header,true)
      
      f.getParent().refreshLocal(1, null)
      
    } catch { case ex: Throwable => EclipseLog.log(ex) }
  }

}