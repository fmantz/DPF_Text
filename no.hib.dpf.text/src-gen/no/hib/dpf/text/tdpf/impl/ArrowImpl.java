/**
 */
package no.hib.dpf.text.tdpf.impl;

import no.hib.dpf.text.tdpf.Arrow;
import no.hib.dpf.text.tdpf.AttributeValue;
import no.hib.dpf.text.tdpf.DataType;
import no.hib.dpf.text.tdpf.NodeSimple;
import no.hib.dpf.text.tdpf.TdpfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.ArrowImpl#getSr <em>Sr</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.ArrowImpl#getTgDataType <em>Tg Data Type</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.ArrowImpl#getTgValue <em>Tg Value</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.ArrowImpl#getTgNode <em>Tg Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrowImpl extends ElementImpl implements Arrow
{
  /**
   * The cached value of the '{@link #getSr() <em>Sr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSr()
   * @generated
   * @ordered
   */
  protected NodeSimple sr;

  /**
   * The default value of the '{@link #getTgDataType() <em>Tg Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTgDataType()
   * @generated
   * @ordered
   */
  protected static final DataType TG_DATA_TYPE_EDEFAULT = DataType.TBOOLEAN;

  /**
   * The cached value of the '{@link #getTgDataType() <em>Tg Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTgDataType()
   * @generated
   * @ordered
   */
  protected DataType tgDataType = TG_DATA_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTgValue() <em>Tg Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTgValue()
   * @generated
   * @ordered
   */
  protected AttributeValue tgValue;

  /**
   * The cached value of the '{@link #getTgNode() <em>Tg Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTgNode()
   * @generated
   * @ordered
   */
  protected NodeSimple tgNode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrowImpl()
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
    return TdpfPackage.Literals.ARROW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeSimple getSr()
  {
    return sr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSr(NodeSimple newSr, NotificationChain msgs)
  {
    NodeSimple oldSr = sr;
    sr = newSr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdpfPackage.ARROW__SR, oldSr, newSr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSr(NodeSimple newSr)
  {
    if (newSr != sr)
    {
      NotificationChain msgs = null;
      if (sr != null)
        msgs = ((InternalEObject)sr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.ARROW__SR, null, msgs);
      if (newSr != null)
        msgs = ((InternalEObject)newSr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.ARROW__SR, null, msgs);
      msgs = basicSetSr(newSr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.ARROW__SR, newSr, newSr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getTgDataType()
  {
    return tgDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTgDataType(DataType newTgDataType)
  {
    DataType oldTgDataType = tgDataType;
    tgDataType = newTgDataType == null ? TG_DATA_TYPE_EDEFAULT : newTgDataType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.ARROW__TG_DATA_TYPE, oldTgDataType, tgDataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeValue getTgValue()
  {
    return tgValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTgValue(AttributeValue newTgValue, NotificationChain msgs)
  {
    AttributeValue oldTgValue = tgValue;
    tgValue = newTgValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdpfPackage.ARROW__TG_VALUE, oldTgValue, newTgValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTgValue(AttributeValue newTgValue)
  {
    if (newTgValue != tgValue)
    {
      NotificationChain msgs = null;
      if (tgValue != null)
        msgs = ((InternalEObject)tgValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.ARROW__TG_VALUE, null, msgs);
      if (newTgValue != null)
        msgs = ((InternalEObject)newTgValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.ARROW__TG_VALUE, null, msgs);
      msgs = basicSetTgValue(newTgValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.ARROW__TG_VALUE, newTgValue, newTgValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeSimple getTgNode()
  {
    return tgNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTgNode(NodeSimple newTgNode, NotificationChain msgs)
  {
    NodeSimple oldTgNode = tgNode;
    tgNode = newTgNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdpfPackage.ARROW__TG_NODE, oldTgNode, newTgNode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTgNode(NodeSimple newTgNode)
  {
    if (newTgNode != tgNode)
    {
      NotificationChain msgs = null;
      if (tgNode != null)
        msgs = ((InternalEObject)tgNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.ARROW__TG_NODE, null, msgs);
      if (newTgNode != null)
        msgs = ((InternalEObject)newTgNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.ARROW__TG_NODE, null, msgs);
      msgs = basicSetTgNode(newTgNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.ARROW__TG_NODE, newTgNode, newTgNode));
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
      case TdpfPackage.ARROW__SR:
        return basicSetSr(null, msgs);
      case TdpfPackage.ARROW__TG_VALUE:
        return basicSetTgValue(null, msgs);
      case TdpfPackage.ARROW__TG_NODE:
        return basicSetTgNode(null, msgs);
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
      case TdpfPackage.ARROW__SR:
        return getSr();
      case TdpfPackage.ARROW__TG_DATA_TYPE:
        return getTgDataType();
      case TdpfPackage.ARROW__TG_VALUE:
        return getTgValue();
      case TdpfPackage.ARROW__TG_NODE:
        return getTgNode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TdpfPackage.ARROW__SR:
        setSr((NodeSimple)newValue);
        return;
      case TdpfPackage.ARROW__TG_DATA_TYPE:
        setTgDataType((DataType)newValue);
        return;
      case TdpfPackage.ARROW__TG_VALUE:
        setTgValue((AttributeValue)newValue);
        return;
      case TdpfPackage.ARROW__TG_NODE:
        setTgNode((NodeSimple)newValue);
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
      case TdpfPackage.ARROW__SR:
        setSr((NodeSimple)null);
        return;
      case TdpfPackage.ARROW__TG_DATA_TYPE:
        setTgDataType(TG_DATA_TYPE_EDEFAULT);
        return;
      case TdpfPackage.ARROW__TG_VALUE:
        setTgValue((AttributeValue)null);
        return;
      case TdpfPackage.ARROW__TG_NODE:
        setTgNode((NodeSimple)null);
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
      case TdpfPackage.ARROW__SR:
        return sr != null;
      case TdpfPackage.ARROW__TG_DATA_TYPE:
        return tgDataType != TG_DATA_TYPE_EDEFAULT;
      case TdpfPackage.ARROW__TG_VALUE:
        return tgValue != null;
      case TdpfPackage.ARROW__TG_NODE:
        return tgNode != null;
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
    result.append(" (tgDataType: ");
    result.append(tgDataType);
    result.append(')');
    return result.toString();
  }

} //ArrowImpl
