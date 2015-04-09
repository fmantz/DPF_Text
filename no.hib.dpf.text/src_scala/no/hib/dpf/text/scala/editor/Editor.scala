package no.hib.dpf.text.scala.editor;

import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }

import no.hib.dpf.text.scala.DPFTextCore
import no.hib.dpf.text.scala.ct._
import no.hib.dpf.text.scala.ct.mutable._
import no.hib.dpf.text.scala.bridge.ScalaBridge
import no.hib.dpf.text.scala.output.EclipseLog

import no.hib.dpf.text.{ DPFConstants => JConstants };
import no.hib.dpf.text.util.CommonUtil

import org.eclipse.core.resources.IFile

/**
 * Editor is a singleton that holds the data of the whole application beside the error messages. 
 * It could be a good idea to move also the error messages to this singleton.
 */
object Editor{

  /**
   * Generator for RIds
   */
  object GCtx { //Usual id generator
    var next: Int = 1
    def gen() = {
      val rs = RId(Set(next));
      next += 1;
      rs
    }
  }

  //Vars:
  
  /**
   * Current Type Specification in use
   */
  var curTS: S = null; 

  /**
   * Current model in the editor
   */
  var curMGraph: MIGraph = null;    

  //Caches:
  
  /**
   * Cache for all loaded specifications
   */
  private val specs: MMap[FKey, S] = MMap()
  
  /**
   * Cache for all loaded specification infos
   */
  private val specsInfo: MMap[FKey, SInfo] = MMap()
  
  /**
   * Cache for equivalend to specsInfo for signatures
   */
  private val signatureKeys: MSet[FKey] = MSet()
    
  /**
   * Empty the caches of the application:
   */
  def clearCaches(){
    specs.clear();
    specs+=Dpf.Graph.tKey -> Dpf.Spec
    specsInfo.clear();
    specsInfo+=Dpf.Graph.tKey -> SInfo(Dpf.Graph.tKey, Dpf.Graph.tKey)
    signatureKeys.clear();
    AbstractGraph.cache = getGraph(_);
    initParser();
  }
  
  /**
   * Helper method for setting the cache for graphs to the one of the editor:
   */
  private def getGraph(k: FKey): Option[AbstractGraph] = if(specs contains(k)){Some(specs(k).g)} else {None};
 
  /**
   * Clear current model an type specification variables
   */
  def initParser() = {
    curTS = Dpf.Spec;                                   
    curMGraph = new MIGraph(Dpf.Graph.tKey, GCtx.gen);  
  }

  //1. Init:
  clearCaches()
  
  /**
   * Is the specification already loaded into the editors cache
   */
  def isSpecInCache(name: String, path: String): Boolean = specs contains FKey(name, path)

  /**
   * Get all loaded specifications:
   */
  def getSpecs(): List[S] = specs.values.toList;

  /**
   * Get loaded specifications by name and path
   */
  def getSpec(name: String, path: String): S = getSpec(FKey(name, path))
 
  /**
   * Get loaded specifications by file key
   */
  def getSpec(key: FKey): S = {
    try {
      specs(key)
    } catch {
      case ex: Throwable =>
        try {
          //Try to read specifcation from file:
          val fName = key.path.get + "/" + key.name + JConstants.SPECIFICATION_FILE_EXTENSION;
          println("Exeption: getSpec() try to read:" + fName);
          val specFile: IFile = CommonUtil.iResourceFromDirectory(fName).asInstanceOf[IFile]
          val jS = DPFTextCore.readSpecification(specFile).y;
          val sS = DPFTextCore.readSpecificationTransitiv(jS, specFile, true);
          ScalaBridge.read(sS, key.path.get)
          specs(key)
        } catch {
          case ex2: Throwable =>
            EclipseLog.log(ex2);
            throw ex2
        }
    }
  }

  /**
   * Get specification infos for all loaded specifications
   */
  def getSpecInfos(): List[SInfo] = specsInfo.values.toList;

  /**
   * Get specification infos by name and path
   */
  def getSpecInfo(name: String, path: String): SInfo = getSpecInfo(FKey(name, path))

  /**
   * Get specification infos by file key
   */
  def getSpecInfo(key: FKey): SInfo = {
   if(Dpf.Graph.tKey.name==key.name){
     return SInfo(Dpf.Graph.tKey,Dpf.Graph.tKey,Nil)
   } 
   specsInfo(key) 
  }

  /**
   * Save specification in application cache
   */
  def saveSpec(info: SInfo, s: S): Unit = {
    removeSpec(info.key)
    specs += info.key -> s
    specsInfo += info.key -> info
    //EclipseLog.log("Save Specification: " + info.key)
  }

  /**
   * Remove specification from application cache
   */
  def removeSpec(key: FKey): Unit = {
    if (specs.contains(key) && "DPF" != key.name) {
      specs -= key;
      specsInfo -= key;
      //EclipseLog.log("Remove Specification: " + key)
    }
  }
  
  /**
   * Prepare current model an type specification variables 
   * for creating a graph via the XText editor
   */
  def createGraph(name: String, path: String, mmName: String): Unit = {
    val key = FKey(mmName, path)
    //non-reflexsive meta-model
    if(name != mmName){
      curTS = getSpec(key);
      curMGraph = new MIGraph(key, GCtx.gen);      
    //reflexsive meta-model
    }else{
      curMGraph = new MIGraph(key, GCtx.gen);      
      curTS = S(curMGraph,Nil);
    }
  }

  /**
   * Save signature FKey in cache of the application
   */
  def saveSignatureFKey(name: String, path: String, version: String, vNo: Int, vNext: Int): FKey = {
    val key = FKey(name, path, version, vNo, vNext)
    //FKeys may be equal but additional information (about version) may have changed
    if (signatureKeys contains key) {
      signatureKeys -= key;
    }
    signatureKeys += key;
    key
  }

  /**
   * Get signatures FKey from the application cache by name and path
   */
  def getSignatureFKey(name:String,path:String):FKey={
    signatureKeys.find { k => k.name==name && k.path==Some(path) }.get
  }
  
  /**
   * Get all Fkeys for signatures from the application cache
   */
  def getSignatureFKeys(): List[FKey] = signatureKeys.toList

}


