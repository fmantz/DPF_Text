/**
 * Coder beware: this code is not warranted to do anything.
 *
 * Copyright Oct 31, 2009 Carlos Valcarcel
 */
package no.hib.dpf.text.ui.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;

/**
 * Wizard for creating customs projects. Taken from some eclipse example.
 */
public abstract class CustomProjectNewFile extends Wizard implements INewWizard {

    protected WizardNewFileCreationPage _pageOne;
    private IWorkbench _workbench;
    protected IStructuredSelection _selection;

    public CustomProjectNewFile() {
        super();
    }

    public CustomProjectNewFile(String wizardName) {
        setWindowTitle(wizardName);
    }

    @Override
    public boolean performFinish() {
        boolean result = false;
        
        IFile file = _pageOne.createNewFile();
        result = file != null;
    
        if (result) {
            try {
                IDE.openEditor(_workbench.getActiveWorkbenchWindow().getActivePage(), file);
            } catch (PartInitException e) {
                e.printStackTrace();
            }
        } // else no file created...result == false
        
        return result;
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        _workbench = workbench;
        _selection = selection;
    }

}
