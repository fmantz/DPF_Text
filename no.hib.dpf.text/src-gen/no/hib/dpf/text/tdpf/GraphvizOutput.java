/**
 */
package no.hib.dpf.text.tdpf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Graphviz Output</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see no.hib.dpf.text.tdpf.TdpfPackage#getGraphvizOutput()
 * @model
 * @generated
 */
public enum GraphvizOutput implements Enumerator
{
  /**
   * The '<em><b>JPG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JPG_VALUE
   * @generated
   * @ordered
   */
  JPG(0, "JPG", "jpg"),

  /**
   * The '<em><b>BMP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BMP_VALUE
   * @generated
   * @ordered
   */
  BMP(1, "BMP", "bmp"),

  /**
   * The '<em><b>CANON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CANON_VALUE
   * @generated
   * @ordered
   */
  CANON(2, "CANON", "canon"),

  /**
   * The '<em><b>DOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOT_VALUE
   * @generated
   * @ordered
   */
  DOT(3, "DOT", "dot"),

  /**
   * The '<em><b>XDOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XDOT_VALUE
   * @generated
   * @ordered
   */
  XDOT(4, "XDOT", "xdot"),

  /**
   * The '<em><b>CMAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CMAP_VALUE
   * @generated
   * @ordered
   */
  CMAP(5, "CMAP", "cmap"),

  /**
   * The '<em><b>EPS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EPS_VALUE
   * @generated
   * @ordered
   */
  EPS(6, "EPS", "eps"),

  /**
   * The '<em><b>FIG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIG_VALUE
   * @generated
   * @ordered
   */
  FIG(7, "FIG", "fig"),

  /**
   * The '<em><b>GD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GD_VALUE
   * @generated
   * @ordered
   */
  GD(8, "GD", "gd"),

  /**
   * The '<em><b>GD2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GD2_VALUE
   * @generated
   * @ordered
   */
  GD2(9, "GD2", "gd2"),

  /**
   * The '<em><b>GIF</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GIF_VALUE
   * @generated
   * @ordered
   */
  GIF(10, "GIF", "gif"),

  /**
   * The '<em><b>GTK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GTK_VALUE
   * @generated
   * @ordered
   */
  GTK(11, "GTK", "gtk"),

  /**
   * The '<em><b>ICO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ICO_VALUE
   * @generated
   * @ordered
   */
  ICO(12, "ICO", "ico"),

  /**
   * The '<em><b>IMAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMAP_VALUE
   * @generated
   * @ordered
   */
  IMAP(13, "IMAP", "imap"),

  /**
   * The '<em><b>CMAPX</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CMAPX_VALUE
   * @generated
   * @ordered
   */
  CMAPX(14, "CMAPX", "cmapx"),

  /**
   * The '<em><b>IMAP NP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMAP_NP_VALUE
   * @generated
   * @ordered
   */
  IMAP_NP(15, "IMAP_NP", "imap_np"),

  /**
   * The '<em><b>CMAP NP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CMAP_NP_VALUE
   * @generated
   * @ordered
   */
  CMAP_NP(16, "CMAP_NP", "cmapx_np"),

  /**
   * The '<em><b>ISMAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ISMAP_VALUE
   * @generated
   * @ordered
   */
  ISMAP(17, "ISMAP", "ismap"),

  /**
   * The '<em><b>JPEG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JPEG_VALUE
   * @generated
   * @ordered
   */
  JPEG(18, "JPEG", "jpeg"),

  /**
   * The '<em><b>JPE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JPE_VALUE
   * @generated
   * @ordered
   */
  JPE(19, "JPE", "jpe"),

  /**
   * The '<em><b>PDF</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PDF_VALUE
   * @generated
   * @ordered
   */
  PDF(20, "PDF", "pdf"),

  /**
   * The '<em><b>PLAIN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLAIN_VALUE
   * @generated
   * @ordered
   */
  PLAIN(21, "PLAIN", "plain"),

