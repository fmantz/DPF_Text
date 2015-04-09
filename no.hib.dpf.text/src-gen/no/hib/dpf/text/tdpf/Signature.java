/**
 */
package no.hib.dpf.text.tdpf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.Signature#getVersion <em>Version</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Signature#getInput <em>Input</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Signature#getValidators <em>Validators</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends Model
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' containment reference.
   * @see #setVersion(Version)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getSignature_Version()
   * @model containment="true"
   * @generated
   */
  Version getVersion();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Signature#getVersion <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' containment reference.
   * @see #getVersion()
   * @generated
   */
  void setVersion(Version value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' attribute.
   * The literals are from the enumeration {@link no.hib.dpf.text.tdpf.ConstraintLanguage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' attribute.
   * @see no.hib.dpf.text.tdpf.ConstraintLanguage
   * @see #setInput(ConstraintLanguage)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getSignature_Input()
   * @model
   * @generated
   */
  ConstraintLanguage getInput();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Signature#getInput <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' attribute.
   * @see no.hib.dpf.text.tdpf.ConstraintLanguage
   * @see #getInput()
   * @generated
   */
  void setInput(ConstraintLanguage value);

  /**
   * Returns the value of the '<em><b>Validators</b></em>' containment reference list.
   * The list contents are of type {@link no.hib.dpf.text.tdpf.Validator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validators</em>' containment reference list.
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getSignature_Validators()
   * @model containment="true"
   * @generated
   */
  EList<Validator> getValidators();

} // Signature
