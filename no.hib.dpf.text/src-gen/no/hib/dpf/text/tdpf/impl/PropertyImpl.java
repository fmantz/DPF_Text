/**
 */
package no.hib.dpf.text.tdpf.impl;

import no.hib.dpf.text.tdpf.AttributeValue;
import no.hib.dpf.text.tdpf.DataType;
import no.hib.dpf.text.tdpf.DpfId;
import no.hib.dpf.text.tdpf.NodeSimple;
import no.hib.dpf.text.tdpf.Property;
import no.hib.dpf.text.tdpf.TdpfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.PropertyImpl#getId <em>Id</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.PropertyImpl#getTgDataType <em>Tg Data Type</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.PropertyImpl#getTgValue <em>Tg Value</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.PropertyImpl#getTgNode <em>Tg Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DpfId type;

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
  protected PropertyImpl()
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
    return TdpfPackage.Literals.PROPERTY;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdpfPackage.PROPERTY__ID, oldId, newId);
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
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.PROPERTY__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.PROPERTY__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.PROPERTY__ID, newId, newId));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.PROPERTY__TG_DATA_TYPE, oldTgDataType, tgDataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DpfId getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(DpfId newType, NotificationChain msgs)
  {
    DpfId oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdpfPackage.PROPERTY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DpfId newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.PROPERTY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.PROPERTY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.PROPERTY__TYPE, newType, newType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdpfPackage.PROPERTY__TG_VALUE, oldTgValue, newTgValue);
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
        msgs = ((InternalEObject)tgValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.PROPERTY__TG_VALUE, null, msgs);
      if (newTgValue != null)
        msgs = ((InternalEObject)newTgValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.PROPERTY__TG_VALUE, null, msgs);
      msgs = basicSetTgValue(newTgValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.PROPERTY__TG_VALUE, newTgValue, newTgValue));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TdpfPackage.PROPERTY__TG_NODE, oldTgNode, newTgNode);
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
        msgs = ((InternalEObject)tgNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.PROPERTY__TG_NODE, null, msgs);
      if (newTgNode != null)
        msgs = ((InternalEObject)newTgNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TdpfPackage.PROPERTY__TG_NODE, null, msgs);
      msgs = basicSetTgNode(newTgNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.PROPERTY__TG_NODE, newTgNode, newTgNode));
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
      case TdpfPackage.PROPERTY__ID:
        return basicSetId(null, msgs);
      case TdpfPackage.PROPERTY__TYPE:
        return basicSetType(null, msgs);
      case TdpfPackage.PROPERTY__TG_VALUE:
        return basicSetTgValue(null, msgs);
      case TdpfPackage.PROPERTY__TG_NODE:
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
      case TdpfPackage.PROPERTY__ID:
        return getId();
      case TdpfPackage.PROPERTY__TG_DATA_TYPE:
        return getTgDataType();
      case TdpfPackage.PROPERTY__TYPE:
        return getType();
      case TdpfPackage.PROPERTY__TG_VALUE:
        return getTgValue();
      case TdpfPackage.PROPERTY__TG_NODE:
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
      case TdpfPackage.PROPERTY__ID:
        setId((DpfId)newValue);
        return;
      case TdpfPackage.PROPERTY__TG_DATA_TYPE:
        setTgDataType((DataType)newValue);
        return;
      case TdpfPackage.PROPERTY__TYPE:
        setType((DpfId)newValue);
        return;
      case TdpfPackage.PROPERTY__TG_VALUE:
        setTgValue((AttributeValue)newValue);
        return;
      case TdpfPackage.PROPERTY__TG_NODE:
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
      case TdpfPackage.PROPERTY__ID:
        setId((DpfId)null);
        return;
      case TdpfPackage.PROPERTY__TG_DATA_TYPE:
        setTgDataType(TG_DATA_TYPE_EDEFAULT);
        return;
      case TdpfPackage.PROPERTY__TYPE:
        setType((DpfId)null);
        return;
      case TdpfPackage.PROPERTY__TG_VALUE:
        setTgValue((AttributeValue)null);
        return;
      case TdpfPackage.PROPERTY__TG_NODE:
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
      case TdpfPackage.PROPERTY__ID:
        return id != null;
      case TdpfPackage.PROPERTY__TG_DATA_TYPE:
        return tgDataType != TG_DATA_TYPE_EDEFAULT;
      case TdpfPackage.PROPERTY__TYPE:
        return type != null;
      case TdpfPackage.PROPERTY__TG_VALUE:
        return tgValue != null;
      case TdpfPackage.PROPERTY__TG_NODE:
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

} //PropertyImpl
