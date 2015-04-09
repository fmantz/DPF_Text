/**
 */
package no.hib.dpf.text.tdpf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.Arrow#getSr <em>Sr</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Arrow#getTgDataType <em>Tg Data Type</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Arrow#getTgValue <em>Tg Value</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Arrow#getTgNode <em>Tg Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getArrow()
 * @model
 * @generated
 */
public interface Arrow extends Element
{
  /**
   * Returns the value of the '<em><b>Sr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sr</em>' containment reference.
   * @see #setSr(NodeSimple)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getArrow_Sr()
   * @model containment="true"
   * @generated
   */
  NodeSimple getSr();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Arrow#getSr <em>Sr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sr</em>' containment reference.
   * @see #getSr()
   * @generated
   */
  void setSr(NodeSimple value);

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
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getArrow_TgDataType()
   * @model
   * @generated
   */
  DataType getTgDataType();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Arrow#getTgDataType <em>Tg Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tg Data Type</em>' attribute.
   * @see no.hib.dpf.text.tdpf.DataType
   * @see #getTgDataType()
   * @generated
   */
  void setTgDataType(DataType value);

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
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getArrow_TgValue()
   * @model containment="true"
   * @generated
   */
  AttributeValue getTgValue();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Arrow#getTgValue <em>Tg Value</em>}' containment reference.
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
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getArrow_TgNode()
   * @model containment="true"
   * @generated
   */
  NodeSimple getTgNode();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Arrow#getTgNode <em>Tg Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tg Node</em>' containment reference.
   * @see #getTgNode()
   * @generated
   */
  void setTgNode(NodeSimple value);

} // Arrow
