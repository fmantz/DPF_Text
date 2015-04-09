/**
 */
package no.hib.dpf.text.tdpf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.Constraint#getType <em>Type</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Constraint#getParameter <em>Parameter</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Constraint#getArity_d <em>Arity d</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
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
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getConstraint_Type()
   * @model containment="true"
   * @generated
   */
  DpfId getType();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Constraint#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DpfId value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' attribute list.
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getConstraint_Parameter()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameter();

  /**
   * Returns the value of the '<em><b>Arity d</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arity d</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arity d</em>' containment reference list.
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getConstraint_Arity_d()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getArity_d();

} // Constraint
