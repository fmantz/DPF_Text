/**
 */
package no.hib.dpf.text.tdpf.impl;

import no.hib.dpf.text.tdpf.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TdpfFactoryImpl extends EFactoryImpl implements TdpfFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TdpfFactory init()
  {
    try
    {
      TdpfFactory theTdpfFactory = (TdpfFactory)EPackage.Registry.INSTANCE.getEFactory(TdpfPackage.eNS_URI);
      if (theTdpfFactory != null)
      {
        return theTdpfFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TdpfFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TdpfFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TdpfPackage.MODEL: return createModel();
      case TdpfPackage.BATCH: return createBatch();
      case TdpfPackage.COMMAND: return createCommand();
      case TdpfPackage.MAKE_EMF: return createMakeEmf();
      case TdpfPackage.MAKE_ECORE: return createMakeEcore();
      case TdpfPackage.MAKE_IMAGE: return createMakeImage();
      case TdpfPackage.MAKE_DIAGRAM: return createMakeDiagram();
      case TdpfPackage.TEST_MATCH: return createTestMatch();
      case TdpfPackage.SPECIFICATION: return createSpecification();
      case TdpfPackage.CONSTRAINT_LIST: return createConstraintList();
      case TdpfPackage.CHOOSEN_SPECIFICATION: return createChoosenSpecification();
      case TdpfPackage.VERSION: return createVersion();
      case TdpfPackage.CHOOSEN_SIGNATURE: return createChoosenSignature();
      case TdpfPackage.CONSTRAINT: return createConstraint();
      case TdpfPackage.SIGNATURE: return createSignature();
      case TdpfPackage.VALIDATOR: return createValidator();
      case TdpfPackage.GRAPH: return createGraph();
      case TdpfPackage.ELEMENT: return createElement();
      case TdpfPackage.ARROW: return createArrow();
      case TdpfPackage.NODE: return createNode();
      case TdpfPackage.NODE_SIMPLE: return createNodeSimple();
      case TdpfPackage.PROPERTY: return createProperty();
      case TdpfPackage.ATTRIBUTE_VALUE: return createAttributeValue();
      case TdpfPackage.DPF_ID: return createDpfId();
      case TdpfPackage.RID: return createRId();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TdpfPackage.DATA_TYPE:
        return createDataTypeFromString(eDataType, initialValue);
      case TdpfPackage.GRAPHVIZ_OUTPUT:
        return createGraphvizOutputFromString(eDataType, initialValue);
      case TdpfPackage.CONSTRAINT_LANGUAGE:
        return createConstraintLanguageFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TdpfPackage.DATA_TYPE:
        return convertDataTypeToString(eDataType, instanceValue);
      case TdpfPackage.GRAPHVIZ_OUTPUT:
        return convertGraphvizOutputToString(eDataType, instanceValue);
      case TdpfPackage.CONSTRAINT_LANGUAGE:
        return convertConstraintLanguageToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Batch createBatch()
  {
    BatchImpl batch = new BatchImpl();
    return batch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MakeEmf createMakeEmf()
  {
    MakeEmfImpl makeEmf = new MakeEmfImpl();
    return makeEmf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MakeEcore createMakeEcore()
  {
    MakeEcoreImpl makeEcore = new MakeEcoreImpl();
    return makeEcore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MakeImage createMakeImage()
  {
    MakeImageImpl makeImage = new MakeImageImpl();
    return makeImage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MakeDiagram createMakeDiagram()
  {
    MakeDiagramImpl makeDiagram = new MakeDiagramImpl();
    return makeDiagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestMatch createTestMatch()
  {
    TestMatchImpl testMatch = new TestMatchImpl();
    return testMatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specification createSpecification()
  {
    SpecificationImpl specification = new SpecificationImpl();
    return specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintList createConstraintList()
  {
    ConstraintListImpl constraintList = new ConstraintListImpl();
    return constraintList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoosenSpecification createChoosenSpecification()
  {
    ChoosenSpecificationImpl choosenSpecification = new ChoosenSpecificationImpl();
    return choosenSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version createVersion()
  {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoosenSignature createChoosenSignature()
  {
    ChoosenSignatureImpl choosenSignature = new ChoosenSignatureImpl();
    return choosenSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signature createSignature()
  {
    SignatureImpl signature = new SignatureImpl();
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Validator createValidator()
  {
    ValidatorImpl validator = new ValidatorImpl();
    return validator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Graph createGraph()
  {
    GraphImpl graph = new GraphImpl();
    return graph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arrow createArrow()
  {
    ArrowImpl arrow = new ArrowImpl();
    return arrow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeSimple createNodeSimple()
  {
    NodeSimpleImpl nodeSimple = new NodeSimpleImpl();
    return nodeSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeValue createAttributeValue()
  {
    AttributeValueImpl attributeValue = new AttributeValueImpl();
    return attributeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DpfId createDpfId()
  {
    DpfIdImpl dpfId = new DpfIdImpl();
    return dpfId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RId createRId()
  {
    RIdImpl rId = new RIdImpl();
    return rId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataTypeFromString(EDataType eDataType, String initialValue)
  {
    DataType result = DataType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphvizOutput createGraphvizOutputFromString(EDataType eDataType, String initialValue)
  {
    GraphvizOutput result = GraphvizOutput.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGraphvizOutputToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintLanguage createConstraintLanguageFromString(EDataType eDataType, String initialValue)
  {
    ConstraintLanguage result = ConstraintLanguage.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConstraintLanguageToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TdpfPackage getTdpfPackage()
  {
    return (TdpfPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TdpfPackage getPackage()
  {
    return TdpfPackage.eINSTANCE;
  }

} //TdpfFactoryImpl
