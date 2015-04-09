/**
 */
package no.hib.dpf.text.tdpf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.Node#getInh <em>Inh</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Node#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Element
{
  /**
   * Returns the value of the '<em><b>Inh</b></em>' containment reference list.
   * The list contents are of type {@link no.hib.dpf.text.tdpf.NodeSimple}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inh</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inh</em>' containment reference list.
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getNode_Inh()
   * @model containment="true"
   * @generated
   */
  EList<NodeSimple> getInh();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link no.hib.dpf.text.tdpf.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getNode_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // Node
