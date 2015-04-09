/**
 */
package no.hib.dpf.text.tdpf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RId</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.RId#getNums <em>Nums</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getRId()
 * @model
 * @generated
 */
public interface RId extends EObject
{
  /**
   * Returns the value of the '<em><b>Nums</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nums</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nums</em>' attribute list.
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getRId_Nums()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getNums();

} // RId
