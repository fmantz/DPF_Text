/**
 */
package no.hib.dpf.text.tdpf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.Property#getId <em>Id</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Property#getTgDataType <em>Tg Data Type</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Property#getType <em>Type</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Property#getTgValue <em>Tg Value</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Property#getTgNode <em>Tg Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(DpfId)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getProperty_Id()
   * @model containment="true"
   * @generated
   */
  DpfId getId();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Property#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(DpfId value);

  /**
   * Returns the value of the '<em><b>Tg Data Type</b></em>' attribute.
   * The literals are from the enumeration {@link no.hib.dpf.text.tdpf.DataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tg Data Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tg Data Type</em>' attribute.
   * @see no.hib.dpf.text.tdpf.DataType
   * @see #setTgDataType(DataType)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getProperty_TgDataType()
   * @model
   * @generated
   */
  DataType getTgDataType();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Property#getTgDataType <em>Tg Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tg Data Type</em>' attribute.
   * @see no.hib.dpf.text.tdpf.DataType
   * @see #getTgDataType()
   * @generated
   */
  void setTgDataType(DataType value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DpfId)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getProperty_Type()
   * @model containment="true"
   * @generated
   */
  DpfId getType();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Property#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DpfId value);

  /**
   * Returns the value of the '<em><b>Tg Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tg Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tg Value</em>' containment reference.
   * @see #setTgValue(AttributeValue)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getProperty_TgValue()
   * @model containment="true"
   * @generated
   */
  AttributeValue getTgValue();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Property#getTgValue <em>Tg Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tg Value</em>' containment reference.
   * @see #getTgValue()
   * @generated
   */
  void setTgValue(AttributeValue value);

  /**
   * Returns the value of the '<em><b>Tg Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tg Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tg Node</em>' containment reference.
   * @see #setTgNode(NodeSimple)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getProperty_TgNode()
   * @model containment="true"
   * @generated
   */
  NodeSimple getTgNode();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Property#getTgNode <em>Tg Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tg Node</em>' containment reference.
   * @see #getTgNode()
   * @generated
   */
  void setTgNode(NodeSimple value);

} // Property
