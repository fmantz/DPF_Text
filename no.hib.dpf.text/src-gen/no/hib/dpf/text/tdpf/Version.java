/**
 */
package no.hib.dpf.text.tdpf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.Version#getName <em>Name</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Version#getNumber <em>Number</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Version#getNextNumber <em>Next Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getVersion_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Version#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getVersion_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Version#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Next Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Number</em>' attribute.
   * @see #setNextNumber(int)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getVersion_NextNumber()
   * @model
   * @generated
   */
  int getNextNumber();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Version#getNextNumber <em>Next Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next Number</em>' attribute.
   * @see #getNextNumber()
   * @generated
   */
  void setNextNumber(int value);

} // Version
