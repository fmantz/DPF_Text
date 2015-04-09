package no.hib.dpf.text.ui.outline;

import java.beans.PropertyChangeSupport;

import no.hib.dpf.text.tdpf.Arrow;
import no.hib.dpf.text.tdpf.Constraint;
import no.hib.dpf.text.tdpf.DpfId;
import no.hib.dpf.text.tdpf.Node;
import no.hib.dpf.text.tdpf.NodeSimple;
import no.hib.dpf.text.tdpf.Property;
import no.hib.dpf.text.tdpf.RId;
import no.hib.dpf.text.tdpf.Specification;
import no.hib.dpf.text.tdpf.Version;
import no.hib.dpf.text.ui.Normalizer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.ITextRegion;

import com.google.inject.Inject;

public class DPFTextOutlineTreeProvider extends DefaultOutlineTreeProvider {

	@Inject
	protected ILocationInFileProvider locationInFileProvider;

	protected IXtextDocument document;

	@Inject
	protected XtextEditor xtextEditor;

	private boolean init = true;

	//
	// Did the active Project changed
	// TODO: (not really the right place here):
	//
	private static PropertyChangeSupport support = new PropertyChangeSupport(new Object());
	private static IProject oldProject = null;
	private IFile currentSpecification = null;

	public static PropertyChangeSupport getSupport() {
		return support;
	}

	//
	// Document:
	//
	@Override
	public IOutlineNode createRoot(IXtextDocument d) {
		this.document = d;
		final IOutlineNode rs = super.createRoot(d);
		try {
			//
			// Fire ActiveProject Changed event:
			//
			currentSpecification = getFileInEditor();
			final IProject p = currentSpecification.getProject();
			
			//If should not be required, however project view is sometimes still not be
			//refreshed TODO: Find bug!
			if(null == oldProject || !oldProject.getName().equals(p.getName())){
				support.firePropertyChange("projectChanged", oldProject, p);
				oldProject = p;
			}
		} catch (Throwable e) {
			// DPFTextCore.log(e); //Can happen when the Editor starts!
		}

		return rs;
	}

	protected void _createChildren(final DocumentRootNode parentNode, final Specification s) {
		if (init) {
			Normalizer.initCache(this.document, s);
			init = false;
		}
		super._createChildren(parentNode, s);
	}

	//
	// Do not show SequenceNumber in outline view:
	//
	protected void _createNode(IOutlineNode parentNode, Version sn) {
	}

	//
	// Nodes:
	//

	/**
	 * Create Node for outline view:
	 * 
	 * @param parentNode
	 * @param arrow
	 */
	protected void _createNode(IOutlineNode parentNode, Node node) {
		Image image = imageDispatcher.invoke(node);
		EObjectNode eObjectNode = new EObjectNode(node, parentNode, image, new StyledString(makeLabel(node)), true);
		eObjectNode.setShortTextRegion(locationInFileProvider.getSignificantTextRegion(node.getId()));
		super._createChildren(eObjectNode, node.getProperties());
	}

	/**
	 * Make Label for a Node
	 * 
	 * @param n
	 * @return
	 */
	private String makeLabel(Node n) {
		return idToString(n.getId()) + ":" + idToString(n.getType());
	}

	private String makeLabel(NodeSimple n) {
		return idToString(n.getId()) + ":" + idToString(n.getType());
	}

	private String idToString(DpfId id) {
		return id.getName() + ((null != id.getId() && !id.getId().getNums().isEmpty()) ? ("@" + formatId(id.getId())) : "");
	}

	private String formatId(RId id) {
		StringBuffer result = new StringBuffer();
		boolean notFirst = false;
		for (int i : id.getNums()) {
			if (notFirst) {
				result.append(",");
			}
			result.append(i);
			notFirst = true;
		}
		return result.toString();
	}

	//
	// Arrows:
	//

	/**
	 * Create Arrow for outline view:
	 * 
	 * @param parentNode
	 * @param arrow
	 */
	protected void _createNode(IOutlineNode parentNode, Arrow arrow) {
		Image image = imageDispatcher.invoke(arrow);
		EObjectNode eObjectNode = new EObjectNode(arrow, parentNode, image, makeLabel(arrow), true);
		ITextRegion location = locationInFileProvider.getSignificantTextRegion(null != arrow.getId() ? arrow.getId() : arrow);
		eObjectNode.setShortTextRegion(location);
	}

