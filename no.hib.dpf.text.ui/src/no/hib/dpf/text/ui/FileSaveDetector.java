package no.hib.dpf.text.ui;

import no.hib.dpf.text.DPFConstants;
import no.hib.dpf.text.scala.DPFTextCore;
import no.hib.dpf.text.ui.outline.OutlineHandlerValidate;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

/**
 * Calls the constraint validation on save.
 */
public class FileSaveDetector implements IResourceDeltaVisitor {

	public static FileSaveDetector INSTANCE = new FileSaveDetector();

	private FileSaveDetector() {}

	public boolean visit(IResourceDelta delta) {
		
		final IResource res = delta.getResource();
		
		switch (delta.getKind()) {
		// case IResourceDelta.ADDED:
		// break;
		// case IResourceDelta.REMOVED:
		// break;
		case IResourceDelta.CHANGED:
			if (res.getFullPath().toString().endsWith(DPFConstants.SPECIFICATION_FILE_EXTENSION)) {
				try {
					// Need to be called from UI Thread!
					PlatformUI.getWorkbench().getDisplay()
							.asyncExec(new Runnable() {
								final IFile file = (IFile)res;						
								public void run() {
									try {
										final IEditorPart xtEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite().getPage().getActiveEditor();						
										OutlineHandlerValidate.validate(file, xtEditor, false);										
									} catch (Throwable t) {
										DPFTextCore.log(t);
									}
								}
							});
				} catch (Throwable t) {
					DPFTextCore.log(t);
				}
			}
			break;
		}
		return true; // visit the children
	}

}
