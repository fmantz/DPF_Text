/**
 */
package no.hib.dpf.text.tdpf.impl;

import no.hib.dpf.text.tdpf.Arrow;
import no.hib.dpf.text.tdpf.AttributeValue;
import no.hib.dpf.text.tdpf.Batch;
import no.hib.dpf.text.tdpf.ChoosenSignature;
import no.hib.dpf.text.tdpf.ChoosenSpecification;
import no.hib.dpf.text.tdpf.Command;
import no.hib.dpf.text.tdpf.Constraint;
import no.hib.dpf.text.tdpf.ConstraintLanguage;
import no.hib.dpf.text.tdpf.ConstraintList;
import no.hib.dpf.text.tdpf.DataType;
import no.hib.dpf.text.tdpf.DpfId;
import no.hib.dpf.text.tdpf.Element;
import no.hib.dpf.text.tdpf.Graph;
import no.hib.dpf.text.tdpf.GraphvizOutput;
import no.hib.dpf.text.tdpf.MakeDiagram;
import no.hib.dpf.text.tdpf.MakeEcore;
import no.hib.dpf.text.tdpf.MakeEmf;
import no.hib.dpf.text.tdpf.MakeImage;
import no.hib.dpf.text.tdpf.Model;
import no.hib.dpf.text.tdpf.Node;
import no.hib.dpf.text.tdpf.NodeSimple;
import no.hib.dpf.text.tdpf.Property;
import no.hib.dpf.text.tdpf.RId;
import no.hib.dpf.text.tdpf.Signature;
import no.hib.dpf.text.tdpf.Specification;
import no.hib.dpf.text.tdpf.TdpfFactory;
import no.hib.dpf.text.tdpf.TdpfPackage;
import no.hib.dpf.text.tdpf.TestMatch;
import no.hib.dpf.text.tdpf.Validator;
import no.hib.dpf.text.tdpf.Version;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TdpfPackageImpl extends EPackageImpl implements TdpfPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass batchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass makeEmfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass makeEcoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass makeImageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass makeDiagramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testMatchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choosenSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choosenSignatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeSimpleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dpfIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dataTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum graphvizOutputEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum constraintLanguageEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see no.hib.dpf.text.tdpf.TdpfPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TdpfPackageImpl()
  {
    super(eNS_URI, TdpfFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TdpfPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TdpfPackage init()
  {
    if (isInited) return (TdpfPackage)EPackage.Registry.INSTANCE.getEPackage(TdpfPackage.eNS_URI);

    // Obtain or create and register package
    TdpfPackageImpl theTdpfPackage = (TdpfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TdpfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TdpfPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTdpfPackage.createPackageContents();

    // Initialize created meta-data
    theTdpfPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTdpfPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TdpfPackage.eNS_URI, theTdpfPackage);
    return theTdpfPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBatch()
  {
    return batchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBatch_Commands()
  {
    return (EReference)batchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMakeEmf()
  {
    return makeEmfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMakeEmf_Id()
  {
    return (EAttribute)makeEmfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMakeEcore()
  {
    return makeEcoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMakeEcore_Id()
  {
    return (EAttribute)makeEcoreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMakeImage()
  {
    return makeImageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMakeImage_Id()
  {
    return (EAttribute)makeImageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMakeImage_Type()
  {
    return (EAttribute)makeImageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMakeDiagram()
  {
    return makeDiagramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMakeDiagram_Id()
  {
    return (EAttribute)makeDiagramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMakeDiagram_Type()
  {
    return (EAttribute)makeDiagramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestMatch()
  {
    return testMatchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestMatch_Search()
  {
    return (EAttribute)testMatchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestMatch_Into()
  {
    return (EAttribute)testMatchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecification()
  {
    return specificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecification_Version()
  {
    return (EReference)specificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecification_Type()
  {
    return (EReference)specificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecification_Output()
  {
    return (EAttribute)specificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecification_Graph()
  {
    return (EReference)specificationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecification_AtomicConstraints()
  {
    return (EReference)specificationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintList()
  {
    return constraintListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintList_ConstraintSemantic()
  {
    return (EReference)constraintListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintList_Constraints()
  {
    return (EReference)constraintListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoosenSpecification()
  {
    return choosenSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChoosenSpecification_Id()
  {
    return (EAttribute)choosenSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChoosenSpecification_VersionName()
  {
    return (EAttribute)choosenSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersion()
  {
    return versionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_Name()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_Number()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_NextNumber()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoosenSignature()
  {
    return choosenSignatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChoosenSignature_Id()
  {
    return (EAttribute)choosenSignatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChoosenSignature_VersionName()
  {
    return (EAttribute)choosenSignatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_Type()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_Parameter()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_Arity_d()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignature()
  {
    return signatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignature_Version()
  {
    return (EReference)signatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignature_Input()
  {
    return (EAttribute)signatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignature_Validators()
  {
    return (EReference)signatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValidator()
  {
    return validatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValidator_Id()
  {
    return (EReference)validatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValidator_Parameter_vars()
  {
    return (EAttribute)validatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValidator_Arity()
  {
    return (EReference)validatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValidator_Ocl()
  {
    return (EAttribute)validatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValidator_ErrorMsg()
  {
    return (EAttribute)validatorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGraph()
  {
    return graphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraph_Elements()
  {
    return (EReference)graphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_Id()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_Type()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrow()
  {
    return arrowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrow_Sr()
  {
    return (EReference)arrowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrow_TgDataType()
  {
    return (EAttribute)arrowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrow_TgValue()
  {
    return (EReference)arrowEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrow_TgNode()
  {
    return (EReference)arrowEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Inh()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Properties()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeSimple()
  {
    return nodeSimpleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeSimple_Id()
  {
    return (EReference)nodeSimpleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeSimple_Type()
  {
    return (EReference)nodeSimpleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Id()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_TgDataType()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Type()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_TgValue()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_TgNode()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeValue()
  {
    return attributeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeValue_Value()
  {
    return (EAttribute)attributeValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeValue_VariableId()
  {
    return (EAttribute)attributeValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDpfId()
  {
    return dpfIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDpfId_Name()
  {
    return (EAttribute)dpfIdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDpfId_Id()
  {
    return (EReference)dpfIdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRId()
  {
    return rIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRId_Nums()
  {
    return (EAttribute)rIdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDataType()
  {
    return dataTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getGraphvizOutput()
  {
    return graphvizOutputEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConstraintLanguage()
  {
    return constraintLanguageEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TdpfFactory getTdpfFactory()
  {
    return (TdpfFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);

    batchEClass = createEClass(BATCH);
    createEReference(batchEClass, BATCH__COMMANDS);

    commandEClass = createEClass(COMMAND);

    makeEmfEClass = createEClass(MAKE_EMF);
    createEAttribute(makeEmfEClass, MAKE_EMF__ID);

    makeEcoreEClass = createEClass(MAKE_ECORE);
    createEAttribute(makeEcoreEClass, MAKE_ECORE__ID);

    makeImageEClass = createEClass(MAKE_IMAGE);
    createEAttribute(makeImageEClass, MAKE_IMAGE__ID);
    createEAttribute(makeImageEClass, MAKE_IMAGE__TYPE);

    makeDiagramEClass = createEClass(MAKE_DIAGRAM);
    createEAttribute(makeDiagramEClass, MAKE_DIAGRAM__ID);
    createEAttribute(makeDiagramEClass, MAKE_DIAGRAM__TYPE);

    testMatchEClass = createEClass(TEST_MATCH);
    createEAttribute(testMatchEClass, TEST_MATCH__SEARCH);
    createEAttribute(testMatchEClass, TEST_MATCH__INTO);

    specificationEClass = createEClass(SPECIFICATION);
    createEReference(specificationEClass, SPECIFICATION__VERSION);
    createEReference(specificationEClass, SPECIFICATION__TYPE);
    createEAttribute(specificationEClass, SPECIFICATION__OUTPUT);
    createEReference(specificationEClass, SPECIFICATION__GRAPH);
    createEReference(specificationEClass, SPECIFICATION__ATOMIC_CONSTRAINTS);

    constraintListEClass = createEClass(CONSTRAINT_LIST);
    createEReference(constraintListEClass, CONSTRAINT_LIST__CONSTRAINT_SEMANTIC);
    createEReference(constraintListEClass, CONSTRAINT_LIST__CONSTRAINTS);

    choosenSpecificationEClass = createEClass(CHOOSEN_SPECIFICATION);
    createEAttribute(choosenSpecificationEClass, CHOOSEN_SPECIFICATION__ID);
    createEAttribute(choosenSpecificationEClass, CHOOSEN_SPECIFICATION__VERSION_NAME);

    versionEClass = createEClass(VERSION);
    createEAttribute(versionEClass, VERSION__NAME);
    createEAttribute(versionEClass, VERSION__NUMBER);
    createEAttribute(versionEClass, VERSION__NEXT_NUMBER);

    choosenSignatureEClass = createEClass(CHOOSEN_SIGNATURE);
    createEAttribute(choosenSignatureEClass, CHOOSEN_SIGNATURE__ID);
    createEAttribute(choosenSignatureEClass, CHOOSEN_SIGNATURE__VERSION_NAME);

    constraintEClass = createEClass(CONSTRAINT);
    createEReference(constraintEClass, CONSTRAINT__TYPE);
    createEAttribute(constraintEClass, CONSTRAINT__PARAMETER);
    createEReference(constraintEClass, CONSTRAINT__ARITY_D);

    signatureEClass = createEClass(SIGNATURE);
    createEReference(signatureEClass, SIGNATURE__VERSION);
    createEAttribute(signatureEClass, SIGNATURE__INPUT);
    createEReference(signatureEClass, SIGNATURE__VALIDATORS);

    validatorEClass = createEClass(VALIDATOR);
    createEReference(validatorEClass, VALIDATOR__ID);
    createEAttribute(validatorEClass, VALIDATOR__PARAMETER_VARS);
    createEReference(validatorEClass, VALIDATOR__ARITY);
    createEAttribute(validatorEClass, VALIDATOR__OCL);
    createEAttribute(validatorEClass, VALIDATOR__ERROR_MSG);

    graphEClass = createEClass(GRAPH);
    createEReference(graphEClass, GRAPH__ELEMENTS);

    elementEClass = createEClass(ELEMENT);
    createEReference(elementEClass, ELEMENT__ID);
    createEReference(elementEClass, ELEMENT__TYPE);

    arrowEClass = createEClass(ARROW);
    createEReference(arrowEClass, ARROW__SR);
    createEAttribute(arrowEClass, ARROW__TG_DATA_TYPE);
    createEReference(arrowEClass, ARROW__TG_VALUE);
    createEReference(arrowEClass, ARROW__TG_NODE);

    nodeEClass = createEClass(NODE);
    createEReference(nodeEClass, NODE__INH);
    createEReference(nodeEClass, NODE__PROPERTIES);

    nodeSimpleEClass = createEClass(NODE_SIMPLE);
    createEReference(nodeSimpleEClass, NODE_SIMPLE__ID);
    createEReference(nodeSimpleEClass, NODE_SIMPLE__TYPE);

    propertyEClass = createEClass(PROPERTY);
    createEReference(propertyEClass, PROPERTY__ID);
    createEAttribute(propertyEClass, PROPERTY__TG_DATA_TYPE);
    createEReference(propertyEClass, PROPERTY__TYPE);
    createEReference(propertyEClass, PROPERTY__TG_VALUE);
    createEReference(propertyEClass, PROPERTY__TG_NODE);

    attributeValueEClass = createEClass(ATTRIBUTE_VALUE);
    createEAttribute(attributeValueEClass, ATTRIBUTE_VALUE__VALUE);
    createEAttribute(attributeValueEClass, ATTRIBUTE_VALUE__VARIABLE_ID);

    dpfIdEClass = createEClass(DPF_ID);
    createEAttribute(dpfIdEClass, DPF_ID__NAME);
    createEReference(dpfIdEClass, DPF_ID__ID);

    rIdEClass = createEClass(RID);
    createEAttribute(rIdEClass, RID__NUMS);

    // Create enums
    dataTypeEEnum = createEEnum(DATA_TYPE);
    graphvizOutputEEnum = createEEnum(GRAPHVIZ_OUTPUT);
    constraintLanguageEEnum = createEEnum(CONSTRAINT_LANGUAGE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    batchEClass.getESuperTypes().add(this.getModel());
    makeEmfEClass.getESuperTypes().add(this.getCommand());
    makeEcoreEClass.getESuperTypes().add(this.getCommand());
    makeImageEClass.getESuperTypes().add(this.getCommand());
    makeDiagramEClass.getESuperTypes().add(this.getCommand());
    testMatchEClass.getESuperTypes().add(this.getCommand());
    specificationEClass.getESuperTypes().add(this.getModel());
    signatureEClass.getESuperTypes().add(this.getModel());
    arrowEClass.getESuperTypes().add(this.getElement());
    nodeEClass.getESuperTypes().add(this.getElement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(batchEClass, Batch.class, "Batch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBatch_Commands(), this.getCommand(), null, "commands", null, 0, -1, Batch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(makeEmfEClass, MakeEmf.class, "MakeEmf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMakeEmf_Id(), ecorePackage.getEString(), "id", null, 0, 1, MakeEmf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(makeEcoreEClass, MakeEcore.class, "MakeEcore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMakeEcore_Id(), ecorePackage.getEString(), "id", null, 0, 1, MakeEcore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(makeImageEClass, MakeImage.class, "MakeImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMakeImage_Id(), ecorePackage.getEString(), "id", null, 0, 1, MakeImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMakeImage_Type(), this.getGraphvizOutput(), "type", null, 0, 1, MakeImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(makeDiagramEClass, MakeDiagram.class, "MakeDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMakeDiagram_Id(), ecorePackage.getEString(), "id", null, 0, 1, MakeDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMakeDiagram_Type(), this.getGraphvizOutput(), "type", null, 0, 1, MakeDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testMatchEClass, TestMatch.class, "TestMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTestMatch_Search(), ecorePackage.getEString(), "search", null, 0, 1, TestMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestMatch_Into(), ecorePackage.getEString(), "into", null, 0, 1, TestMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpecification_Version(), this.getVersion(), null, "version", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecification_Type(), this.getChoosenSpecification(), null, "type", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpecification_Output(), ecorePackage.getEString(), "output", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecification_Graph(), this.getGraph(), null, "graph", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecification_AtomicConstraints(), this.getConstraintList(), null, "atomicConstraints", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintListEClass, ConstraintList.class, "ConstraintList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstraintList_ConstraintSemantic(), this.getChoosenSignature(), null, "constraintSemantic", null, 0, 1, ConstraintList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraintList_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, ConstraintList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(choosenSpecificationEClass, ChoosenSpecification.class, "ChoosenSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChoosenSpecification_Id(), ecorePackage.getEString(), "id", null, 0, 1, ChoosenSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChoosenSpecification_VersionName(), ecorePackage.getEString(), "versionName", null, 0, 1, ChoosenSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVersion_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVersion_NextNumber(), ecorePackage.getEInt(), "nextNumber", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(choosenSignatureEClass, ChoosenSignature.class, "ChoosenSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChoosenSignature_Id(), ecorePackage.getEString(), "id", null, 0, 1, ChoosenSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChoosenSignature_VersionName(), ecorePackage.getEString(), "versionName", null, 0, 1, ChoosenSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstraint_Type(), this.getDpfId(), null, "type", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraint_Parameter(), ecorePackage.getEString(), "parameter", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_Arity_d(), ecorePackage.getEObject(), null, "arity_d", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignature_Version(), this.getVersion(), null, "version", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignature_Input(), this.getConstraintLanguage(), "input", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignature_Validators(), this.getValidator(), null, "validators", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validatorEClass, Validator.class, "Validator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValidator_Id(), this.getDpfId(), null, "id", null, 0, 1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValidator_Parameter_vars(), ecorePackage.getEString(), "parameter_vars", null, 0, -1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValidator_Arity(), ecorePackage.getEObject(), null, "arity", null, 0, -1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValidator_Ocl(), ecorePackage.getEString(), "ocl", null, 0, 1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValidator_ErrorMsg(), ecorePackage.getEString(), "errorMsg", null, 0, 1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGraph_Elements(), this.getElement(), null, "elements", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElement_Id(), this.getDpfId(), null, "id", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElement_Type(), this.getDpfId(), null, "type", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrowEClass, Arrow.class, "Arrow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrow_Sr(), this.getNodeSimple(), null, "sr", null, 0, 1, Arrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrow_TgDataType(), this.getDataType(), "tgDataType", null, 0, 1, Arrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrow_TgValue(), this.getAttributeValue(), null, "tgValue", null, 0, 1, Arrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrow_TgNode(), this.getNodeSimple(), null, "tgNode", null, 0, 1, Arrow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNode_Inh(), this.getNodeSimple(), null, "inh", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Properties(), this.getProperty(), null, "properties", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeSimpleEClass, NodeSimple.class, "NodeSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeSimple_Id(), this.getDpfId(), null, "id", null, 0, 1, NodeSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeSimple_Type(), this.getDpfId(), null, "type", null, 0, 1, NodeSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProperty_Id(), this.getDpfId(), null, "id", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_TgDataType(), this.getDataType(), "tgDataType", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Type(), this.getDpfId(), null, "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_TgValue(), this.getAttributeValue(), null, "tgValue", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_TgNode(), this.getNodeSimple(), null, "tgNode", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeValue_VariableId(), ecorePackage.getEString(), "variableId", null, 0, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dpfIdEClass, DpfId.class, "DpfId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDpfId_Name(), ecorePackage.getEString(), "name", null, 0, 1, DpfId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDpfId_Id(), this.getRId(), null, "id", null, 0, 1, DpfId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rIdEClass, RId.class, "RId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRId_Nums(), ecorePackage.getEInt(), "nums", null, 0, -1, RId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(dataTypeEEnum, DataType.class, "DataType");
    addEEnumLiteral(dataTypeEEnum, DataType.TBOOLEAN);
    addEEnumLiteral(dataTypeEEnum, DataType.TCHAR);
    addEEnumLiteral(dataTypeEEnum, DataType.TBYTE);
    addEEnumLiteral(dataTypeEEnum, DataType.TSHORT);
    addEEnumLiteral(dataTypeEEnum, DataType.TINT);
    addEEnumLiteral(dataTypeEEnum, DataType.TLONG);
    addEEnumLiteral(dataTypeEEnum, DataType.TFLOAT);
    addEEnumLiteral(dataTypeEEnum, DataType.TDOUBLE);
    addEEnumLiteral(dataTypeEEnum, DataType.TSTRING);

    initEEnum(graphvizOutputEEnum, GraphvizOutput.class, "GraphvizOutput");
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.JPG);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.BMP);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.CANON);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.DOT);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.XDOT);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.CMAP);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.EPS);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.FIG);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.GD);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.GD2);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.GIF);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.GTK);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.ICO);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.IMAP);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.CMAPX);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.IMAP_NP);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.CMAP_NP);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.ISMAP);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.JPEG);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.JPE);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.PDF);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.PLAIN);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.PLAIN_EXT);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.PNG);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.PS);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.PS2);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.SVG);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.SVGZ);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.TIF);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.TIFF);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.VML);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.VMLZ);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.VRML);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.WBMP);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.WEBP);
    addEEnumLiteral(graphvizOutputEEnum, GraphvizOutput.XLIB);

    initEEnum(constraintLanguageEEnum, ConstraintLanguage.class, "ConstraintLanguage");
    addEEnumLiteral(constraintLanguageEEnum, ConstraintLanguage.OCL);

    // Create resource
    createResource(eNS_URI);
  }

} //TdpfPackageImpl
