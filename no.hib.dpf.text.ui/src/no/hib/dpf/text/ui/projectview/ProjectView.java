package no.hib.dpf.text.ui.projectview;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import no.hib.dpf.text.DPFConstants;
import no.hib.dpf.text.scala.DPFTextCore;
import no.hib.dpf.text.ui.internal.DPFTextActivator;
import no.hib.dpf.text.ui.outline.DPFTextOutlineTreeProvider;
import no.hib.dpf.text.util.CommonUtil;
import no.hib.dpf.text.util.SignatureInfo;
import no.hib.dpf.text.util.SpecificationInfo;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.ViewPart;

/**
 * The project view, where specifications are shown in a tree,
 * batch files and signatures are listed.
 */
public class ProjectView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "no.hib.dpf.text.ui.projectview.ProjectView";

	private static String IMAGE_Specification = "icons/specification.png";
	private static String IMAGE_Signature = "icons/signature.png";
	private static String IMAGE_Batches = "icons/batch.png";
	private static String IMAGE_Refresh = "icons/view-refresh.png";

	private static String REFRESH_Label = "";

	private TreeViewer viewer;
	private Action action_open;
	private Action action_refresh;
	private int pName = 0;
	private final ViewContentProvider contentProvider = new ViewContentProvider();
	private IProject currentProject = null;
	
	/**
	 * Tree object to display leave nodes in the tree
	 */
	class TreeObject implements IAdaptable {

		private String name;
		private String path;
		private String version;
		private boolean dirty;
		private String fileExtension;
		private TreeParent parent;

		public TreeObject(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public boolean isDirty() {
			return dirty;
		}

		public void setDirty(boolean dirty) {
			this.dirty = dirty;
		}

		public String getFileExtension() {
			return fileExtension;
		}

		public void setFileExtension(String fileExtension) {
			this.fileExtension = fileExtension;
		}

		public void setParent(TreeParent parent) {
			this.parent = parent;
		}

		public TreeParent getParent() {
			return parent;
		}

		public String toString() {
			if (null == getFileExtension() || getFileExtension().isEmpty()) {
				return getName();
			}
			return makeNameWithMetaInformation();
		}

		private String makeNameWithMetaInformation() {
			try {
				String pathWithoutProjectName = "";
				if (null != getPath() && getPath().length() > pName) {
					pathWithoutProjectName = getPath().substring(pName + 1);
				}
				return getName() + (null != getVersion() ? " Version=\"" + getVersion() + "\"":"")  
						         + (!pathWithoutProjectName.isEmpty() ? " Path=" + pathWithoutProjectName : "")
						         + (isDirty() ? " (UNVERSIONED!)" : "") ;
			} catch (Exception e) {
				DPFTextCore.log(e);
				return getName();
			}
		}

		@SuppressWarnings("rawtypes")
		public Object getAdapter(Class key) {
			return null;
		}
	}

	/**
	 * Object to display parent object in the tree
	 */
	class TreeParent extends TreeObject {
		private ArrayList<TreeObject> children = new ArrayList<TreeObject>();

		public TreeParent(String name) {
			super(name);
		}

		public void addChild(TreeObject child) {
			children.add(child);
			child.setParent(this);
		}

		public void removeChild(TreeObject child) {
			children.remove(child);
			child.setParent(null);
		}

		public void removeAllChildren() {
			for (TreeObject t : children) {
				t.setParent(null);
			}
			children.clear();
		}

		public TreeObject[] getChildren() {
			return (TreeObject[]) children.toArray(new TreeObject[children.size()]);
		}

		public boolean hasChildren() {
			return children.size() > 0;
		}
	}

	/**
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */
	class ViewContentProvider implements IStructuredContentProvider, ITreeContentProvider, PropertyChangeListener {

		// Types of documents:
		final TreeParent refresh = new TreeParent(REFRESH_Label);
		final TreeParent spec = new TreeParent("Specifications");
		final TreeParent sig = new TreeParent("Signatures");
		final TreeParent batch = new TreeParent("Batches");

		public ViewContentProvider() {
			DPFTextOutlineTreeProvider.getSupport().addPropertyChangeListener(this);
		}

		private TreeParent invisibleRoot;

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			if (parent.equals(getViewSite())) {
				if (invisibleRoot == null)
					initialize();
				return getChildren(invisibleRoot);
			}
			return getChildren(parent);
		}

		public Object getParent(Object child) {
			if (child instanceof TreeObject) {
				return ((TreeObject) child).getParent();
			}
			return null;
		}

		public Object[] getChildren(Object parent) {
			if (parent instanceof TreeParent) {
				return ((TreeParent) parent).getChildren();
			}
			return new Object[0];
		}

		public boolean hasChildren(Object parent) {
			if (parent instanceof TreeParent)
				return ((TreeParent) parent).hasChildren();
			return false;
		}

		private void initialize() {
			// TreeParent root = new TreeParent("Project");
			invisibleRoot = new TreeParent("Project");
			invisibleRoot.addChild(refresh);
			invisibleRoot.addChild(spec);
			invisibleRoot.addChild(sig);
			invisibleRoot.addChild(batch);
		}

		/**
		 * Show specification information in tree objects.
		 * @param root
		 * @param project
		 * @return
		 */
		private TreeObject decorate(final SpecificationInfo root, final String project) {
			final String prefix = "/" + project;
			if (root.getInstances().isEmpty()) {
				final TreeObject rs = new TreeObject(root.getName());
				rs.setPath(root.getPath());
				rs.setVersion(root.getVersionName());
				rs.setDirty(root.isDirty());
				rs.setFileExtension(DPFConstants.SPECIFICATION_FILE_EXTENSION);
				return rs;
			} else {
				final TreeParent rs = new TreeParent(root.getName());
				rs.setPath(root.getPath());
				rs.setVersion(root.getVersionName());
				rs.setDirty(root.isDirty());
				rs.setFileExtension(DPFConstants.SPECIFICATION_FILE_EXTENSION);
				for (SpecificationInfo i : root.getInstances()) {
					try {
						if (i.getPath().toString().startsWith(prefix)) {
							rs.addChild(decorate(i, project));
						}						
					} catch (Exception t) {
						DPFTextCore.log(t);
					}
				}
				return rs;
			}
		}

		/**
		 * If the project has been switched refresh the information of the view.
		 */
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			IProject project = (IProject) evt.getNewValue();
			if(null == currentProject || !project.getName().equals(currentProject.getName())){
				refreshTree(project);				
			}
		}

		/**
		 * Refresh all information for the project.
		 * Note: quite expansive operation.s
		 * @param project
		 */
		private void refreshTree(IProject project) {
			try {
				// Save project:
				currentProject = project;
				Set<IFile> batches = new HashSet<IFile>();

				pName = project.getName().length();

				//Clear all editor data:
				DPFTextCore.clearCaches();

				// Scan Project
				scanFiles(project,batches);

				// Add Specifications:
				spec.removeAllChildren();
				spec.addChild(decorate(DPFTextCore.getAllLoadedSpecificationInfos(), project.getName()));

				// Add Signatures:
				sig.removeAllChildren();
				final String prefix = "/" + project.getName();
				for (SignatureInfo i: DPFTextCore.getAllLoadedSignatureInfos()) {
					try {
						if (i.getPath().toString().startsWith(prefix)) {
							final TreeObject o = new TreeObject(i.getName());
							o.setPath(i.getPath());
							o.setVersion(i.getVersionName());
							o.setDirty(i.isDirty());
							o.setFileExtension(DPFConstants.SIGNATURE_FILE_EXTENSION);
							sig.addChild(o);
						}						
					} catch (Throwable t) {
						DPFTextCore.log(t);
					}
				}

				// Add Batches:
				batch.removeAllChildren();
				for (IFile f : batches) {
					final TreeObject o = new TreeObject(CommonUtil.getBatchFileNameFromIFile(f));
					o.setPath(f.getParent().getFullPath().toPortableString());
					o.setFileExtension(DPFConstants.BATCH_FILE_EXTENSION);
					batch.addChild(o);
				}

				viewer.refresh();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/**
		 * Scan the project and load all specifications and signatures in the project
		 * @param c
		 * @param batches
		 */
		private void scanFiles(IContainer c, Set<IFile> batches) {
			try {
				for (IResource r : c.members()) {
					if (r instanceof IContainer) {
						scanFiles((IContainer) r, batches);
					} else if (r instanceof IFile) {
						final IFile f = (IFile) r;
						if (f.getName().endsWith(DPFConstants.SPECIFICATION_FILE_EXTENSION)) {
							try {
								DPFTextCore.loadSpecification(f, false);
							} catch (Exception e) {
								// do nothing
							}
						} else if (f.getName().endsWith(DPFConstants.SIGNATURE_FILE_EXTENSION)) {
							try {
								DPFTextCore.loadSignature(CommonUtil.getSigNameFromFileName(f), f.getParent());								
							} catch (Exception e) {
								// do nothing
							}
						} else if (f.getName().endsWith(DPFConstants.BATCH_FILE_EXTENSION)) {
							batches.add(f);
						}
					}
				}
			} catch (Exception e) {
				DPFTextCore.log(e);
			}
		}

	}

	/**
	 * Provide images for different tree objects according to their content.
	 */
	class ViewLabelProvider extends LabelProvider {
		private Image imageRefresh;
		private Image imageSpec;
		private Image imageSig;
		private Image imageBatches;

		private boolean isInit = false;

		private void initialize() {
			try {
				imageRefresh = ImageDescriptor.createFromURL(FileLocator.find(DPFTextActivator.getInstance().getBundle(), new Path(IMAGE_Refresh), null)).createImage();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				imageSpec = ImageDescriptor.createFromURL(FileLocator.find(DPFTextActivator.getInstance().getBundle(), new Path(IMAGE_Specification), null)).createImage();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				imageSig = ImageDescriptor.createFromURL(FileLocator.find(DPFTextActivator.getInstance().getBundle(), new Path(IMAGE_Signature), null)).createImage();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				imageBatches = ImageDescriptor.createFromURL(FileLocator.find(DPFTextActivator.getInstance().getBundle(), new Path(IMAGE_Batches), null)).createImage();
			} catch (Exception e) {
				e.printStackTrace();
			}
			isInit = true;

		}

		public String getText(Object obj) {
			return obj.toString();
		}

		public Image getImage(Object obj) {

			if (!isInit) {
				initialize();
			}

			if (obj instanceof TreeObject) {
				try {
					final TreeObject o = (TreeObject) obj;
					if(null != o.getFileExtension()){
						if (o.getFileExtension().equals(DPFConstants.SPECIFICATION_FILE_EXTENSION)) {
							if (null != imageSpec)
								return imageSpec;
						}
						if (o.getFileExtension().equals(DPFConstants.SIGNATURE_FILE_EXTENSION)) {
							if (null != imageSig)
								return imageSig;
						}
						if (o.getFileExtension().equals(DPFConstants.BATCH_FILE_EXTENSION)) {
							if (null != imageBatches)
								return imageBatches;
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			// String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
			if (obj instanceof TreeParent) {
				if (((TreeParent) obj).getName().equals(REFRESH_Label)) {
					return imageRefresh;
				}
			}
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
		}

	}

	/**
	 * Sort names in the tree alphabetically
	 */
	class NameSorter extends ViewerSorter {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(contentProvider);
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "no.hib.dpf.text.ui.viewer");
		makeActions();
		hookContextMenu();
		refreshActionClicked();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {

				// Show context menu only fo DPF-Text-Files
				IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection ss = (IStructuredSelection) selection;
					Object sel = ss.getFirstElement();
					if (sel instanceof TreeObject) {
						final TreeObject t = (TreeObject) sel;
						if (null != t.getPath() && !t.getPath().isEmpty()) {
							manager.add(action_open);
						}
					}
				}

			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void refreshActionClicked() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				if (event.getSelection() instanceof TreeSelection) {
					TreeSelection s = (TreeSelection) event.getSelection();
					if (s.getFirstElement() instanceof TreeParent) {
						TreeParent t = (TreeParent) s.getFirstElement();
						if (t.getName().equals(REFRESH_Label)) {
							action_refresh.run();
						}
					}
				}
			}
		});
	}

	private void makeActions() {
		action_open = new Action() {
			public void run() {
				try {
					IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
					if (selection instanceof IStructuredSelection) {
						IStructuredSelection ss = (IStructuredSelection) selection;
						Object sel = ss.getFirstElement();
						if (sel instanceof TreeObject) {
							try {

								final TreeObject t = (TreeObject) sel;
								final Path path = new Path(t.getPath() + "/" + t.getName() + t.getFileExtension());
								final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

								if (null != file) {
									final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
									IDE.openEditor(page, file);
								}
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		action_open.setText("Open");

		action_refresh = new Action() {
			public void run() {
				if (null != contentProvider) {
					contentProvider.refreshTree(currentProject);
				}
			}
		};
		action_refresh.setText("refresh");
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}