	/**
	 * Create Arrow for outline view that is a property in the editor:
	 * 
	 * @param parentNode
	 * @param arrow
	 */
	protected void _createNode(IOutlineNode parentNode, Property property) {
		Image image = imageDispatcher.invoke(property);
		EObjectNode eObjectNode = new EObjectNode(property, parentNode, image, makeLabel(property), true);
		ITextRegion location = locationInFileProvider.getSignificantTextRegion(null != property.getId() ? property.getId() : property);
		eObjectNode.setShortTextRegion(location);
	}

	/**
	 * Make label for an Arrow
	 * 
	 * @param arrow
	 * @return
	 */
	protected StyledString makeLabel(Arrow arrow) {
		try {
			final String sr = idToString(arrow.getSr().getId()) + ":" + idToString(arrow.getSr().getType());
			String tg = "";
			// Target:
			if (null != arrow.getTgNode()) {
				NodeSimple n = arrow.getTgNode();
				tg = makeLabel(n);
			} else if (null != arrow.getTgValue()) {
				tg = arrow.getTgValue().getValue();
			} else if (null != arrow.getTgDataType()) {
				tg = arrow.getTgDataType().getName() + ":Datatype";
			}
			// Inheritance:
			if (null == arrow.getType() && null != arrow.getTgNode()) {
				final StyledString ret = new StyledString(sr + " --- |> " + tg);
				ret.setStyle(sr.length() + 1, 12, StyledString.COUNTER_STYLER);
				return ret;
			} else {
				final String id = idToString(arrow.getId()) + (null != arrow.getType() ? idToString(arrow.getType()) : "Attribute");
				final StyledString ret = new StyledString(sr + " --- " + id + " ---> " + tg);
				ret.setStyle(sr.length() + 1, id.length() + 10, StyledString.COUNTER_STYLER);
				return ret;
			}
		} catch (Exception e) {
			System.out.println("Source: " + arrow.getSr());
			System.out.println("Type  : " + arrow.getType());
			return new StyledString("Problem with arrow: " + arrow);
		}
	}

	/**
	 * Make Label for an Property (which is an Arrow in the graph)
	 * 
	 * @param property
	 * @return
	 */
	protected StyledString makeLabel(Property property) {
		try {
			String tg = "";
			// Target:
			if (null != property.getTgNode()) {
				NodeSimple n = property.getTgNode();
				tg = makeLabel(n);
			} else if (null != property.getTgValue()) {
				tg = property.getTgValue().getValue();
			} else if (null != property.getTgDataType()) {
				tg = property.getTgDataType().getName() + ":Datatype";
			}
			final String id = idToString(property.getId()) + (null != property.getType() ? idToString(property.getType()) : "Attribute");
			final StyledString ret = new StyledString(" --- " + id + " ---> " + tg);
			ret.setStyle(1, id.length() + 10, StyledString.COUNTER_STYLER);
			return ret;
		} catch (Exception e) {
			return new StyledString("Problem with property: " + property + " " + e.getCause());
		}
	}

	//
	// Constraints:
	//
	
	/**
	 * Create Constraint for outline view:
	 * 
	 * @param parentNode
	 * @param arrow
	 */
	protected void _createNode(IOutlineNode parentNode, Constraint constraint) {
		Image image = imageDispatcher.invoke(constraint);
		EObjectNode eObjectNode = new EObjectNode(constraint, parentNode, image, new StyledString(makeLabel(constraint)), true);
		eObjectNode.setShortTextRegion(locationInFileProvider.getSignificantTextRegion(constraint));
		for (EObject o : constraint.getArity_d()) {
			createNode(eObjectNode, o);
		}
	}

	private String makeLabel(Constraint c) {
		final StringBuffer b = new StringBuffer();
		boolean notFirst = false;
		b.append("(");
		for (String p : c.getParameter()) {
			if (notFirst)
				b.append(",");
			b.append(p);
			notFirst = true;
		}
		b.append(")");
		return c.getType().getName() + b.toString();
	}
	
	/**
	 * Get file currently loaded in the editor
	 * @return
	 */
	private IFile getFileInEditor() {
		IFile f = null;
		try {
			final IWorkbenchPartSite s = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite();
			f = (IFile) s.getPage().getActiveEditor().getEditorInput().getAdapter(IFile.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
