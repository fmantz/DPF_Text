package no.hib.dpf.text.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

public class DPFTextDocumentProvider extends XtextDocumentProvider {

	/**
	 * Reformat the content of the specification or signature after saving into 
	 * one of the standard formats.
	 */
	protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite) 
			throws CoreException {
		Normalizer.normalize(document);
		super.doSaveDocument(monitor, element, document, overwrite);
		
		//TODO: If there is a way to get access to the IFile here:
		//the FileSaveDector can be deleted and the ConstraintValidation on save
		//could be called here.
	} 
	
}
