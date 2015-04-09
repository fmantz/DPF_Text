package no.hib.dpf.text.ui.commands;

import java.util.Arrays;

import no.hib.dpf.text.DPFConstants;
import no.hib.dpf.text.scala.DPFTextCore;
import no.hib.dpf.text.tdpf.Specification;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Command to create a EMF XMI file by right mouse click on a specification "Create XMI".
 */
public class CommandCreateXMI extends AbstractHandler {

	private Shell shell;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		try {
			final IFile file = (IFile) ((StructuredSelection)selection).getFirstElement();
			final IContainer parent = file.getParent();
			final String pathString = parent.getFullPath().toOSString();
			final String dir = parent.getLocation().toFile().getAbsolutePath();
			final String name = file.getName().substring(0,file.getName().length()-DPFConstants.SPECIFICATION_FILE_EXTENSION.length());
			final Specification s = DPFTextCore.loadSpecification(parent, name, true);
			DPFTextCore.makeEMF(name , s.getType().getId(), pathString, dir);
			parent.refreshLocal(1, new NullProgressMonitor());
		} catch (Exception e) {
			DPFTextCore.log(e);
			MessageDialog.openError(shell, "Error", Arrays.deepToString(e.getStackTrace()));
		}
		return null;
	}

 	
}
