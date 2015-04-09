package no.hib.dpf.text.scala;

import static no.hib.dpf.text.util.CommonUtil.eObject2IFile;
import static no.hib.dpf.text.util.CommonUtil.getSpecNameFromFileName;
import static no.hib.dpf.text.util.CommonUtil.iFileFromDirectory;
import static no.hib.dpf.text.util.CommonUtil.metaSpecificationFromSpecification;
import static no.hib.dpf.text.scala.bridge.JavaScalaConverter.jId2RId;
import static no.hib.dpf.text.scala.bridge.JavaScalaConverter.jList2List;
import static no.hib.dpf.text.scala.bridge.JavaScalaConverter.jSet2RId;

import no.hib.dpf.text.DPFConstants;
import no.hib.dpf.text.DPFTextRuntimeModule;
import no.hib.dpf.text.parser.antlr.DPFTextParser;

import no.hib.dpf.text.scala.ct.Dpf;
import no.hib.dpf.text.scala.ct.FKey;
import no.hib.dpf.text.scala.ct.SInfo;
import no.hib.dpf.text.scala.output.EclipseLog;
import no.hib.dpf.text.scala.editor.*;
import no.hib.dpf.text.scala.bridge.*;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import no.hib.dpf.text.tdpf.ConstraintList;
import no.hib.dpf.text.tdpf.Signature;
import no.hib.dpf.text.tdpf.Specification;
import no.hib.dpf.text.tdpf.Validator;
import no.hib.dpf.text.util.*;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Since it is not always so straight-forward to call Scala commands from Java
 * the access to the scala "world" has been encapsulated via this class. It is
 * the only class which is used in other Java classes to communicate with the
 * scala objects.
 */
public class DPFTextCore {

	/**
	 * Write to the simple logger
	 * 
	 * @param t
	 */
	public static void log(Throwable t) {
		EclipseLog.log(t);
	}

	/**
	 * Write to the simple logger
	 * 
	 * @param t
	 */
	public static void log(String s) {
		EclipseLog.log(s);
	}

	/**
	 * Clear all infomation from the singelton objects storing any information
	 * about specifications, signatures etc. The method resets the application
	 * caches!
	 */
	public static void clearCaches() {
		no.hib.dpf.text.scala.validation.OCLValidation.clearErrors();
		Editor.clearCaches();
	}

	/**
	 * Create an instance of the DPFText-Xtext Parser
	 * 
	 * @return
	 */
	private static IParser createParser() {
		// final Injector injector = new
		// DPFTextStandaloneSetup().createInjectorAndDoEMFRegistration();
		// https://bugs.eclipse.org/bugs/show_bug.cgi?format=multiple&id=326024
		final Injector injector = Guice.createInjector(new DPFTextRuntimeModule());
		final IParser parser = injector.getInstance(DPFTextParser.class);
		return parser;
	}