  /**
   * The '<em><b>PLAIN EXT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLAIN_EXT_VALUE
   * @generated
   * @ordered
   */
  PLAIN_EXT(22, "PLAIN_EXT", "plain-ext"),

  /**
   * The '<em><b>PNG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PNG_VALUE
   * @generated
   * @ordered
   */
  PNG(23, "PNG", "png"),

  /**
   * The '<em><b>PS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PS_VALUE
   * @generated
   * @ordered
   */
  PS(24, "PS", "ps"),

  /**
   * The '<em><b>PS2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PS2_VALUE
   * @generated
   * @ordered
   */
  PS2(25, "PS2", "ps2"),

  /**
   * The '<em><b>SVG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SVG_VALUE
   * @generated
   * @ordered
   */
  SVG(26, "SVG", "svg"),

  /**
   * The '<em><b>SVGZ</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SVGZ_VALUE
   * @generated
   * @ordered
   */
  SVGZ(27, "SVGZ", "svgz"),

  /**
   * The '<em><b>TIF</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIF_VALUE
   * @generated
   * @ordered
   */
  TIF(28, "TIF", "tif"),

  /**
   * The '<em><b>TIFF</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIFF_VALUE
   * @generated
   * @ordered
   */
  TIFF(29, "TIFF", "tiff"),

  /**
   * The '<em><b>VML</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VML_VALUE
   * @generated
   * @ordered
   */
  VML(30, "VML", "vml"),

  /**
   * The '<em><b>VMLZ</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VMLZ_VALUE
   * @generated
   * @ordered
   */
  VMLZ(31, "VMLZ", "vmlz"),

  /**
   * The '<em><b>VRML</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VRML_VALUE
   * @generated
   * @ordered
   */
  VRML(32, "VRML", "vrml"),

  /**
   * The '<em><b>WBMP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WBMP_VALUE
   * @generated
   * @ordered
   */
  WBMP(33, "WBMP", "wbmp"),

  /**
   * The '<em><b>WEBP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEBP_VALUE
   * @generated
   * @ordered
   */
  WEBP(34, "WEBP", "webp"),

  /**
   * The '<em><b>XLIB</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XLIB_VALUE
   * @generated
   * @ordered
   */
  XLIB(35, "XLIB", "xlib");

  /**
   * The '<em><b>JPG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JPG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JPG
   * @model literal="jpg"
   * @generated
   * @ordered
   */
  public static final int JPG_VALUE = 0;

  /**
   * The '<em><b>BMP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BMP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BMP
   * @model literal="bmp"
   * @generated
   * @ordered
   */
  public static final int BMP_VALUE = 1;

  /**
   * The '<em><b>CANON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CANON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CANON
   * @model literal="canon"
   * @generated
   * @ordered
   */
  public static final int CANON_VALUE = 2;

  /**
   * The '<em><b>DOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DOT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOT
   * @model literal="dot"
   * @generated
   * @ordered
   */
  public static final int DOT_VALUE = 3;

  /**
   * The '<em><b>XDOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>XDOT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XDOT
   * @model literal="xdot"
   * @generated
   * @ordered
   */
  public static final int XDOT_VALUE = 4;

  /**
   * The '<em><b>CMAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CMAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CMAP
   * @model literal="cmap"
   * @generated
   * @ordered
   */
  public static final int CMAP_VALUE = 5;

  /**
   * The '<em><b>EPS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EPS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EPS
   * @model literal="eps"
   * @generated
   * @ordered
   */
  public static final int EPS_VALUE = 6;

  /**
   * The '<em><b>FIG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FIG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIG
   * @model literal="fig"
   * @generated
   * @ordered
   */
  public static final int FIG_VALUE = 7;

  /**
   * The '<em><b>GD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GD
   * @model literal="gd"
   * @generated
   * @ordered
   */
  public static final int GD_VALUE = 8;

  /**
   * The '<em><b>GD2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GD2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GD2
   * @model literal="gd2"
   * @generated
   * @ordered
   */
  public static final int GD2_VALUE = 9;

