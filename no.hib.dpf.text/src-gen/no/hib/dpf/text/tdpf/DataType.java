/**
 */
package no.hib.dpf.text.tdpf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getDataType()
 * @model
 * @generated
 */
public enum DataType implements Enumerator
{
  /**
   * The '<em><b>TBOOLEAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TBOOLEAN_VALUE
   * @generated
   * @ordered
   */
  TBOOLEAN(0, "TBOOLEAN", "Boolean"),

  /**
   * The '<em><b>TCHAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TCHAR_VALUE
   * @generated
   * @ordered
   */
  TCHAR(1, "TCHAR", "Char"),

  /**
   * The '<em><b>TBYTE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TBYTE_VALUE
   * @generated
   * @ordered
   */
  TBYTE(2, "TBYTE", "Byte"),

  /**
   * The '<em><b>TSHORT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TSHORT_VALUE
   * @generated
   * @ordered
   */
  TSHORT(3, "TSHORT", "Short"),

  /**
   * The '<em><b>TINT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TINT_VALUE
   * @generated
   * @ordered
   */
  TINT(4, "TINT", "Int"),

  /**
   * The '<em><b>TLONG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TLONG_VALUE
   * @generated
   * @ordered
   */
  TLONG(5, "TLONG", "Long"),

  /**
   * The '<em><b>TFLOAT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TFLOAT_VALUE
   * @generated
   * @ordered
   */
  TFLOAT(6, "TFLOAT", "Float"),

  /**
   * The '<em><b>TDOUBLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TDOUBLE_VALUE
   * @generated
   * @ordered
   */
  TDOUBLE(7, "TDOUBLE", "Double"),

  /**
   * The '<em><b>TSTRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TSTRING_VALUE
   * @generated
   * @ordered
   */
  TSTRING(8, "TSTRING", "String");

  /**
   * The '<em><b>TBOOLEAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TBOOLEAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TBOOLEAN
   * @model literal="Boolean"
   * @generated
   * @ordered
   */
  public static final int TBOOLEAN_VALUE = 0;

  /**
   * The '<em><b>TCHAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TCHAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TCHAR
   * @model literal="Char"
   * @generated
   * @ordered
   */
  public static final int TCHAR_VALUE = 1;

  /**
   * The '<em><b>TBYTE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TBYTE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TBYTE
   * @model literal="Byte"
   * @generated
   * @ordered
   */
  public static final int TBYTE_VALUE = 2;

  /**
   * The '<em><b>TSHORT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TSHORT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TSHORT
   * @model literal="Short"
   * @generated
   * @ordered
   */
  public static final int TSHORT_VALUE = 3;

  /**
   * The '<em><b>TINT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TINT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TINT
   * @model literal="Int"
   * @generated
   * @ordered
   */
  public static final int TINT_VALUE = 4;

  /**
   * The '<em><b>TLONG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TLONG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TLONG
   * @model literal="Long"
   * @generated
   * @ordered
   */
  public static final int TLONG_VALUE = 5;

  /**
   * The '<em><b>TFLOAT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TFLOAT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TFLOAT
   * @model literal="Float"
   * @generated
   * @ordered
   */
  public static final int TFLOAT_VALUE = 6;

  /**
   * The '<em><b>TDOUBLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TDOUBLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TDOUBLE
   * @model literal="Double"
   * @generated
   * @ordered
   */
  public static final int TDOUBLE_VALUE = 7;

  /**
   * The '<em><b>TSTRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TSTRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TSTRING
   * @model literal="String"
   * @generated
   * @ordered
   */
  public static final int TSTRING_VALUE = 8;

  /**
   * An array of all the '<em><b>Data Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DataType[] VALUES_ARRAY =
    new DataType[]
    {
      TBOOLEAN,
      TCHAR,
      TBYTE,
      TSHORT,
      TINT,
      TLONG,
      TFLOAT,
      TDOUBLE,
      TSTRING,
    };

  /**
   * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataType get(int value)
  {
    switch (value)
    {
      case TBOOLEAN_VALUE: return TBOOLEAN;
      case TCHAR_VALUE: return TCHAR;
      case TBYTE_VALUE: return TBYTE;
      case TSHORT_VALUE: return TSHORT;
      case TINT_VALUE: return TINT;
      case TLONG_VALUE: return TLONG;
      case TFLOAT_VALUE: return TFLOAT;
      case TDOUBLE_VALUE: return TDOUBLE;
      case TSTRING_VALUE: return TSTRING;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DataType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DataType
