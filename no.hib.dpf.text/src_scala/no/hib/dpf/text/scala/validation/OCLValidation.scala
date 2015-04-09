package no.hib.dpf.text.scala.validation

import no.hib.dpf.text.scala.ct._
import no.hib.dpf.text.scala.output._

//Ecore:
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//OCL:
import java.text.ParseException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.emf.common.util.URI;
//Util:
import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }
//Eclipse
import org.eclipse.core.resources._
//Java:
import java.io.File

object OCLValidation extends ConstraintValidation with EMFHelper {

  //Vals:
  private val ocl: OCL[_, EClassifier, _, _, _, _, _, _, _, Constraint, EClass, EObject] = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
  private val oclHelper = ocl.createOCLHelper();

  //Init:
  Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
  Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

  /**
   * Validate the instance of a specification for all OCL constraints of the meta-specification.
   */
  def validate(is: IS) {
    try {
      import java.io._

      //Create and load meta model:
      val name = "Temp" + System.currentTimeMillis();
      createMetaModel(name, is.mm.g)

      //In create,load and validate instance:
      for (e <- createValidationParts(is)) {

        //Create temporal EMF instance which only contain the pullback of a constraint  
        val nameI = "Temp" + System.currentTimeMillis() + ".xmi";
        val file = getDebugFolder() match {
          case Some(f) => new File(f.getLocation().toFile(), nameI)
          case None => new File(nameI);
        }
        EMFOutput.writeXML(file, () => EMFOutput.graph2EcoreI_OCL(e._2, name))

        //Load the instance:
        val modelResource = loadInstance(file.getAbsolutePath());

        //Call the OCL checker:
        try {
          validateOCL(modelResource, e._1, e._3);
        } catch {
          case ex: Throwable => Errors.add("Error validate(is:IS): " + ex.getMessage())
        }
      }
      //Refresh Local;
      try {
        getDebugFolder() match {
          case Some(f) => f.refreshLocal(1, null);
          case None => println("Warning: Could not find working folder!");
        }
      } catch {
        case ex: Throwable => println("Warning:" + ex.getMessage());
      }

    } catch {
      case ex: Throwable =>
        ex.printStackTrace();
        sys.error("validate(is:IS):>" + ex.getMessage());
    }
  }

  /**
   * Validate a model for one OCL constraint.
   */
  private def validateOCL(modelResource: EObject, oclString: String, errMsg: String) = {
    try {
      //EclipseLog.log("OCL:>" + oclString)
      val eOclString = "package Graph\n\n" + oclString + "\n\nendpackage";
      val document = new OCLInput(eOclString);
      val ecoreEnv = new EcoreEnvironmentFactory(modelResource.eResource().getResourceSet().getPackageRegistry());
      val oclParser = OCL.newInstance(ecoreEnv);
      val constraint = oclParser.parse(document).get(0);
      import scala.collection.JavaConversions._
      val context = constraint.getSpecification().getContextVariable().getType();
      for (e <- modelResource.eAllContents()) {
        try {
          if (context.isInstance(e)) {
            if (!ocl.check(e, constraint)) {
              val validateId = e.eGet(e.eClass().getEStructuralFeature("id")).toString();
              val message = errMsg + "\ndetails=OCL=" + constraint;
              Errors.add(RId(validateId), message)
            }
          }
        } catch {
          case ex: Throwable => Errors.add("validate1(modelResource: EObject,oclString: String): " + ex.getMessage());
        }
      }
    } catch {
      case ex: Throwable =>
        Errors.add("validate1(modelResource: EObject,oclString: String): " + ex.getMessage());
        ex.printStackTrace();
    }
  }

}

/**
 * Helper methods for loading and dealing with EMF/Ecore files.
 * May also be used by other functionality of the tool in the future and then moved into a different package.
 */
trait EMFHelper {

  /**
   * Create transient EMF models as meta-model. This meta-model is required for working with the OCL
   * constraints defined on instances of this model.
   */
  protected def createMetaModel(name: String, g: AbstractGraph): File = {
    import java.io._
    val file = getDebugFolder() match {
      case Some(f) => new File(f.getLocation().toFile(), name + ".ecore")
      case None => new File(name + ".ecore");
    }
    EMFOutput.writeXML(file, () => EMFOutput.graph2EcoreM_OCL(g, name))
    file
  }

  /**
   * Load "EMF" model:
   */
  protected def loadModel(fname: String) = {
    import java.io.File;
    val modelUri = URI.createFileURI(new File(fname).getAbsolutePath());
    val resourceSet: ResourceSet = new ResourceSetImpl();
    val resourceModel: Resource = resourceSet.getResource(modelUri, true);
    resourceModel
    //resourceModel.getContents().get(0).asInstanceOf[EPackage];
  }

  /**
   * Load "EMF" instance:
   */
  protected def loadInstance(fname: String): EObject = {
    import java.io.File;
    /*
     * Note the usage of ".getAbsolutePath()" below! This is necessary for
     * EMF to resolve relative paths in instance models. 
    */
    val instanceUri = URI.createFileURI(new File(fname).getAbsolutePath());
    val resourceSet: ResourceSet = new ResourceSetImpl();
    val resourceInstance: Resource = resourceSet.getResource(instanceUri, true);
    resourceInstance.getContents().get(0).asInstanceOf[EObject];
  }

  /**
   * Get the working debug folder of the project.
   */
  def getDebugFolder(): Option[IFolder] = {
    import org.eclipse.ui.PlatformUI
    import org.eclipse.jface.viewers.StructuredSelection
    import org.eclipse.core.runtime.Path
    import org.eclipse.core.resources.IFile;
    var rs: Option[IFolder] = None

    //Create or return debug folder from file
    def getDebugFromFile(file: org.eclipse.core.resources.IFile): Option[IFolder] = {
      val parent = file.getParent();
      val folder = parent.getFolder(new Path("debug"));
      if (!folder.exists()) {
        folder.create(false, true, null);
      }
      Some(folder)
    }

    //Get a file:
    val file = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().
        getActivePart().getSite().getPage().getActiveEditor().getEditorInput().getAdapter(classOf[IFile]).asInstanceOf[IFile];
    rs = getDebugFromFile(file)
    //println(rs)
    rs
  }

}

