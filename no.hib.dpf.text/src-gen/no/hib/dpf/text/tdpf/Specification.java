/**
 */
package no.hib.dpf.text.tdpf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.Specification#getVersion <em>Version</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Specification#getType <em>Type</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Specification#getOutput <em>Output</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Specification#getGraph <em>Graph</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.Specification#getAtomicConstraints <em>Atomic Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends Model
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
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getSpecification_Version()
   * @model containment="true"
   * @generated
   */
  Version getVersion();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Specification#getVersion <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' containment reference.
   * @see #getVersion()
   * @generated
   */
  void setVersion(Version value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ChoosenSpecification)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getSpecification_Type()
   * @model containment="true"
   * @generated
   */
  ChoosenSpecification getType();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Specification#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ChoosenSpecification value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' attribute.
   * @see #setOutput(String)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getSpecification_Output()
   * @model
   * @generated
   */
  String getOutput();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Specification#getOutput <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' attribute.
   * @see #getOutput()
   * @generated
   */
  void setOutput(String value);

  /**
   * Returns the value of the '<em><b>Graph</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graph</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graph</em>' containment reference.
   * @see #setGraph(Graph)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getSpecification_Graph()
   * @model containment="true"
   * @generated
   */
  Graph getGraph();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.Specification#getGraph <em>Graph</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graph</em>' containment reference.
   * @see #getGraph()
   * @generated
   */
  void setGraph(Graph value);

  /**
   * Returns the value of the '<em><b>Atomic Constraints</b></em>' containment reference list.
   * The list contents are of type {@link no.hib.dpf.text.tdpf.ConstraintList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atomic Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic Constraints</em>' containment reference list.
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getSpecification_AtomicConstraints()
   * @model containment="true"
   * @generated
   */
  EList<ConstraintList> getAtomicConstraints();

} // Specification
