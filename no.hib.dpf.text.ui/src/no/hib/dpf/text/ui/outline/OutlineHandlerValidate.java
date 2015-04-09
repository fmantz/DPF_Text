package no.hib.dpf.text.ui.outline;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import no.hib.dpf.text.scala.DPFTextCore;
import no.hib.dpf.text.tdpf.Specification;

import no.hib.dpf.text.util.Tuple;
import no.hib.dpf.text.validation.DPFTextJavaValidator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * Handler to validate a DPF Specification in the outline view by right mouse click.
 */
public class OutlineHandlerValidate extends AbstractHandler {
	
	private EObjectNode currentEObjectNode = null;	
	
	/**
	 * Make errors for specifc elements e.g. Nodes, Arrows available 
	 */
	private static void setErrorMessages(final Map<String,String> errors, final IFile owner, final IEditorPart xtEditor){
		if(null != errors){
			DPFTextJavaValidator.setValidationErrMsg(errors,owner);
			if(xtEditor instanceof XtextEditor){
				updateAnnotations((XtextEditor)xtEditor);
				//System.out.println("Revalidate errors.size()=" + errors.size());
			}
		}else{
			DPFTextJavaValidator.setValidationErrMsg(new HashMap<String,String>(),owner);
		}
	}
	
	/**
	 * Update error annotations in editor 
	 * @param editor
	 */
	private static void updateAnnotations(XtextEditor editor) {
		try {
		    final IXtextDocument document = editor.getDocument();
		    document.readOnly(new IUnitOfWork<Void, XtextResource>() {
		      public java.lang.Void exec(XtextResource resource) throws Exception {
		        ((XtextDocument) document).checkAndUpdateAnnotations();
		        return null;
		      }
		    });			
		} catch (Exception e) {
			DPFTextCore.log(e);
		}
	}

	
	/**
	 * Make errors available that could not further specified:
	 * @param i
	 * @return
	 */
	private static void printUnspecifiedErrorMessages(List<String> errors, boolean openDialog){
		if(null != errors && 0 < errors.size()){
			final StringBuffer msg = new StringBuffer();
			msg.append("Following global errors where found: \n");
			for(String s:errors){
				msg.append(s);
				msg.append("\n");
			}
			if(openDialog) MessageDialog.openInformation(Display.getCurrent().getActiveShell(),"Validation Completed!", msg.toString());
		}else{
			if(openDialog) MessageDialog.openInformation(Display.getCurrent().getActiveShell(),"Validation Completed!","Validation Completed!");
		}
	}
		
	/**
	 * Validate a specification i.e check the constraints from the meta-specification
	 * @param specification2Parse
	 * @param xtEditor
	 * @param openDialog
	 */
	public static void validate(final IFile specification2Parse, IEditorPart xtEditor, boolean openDialog) {
		try {		
			//Get Specification:
			Specification spec = DPFTextCore.readSpecification(specification2Parse).y;
							
			//Validate:
			if(null != spec){
				final String path = specification2Parse.getParent().getFullPath().toOSString();
				Tuple<Map<String,String>,List<String>> errors=DPFTextCore.checkAllConstraints(spec, path);
				printUnspecifiedErrorMessages(errors.y,openDialog);
				//System.out.println("Validation errors found " + errors.x.size());
				//for(Map.Entry<String,String> e:errors.x.entrySet())System.out.println(e.getKey() + " = " + e.getValue());
				setErrorMessages(errors.x,specification2Parse,xtEditor);
			}
			
		} catch (Exception e) {
			DPFTextCore.log(e);
		}
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//Get current open File:
		try {
			IEditorPart xtEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite().getPage().getActiveEditor();
			final IFile specification2Parse = (IFile)xtEditor.getEditorInput().getAdapter(IFile.class);
				validate(specification2Parse,xtEditor,true);
		} catch (Exception e) {
			DPFTextCore.log(e);
		}
		//do nothing
		return null;
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
					final String check = currentEObjectNode.getText().toString();
					return check.startsWith("Specification:"); 
				}
			}
		}
		return false;
	}
}