  /**
   * The '<em><b>GIF</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GIF</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GIF
   * @model literal="gif"
   * @generated
   * @ordered
   */
  public static final int GIF_VALUE = 10;

  /**
   * The '<em><b>GTK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GTK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GTK
   * @model literal="gtk"
   * @generated
   * @ordered
   */
  public static final int GTK_VALUE = 11;

  /**
   * The '<em><b>ICO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ICO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ICO
   * @model literal="ico"
   * @generated
   * @ordered
   */
  public static final int ICO_VALUE = 12;

  /**
   * The '<em><b>IMAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IMAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMAP
   * @model literal="imap"
   * @generated
   * @ordered
   */
  public static final int IMAP_VALUE = 13;

  /**
   * The '<em><b>CMAPX</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CMAPX</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CMAPX
   * @model literal="cmapx"
   * @generated
   * @ordered
   */
  public static final int CMAPX_VALUE = 14;

  /**
   * The '<em><b>IMAP NP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IMAP NP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMAP_NP
   * @model literal="imap_np"
   * @generated
   * @ordered
   */
  public static final int IMAP_NP_VALUE = 15;

  /**
   * The '<em><b>CMAP NP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CMAP NP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CMAP_NP
   * @model literal="cmapx_np"
   * @generated
   * @ordered
   */
  public static final int CMAP_NP_VALUE = 16;

  /**
   * The '<em><b>ISMAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ISMAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ISMAP
   * @model literal="ismap"
   * @generated
   * @ordered
   */
  public static final int ISMAP_VALUE = 17;

  /**
   * The '<em><b>JPEG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JPEG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JPEG
   * @model literal="jpeg"
   * @generated
   * @ordered
   */
  public static final int JPEG_VALUE = 18;

  /**
   * The '<em><b>JPE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JPE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JPE
   * @model literal="jpe"
   * @generated
   * @ordered
   */
  public static final int JPE_VALUE = 19;

  /**
   * The '<em><b>PDF</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PDF</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PDF
   * @model literal="pdf"
   * @generated
   * @ordered
   */
  public static final int PDF_VALUE = 20;

  /**
   * The '<em><b>PLAIN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PLAIN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLAIN
   * @model literal="plain"
   * @generated
   * @ordered
   */
  public static final int PLAIN_VALUE = 21;

  /**
   * The '<em><b>PLAIN EXT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PLAIN EXT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLAIN_EXT
   * @model literal="plain-ext"
   * @generated
   * @ordered
   */
  public static final int PLAIN_EXT_VALUE = 22;

  /**
   * The '<em><b>PNG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PNG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PNG
   * @model literal="png"
   * @generated
   * @ordered
   */
  public static final int PNG_VALUE = 23;

  /**
   * The '<em><b>PS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PS
   * @model literal="ps"
   * @generated
   * @ordered
   */
  public static final int PS_VALUE = 24;

  /**
   * The '<em><b>PS2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PS2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PS2
   * @model literal="ps2"
   * @generated
   * @ordered
   */
  public static final int PS2_VALUE = 25;

  /**
   * The '<em><b>SVG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SVG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SVG
   * @model literal="svg"
   * @generated
   * @ordered
   */
  public static final int SVG_VALUE = 26;

  /**
   * The '<em><b>SVGZ</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SVGZ</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SVGZ
   * @model literal="svgz"
   * @generated
   * @ordered
   */
  public static final int SVGZ_VALUE = 27;

  /**
   * The '<em><b>TIF</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TIF</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIF
   * @model literal="tif"
   * @generated
   * @ordered
   */
  public static final int TIF_VALUE = 28;

  /**
   * The '<em><b>TIFF</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TIFF</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIFF
   * @model literal="tiff"
   * @generated
   * @ordered
   */
  public static final int TIFF_VALUE = 29;

  /**
   * The '<em><b>VML</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VML</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VML
   * @model literal="vml"
   * @generated
   * @ordered
   */
  public static final int VML_VALUE = 30;

