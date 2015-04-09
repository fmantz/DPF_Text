/**
 */
package no.hib.dpf.text.tdpf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hib.dpf.text.tdpf.TdpfFactory
 * @model kind="package"
 * @generated
 */
public interface TdpfPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tdpf";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://no.hib.dpf/dpf-text";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tdpf";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TdpfPackage eINSTANCE = no.hib.dpf.text.tdpf.impl.TdpfPackageImpl.init();

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.ModelImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.BatchImpl <em>Batch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.BatchImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getBatch()
   * @generated
   */
  int BATCH = 1;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH__COMMANDS = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Batch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BATCH_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.CommandImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 2;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.MakeEmfImpl <em>Make Emf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.MakeEmfImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getMakeEmf()
   * @generated
   */
  int MAKE_EMF = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_EMF__ID = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Make Emf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_EMF_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.MakeEcoreImpl <em>Make Ecore</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.MakeEcoreImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getMakeEcore()
   * @generated
   */
  int MAKE_ECORE = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_ECORE__ID = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Make Ecore</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_ECORE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.MakeImageImpl <em>Make Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.MakeImageImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getMakeImage()
   * @generated
   */
  int MAKE_IMAGE = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_IMAGE__ID = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_IMAGE__TYPE = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Make Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_IMAGE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.MakeDiagramImpl <em>Make Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.MakeDiagramImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getMakeDiagram()
   * @generated
   */
  int MAKE_DIAGRAM = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_DIAGRAM__ID = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_DIAGRAM__TYPE = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Make Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_DIAGRAM_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.TestMatchImpl <em>Test Match</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.TestMatchImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getTestMatch()
   * @generated
   */
  int TEST_MATCH = 7;

  /**
   * The feature id for the '<em><b>Search</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_MATCH__SEARCH = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Into</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_MATCH__INTO = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Test Match</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_MATCH_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.SpecificationImpl <em>Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.SpecificationImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getSpecification()
   * @generated
   */
  int SPECIFICATION = 8;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__VERSION = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__TYPE = MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__OUTPUT = MODEL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Graph</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__GRAPH = MODEL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Atomic Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__ATOMIC_CONSTRAINTS = MODEL_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_FEATURE_COUNT = MODEL_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.ConstraintListImpl <em>Constraint List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.ConstraintListImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getConstraintList()
   * @generated
   */
  int CONSTRAINT_LIST = 9;

  /**
   * The feature id for the '<em><b>Constraint Semantic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_LIST__CONSTRAINT_SEMANTIC = 0;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_LIST__CONSTRAINTS = 1;

  /**
   * The number of structural features of the '<em>Constraint List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.ChoosenSpecificationImpl <em>Choosen Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.ChoosenSpecificationImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getChoosenSpecification()
   * @generated
   */
  int CHOOSEN_SPECIFICATION = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOOSEN_SPECIFICATION__ID = 0;

  /**
   * The feature id for the '<em><b>Version Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOOSEN_SPECIFICATION__VERSION_NAME = 1;

  /**
   * The number of structural features of the '<em>Choosen Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOOSEN_SPECIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.VersionImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__NUMBER = 1;

  /**
   * The feature id for the '<em><b>Next Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__NEXT_NUMBER = 2;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.ChoosenSignatureImpl <em>Choosen Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.ChoosenSignatureImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getChoosenSignature()
   * @generated
   */
  int CHOOSEN_SIGNATURE = 12;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOOSEN_SIGNATURE__ID = 0;

  /**
   * The feature id for the '<em><b>Version Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOOSEN_SIGNATURE__VERSION_NAME = 1;

  /**
   * The number of structural features of the '<em>Choosen Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOOSEN_SIGNATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.ConstraintImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__PARAMETER = 1;

  /**
   * The feature id for the '<em><b>Arity d</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__ARITY_D = 2;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.SignatureImpl <em>Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.SignatureImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getSignature()
   * @generated
   */
  int SIGNATURE = 14;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__VERSION = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__INPUT = MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Validators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__VALIDATORS = MODEL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_FEATURE_COUNT = MODEL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.ValidatorImpl <em>Validator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.ValidatorImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getValidator()
   * @generated
   */
  int VALIDATOR = 15;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR__ID = 0;

  /**
   * The feature id for the '<em><b>Parameter vars</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR__PARAMETER_VARS = 1;

  /**
   * The feature id for the '<em><b>Arity</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR__ARITY = 2;

  /**
   * The feature id for the '<em><b>Ocl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR__OCL = 3;

  /**
   * The feature id for the '<em><b>Error Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR__ERROR_MSG = 4;

  /**
   * The number of structural features of the '<em>Validator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.GraphImpl <em>Graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.GraphImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getGraph()
   * @generated
   */
  int GRAPH = 16;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.ElementImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ID = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.ArrowImpl <em>Arrow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.ArrowImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getArrow()
   * @generated
   */
  int ARROW = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW__ID = ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW__TYPE = ELEMENT__TYPE;

  /**
   * The feature id for the '<em><b>Sr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW__SR = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tg Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW__TG_DATA_TYPE = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tg Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW__TG_VALUE = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tg Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW__TG_NODE = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Arrow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.NodeImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getNode()
   * @generated
   */
  int NODE = 19;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ID = ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__TYPE = ELEMENT__TYPE;

  /**
   * The feature id for the '<em><b>Inh</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__INH = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__PROPERTIES = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.NodeSimpleImpl <em>Node Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.NodeSimpleImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getNodeSimple()
   * @generated
   */
  int NODE_SIMPLE = 20;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_SIMPLE__ID = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_SIMPLE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Node Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_SIMPLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.PropertyImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 21;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__ID = 0;

  /**
   * The feature id for the '<em><b>Tg Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TG_DATA_TYPE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 2;

  /**
   * The feature id for the '<em><b>Tg Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TG_VALUE = 3;

  /**
   * The feature id for the '<em><b>Tg Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TG_NODE = 4;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.AttributeValueImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getAttributeValue()
   * @generated
   */
  int ATTRIBUTE_VALUE = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Variable Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE__VARIABLE_ID = 1;

  /**
   * The number of structural features of the '<em>Attribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.DpfIdImpl <em>Dpf Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.DpfIdImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getDpfId()
   * @generated
   */
  int DPF_ID = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DPF_ID__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DPF_ID__ID = 1;

  /**
   * The number of structural features of the '<em>Dpf Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DPF_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.impl.RIdImpl <em>RId</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.impl.RIdImpl
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getRId()
   * @generated
   */
  int RID = 24;

  /**
   * The feature id for the '<em><b>Nums</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RID__NUMS = 0;

  /**
   * The number of structural features of the '<em>RId</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.DataType <em>Data Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.DataType
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 25;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.GraphvizOutput <em>Graphviz Output</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.GraphvizOutput
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getGraphvizOutput()
   * @generated
   */
  int GRAPHVIZ_OUTPUT = 26;

  /**
   * The meta object id for the '{@link no.hib.dpf.text.tdpf.ConstraintLanguage <em>Constraint Language</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hib.dpf.text.tdpf.ConstraintLanguage
   * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getConstraintLanguage()
   * @generated
   */
  int CONSTRAINT_LANGUAGE = 27;


  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see no.hib.dpf.text.tdpf.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Batch <em>Batch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Batch</em>'.
   * @see no.hib.dpf.text.tdpf.Batch
   * @generated
   */
  EClass getBatch();

  /**
   * Returns the meta object for the containment reference list '{@link no.hib.dpf.text.tdpf.Batch#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see no.hib.dpf.text.tdpf.Batch#getCommands()
   * @see #getBatch()
   * @generated
   */
  EReference getBatch_Commands();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see no.hib.dpf.text.tdpf.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.MakeEmf <em>Make Emf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Make Emf</em>'.
   * @see no.hib.dpf.text.tdpf.MakeEmf
   * @generated
   */
  EClass getMakeEmf();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.MakeEmf#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see no.hib.dpf.text.tdpf.MakeEmf#getId()
   * @see #getMakeEmf()
   * @generated
   */
  EAttribute getMakeEmf_Id();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.MakeEcore <em>Make Ecore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Make Ecore</em>'.
   * @see no.hib.dpf.text.tdpf.MakeEcore
   * @generated
   */
  EClass getMakeEcore();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.MakeEcore#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see no.hib.dpf.text.tdpf.MakeEcore#getId()
   * @see #getMakeEcore()
   * @generated
   */
  EAttribute getMakeEcore_Id();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.MakeImage <em>Make Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Make Image</em>'.
   * @see no.hib.dpf.text.tdpf.MakeImage
   * @generated
   */
  EClass getMakeImage();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.MakeImage#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see no.hib.dpf.text.tdpf.MakeImage#getId()
   * @see #getMakeImage()
   * @generated
   */
  EAttribute getMakeImage_Id();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.MakeImage#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see no.hib.dpf.text.tdpf.MakeImage#getType()
   * @see #getMakeImage()
   * @generated
   */
  EAttribute getMakeImage_Type();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.MakeDiagram <em>Make Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Make Diagram</em>'.
   * @see no.hib.dpf.text.tdpf.MakeDiagram
   * @generated
   */
  EClass getMakeDiagram();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.MakeDiagram#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see no.hib.dpf.text.tdpf.MakeDiagram#getId()
   * @see #getMakeDiagram()
   * @generated
   */
  EAttribute getMakeDiagram_Id();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.MakeDiagram#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see no.hib.dpf.text.tdpf.MakeDiagram#getType()
   * @see #getMakeDiagram()
   * @generated
   */
  EAttribute getMakeDiagram_Type();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.TestMatch <em>Test Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Match</em>'.
   * @see no.hib.dpf.text.tdpf.TestMatch
   * @generated
   */
  EClass getTestMatch();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.TestMatch#getSearch <em>Search</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Search</em>'.
   * @see no.hib.dpf.text.tdpf.TestMatch#getSearch()
   * @see #getTestMatch()
   * @generated
   */
  EAttribute getTestMatch_Search();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.TestMatch#getInto <em>Into</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Into</em>'.
   * @see no.hib.dpf.text.tdpf.TestMatch#getInto()
   * @see #getTestMatch()
   * @generated
   */
  EAttribute getTestMatch_Into();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specification</em>'.
   * @see no.hib.dpf.text.tdpf.Specification
   * @generated
   */
  EClass getSpecification();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Specification#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see no.hib.dpf.text.tdpf.Specification#getVersion()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Version();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Specification#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see no.hib.dpf.text.tdpf.Specification#getType()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Type();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.Specification#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output</em>'.
   * @see no.hib.dpf.text.tdpf.Specification#getOutput()
   * @see #getSpecification()
   * @generated
   */
  EAttribute getSpecification_Output();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Specification#getGraph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Graph</em>'.
   * @see no.hib.dpf.text.tdpf.Specification#getGraph()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Graph();

  /**
   * Returns the meta object for the containment reference list '{@link no.hib.dpf.text.tdpf.Specification#getAtomicConstraints <em>Atomic Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atomic Constraints</em>'.
   * @see no.hib.dpf.text.tdpf.Specification#getAtomicConstraints()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_AtomicConstraints();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.ConstraintList <em>Constraint List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint List</em>'.
   * @see no.hib.dpf.text.tdpf.ConstraintList
   * @generated
   */
  EClass getConstraintList();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.ConstraintList#getConstraintSemantic <em>Constraint Semantic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint Semantic</em>'.
   * @see no.hib.dpf.text.tdpf.ConstraintList#getConstraintSemantic()
   * @see #getConstraintList()
   * @generated
   */
  EReference getConstraintList_ConstraintSemantic();

  /**
   * Returns the meta object for the containment reference list '{@link no.hib.dpf.text.tdpf.ConstraintList#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see no.hib.dpf.text.tdpf.ConstraintList#getConstraints()
   * @see #getConstraintList()
   * @generated
   */
  EReference getConstraintList_Constraints();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.ChoosenSpecification <em>Choosen Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choosen Specification</em>'.
   * @see no.hib.dpf.text.tdpf.ChoosenSpecification
   * @generated
   */
  EClass getChoosenSpecification();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.ChoosenSpecification#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see no.hib.dpf.text.tdpf.ChoosenSpecification#getId()
   * @see #getChoosenSpecification()
   * @generated
   */
  EAttribute getChoosenSpecification_Id();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.ChoosenSpecification#getVersionName <em>Version Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Name</em>'.
   * @see no.hib.dpf.text.tdpf.ChoosenSpecification#getVersionName()
   * @see #getChoosenSpecification()
   * @generated
   */
  EAttribute getChoosenSpecification_VersionName();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see no.hib.dpf.text.tdpf.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.Version#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see no.hib.dpf.text.tdpf.Version#getName()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Name();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.Version#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see no.hib.dpf.text.tdpf.Version#getNumber()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Number();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.Version#getNextNumber <em>Next Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Next Number</em>'.
   * @see no.hib.dpf.text.tdpf.Version#getNextNumber()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_NextNumber();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.ChoosenSignature <em>Choosen Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choosen Signature</em>'.
   * @see no.hib.dpf.text.tdpf.ChoosenSignature
   * @generated
   */
  EClass getChoosenSignature();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.ChoosenSignature#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see no.hib.dpf.text.tdpf.ChoosenSignature#getId()
   * @see #getChoosenSignature()
   * @generated
   */
  EAttribute getChoosenSignature_Id();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.ChoosenSignature#getVersionName <em>Version Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Name</em>'.
   * @see no.hib.dpf.text.tdpf.ChoosenSignature#getVersionName()
   * @see #getChoosenSignature()
   * @generated
   */
  EAttribute getChoosenSignature_VersionName();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see no.hib.dpf.text.tdpf.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Constraint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see no.hib.dpf.text.tdpf.Constraint#getType()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Type();

  /**
   * Returns the meta object for the attribute list '{@link no.hib.dpf.text.tdpf.Constraint#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameter</em>'.
   * @see no.hib.dpf.text.tdpf.Constraint#getParameter()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Parameter();

  /**
   * Returns the meta object for the containment reference list '{@link no.hib.dpf.text.tdpf.Constraint#getArity_d <em>Arity d</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arity d</em>'.
   * @see no.hib.dpf.text.tdpf.Constraint#getArity_d()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Arity_d();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Signature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signature</em>'.
   * @see no.hib.dpf.text.tdpf.Signature
   * @generated
   */
  EClass getSignature();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Signature#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see no.hib.dpf.text.tdpf.Signature#getVersion()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_Version();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.Signature#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see no.hib.dpf.text.tdpf.Signature#getInput()
   * @see #getSignature()
   * @generated
   */
  EAttribute getSignature_Input();

  /**
   * Returns the meta object for the containment reference list '{@link no.hib.dpf.text.tdpf.Signature#getValidators <em>Validators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Validators</em>'.
   * @see no.hib.dpf.text.tdpf.Signature#getValidators()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_Validators();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Validator <em>Validator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validator</em>'.
   * @see no.hib.dpf.text.tdpf.Validator
   * @generated
   */
  EClass getValidator();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Validator#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see no.hib.dpf.text.tdpf.Validator#getId()
   * @see #getValidator()
   * @generated
   */
  EReference getValidator_Id();

  /**
   * Returns the meta object for the attribute list '{@link no.hib.dpf.text.tdpf.Validator#getParameter_vars <em>Parameter vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameter vars</em>'.
   * @see no.hib.dpf.text.tdpf.Validator#getParameter_vars()
   * @see #getValidator()
   * @generated
   */
  EAttribute getValidator_Parameter_vars();

  /**
   * Returns the meta object for the containment reference list '{@link no.hib.dpf.text.tdpf.Validator#getArity <em>Arity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arity</em>'.
   * @see no.hib.dpf.text.tdpf.Validator#getArity()
   * @see #getValidator()
   * @generated
   */
  EReference getValidator_Arity();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.Validator#getOcl <em>Ocl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ocl</em>'.
   * @see no.hib.dpf.text.tdpf.Validator#getOcl()
   * @see #getValidator()
   * @generated
   */
  EAttribute getValidator_Ocl();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.Validator#getErrorMsg <em>Error Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Error Msg</em>'.
   * @see no.hib.dpf.text.tdpf.Validator#getErrorMsg()
   * @see #getValidator()
   * @generated
   */
  EAttribute getValidator_ErrorMsg();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Graph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graph</em>'.
   * @see no.hib.dpf.text.tdpf.Graph
   * @generated
   */
  EClass getGraph();

  /**
   * Returns the meta object for the containment reference list '{@link no.hib.dpf.text.tdpf.Graph#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see no.hib.dpf.text.tdpf.Graph#getElements()
   * @see #getGraph()
   * @generated
   */
  EReference getGraph_Elements();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see no.hib.dpf.text.tdpf.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Element#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see no.hib.dpf.text.tdpf.Element#getId()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Id();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Element#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see no.hib.dpf.text.tdpf.Element#getType()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Type();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Arrow <em>Arrow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arrow</em>'.
   * @see no.hib.dpf.text.tdpf.Arrow
   * @generated
   */
  EClass getArrow();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Arrow#getSr <em>Sr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sr</em>'.
   * @see no.hib.dpf.text.tdpf.Arrow#getSr()
   * @see #getArrow()
   * @generated
   */
  EReference getArrow_Sr();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.Arrow#getTgDataType <em>Tg Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tg Data Type</em>'.
   * @see no.hib.dpf.text.tdpf.Arrow#getTgDataType()
   * @see #getArrow()
   * @generated
   */
  EAttribute getArrow_TgDataType();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Arrow#getTgValue <em>Tg Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tg Value</em>'.
   * @see no.hib.dpf.text.tdpf.Arrow#getTgValue()
   * @see #getArrow()
   * @generated
   */
  EReference getArrow_TgValue();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Arrow#getTgNode <em>Tg Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tg Node</em>'.
   * @see no.hib.dpf.text.tdpf.Arrow#getTgNode()
   * @see #getArrow()
   * @generated
   */
  EReference getArrow_TgNode();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see no.hib.dpf.text.tdpf.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the containment reference list '{@link no.hib.dpf.text.tdpf.Node#getInh <em>Inh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inh</em>'.
   * @see no.hib.dpf.text.tdpf.Node#getInh()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Inh();

  /**
   * Returns the meta object for the containment reference list '{@link no.hib.dpf.text.tdpf.Node#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see no.hib.dpf.text.tdpf.Node#getProperties()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Properties();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.NodeSimple <em>Node Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Simple</em>'.
   * @see no.hib.dpf.text.tdpf.NodeSimple
   * @generated
   */
  EClass getNodeSimple();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.NodeSimple#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see no.hib.dpf.text.tdpf.NodeSimple#getId()
   * @see #getNodeSimple()
   * @generated
   */
  EReference getNodeSimple_Id();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.NodeSimple#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see no.hib.dpf.text.tdpf.NodeSimple#getType()
   * @see #getNodeSimple()
   * @generated
   */
  EReference getNodeSimple_Type();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see no.hib.dpf.text.tdpf.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Property#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see no.hib.dpf.text.tdpf.Property#getId()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Id();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.Property#getTgDataType <em>Tg Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tg Data Type</em>'.
   * @see no.hib.dpf.text.tdpf.Property#getTgDataType()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_TgDataType();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see no.hib.dpf.text.tdpf.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Property#getTgValue <em>Tg Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tg Value</em>'.
   * @see no.hib.dpf.text.tdpf.Property#getTgValue()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_TgValue();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.Property#getTgNode <em>Tg Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tg Node</em>'.
   * @see no.hib.dpf.text.tdpf.Property#getTgNode()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_TgNode();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Value</em>'.
   * @see no.hib.dpf.text.tdpf.AttributeValue
   * @generated
   */
  EClass getAttributeValue();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.AttributeValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see no.hib.dpf.text.tdpf.AttributeValue#getValue()
   * @see #getAttributeValue()
   * @generated
   */
  EAttribute getAttributeValue_Value();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.AttributeValue#getVariableId <em>Variable Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Id</em>'.
   * @see no.hib.dpf.text.tdpf.AttributeValue#getVariableId()
   * @see #getAttributeValue()
   * @generated
   */
  EAttribute getAttributeValue_VariableId();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.DpfId <em>Dpf Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dpf Id</em>'.
   * @see no.hib.dpf.text.tdpf.DpfId
   * @generated
   */
  EClass getDpfId();

  /**
   * Returns the meta object for the attribute '{@link no.hib.dpf.text.tdpf.DpfId#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see no.hib.dpf.text.tdpf.DpfId#getName()
   * @see #getDpfId()
   * @generated
   */
  EAttribute getDpfId_Name();

  /**
   * Returns the meta object for the containment reference '{@link no.hib.dpf.text.tdpf.DpfId#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see no.hib.dpf.text.tdpf.DpfId#getId()
   * @see #getDpfId()
   * @generated
   */
  EReference getDpfId_Id();

  /**
   * Returns the meta object for class '{@link no.hib.dpf.text.tdpf.RId <em>RId</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RId</em>'.
   * @see no.hib.dpf.text.tdpf.RId
   * @generated
   */
  EClass getRId();

  /**
   * Returns the meta object for the attribute list '{@link no.hib.dpf.text.tdpf.RId#getNums <em>Nums</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Nums</em>'.
   * @see no.hib.dpf.text.tdpf.RId#getNums()
   * @see #getRId()
   * @generated
   */
  EAttribute getRId_Nums();

  /**
   * Returns the meta object for enum '{@link no.hib.dpf.text.tdpf.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Type</em>'.
   * @see no.hib.dpf.text.tdpf.DataType
   * @generated
   */
  EEnum getDataType();

  /**
   * Returns the meta object for enum '{@link no.hib.dpf.text.tdpf.GraphvizOutput <em>Graphviz Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Graphviz Output</em>'.
   * @see no.hib.dpf.text.tdpf.GraphvizOutput
   * @generated
   */
  EEnum getGraphvizOutput();

  /**
   * Returns the meta object for enum '{@link no.hib.dpf.text.tdpf.ConstraintLanguage <em>Constraint Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Constraint Language</em>'.
   * @see no.hib.dpf.text.tdpf.ConstraintLanguage
   * @generated
   */
  EEnum getConstraintLanguage();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TdpfFactory getTdpfFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.ModelImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.BatchImpl <em>Batch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.BatchImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getBatch()
     * @generated
     */
    EClass BATCH = eINSTANCE.getBatch();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BATCH__COMMANDS = eINSTANCE.getBatch_Commands();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.CommandImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.MakeEmfImpl <em>Make Emf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.MakeEmfImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getMakeEmf()
     * @generated
     */
    EClass MAKE_EMF = eINSTANCE.getMakeEmf();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAKE_EMF__ID = eINSTANCE.getMakeEmf_Id();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.MakeEcoreImpl <em>Make Ecore</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.MakeEcoreImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getMakeEcore()
     * @generated
     */
    EClass MAKE_ECORE = eINSTANCE.getMakeEcore();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAKE_ECORE__ID = eINSTANCE.getMakeEcore_Id();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.MakeImageImpl <em>Make Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.MakeImageImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getMakeImage()
     * @generated
     */
    EClass MAKE_IMAGE = eINSTANCE.getMakeImage();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAKE_IMAGE__ID = eINSTANCE.getMakeImage_Id();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAKE_IMAGE__TYPE = eINSTANCE.getMakeImage_Type();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.MakeDiagramImpl <em>Make Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.MakeDiagramImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getMakeDiagram()
     * @generated
     */
    EClass MAKE_DIAGRAM = eINSTANCE.getMakeDiagram();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAKE_DIAGRAM__ID = eINSTANCE.getMakeDiagram_Id();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAKE_DIAGRAM__TYPE = eINSTANCE.getMakeDiagram_Type();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.TestMatchImpl <em>Test Match</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.TestMatchImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getTestMatch()
     * @generated
     */
    EClass TEST_MATCH = eINSTANCE.getTestMatch();

    /**
     * The meta object literal for the '<em><b>Search</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_MATCH__SEARCH = eINSTANCE.getTestMatch_Search();

    /**
     * The meta object literal for the '<em><b>Into</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_MATCH__INTO = eINSTANCE.getTestMatch_Into();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.SpecificationImpl <em>Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.SpecificationImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getSpecification()
     * @generated
     */
    EClass SPECIFICATION = eINSTANCE.getSpecification();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__VERSION = eINSTANCE.getSpecification_Version();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__TYPE = eINSTANCE.getSpecification_Type();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIFICATION__OUTPUT = eINSTANCE.getSpecification_Output();

    /**
     * The meta object literal for the '<em><b>Graph</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__GRAPH = eINSTANCE.getSpecification_Graph();

    /**
     * The meta object literal for the '<em><b>Atomic Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__ATOMIC_CONSTRAINTS = eINSTANCE.getSpecification_AtomicConstraints();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.ConstraintListImpl <em>Constraint List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.ConstraintListImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getConstraintList()
     * @generated
     */
    EClass CONSTRAINT_LIST = eINSTANCE.getConstraintList();

    /**
     * The meta object literal for the '<em><b>Constraint Semantic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_LIST__CONSTRAINT_SEMANTIC = eINSTANCE.getConstraintList_ConstraintSemantic();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_LIST__CONSTRAINTS = eINSTANCE.getConstraintList_Constraints();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.ChoosenSpecificationImpl <em>Choosen Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.ChoosenSpecificationImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getChoosenSpecification()
     * @generated
     */
    EClass CHOOSEN_SPECIFICATION = eINSTANCE.getChoosenSpecification();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOOSEN_SPECIFICATION__ID = eINSTANCE.getChoosenSpecification_Id();

    /**
     * The meta object literal for the '<em><b>Version Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOOSEN_SPECIFICATION__VERSION_NAME = eINSTANCE.getChoosenSpecification_VersionName();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.VersionImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getVersion()
     * @generated
     */
    EClass VERSION = eINSTANCE.getVersion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__NAME = eINSTANCE.getVersion_Name();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__NUMBER = eINSTANCE.getVersion_Number();

    /**
     * The meta object literal for the '<em><b>Next Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__NEXT_NUMBER = eINSTANCE.getVersion_NextNumber();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.ChoosenSignatureImpl <em>Choosen Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.ChoosenSignatureImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getChoosenSignature()
     * @generated
     */
    EClass CHOOSEN_SIGNATURE = eINSTANCE.getChoosenSignature();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOOSEN_SIGNATURE__ID = eINSTANCE.getChoosenSignature_Id();

    /**
     * The meta object literal for the '<em><b>Version Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOOSEN_SIGNATURE__VERSION_NAME = eINSTANCE.getChoosenSignature_VersionName();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.ConstraintImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__TYPE = eINSTANCE.getConstraint_Type();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__PARAMETER = eINSTANCE.getConstraint_Parameter();

    /**
     * The meta object literal for the '<em><b>Arity d</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__ARITY_D = eINSTANCE.getConstraint_Arity_d();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.SignatureImpl <em>Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.SignatureImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getSignature()
     * @generated
     */
    EClass SIGNATURE = eINSTANCE.getSignature();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__VERSION = eINSTANCE.getSignature_Version();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNATURE__INPUT = eINSTANCE.getSignature_Input();

    /**
     * The meta object literal for the '<em><b>Validators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__VALIDATORS = eINSTANCE.getSignature_Validators();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.ValidatorImpl <em>Validator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.ValidatorImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getValidator()
     * @generated
     */
    EClass VALIDATOR = eINSTANCE.getValidator();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATOR__ID = eINSTANCE.getValidator_Id();

    /**
     * The meta object literal for the '<em><b>Parameter vars</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATOR__PARAMETER_VARS = eINSTANCE.getValidator_Parameter_vars();

    /**
     * The meta object literal for the '<em><b>Arity</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATOR__ARITY = eINSTANCE.getValidator_Arity();

    /**
     * The meta object literal for the '<em><b>Ocl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATOR__OCL = eINSTANCE.getValidator_Ocl();

    /**
     * The meta object literal for the '<em><b>Error Msg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATOR__ERROR_MSG = eINSTANCE.getValidator_ErrorMsg();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.GraphImpl <em>Graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.GraphImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getGraph()
     * @generated
     */
    EClass GRAPH = eINSTANCE.getGraph();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH__ELEMENTS = eINSTANCE.getGraph_Elements();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.ElementImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__ID = eINSTANCE.getElement_Id();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__TYPE = eINSTANCE.getElement_Type();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.ArrowImpl <em>Arrow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.ArrowImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getArrow()
     * @generated
     */
    EClass ARROW = eINSTANCE.getArrow();

    /**
     * The meta object literal for the '<em><b>Sr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARROW__SR = eINSTANCE.getArrow_Sr();

    /**
     * The meta object literal for the '<em><b>Tg Data Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARROW__TG_DATA_TYPE = eINSTANCE.getArrow_TgDataType();

    /**
     * The meta object literal for the '<em><b>Tg Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARROW__TG_VALUE = eINSTANCE.getArrow_TgValue();

    /**
     * The meta object literal for the '<em><b>Tg Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARROW__TG_NODE = eINSTANCE.getArrow_TgNode();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.NodeImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Inh</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__INH = eINSTANCE.getNode_Inh();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__PROPERTIES = eINSTANCE.getNode_Properties();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.NodeSimpleImpl <em>Node Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.NodeSimpleImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getNodeSimple()
     * @generated
     */
    EClass NODE_SIMPLE = eINSTANCE.getNodeSimple();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_SIMPLE__ID = eINSTANCE.getNodeSimple_Id();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_SIMPLE__TYPE = eINSTANCE.getNodeSimple_Type();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.PropertyImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__ID = eINSTANCE.getProperty_Id();

    /**
     * The meta object literal for the '<em><b>Tg Data Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__TG_DATA_TYPE = eINSTANCE.getProperty_TgDataType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '<em><b>Tg Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TG_VALUE = eINSTANCE.getProperty_TgValue();

    /**
     * The meta object literal for the '<em><b>Tg Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TG_NODE = eINSTANCE.getProperty_TgNode();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.AttributeValueImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getAttributeValue()
     * @generated
     */
    EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_VALUE__VALUE = eINSTANCE.getAttributeValue_Value();

    /**
     * The meta object literal for the '<em><b>Variable Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_VALUE__VARIABLE_ID = eINSTANCE.getAttributeValue_VariableId();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.DpfIdImpl <em>Dpf Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.DpfIdImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getDpfId()
     * @generated
     */
    EClass DPF_ID = eINSTANCE.getDpfId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DPF_ID__NAME = eINSTANCE.getDpfId_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DPF_ID__ID = eINSTANCE.getDpfId_Id();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.impl.RIdImpl <em>RId</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.impl.RIdImpl
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getRId()
     * @generated
     */
    EClass RID = eINSTANCE.getRId();

    /**
     * The meta object literal for the '<em><b>Nums</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RID__NUMS = eINSTANCE.getRId_Nums();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.DataType <em>Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.DataType
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getDataType()
     * @generated
     */
    EEnum DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.GraphvizOutput <em>Graphviz Output</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.GraphvizOutput
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getGraphvizOutput()
     * @generated
     */
    EEnum GRAPHVIZ_OUTPUT = eINSTANCE.getGraphvizOutput();

    /**
     * The meta object literal for the '{@link no.hib.dpf.text.tdpf.ConstraintLanguage <em>Constraint Language</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hib.dpf.text.tdpf.ConstraintLanguage
     * @see no.hib.dpf.text.tdpf.impl.TdpfPackageImpl#getConstraintLanguage()
     * @generated
     */
    EEnum CONSTRAINT_LANGUAGE = eINSTANCE.getConstraintLanguage();

  }

} //TdpfPackage