	/**
	 * Load a specification into the Scala classes with all dependencies
	 * 
	 * @param path
	 * @param specId
	 * @param force
	 * @return
	 */
	public static Specification loadSpecification(final IResource path, final String specId, final Boolean force) {
		final String pathString = path.getFullPath().toPortableString();
		final String spec2read = pathString + "/" + specId + DPFConstants.SPECIFICATION_FILE_EXTENSION;
		final IFile specFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(spec2read));
		final Specification s = readSpecification(specFile).y;
		DPFTextCore.read(readSpecificationTransitiv(s, specFile, force), pathString);
		return s;
	}

	/**
	 * Load a specification into the Scala classes with all dependencies
	 * 
	 * @param file
	 * @param force
	 * @return
	 */
	public static Specification loadSpecification(final IFile file, final Boolean force) {
		return loadSpecification(file.getParent(), getSpecNameFromFileName(file), force);
	}

	/**
	 * Read a XText-generated specification with all its meta-specifications.
	 * 
	 * @param specification
	 * @param file
	 * @param force
	 * @return
	 */
	public static Stack<Tuple<String, Specification>> readSpecificationTransitiv(final Specification specification, final IFile file, final Boolean force) {
		final IFile f = (null != file) ? file : eObject2IFile(specification);
		final Stack<Tuple<String, Specification>> stack = new Stack<Tuple<String, Specification>>();
		stack.add(new Tuple<String, Specification>(getSpecNameFromFileName(f), specification));
		Specification s = specification;
		String lastType = ""; //for recursion detection
		while (!stack.isEmpty() && !Editor.isSpecInCache(s.getType().getId(), file.getParent().getFullPath().toOSString()) && !lastType.equals(s.getType().getId())) {
			lastType = s.getType().getId();
			stack.push(readSpecification(metaSpecificationFromSpecification(f.getParent(), s), s, force));
			s = stack.peek().y;
		}
		return stack;
	}

	/**
	 * Read one single XText-generated specification without its meta-specifications.
	 * 
	 * @param f
	 * @return
	 * @throws RuntimeException
	 */
	public static Tuple<String, Specification> readSpecification(final IFile f) throws RuntimeException {
		try {
			final IParser parser = createParser();
			final IParseResult result = parser.parse(new InputStreamReader(f.getContents()));
			final EObject eRoot = result.getRootASTElement();
			if (eRoot instanceof Specification) {
				return new Tuple<String, Specification>(getSpecNameFromFileName(f), (Specification) eRoot);
			}
			throw new RuntimeException(f + "  is not a specification");
		} catch (Exception e) {
			DPFTextCore.log(e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * Read a XText-generated specification. If it does not exist, it is automatically generated from an instance.
	 * 
	 * @param f
	 * @param instance
	 * @param force
	 * @return
	 */
	private static Tuple<String, Specification> readSpecification(final IFile f, final Specification instance, final Boolean force) {
		// log("Read: " + f);
		try {
			return readSpecification(f);
		} catch (Exception e) {
			//
			// Try to generate meta-specification:
			//
			if (force && null != instance && !f.exists()) {
				DPFTextCore.generateSpecification(f, instance);
				final Tuple<String, Specification> rs = readSpecification(f);
				try {
					f.getParent().refreshLocal(1, null);
				} catch (Exception e2) {
					// Ignore Exception
				}
				return rs;
			} else {
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * Read all XText generated signatures from a specification.
	 * Return specifications and their names as tuples.
	 * @param s
	 * @param dir
	 * @return
	 */
	public static List<Tuple<String, Signature>> readSignatures(final Specification s, final IResource dir) {
		final IResource sigDir = (null != dir) ? dir : eObject2IFile(s).getParent();
		final List<Tuple<String, Signature>> rs = new LinkedList<Tuple<String, Signature>>();
		for (ConstraintList l : s.getAtomicConstraints()) {
			final IFile f = iFileFromDirectory(sigDir, l.getConstraintSemantic().getId() + DPFConstants.SIGNATURE_FILE_EXTENSION);
			final IParser parser = createParser();
			// log("Read: " + f.getFullPath());
			try {
				final IParseResult result = parser.parse(new InputStreamReader(f.getContents()));
				final EObject eRoot = result.getRootASTElement();
				if (eRoot instanceof Signature) {
					rs.add(new Tuple<String, Signature>(l.getConstraintSemantic().getId(), (Signature) eRoot));
				} else {
					throw new RuntimeException(f.getFullPath() + " is not a Signature!");
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return rs;
	}

	/**
	 * Read one XText generated signature by its name.
	 * @param name
	 * @param dir
	 * @return
	 */
	public static Signature readSignature(final String name, final IResource dir) {
		final IFile f = iFileFromDirectory(dir, name + DPFConstants.SIGNATURE_FILE_EXTENSION);
		final IParser parser = createParser();
		// log("Read: " + f.getFullPath());
		try {
			final IParseResult result = parser.parse(new InputStreamReader(f.getContents()));
			final EObject eRoot = result.getRootASTElement();
			if (eRoot instanceof Signature) {
				return (Signature) eRoot;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		throw new RuntimeException(f.getFullPath() + " is not a Signature!");
	}

	/**
	 * Load a signature into the "scala world".
	 * @param name
	 * @param dir
	 */
	public static void loadSignature(final String name, final IResource dir) {
		try {
			DPFTextCore.read(DPFTextCore.readSignature(name, dir), dir.getFullPath().toOSString(), name);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Get specification infos of all specifications in the cache.
	 * @return
	 */
	public static SpecificationInfo getAllLoadedSpecificationInfos() {
		// Sort all infos according to their typegraphs in buckets
		final Map<String, Set<SInfo>> infos = new HashMap<String, Set<SInfo>>();

		for (SInfo i : scala.collection.JavaConversions.seqAsJavaList(Editor.getSpecInfos())) {
			try {
				if (!i.key().name().equals("DPF") &&        // do not add second DPF model
						!i.key().name().startsWith(".")) {  // do not add hidden transient models
					final String tGraph = i.t().name() + "/" + i.t().path().toString();
					if (infos.containsKey(tGraph)) {
						infos.get(tGraph).add(i);
					} else {
						final Set<SInfo> c = new HashSet<SInfo>();
						c.add(i);
						infos.put(tGraph, c);
					}
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		// Make tree
		boolean changed = true;
		List<SpecificationInfo> root = new ArrayList<SpecificationInfo>();
		root.add(new SpecificationInfo(Dpf.Spec().g().tKey().name(), "", Dpf.Spec().g().tKey().version().get().name(), false));

		// Add to tree:
		while (!infos.isEmpty() && changed) {
			changed = false;
			Set<Map.Entry<String, Set<SInfo>>> elements = new HashSet<Map.Entry<String, Set<SInfo>>>(infos.entrySet());
			for (Map.Entry<String, Set<SInfo>> e : elements) {
				if (insert(root, e.getValue())) {
					changed = true;
					infos.remove(e.getKey());
				}
			}
		}
		return root.iterator().next();
	}

	/**
	 * Helper method to transform a set of SInfos to a tree of specification infos
	 * @param ls
	 * @param is
	 * @return
	 */
	private static boolean insert(List<SpecificationInfo> ls, Set<SInfo> is) {
		final SInfo first = is.iterator().next();
		final String firstType = first.t().name();
		String firstPath = "";
		try {
			firstPath = first.key().path().get();
		} catch (Exception e) {
			firstPath = "";
		}
		for (SpecificationInfo l : ls) {
			if (l.getName().equals(firstType) && // must be typed by meta-model
					(l.getPath().equals(firstPath) // path must be equal
					|| l.getName().equals("DPF"))) { // except the meta-model is
														// DPF
				for (SInfo i : is) {
					try {
						String versionName = "";
						boolean isDirty = false;
						try {
							if (null != i.key().version()) {
								versionName = i.key().version().get().name();
								isDirty = i.key().version().get().isDirty();
							}
						} catch (Exception e) {
						}
						l.getInstances().add(new SpecificationInfo(i.key().name(), i.key().path().get(), versionName, isDirty));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return true;
			} else {
				if (insert(l.getInstances(), is)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Returns all signature infos for all signatures in the cache.
	 * @return
	 */
	public static List<SignatureInfo> getAllLoadedSignatureInfos() {
		List<SignatureInfo> rs = new LinkedList<SignatureInfo>();
		for (FKey k : scala.collection.JavaConversions.seqAsJavaList(Editor.getSignatureFKeys())) {
			String versionName = "";
			boolean isDirty = false;
			try {
				if (null != k.version()) {
					versionName = k.version().get().name();
					isDirty = k.version().get().isDirty();
				}
			} catch (Exception e) {
			}
			rs.add(new SignatureInfo(k.name(), k.path().get(), versionName, isDirty));
		}
		return rs;
	}

	//	
	//Access to Scala Bridge:
	//
	
	/**
	 * Read a stack of specifications into the scala world.
	 * Return the first specification of the stack as list of strings. 
	 * Furthermore a list of eobjects with possible errors that may have been occurred are returned. 
	 * @param stack
	 * @param path
	 * @return
	 */
	public static Tuple<List<String>, List<Tuple<EObject, String>>> read(final Stack<Tuple<String, Specification>> stack, final String path) {
		return ScalaBridge.read(stack, path);
	}

	/**
	 * Read one specifications into the scala world. 
	 * Returns a list of eobjects and possible errors that may have been occurred. 
	 * @param stack
	 * @param path
	 * @return
	 */
	public static List<Tuple<EObject, String>> read(final Specification s, final String path, final String specName) {
		return ScalaBridge.read(specName, path, s).y;
	}

	/**
	 * Read one signature into the scala world. 
	 * Returns the signature as list of strings. 
	 * Furthermore a list of eobjects and possible errors that may have been occurred are returned. 
	 * @param stack
	 * @param path
	 * @return
	 */
	public static Tuple<List<String>, List<Tuple<EObject, String>>> read(final Signature s, final String path, final String sigName) {
		return ScalaBridge.read(sigName, path, s);
	}

	/**
	 * Check if a specification conforms to its meta-specification
	 * Returns a map of errors mapped to element ids in their string representation. 
	 * Furthermore a list of errors is returned that cannot be mapped to specific elements. 
	 * @param s
	 * @param path
	 * @return
	 */
	public static Tuple<Map<String, String>, List<String>> checkAllConstraints(final Specification s, final String path) {
		return ScalaBridge.checkAllConstraints(s, path);
	}

	//
	// Proposals:
	//

	/**
	 * Helper method for scala-java list conversion.
	 * @param seq
	 * @return
	 */
	private static List<String> convert(scala.collection.Seq<String> seq) {
		return scala.collection.JavaConversions.seqAsJavaList(seq);
	}

	/**
	 * Propose node types.
	 * @param sname
	 * @param path
	 * @return
	 */
	public static List<String> getProposal_AllNodeTypes(String sname, String path) {
		return convert(EditorProposal.getProposal_AllNodeTypes(Editor.getSpec(sname, path)));
	}

	/**
	 * Propose all existing nodes.
	 * @param sname
	 * @param path
	 * @return
	 */
	public static List<String> getProposal_AllNodes(String sname, String path) {
		return convert(EditorProposal.getProposal_AllNodes(Editor.getSpec(sname, path)));
	}
	
	/**
	 * Propose all arrow types that can start from a specific node type
	 * @param srcTypeNode
	 * @param srcTypeNodeId
	 * @param sname
	 * @param path
	 * @return
	 */
	public static List<String> getProposal_ArrowTypes(String srcTypeNode, Set<Integer> srcTypeNodeId, String sname, String path) {
		return convert(EditorProposal.getProposal_ArrowTypes(srcTypeNode, jSet2RId(srcTypeNodeId), Editor.getSpec(sname, path)));
	}

	/**
	 * Propose complete arrows starting from a source node.
	 * Used to make suggestions in the constraint section of a specification.
	 * @param srcNode
	 * @param srcNodeId
	 * @param sname
	 * @param path
	 * @return
	 */
	public static List<String> getProposal_CompleteArrows(String srcNode, Set<Integer> srcNodeId, String sname, String path) {
		return convert(EditorProposal.getProposal_CompleteArrows(srcNode, jSet2RId(srcNodeId), Editor.getSpec(sname, path)));
	}

	
	/**
	 * Propose all existing and possible target nodes for an arrow
	 * @param srcNodeType
	 * @param srcNodeTypeId
	 * @param arrowType
	 * @param arrowTypeId
	 * @param sname
	 * @param path
	 * @return
	 */
	public static List<String> getProposal_ArrowTargetNodes(String srcNodeType, Set<Integer> srcNodeTypeId, String arrowType, Set<Integer> arrowTypeId, String sname, String path) {
		return convert(EditorProposal.getProposal_ArrowTargetNodes(srcNodeType, jSet2RId(srcNodeTypeId), arrowType, jSet2RId(arrowTypeId), Editor.getSpec(sname, path)));
	}

	/**
	 * Propose all possible target types for an arrow
	 * @param srcNodeType
	 * @param srcNodeTypeId
	 * @param arrowType
	 * @param arrowTypeId
	 * @param sname
	 * @param path
	 * @return
	 */
	public static List<String> getProposal_ArrowTargetTypes(String srcNodeType, Set<Integer> srcNodeTypeId, String arrowType, Set<Integer> arrowTypeId, String sname, String path) {
		return convert(EditorProposal.getProposal_ArrowTargetTypes(srcNodeType, jSet2RId(srcNodeTypeId), arrowType, jSet2RId(arrowTypeId), Editor.getSpec(sname, path)));
	}

	/**
	 * Propose all constraints of a signature.
	 * Used to propose possible constraints in a specification after a signature has been selected.
	 * @param s
	 * @return
	 */
	public static List<String> getProposal_AllConstraints(final Signature s) {
		List<String> rs = new ArrayList<String>();
		for (Validator jv : s.getValidators()) {
			rs.add(EditorProposal.getProposal_Constraint(jv.getId().getName(), jId2RId(jv.getId()), jList2List(jv.getParameter_vars())));
		}
		java.util.Collections.sort(rs);
		return rs;
	}

	/**
	 * Propose all specifications of a specific directory.
	 * Used to propose the meta-specification for a specification.
	 * @param dir
	 * @return
	 */
	public static List<String> getProposal_AllSpecifications(IResource dir) {
		return convert(EditorProposal.getProposal_AllSpecifications(dir.getFullPath().toPortableString()));
	}

	/**
	 * Propose all signatures of a specific directory.
	 * Used to propose signatures in a specification. 
	 * @param dir
	 * @return
	 */
	public static List<String> getProposal_AllSignatures(IResource dir) {
		return convert(EditorProposal.getProposal_AllSignatures(dir.getFullPath().toPortableString()));
	}

	//
	// Apply commands:
	//

	/**
	 * Generate an image as Graphviz graph. 
	 * Image contains all constraints etc. 
	 * @param name
	 * @param path
	 * @param fileType
	 * @param outDir
	 */
	public static void makeImage(final String name, final String path, final String fileType, final String outDir) {
		EditorCommands.makeImage(name, path, fileType, outDir);
	}

	/**
	 * Generate an image as Graphviz graph. 
	 * Image looks a bit more like a class diagram.
	 * @param name
	 * @param path
	 * @param fileType
	 * @param outDir
	 */
	public static void makeDiagram(final String name, final String path, final String fileType, final String outDir) {
		EditorCommands.makeDiagram(name, path, fileType, outDir);
	}

	/**
	 * Generates an ecore file for a specification.
	 * @param name
	 * @param path
	 * @param outDir
	 */
	public static void makeEcore(final String name, final String path, final String outDir) {
		EditorCommands.makeEcore(name, path, outDir);
	}

	/**
	 * Generates a XMI file for a specification.
	 * Attention: can only be loaded if the corresponding ecore file has been generated too.
	 * @param name
	 * @param path
	 * @param outDir
	 */
	public static void makeEMF(final String name, final String mmName, final String path, final String outDir) {
		EditorCommands.makeEMF(name, mmName, path, outDir);
	}

	
	/**
	 * Searches a specification in another specification. 
	 * Has been implemented to extend it later for a graph transformation.
	 * @param search
	 * @param into
	 * @param path
	 * @param debugDir
	 * @return
	 */
	public static String testMatch(final String search, final String into, final String path, final String debugDir) {
		return EditorCommands.testMatch(search, into, path, debugDir);
	}

	/**
	 * Create non existing "meta-specification" for a specification
	 * Tries to recover the meta-specification if it has been deleted by accident. 
	 * 
	 * @param f
	 * @param instance
	 */
	public static void generateSpecification(IFile f, Specification instance) {
		ScalaBridgeExtra.generateSpecification(f, instance);
	}
}