  /**
   * The '<em><b>VMLZ</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VMLZ</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VMLZ
   * @model literal="vmlz"
   * @generated
   * @ordered
   */
  public static final int VMLZ_VALUE = 31;

  /**
   * The '<em><b>VRML</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VRML</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VRML
   * @model literal="vrml"
   * @generated
   * @ordered
   */
  public static final int VRML_VALUE = 32;

  /**
   * The '<em><b>WBMP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WBMP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WBMP
   * @model literal="wbmp"
   * @generated
   * @ordered
   */
  public static final int WBMP_VALUE = 33;

  /**
   * The '<em><b>WEBP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WEBP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WEBP
   * @model literal="webp"
   * @generated
   * @ordered
   */
  public static final int WEBP_VALUE = 34;

  /**
   * The '<em><b>XLIB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>XLIB</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XLIB
   * @model literal="xlib"
   * @generated
   * @ordered
   */
  public static final int XLIB_VALUE = 35;

  /**
   * An array of all the '<em><b>Graphviz Output</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final GraphvizOutput[] VALUES_ARRAY =
    new GraphvizOutput[]
    {
      JPG,
      BMP,
      CANON,
      DOT,
      XDOT,
      CMAP,
      EPS,
      FIG,
      GD,
      GD2,
      GIF,
      GTK,
      ICO,
      IMAP,
      CMAPX,
      IMAP_NP,
      CMAP_NP,
      ISMAP,
      JPEG,
      JPE,
      PDF,
      PLAIN,
      PLAIN_EXT,
      PNG,
      PS,
      PS2,
      SVG,
      SVGZ,
      TIF,
      TIFF,
      VML,
      VMLZ,
      VRML,
      WBMP,
      WEBP,
      XLIB,
    };

  /**
   * A public read-only list of all the '<em><b>Graphviz Output</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<GraphvizOutput> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Graphviz Output</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GraphvizOutput get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GraphvizOutput result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Graphviz Output</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GraphvizOutput getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      GraphvizOutput result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Graphviz Output</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GraphvizOutput get(int value)
  {
    switch (value)
    {
      case JPG_VALUE: return JPG;
      case BMP_VALUE: return BMP;
      case CANON_VALUE: return CANON;
      case DOT_VALUE: return DOT;
      case XDOT_VALUE: return XDOT;
      case CMAP_VALUE: return CMAP;
      case EPS_VALUE: return EPS;
      case FIG_VALUE: return FIG;
      case GD_VALUE: return GD;
      case GD2_VALUE: return GD2;
      case GIF_VALUE: return GIF;
      case GTK_VALUE: return GTK;
      case ICO_VALUE: return ICO;
      case IMAP_VALUE: return IMAP;
      case CMAPX_VALUE: return CMAPX;
      case IMAP_NP_VALUE: return IMAP_NP;
      case CMAP_NP_VALUE: return CMAP_NP;
      case ISMAP_VALUE: return ISMAP;
      case JPEG_VALUE: return JPEG;
      case JPE_VALUE: return JPE;
      case PDF_VALUE: return PDF;
      case PLAIN_VALUE: return PLAIN;
      case PLAIN_EXT_VALUE: return PLAIN_EXT;
      case PNG_VALUE: return PNG;
      case PS_VALUE: return PS;
      case PS2_VALUE: return PS2;
      case SVG_VALUE: return SVG;
      case SVGZ_VALUE: return SVGZ;
      case TIF_VALUE: return TIF;
      case TIFF_VALUE: return TIFF;
      case VML_VALUE: return VML;
      case VMLZ_VALUE: return VMLZ;
      case VRML_VALUE: return VRML;
      case WBMP_VALUE: return WBMP;
      case WEBP_VALUE: return WEBP;
      case XLIB_VALUE: return XLIB;
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
  private GraphvizOutput(int value, String name, String literal)
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
  
} //GraphvizOutput
