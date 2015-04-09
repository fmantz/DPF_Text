/**
 */
package no.hib.dpf.text.tdpf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.ConstraintList#getConstraintSemantic <em>Constraint Semantic</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.ConstraintList#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getConstraintList()
 * @model
 * @generated
 */
public interface ConstraintList extends EObject
{
  /**
   * Returns the value of the '<em><b>Constraint Semantic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint Semantic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint Semantic</em>' containment reference.
   * @see #setConstraintSemantic(ChoosenSignature)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getConstraintList_ConstraintSemantic()
   * @model containment="true"
   * @generated
   */
  ChoosenSignature getConstraintSemantic();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.ConstraintList#getConstraintSemantic <em>Constraint Semantic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint Semantic</em>' containment reference.
   * @see #getConstraintSemantic()
   * @generated
   */
  void setConstraintSemantic(ChoosenSignature value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link no.hib.dpf.text.tdpf.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getConstraintList_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // ConstraintList
