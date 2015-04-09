/**
 */
package no.hib.dpf.text.tdpf.impl;

import java.util.Collection;

import no.hib.dpf.text.tdpf.ChoosenSignature;
import no.hib.dpf.text.tdpf.Constraint;
import no.hib.dpf.text.tdpf.ConstraintList;
import no.hib.dpf.text.tdpf.TdpfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.ConstraintListImpl#getConstraintSemantic <em>Constraint Semantic</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.ConstraintListImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintListImpl extends MinimalEObjectImpl.Container implements ConstraintList
{
  /**
   * The cached value of the '{@link #getConstraintSemantic() <em>Constraint Semantic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintSemantic()
   * @generated
   * @ordered
   */
  protected ChoosenSignature constraintSemantic;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<Constraint> constraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintListImpl()
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
    return TdpfPackage.Literals.CONSTRAINT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoosenSignature getConstraintSemantic()
  {
    return constraintSemantic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraintSemantic(ChoosenSignature newConstraintSemantic, NotificationChain msgs)
  {
    ChoosenSignature oldConstraintSemantic = constraintSemantic;
    constraintSemantic = newConstraintSemantic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdpfPackage.CONSTRAINT_LIST__CONSTRAINT_SEMANTIC, oldConstraintSemantic, newConstraintSemantic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraintSemantic(ChoosenSignature newConstraintSemantic)
  {
    if (newConstraintSemantic != constraintSemantic)
    {
      NotificationChain msgs = null;
      if (constraintSemantic != null)
        msgs = ((InternalEObject)constraintSemantic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.CONSTRAINT_LIST__CONSTRAINT_SEMANTIC, null, msgs);
      if (newConstraintSemantic != null)
        msgs = ((InternalEObject)newConstraintSemantic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.CONSTRAINT_LIST__CONSTRAINT_SEMANTIC, null, msgs);
      msgs = basicSetConstraintSemantic(newConstraintSemantic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.CONSTRAINT_LIST__CONSTRAINT_SEMANTIC, newConstraintSemantic, newConstraintSemantic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, TdpfPackage.CONSTRAINT_LIST__CONSTRAINTS);
    }
    return constraints;
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
      case TdpfPackage.CONSTRAINT_LIST__CONSTRAINT_SEMANTIC:
        return basicSetConstraintSemantic(null, msgs);
      case TdpfPackage.CONSTRAINT_LIST__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
      case TdpfPackage.CONSTRAINT_LIST__CONSTRAINT_SEMANTIC:
        return getConstraintSemantic();
      case TdpfPackage.CONSTRAINT_LIST__CONSTRAINTS:
        return getConstraints();
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
      case TdpfPackage.CONSTRAINT_LIST__CONSTRAINT_SEMANTIC:
        setConstraintSemantic((ChoosenSignature)newValue);
        return;
      case TdpfPackage.CONSTRAINT_LIST__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
      case TdpfPackage.CONSTRAINT_LIST__CONSTRAINT_SEMANTIC:
        setConstraintSemantic((ChoosenSignature)null);
        return;
      case TdpfPackage.CONSTRAINT_LIST__CONSTRAINTS:
        getConstraints().clear();
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
      case TdpfPackage.CONSTRAINT_LIST__CONSTRAINT_SEMANTIC:
        return constraintSemantic != null;
      case TdpfPackage.CONSTRAINT_LIST__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConstraintListImpl
