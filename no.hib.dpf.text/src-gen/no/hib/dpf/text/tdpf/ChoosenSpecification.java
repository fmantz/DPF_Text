/**
 */
package no.hib.dpf.text.tdpf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choosen Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.ChoosenSpecification#getId <em>Id</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.ChoosenSpecification#getVersionName <em>Version Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getChoosenSpecification()
 * @model
 * @generated
 */
public interface ChoosenSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getChoosenSpecification_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.ChoosenSpecification#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Version Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version Name</em>' attribute.
   * @see #setVersionName(String)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getChoosenSpecification_VersionName()
   * @model
   * @generated
   */
  String getVersionName();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.ChoosenSpecification#getVersionName <em>Version Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version Name</em>' attribute.
   * @see #getVersionName()
   * @generated
   */
  void setVersionName(String value);

} // ChoosenSpecification
