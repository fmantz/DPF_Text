package no.hib.dpf.text.validation;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import no.hib.dpf.text.scala.DPFTextCore;
import no.hib.dpf.text.tdpf.Arrow;
import no.hib.dpf.text.tdpf.DpfId;
import no.hib.dpf.text.tdpf.Element;
import no.hib.dpf.text.tdpf.Node;
import no.hib.dpf.text.tdpf.NodeSimple;
import no.hib.dpf.text.tdpf.Property;
import no.hib.dpf.text.tdpf.Specification;
import no.hib.dpf.text.tdpf.Validator;
import no.hib.dpf.text.util.CommonUtil;
import no.hib.dpf.text.util.Tuple;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

/**
 * Validate the specifications for the editor
 */
public class DPFTextJavaValidator extends AbstractDPFTextJavaValidator {

	/**
	 * In case you want to debug this class, you get some printouts if you set the debug flag to true
	 */
	private static final boolean debug = false;
	
	/**
	 * Stores all error message maps for specifications (identified by key String) 
	 * Each value map uses a element id as string for a error message.  
	 */
	private static Map<String, Map<String, String>> validationErrors = new HashMap<String, Map<String, String>>();

	/**
	 * Generates a key-String for a file/specification for the validationErrors object
	 * @param owner
	 * @return
	 */
	private static String file2String(final IFile owner) {
		return owner.getFullPath().toString();
	}

	/**
	 * Add validation erros for a specific file/specification
	 * @param errs
	 * @param owner
	 */
	public static final void setValidationErrMsg(final Map<String, String> errs, final IFile owner) {
		DPFTextJavaValidator.validationErrors.put(file2String(owner), errs);
	}

	/**
	 * Annotate an element with its error message.
	 * @param e
	 * @param err
	 */
	private void setValidationErrMsg(final DpfId e, final Map<String, String> err) {
		try {
			if (null != err) {
				final StringBuffer temp_idString = new StringBuffer();
				final List<Integer> sl = new LinkedList<Integer>(e.getId().getNums());
				Collections.sort(sl);
				boolean first = true;
				for (Integer i : sl) {
					if (first) {
						temp_idString.append(i);
						first = false;
					} else {
						temp_idString.append("_");
						temp_idString.append(i);
					}
				}
				final String idString = temp_idString.toString();
				final String msg = err.get(idString);
				if (debug)
					System.out.println("ErrorMsg=" + msg);
				if (null != msg && !msg.equals("")) {
					error(msg, e, null, null);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * Annotate all elements of a specification with its error messages.
	 * @param s
	 */
	@Check
	public void checkSpecification(final Specification s) {
		//
		// Get Validation Errors if exists:
		//
		final URI eUri = s.eResource().getURI();
		final String platformString = eUri.toPlatformString(true);
		final String key = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString).getFullPath().toString();
		Map<String, String> err = null;
		if (null != key) {
			err = DPFTextJavaValidator.validationErrors.get(key);
		}
		try {
			// Homo and types:
			final String path = CommonUtil.eObject2IFile(s).getParent().getFullPath().toString();
			final List<Tuple<EObject, String>> rs = DPFTextCore.read(s, path, ".temp<**");
			for (Tuple<EObject, String> t : rs) {
				if (!t.y.equals("")) {
					error(t.y, t.x, null, null);
				}
			}
			// OCL:
			for (Element e : s.getGraph().getElements()) {
				if (e instanceof Node) {
					final Node n = (Node) e;
					try {
						setValidationErrMsg(n.getId(), err);
					} catch (Exception ex) {
					}
					if (null != n.getInh()) {
						for (NodeSimple sn : n.getInh()) {
							try {
								setValidationErrMsg(sn.getId(), err);
							} catch (Exception ex) {
							}
						}
						for (Property p : n.getProperties()) {
							try {
								setValidationErrMsg(p.getId(), err);
							} catch (Exception ex) {
							}
							try {
								setValidationErrMsg(p.getTgNode().getId(), err);
							} catch (Exception ex) {
							}
						}
					}

				}
				if (e instanceof Arrow) {
					try {
					    final Arrow a = (Arrow)e;
						setValidationErrMsg(a.getSr().getId(), err);
						setValidationErrMsg(e.getId(), err);
						setValidationErrMsg(a.getTgNode().getId(), err);
					} catch (Exception ex) {
					}
				}
			}
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Specification not inited:" + e.getMessage());
			return; // not inited yet
		}

	}

	/**
	 * Annotate validator elements with error messages.
	 * @param s
	 */
	@Check
	public void checkValidator(final Validator v) {
		final Set<String> nodeVars = new HashSet<String>();
		final Set<String> arrowVars = new HashSet<String>();
		for (EObject o : v.getArity()) {
			if (o instanceof NodeSimple) {
				final NodeSimple ns = (NodeSimple) o;
				final String name = ns.getId().getName();
				nodeVars.add(name);
				if (arrowVars.contains(name)) {
					final String msg = "Node variable already used for arrow: " + name;
					error(msg, o, null, null);
				}
			} else if (o instanceof Arrow) {
				final Arrow a = (Arrow) o;
				try {
					final String srName = a.getSr().getId().getName();
					nodeVars.add(srName);
					if (arrowVars.contains(srName)) {
						final String msg = "Node variable already used for arrow: " + srName;
						error(msg, o, null, null);
					}
				} catch (Exception e) {
					// do nothing
				}
				try {
					final String tgName = a.getTgNode().getId().getName();
					nodeVars.add(tgName);
					if (arrowVars.contains(tgName)) {
						final String msg = "Node variable already used for arrow: " + tgName;
						error(msg, o, null, null);
					}
				} catch (Exception e) {
					// do nothing
				}
				try {
					final String name = a.getId().getName();
					arrowVars.add(name);
					if (nodeVars.contains(name)) {
						final String msg = "Arrow variable already used for node: " + name;
						error(msg, o, null, null);
					}
				} catch (Exception e) {
					// do nothing
				}
			}
		}
	}

	
	
}
