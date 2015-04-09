/**
 */
package no.hib.dpf.text.tdpf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.NodeSimple#getId <em>Id</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.NodeSimple#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getNodeSimple()
 * @model
 * @generated
 */
public interface NodeSimple extends EObject
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
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getNodeSimple_Id()
   * @model containment="true"
   * @generated
   */
  DpfId getId();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.NodeSimple#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(DpfId value);

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
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getNodeSimple_Type()
   * @model containment="true"
   * @generated
   */
  DpfId getType();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.NodeSimple#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DpfId value);

} // NodeSimple
