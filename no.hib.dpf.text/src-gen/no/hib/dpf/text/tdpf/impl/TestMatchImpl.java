/**
 */
package no.hib.dpf.text.tdpf.impl;

import no.hib.dpf.text.tdpf.TdpfPackage;
import no.hib.dpf.text.tdpf.TestMatch;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.TestMatchImpl#getSearch <em>Search</em>}</li>
 *   <li>{@link no.hib.dpf.text.tdpf.impl.TestMatchImpl#getInto <em>Into</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestMatchImpl extends CommandImpl implements TestMatch
{
  /**
   * The default value of the '{@link #getSearch() <em>Search</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearch()
   * @generated
   * @ordered
   */
  protected static final String SEARCH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSearch() <em>Search</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearch()
   * @generated
   * @ordered
   */
  protected String search = SEARCH_EDEFAULT;

  /**
   * The default value of the '{@link #getInto() <em>Into</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInto()
   * @generated
   * @ordered
   */
  protected static final String INTO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInto() <em>Into</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInto()
   * @generated
   * @ordered
   */
  protected String into = INTO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestMatchImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TdpfPackage.Literals.TEST_MATCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSearch()
  {
    return search;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearch(String newSearch)
  {
    String oldSearch = search;
    search = newSearch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.TEST_MATCH__SEARCH, oldSearch, search));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInto()
  {
    return into;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInto(String newInto)
  {
    String oldInto = into;
    into = newInto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TdpfPackage.TEST_MATCH__INTO, oldInto, into));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TdpfPackage.TEST_MATCH__SEARCH:
        return getSearch();
      case TdpfPackage.TEST_MATCH__INTO:
        return getInto();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TdpfPackage.TEST_MATCH__SEARCH:
        setSearch((String)newValue);
        return;
      case TdpfPackage.TEST_MATCH__INTO:
        setInto((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TdpfPackage.TEST_MATCH__SEARCH:
        setSearch(SEARCH_EDEFAULT);
        return;
      case TdpfPackage.TEST_MATCH__INTO:
        setInto(INTO_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TdpfPackage.TEST_MATCH__SEARCH:
        return SEARCH_EDEFAULT == null ? search != null : !SEARCH_EDEFAULT.equals(search);
      case TdpfPackage.TEST_MATCH__INTO:
        return INTO_EDEFAULT == null ? into != null : !INTO_EDEFAULT.equals(into);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (search: ");
    result.append(search);
    result.append(", into: ");
    result.append(into);
    result.append(')');
    return result.toString();
  }

} //TestMatchImpl
