/**
 */
package no.hib.dpf.text.tdpf.impl;

import java.util.Collection;

import no.hib.dpf.text.tdpf.DpfId;
import no.hib.dpf.text.tdpf.TdpfPackage;
import no.hib.dpf.text.tdpf.Validator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.ValidatorImpl#getId <em>Id</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.ValidatorImpl#getParameter_vars <em>Parameter vars</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.ValidatorImpl#getArity <em>Arity</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.ValidatorImpl#getOcl <em>Ocl</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.ValidatorImpl#getErrorMsg <em>Error Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidatorImpl extends MinimalEObjectImpl.Container implements Validator
{
  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected DpfId id;

  /**
   * The cached value of the '{@link #getParameter_vars() <em>Parameter vars</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter_vars()
   * @generated
   * @ordered
   */
  protected EList<String> parameter_vars;

  /**
   * The cached value of the '{@link #getArity() <em>Arity</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArity()
   * @generated
   * @ordered
   */
  protected EList<EObject> arity;

  /**
   * The default value of the '{@link #getOcl() <em>Ocl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOcl()
   * @generated
   * @ordered
   */
  protected static final String OCL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOcl() <em>Ocl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOcl()
   * @generated
   * @ordered
   */
  protected String ocl = OCL_EDEFAULT;

  /**
   * The default value of the '{@link #getErrorMsg() <em>Error Msg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorMsg()
   * @generated
   * @ordered
   */
  protected static final String ERROR_MSG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getErrorMsg() <em>Error Msg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorMsg()
   * @generated
   * @ordered
   */
  protected String errorMsg = ERROR_MSG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValidatorImpl()
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
    return TdpfPackage.Literals.VALIDATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DpfId getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId(DpfId newId, NotificationChain msgs)
  {
    DpfId oldId = id;
    id = newId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdpfPackage.VALIDATOR__ID, oldId, newId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(DpfId newId)
  {
    if (newId != id)
    {
      NotificationChain msgs = null;
      if (id != null)
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.VALIDATOR__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.VALIDATOR__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.VALIDATOR__ID, newId, newId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParameter_vars()
  {
    if (parameter_vars == null)
    {
      parameter_vars = new EDataTypeEList<String>(String.class, this, TdpfPackage.VALIDATOR__PARAMETER_VARS);
    }
    return parameter_vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getArity()
  {
    if (arity == null)
    {
      arity = new EObjectContainmentEList<EObject>(EObject.class, this, TdpfPackage.VALIDATOR__ARITY);
    }
    return arity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOcl()
  {
    return ocl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOcl(String newOcl)
  {
    String oldOcl = ocl;
    ocl = newOcl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.VALIDATOR__OCL, oldOcl, ocl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getErrorMsg()
  {
    return errorMsg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorMsg(String newErrorMsg)
  {
    String oldErrorMsg = errorMsg;
    errorMsg = newErrorMsg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.VALIDATOR__ERROR_MSG, oldErrorMsg, errorMsg));
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
      case TdpfPackage.VALIDATOR__ID:
        return basicSetId(null, msgs);
      case TdpfPackage.VALIDATOR__ARITY:
        return ((InternalEList<?>)getArity()).basicRemove(otherEnd, msgs);
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
      case TdpfPackage.VALIDATOR__ID:
        return getId();
      case TdpfPackage.VALIDATOR__PARAMETER_VARS:
        return getParameter_vars();
      case TdpfPackage.VALIDATOR__ARITY:
        return getArity();
      case TdpfPackage.VALIDATOR__OCL:
        return getOcl();
      case TdpfPackage.VALIDATOR__ERROR_MSG:
        return getErrorMsg();
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
      case TdpfPackage.VALIDATOR__ID:
        setId((DpfId)newValue);
        return;
      case TdpfPackage.VALIDATOR__PARAMETER_VARS:
        getParameter_vars().clear();
        getParameter_vars().addAll((Collection<? extends String>)newValue);
        return;
      case TdpfPackage.VALIDATOR__ARITY:
        getArity().clear();
        getArity().addAll((Collection<? extends EObject>)newValue);
        return;
      case TdpfPackage.VALIDATOR__OCL:
        setOcl((String)newValue);
        return;
      case TdpfPackage.VALIDATOR__ERROR_MSG:
        setErrorMsg((String)newValue);
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
      case TdpfPackage.VALIDATOR__ID:
        setId((DpfId)null);
        return;
      case TdpfPackage.VALIDATOR__PARAMETER_VARS:
        getParameter_vars().clear();
        return;
      case TdpfPackage.VALIDATOR__ARITY:
        getArity().clear();
        return;
      case TdpfPackage.VALIDATOR__OCL:
        setOcl(OCL_EDEFAULT);
        return;
      case TdpfPackage.VALIDATOR__ERROR_MSG:
        setErrorMsg(ERROR_MSG_EDEFAULT);
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
      case TdpfPackage.VALIDATOR__ID:
        return id != null;
      case TdpfPackage.VALIDATOR__PARAMETER_VARS:
        return parameter_vars != null && !parameter_vars.isEmpty();
      case TdpfPackage.VALIDATOR__ARITY:
        return arity != null && !arity.isEmpty();
      case TdpfPackage.VALIDATOR__OCL:
        return OCL_EDEFAULT == null ? ocl != null : !OCL_EDEFAULT.equals(ocl);
      case TdpfPackage.VALIDATOR__ERROR_MSG:
        return ERROR_MSG_EDEFAULT == null ? errorMsg != null : !ERROR_MSG_EDEFAULT.equals(errorMsg);
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
    result.append(" (parameter_vars: ");
    result.append(parameter_vars);
    result.append(", ocl: ");
    result.append(ocl);
    result.append(", errorMsg: ");
    result.append(errorMsg);
    result.append(')');
    return result.toString();
  }

} //ValidatorImpl
