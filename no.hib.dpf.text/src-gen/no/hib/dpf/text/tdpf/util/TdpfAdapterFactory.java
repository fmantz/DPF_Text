/**
 */
package no.hib.dpf.text.tdpf.util;

import no.hib.dpf.text.tdpf.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hib.dpf.text.tdpf.TdpfPackage
 * @generated
 */
public class TdpfAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TdpfPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TdpfAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TdpfPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TdpfSwitch<Adapter> modelSwitch =
    new TdpfSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseBatch(Batch object)
      {
        return createBatchAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseMakeEmf(MakeEmf object)
      {
        return createMakeEmfAdapter();
      }
      @Override
      public Adapter caseMakeEcore(MakeEcore object)
      {
        return createMakeEcoreAdapter();
      }
      @Override
      public Adapter caseMakeImage(MakeImage object)
      {
        return createMakeImageAdapter();
      }
      @Override
      public Adapter caseMakeDiagram(MakeDiagram object)
      {
        return createMakeDiagramAdapter();
      }
      @Override
      public Adapter caseTestMatch(TestMatch object)
      {
        return createTestMatchAdapter();
      }
      @Override
      public Adapter caseSpecification(Specification object)
      {
        return createSpecificationAdapter();
      }
      @Override
      public Adapter caseConstraintList(ConstraintList object)
      {
        return createConstraintListAdapter();
      }
      @Override
      public Adapter caseChoosenSpecification(ChoosenSpecification object)
      {
        return createChoosenSpecificationAdapter();
      }
      @Override
      public Adapter caseVersion(Version object)
      {
        return createVersionAdapter();
      }
      @Override
      public Adapter caseChoosenSignature(ChoosenSignature object)
      {
        return createChoosenSignatureAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseSignature(Signature object)
      {
        return createSignatureAdapter();
      }
      @Override
      public Adapter caseValidator(Validator object)
      {
        return createValidatorAdapter();
      }
      @Override
      public Adapter caseGraph(Graph object)
      {
        return createGraphAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseArrow(Arrow object)
      {
        return createArrowAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseNodeSimple(NodeSimple object)
      {
        return createNodeSimpleAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseAttributeValue(AttributeValue object)
      {
        return createAttributeValueAdapter();
      }
      @Override
      public Adapter caseDpfId(DpfId object)
      {
        return createDpfIdAdapter();
      }
      @Override
      public Adapter caseRId(RId object)
      {
        return createRIdAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Batch <em>Batch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Batch
   * @generated
   */
  public Adapter createBatchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.MakeEmf <em>Make Emf</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.MakeEmf
   * @generated
   */
  public Adapter createMakeEmfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.MakeEcore <em>Make Ecore</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.MakeEcore
   * @generated
   */
  public Adapter createMakeEcoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.MakeImage <em>Make Image</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.MakeImage
   * @generated
   */
  public Adapter createMakeImageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.MakeDiagram <em>Make Diagram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.MakeDiagram
   * @generated
   */
  public Adapter createMakeDiagramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.TestMatch <em>Test Match</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.TestMatch
   * @generated
   */
  public Adapter createTestMatchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Specification
   * @generated
   */
  public Adapter createSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.ConstraintList <em>Constraint List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.ConstraintList
   * @generated
   */
  public Adapter createConstraintListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.ChoosenSpecification <em>Choosen Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.ChoosenSpecification
   * @generated
   */
  public Adapter createChoosenSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Version
   * @generated
   */
  public Adapter createVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.ChoosenSignature <em>Choosen Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.ChoosenSignature
   * @generated
   */
  public Adapter createChoosenSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Signature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Signature
   * @generated
   */
  public Adapter createSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Validator <em>Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Validator
   * @generated
   */
  public Adapter createValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Graph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Graph
   * @generated
   */
  public Adapter createGraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Arrow <em>Arrow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Arrow
   * @generated
   */
  public Adapter createArrowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.NodeSimple <em>Node Simple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.NodeSimple
   * @generated
   */
  public Adapter createNodeSimpleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.AttributeValue
   * @generated
   */
  public Adapter createAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.DpfId <em>Dpf Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.DpfId
   * @generated
   */
  public Adapter createDpfIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hib.dpf.text.tdpf.RId <em>RId</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hib.dpf.text.tdpf.RId
   * @generated
   */
  public Adapter createRIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TdpfAdapterFactory
