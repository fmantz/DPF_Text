/**
 */
package no.hib.dpf.text.tdpf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Make Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.MakeDiagram#getId <em>Id</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.MakeDiagram#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getMakeDiagram()
 * @model
 * @generated
 */
public interface MakeDiagram extends Command
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
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getMakeDiagram_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.MakeDiagram#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link no.hib.dpf.text.tdpf.GraphvizOutput}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see no.hib.dpf.text.tdpf.GraphvizOutput
   * @see #setType(GraphvizOutput)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getMakeDiagram_Type()
   * @model
   * @generated
   */
  GraphvizOutput getType();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.MakeDiagram#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see no.hib.dpf.text.tdpf.GraphvizOutput
   * @see #getType()
   * @generated
   */
  void setType(GraphvizOutput value);

} // MakeDiagram
