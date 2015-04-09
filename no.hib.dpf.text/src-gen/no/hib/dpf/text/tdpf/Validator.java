/**
 */
package no.hib.dpf.text.tdpf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.Validator#getId <em>Id</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Validator#getParameter_vars <em>Parameter vars</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Validator#getArity <em>Arity</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Validator#getOcl <em>Ocl</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Validator#getErrorMsg <em>Error Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getValidator()
 * @model
 * @generated
 */
public interface Validator extends EObject
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
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getValidator_Id()
   * @model containment="true"
   * @generated
   */
  DpfId getId();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Validator#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(DpfId value);

  /**
   * Returns the value of the '<em><b>Parameter vars</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter vars</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter vars</em>' attribute list.
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getValidator_Parameter_vars()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameter_vars();

  /**
   * Returns the value of the '<em><b>Arity</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arity</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arity</em>' containment reference list.
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getValidator_Arity()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getArity();

  /**
   * Returns the value of the '<em><b>Ocl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ocl</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ocl</em>' attribute.
   * @see #setOcl(String)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getValidator_Ocl()
   * @model
   * @generated
   */
  String getOcl();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Validator#getOcl <em>Ocl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ocl</em>' attribute.
   * @see #getOcl()
   * @generated
   */
  void setOcl(String value);

  /**
   * Returns the value of the '<em><b>Error Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error Msg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Msg</em>' attribute.
   * @see #setErrorMsg(String)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getValidator_ErrorMsg()
   * @model
   * @generated
   */
  String getErrorMsg();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Validator#getErrorMsg <em>Error Msg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Msg</em>' attribute.
   * @see #getErrorMsg()
   * @generated
   */
  void setErrorMsg(String value);

} // Validator
