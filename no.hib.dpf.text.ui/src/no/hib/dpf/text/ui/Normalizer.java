package no.hib.dpf.text.ui;

import java.util.Date;
import java.util.List;

import no.hib.dpf.text.scala.DPFTextCore;
import no.hib.dpf.text.tdpf.Signature;
import no.hib.dpf.text.tdpf.Specification;
import no.hib.dpf.text.util.CommonUtil;
import no.hib.dpf.text.util.Tuple;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * Normalize a Xtextdocument so that it is a valid graph (does not care
 * about additional well-formedness rules), signature etc. 
 * Creates a serialization of specifications and signatures as shown in the editor after saving. 
 */
public class Normalizer {

	/**
	 * Read the document in the application cache if it is not there, 
	 * @param d
	 */
	public static void initCache(final IXtextDocument document, final Specification specification) {
		try {
			System.out.println("initCache!");
			final IFile file = CommonUtil.eObject2IFile(specification);
			final String path = file.getParent().getFullPath().toOSString();
			DPFTextCore.read(DPFTextCore.readSpecificationTransitiv(specification, file, true), path);
			// JavaScalaBridge.read(ParserUtil.readSpecificationTransitiv(specification,null),path);
		} catch (Exception e) {
			DPFTextCore.log(e);
			System.out.println("Warning Normalizer.initCache(): " + e.getMessage());
		}
	}

	/**
	 * Normalize a Xtextdocument so that it is a valid specification (does not care
	 * about additional well-formedness rules), signature etc.
	 * 
	 * @param d
	 */
	public static void normalize(final IDocument d) {
		if (d instanceof XtextDocument) {
			final XtextDocument document = (XtextDocument) d;
			try {
				document.modify(new IUnitOfWork<EList<EObject>, XtextResource>() {
					public EList<EObject> exec(XtextResource state) throws Exception {
						IParseResult parseResult = state.getParseResult();
						EObject eRoot = parseResult.getRootASTElement();
						// System.out.println(eRoot);
						try {
							if (eRoot instanceof Specification) {
								final Specification specification = (Specification) eRoot;
								final ICompositeNode co = NodeModelUtils.findActualNodeFor(eRoot);
								final IFile file = CommonUtil.eObject2IFile(specification);
								final String path = file.getParent().getFullPath().toOSString();
								final Tuple<List<String>, List<Tuple<EObject, String>>> rs = DPFTextCore.read(DPFTextCore.readSpecificationTransitiv(specification, file, true), path);
								final List<String> nGraph = rs.x;
								addNonParsableLines(parseResult, nGraph, d);
								addNotWellTypedElements(rs.y, nGraph, d);
								replaceInOpendIFile(co, nGraph, document);
							} else if (eRoot instanceof Signature) {
								final Signature signature = (Signature) eRoot;
								final ICompositeNode co = NodeModelUtils.findActualNodeFor(eRoot);
								final IFile file = CommonUtil.eObject2IFile(signature);
								final String path = file.getParent().getFullPath().toOSString();
								final Tuple<List<String>, List<Tuple<EObject, String>>> rs = DPFTextCore.read(signature, path, CommonUtil.getSigNameFromFileName(file));
								final List<String> nSignature = rs.x;
								addNonParsableLines(parseResult, nSignature, d);
	  						    addNotWellTypedElements(rs.y, nSignature, d);
								replaceInOpendIFile(co, nSignature, document);
							}
						} catch (Exception e1) {
							//MessageDialog.openError(null,"Error occured:", e1.getMessage());
							e1.printStackTrace();
							// do nothing
						}
						return null;
					}
				});

			} catch (Exception e2) {
				//MessageDialog.openError(null,"Error occured:", e2.getMessage());
				DPFTextCore.log(e2);
			}
		}
	}

	/**
	 * Errors Level 1: Not Parsable
	 * 
	 * @param result
	 * @param nGraph
	 * @param d
	 */
	//TODO: Not called anymore after a change in XText. 
	//Can properly be removed!
	private static void addNonParsableLines(IParseResult result, final List<String> nGraph, final IDocument d) {
		// Comment out errors:
		synchronized (d) {
			if (result.getSyntaxErrors().iterator().hasNext()) {
				nGraph.add("\n/*");
				nGraph.add("\n-------------------------------------------------");
				nGraph.add("\nCould not be parsed:" + new Date());
				nGraph.add("\n-------------------------------------------------\n");
				String oldText = "";
				for (INode n : result.getSyntaxErrors()) {
					try {
						for (int i = n.getStartLine() - 1; i <= n.getEndLine() - 1; i++) {
							final String text = d.get(d.getLineOffset(i), d.getLineLength(i));
							if (!text.equals(oldText)) {
								nGraph.add(text);
							}
							oldText = text;
						}
						nGraph.add("Error message: " + n.getSyntaxErrorMessage() + "\n");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				nGraph.add("\n-------------------------------------------------\n");
				nGraph.add("*/\n");
			}
		}
	}

	/**
	 * Errors Level 2: Not Well-typed
	 * 
	 * @param result
	 * @param contentList
	 * @param d
	 */
	//TODO: Not called anymore after a change in XText. 
    //Can properly be removed!		
	private static void addNotWellTypedElements(List<Tuple<EObject, String>> errors, final List<String> contentList, final IDocument d) {
		// Comment out errors:
		if (0 < errors.size()) {
			contentList.add("\n/*");
			contentList.add("\n-------------------------------------------------");
			contentList.add("\nNot Well-typed Elements:" + new Date());
			contentList.add("\n-------------------------------------------------\n");
			String errorMessage = "";
			for (Tuple<EObject, String> t : errors) {
				ICompositeNode n = null;
				String text = "";
				try {
					n = NodeModelUtils.findActualNodeFor(t.x);
					for (int i = n.getStartLine() - 1; i <= n.getEndLine() - 1; i++) {
						text = d.get(d.getLineOffset(i), d.getLineLength(i));
					}
					final String msg = "Error message: " + t.y + "\t" + text + "\n";
					if (!errorMessage.equals(msg)) {
						errorMessage = msg;
						contentList.add(errorMessage);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			contentList.add("\n-------------------------------------------------\n");
			contentList.add("*/\n");
		}
	}

	/**
	 * Replace in the current file which is displayed in the editor.
	 * Used to replace the current specification/signature by its updated serialization.
	 * 
	 * @param co
	 * @param contentList
	 * @param document
	 */
	private static void replaceInOpendIFile(final ICompositeNode co, final List<String> contentList, final IXtextDocument document) {
		final StringBuilder content = new StringBuilder();
		for (String s : contentList) {
			content.append(s);
		}
		// Replace:
		final ReplaceEdit r = new ReplaceEdit(co.getOffset(), co.getLength(), content.toString());
		try {
			r.apply(document, ReplaceEdit.CREATE_UNDO);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
