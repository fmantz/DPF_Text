/**
 */
package no.hib.dpf.text.tdpf.impl;

import java.util.Collection;

import no.hib.dpf.text.tdpf.ChoosenSpecification;
import no.hib.dpf.text.tdpf.ConstraintList;
import no.hib.dpf.text.tdpf.Graph;
import no.hib.dpf.text.tdpf.Specification;
import no.hib.dpf.text.tdpf.TdpfPackage;
import no.hib.dpf.text.tdpf.Version;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.SpecificationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.SpecificationImpl#getType <em>Type</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.SpecificationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.SpecificationImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.SpecificationImpl#getAtomicConstraints <em>Atomic Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationImpl extends ModelImpl implements Specification
{
  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected Version version;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ChoosenSpecification type;

  /**
   * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected static final String OUTPUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected String output = OUTPUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getGraph() <em>Graph</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraph()
   * @generated
   * @ordered
   */
  protected Graph graph;

  /**
   * The cached value of the '{@link #getAtomicConstraints() <em>Atomic Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomicConstraints()
   * @generated
   * @ordered
   */
  protected EList<ConstraintList> atomicConstraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecificationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TdpfPackage.Literals.SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVersion(Version newVersion, NotificationChain msgs)
  {
    Version oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdpfPackage.SPECIFICATION__VERSION, oldVersion, newVersion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(Version newVersion)
  {
    if (newVersion != version)
    {
      NotificationChain msgs = null;
      if (version != null)
        msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.SPECIFICATION__VERSION, null, msgs);
      if (newVersion != null)
        msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.SPECIFICATION__VERSION, null, msgs);
      msgs = basicSetVersion(newVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.SPECIFICATION__VERSION, newVersion, newVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoosenSpecification getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(ChoosenSpecification newType, NotificationChain msgs)
  {
    ChoosenSpecification oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdpfPackage.SPECIFICATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ChoosenSpecification newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.SPECIFICATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.SPECIFICATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.SPECIFICATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(String newOutput)
  {
    String oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.SPECIFICATION__OUTPUT, oldOutput, output));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Graph getGraph()
  {
    return graph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs)
  {
    Graph oldGraph = graph;
    graph = newGraph;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdpfPackage.SPECIFICATION__GRAPH, oldGraph, newGraph);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGraph(Graph newGraph)
  {
    if (newGraph != graph)
    {
      NotificationChain msgs = null;
      if (graph != null)
        msgs = ((InternalEObject)graph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.SPECIFICATION__GRAPH, null, msgs);
      if (newGraph != null)
        msgs = ((InternalEObject)newGraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.SPECIFICATION__GRAPH, null, msgs);
      msgs = basicSetGraph(newGraph, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.SPECIFICATION__GRAPH, newGraph, newGraph));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstraintList> getAtomicConstraints()
  {
    if (atomicConstraints == null)
    {
      atomicConstraints = new EObjectContainmentEList<ConstraintList>(ConstraintList.class, this, TdpfPackage.SPECIFICATION__ATOMIC_CONSTRAINTS);
    }
    return atomicConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TdpfPackage.SPECIFICATION__VERSION:
        return basicSetVersion(null, msgs);
      case TdpfPackage.SPECIFICATION__TYPE:
        return basicSetType(null, msgs);
      case TdpfPackage.SPECIFICATION__GRAPH:
        return basicSetGraph(null, msgs);
      case TdpfPackage.SPECIFICATION__ATOMIC_CONSTRAINTS:
        return ((InternalEList<?>)getAtomicConstraints()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TdpfPackage.SPECIFICATION__VERSION:
        return getVersion();
      case TdpfPackage.SPECIFICATION__TYPE:
        return getType();
      case TdpfPackage.SPECIFICATION__OUTPUT:
        return getOutput();
      case TdpfPackage.SPECIFICATION__GRAPH:
        return getGraph();
      case TdpfPackage.SPECIFICATION__ATOMIC_CONSTRAINTS:
        return getAtomicConstraints();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TdpfPackage.SPECIFICATION__VERSION:
        setVersion((Version)newValue);
        return;
      case TdpfPackage.SPECIFICATION__TYPE:
        setType((ChoosenSpecification)newValue);
        return;
      case TdpfPackage.SPECIFICATION__OUTPUT:
        setOutput((String)newValue);
        return;
      case TdpfPackage.SPECIFICATION__GRAPH:
        setGraph((Graph)newValue);
        return;
      case TdpfPackage.SPECIFICATION__ATOMIC_CONSTRAINTS:
        getAtomicConstraints().clear();
        getAtomicConstraints().addAll((Collection<? extends ConstraintList>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TdpfPackage.SPECIFICATION__VERSION:
        setVersion((Version)null);
        return;
      case TdpfPackage.SPECIFICATION__TYPE:
        setType((ChoosenSpecification)null);
        return;
      case TdpfPackage.SPECIFICATION__OUTPUT:
        setOutput(OUTPUT_EDEFAULT);
        return;
      case TdpfPackage.SPECIFICATION__GRAPH:
        setGraph((Graph)null);
        return;
      case TdpfPackage.SPECIFICATION__ATOMIC_CONSTRAINTS:
        getAtomicConstraints().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TdpfPackage.SPECIFICATION__VERSION:
        return version != null;
      case TdpfPackage.SPECIFICATION__TYPE:
        return type != null;
      case TdpfPackage.SPECIFICATION__OUTPUT:
        return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
      case TdpfPackage.SPECIFICATION__GRAPH:
        return graph != null;
      case TdpfPackage.SPECIFICATION__ATOMIC_CONSTRAINTS:
        return atomicConstraints != null && !atomicConstraints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (output: ");
    result.append(output);
    result.append(')');
    return result.toString();
  }

} //SpecificationImpl
