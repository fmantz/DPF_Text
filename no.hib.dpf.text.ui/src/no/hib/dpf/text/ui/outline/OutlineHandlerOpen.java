package no.hib.dpf.text.ui.outline;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

/**
 * Handler to open a DPF Text file in the outline view by right mouse click.
 */
public class OutlineHandlerOpen extends AbstractHandler {
	
	private EObjectNode currentEObjectNode = null;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//Get current open File:
		try {
			final IFile f = (IFile)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().
					   getActivePart().getSite().getPage().getActiveEditor().getEditorInput().getAdapter(IFile.class);
			
			//Get File to Open:
			final String text = currentEObjectNode.getText().toString();
			final IFile fileToOpen = iFileFromParent(f, text.substring(text.indexOf("=")+1));
			
			//Open File in new Tab:
			if (null != fileToOpen) {
			    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			    IDE.openEditor(page, fileToOpen);
			}
			
		} catch (Exception e) {
			//ignore
		}
		return null; //nothing need to be returned
	}

    private static IFile iFileFromParent(IFile f, String fileName){
	   final String path = f.getParent().getFullPath() + "/" + fileName;
	   return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path)); 	   
    }
	
	@Override
	public boolean isEnabled() {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = win.getActivePage();
		IWorkbenchPart part = page.getActivePart();
		if (part instanceof ContentOutline) {
			ISelection selection = ((ContentOutline) part).getSelection();
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection ss = (IStructuredSelection) selection;
				Object sel = ss.getFirstElement();
				if (sel instanceof EObjectNode) {
					currentEObjectNode = (EObjectNode) sel;
					return currentEObjectNode.getText().toString().endsWith(".tdpf");
				}
			}
		}
		return false;
	}

}
