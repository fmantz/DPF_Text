package no.hib.dpf.text.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * DPF Text Project Nature
 * A DPF Text Project is simply a general Eclipse project
 */
public class ProjectNature implements IProjectNature {

    final static String NATURE_ID = "no.hib.dpf.text.ui.projectNature";
 
    @Override
    public void configure() throws CoreException {
    }

    @Override
    public void deconfigure() throws CoreException {
    }

    @Override
    public IProject getProject() {
    	return null;
    }

    @Override
    public void setProject(IProject project) {
    }

}
