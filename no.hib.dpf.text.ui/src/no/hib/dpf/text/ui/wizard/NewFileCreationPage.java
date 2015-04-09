package no.hib.dpf.text.ui.wizard;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

import no.hib.dpf.text.DPFConstants;
import no.hib.dpf.text.scala.DPFTextCore;
import no.hib.dpf.text.ui.internal.DPFTextActivator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.osgi.framework.Bundle;

/**
 * Wizard page for creating a new DPF Text document.
 */
public class NewFileCreationPage extends WizardNewFileCreationPage {

	private static final String PAGE_NAME = "Create new DPF Text File"; //$NON-NLS-1$
	Button radioButton_Specification = null;
	Button radioButton_Signature = null;
	Button radioButton_Command = null;
	private IFile newFile;

	public NewFileCreationPage(IStructuredSelection selection) {
		super(PAGE_NAME, selection);
		setTitle("Create a new DPF Text File");
		setDescription("DPF Text Files can be specifcation, signature or batch files.");
		setFileName("");
		setFileExtension("");
	}

	/**
	 * Get initial content from template files
	 */
	@Override
	protected InputStream getInitialContents() {	
		String templateFilePath = "templates/template";
		if (radioButton_Specification.getSelection()) {
			templateFilePath += DPFConstants.SPECIFICATION_FILE_EXTENSION;
		} else if (radioButton_Signature.getSelection()) {
			templateFilePath += DPFConstants.SIGNATURE_FILE_EXTENSION;
		} else if (radioButton_Command.getSelection()) {
			templateFilePath += DPFConstants.BATCH_FILE_EXTENSION;
		}
		InputStream inputStream = null;
		try {
			final Bundle bundle = DPFTextActivator.getInstance().getBundle();
			inputStream = bundle.getEntry("/"+ templateFilePath).openStream();
		} catch (Throwable t) {
			DPFTextCore.log(Arrays.deepToString(t.getStackTrace()));
			inputStream = new ByteArrayInputStream("//Template file could not be read!".getBytes());
		}
		return inputStream;
	}

	@Override
	protected String getNewFileLabel() {
		return "New Artifact Name: ";
	}

	@Override
	public IFile createNewFile() {
		if (newFile != null) {
			return newFile;
		}
		if (!this.getFileName().matches("[a-zA-Z][a-zA-Z0-9]*")) {
			setErrorMessage("Artifact has not a valid name!");
			return null;
		}
		String fileName = this.getFileName();
		if (null != super.getFileName() && !"".equals(super.getFileName().trim())) {
			if (radioButton_Specification.getSelection()) {
				fileName += "_Specification.tdpf";
			} else if (radioButton_Signature.getSelection()) {
				fileName += "_Signature.tdpf";
			} else if (radioButton_Command.getSelection()) {
				fileName += DPFConstants.BATCH_FILE_EXTENSION;
			} else {
				setErrorMessage("Select an artifact type!");
				return null;
			}
		}
		final IPath containerPath = this.getContainerFullPath();
		final IPath newFilePath = containerPath.append(fileName);
		// System.out.println("Create File:>" + newFilePath.toOSString());
		final IFile newFileHandle = createFileHandle(newFilePath);
		if (newFileHandle.exists()) {
			setErrorMessage("Artifact already exists!");
			return null;
		} else {
			final InputStream initialContents = getInitialContents();
			try {
				newFileHandle.create(initialContents, false, null);
			} catch (Throwable t) {
				setErrorMessage("Artifact could not be created: " + newFilePath.toOSString());
				return null;
			}
			newFile = newFileHandle;
			return newFileHandle;
		}
	}

	@Override
	protected boolean validatePage() {
		boolean valid = true;
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IStatus result = workspace.validateName(this.getFileName(), IResource.FILE);
		if (!result.isOK()) {
			setErrorMessage(result.getMessage());
			return false;
		}
		return valid;
	}

	@Override
	protected void createAdvancedControls(Composite parent) {
		Composite fileType = new Composite(parent, SWT.NONE);
		fileType.setLayout(new RowLayout(SWT.VERTICAL));
		radioButton_Signature = new Button(fileType, SWT.RADIO);
		radioButton_Signature.setText("Signature");
		radioButton_Specification = new Button(fileType, SWT.RADIO);
		radioButton_Specification.setText("Specification");
		radioButton_Specification.setSelection(true);
		radioButton_Command = new Button(fileType, SWT.RADIO);
		radioButton_Command.setText("Batch");
	}

}
