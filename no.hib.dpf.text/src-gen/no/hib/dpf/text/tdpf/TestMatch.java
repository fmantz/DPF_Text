/**
 */
package no.hib.dpf.text.tdpf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.TestMatch#getSearch <em>Search</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.TestMatch#getInto <em>Into</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getTestMatch()
 * @model
 * @generated
 */
public interface TestMatch extends Command
{
  /**
   * Returns the value of the '<em><b>Search</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Search</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Search</em>' attribute.
   * @see #setSearch(String)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getTestMatch_Search()
   * @model
   * @generated
   */
  String getSearch();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.TestMatch#getSearch <em>Search</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Search</em>' attribute.
   * @see #getSearch()
   * @generated
   */
  void setSearch(String value);

  /**
   * Returns the value of the '<em><b>Into</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Into</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Into</em>' attribute.
   * @see #setInto(String)
   * @see no.hib.dpf.text.tdpf.TdpfPackage#getTestMatch_Into()
   * @model
   * @generated
   */
  String getInto();

  /**
   * Sets the value of the '{@link no.hib.dpf.text.tdpf.TestMatch#getInto <em>Into</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Into</em>' attribute.
   * @see #getInto()
   * @generated
   */
  void setInto(String value);

} // TestMatch
