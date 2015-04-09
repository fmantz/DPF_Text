package no.hib.dpf.text.ui.wizard;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

/**
 * New DPF Text Project Creation Wizard 
 */
public class NewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	private final String WIZARD_NAME = "New DPF-Text Project";
	private static final String PROJECT_PAGE_NAME = "DPF Text Project Wizard";
	private static final String PROJECT_PAGE_TITLE = "Create a DPF Text Project";
	private static final String PROJECT_PAGE_DESCRIPTION = "Create an empty DPF Text Project.";
	
	private WizardNewProjectCreationPage _pageOne;
	private IConfigurationElement _configurationElement;
	
	public NewProjectWizard() {
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean performFinish() {
	    final String name = _pageOne.getProjectName();
	    URI location = null;
	    if (!_pageOne.useDefaults()) {
	        location = _pageOne.getLocationURI();
	        System.err.println("location: " + location.toString()); //$NON-NLS-1$
	    } // else location == null

	    CustomProjectSupport.createProject(name, location);
	    // Add this
	    BasicNewProjectResourceWizard.updatePerspective(_configurationElement);

	    return true;
	}

	@Override
	public void addPages() {
	    super.addPages();

	    _pageOne = new WizardNewProjectCreationPage(PROJECT_PAGE_NAME);
	    _pageOne.setTitle(PROJECT_PAGE_TITLE);
	    _pageOne.setDescription(PROJECT_PAGE_DESCRIPTION);

	    addPage(_pageOne);
	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
	    _configurationElement = config;
	}
	
}
