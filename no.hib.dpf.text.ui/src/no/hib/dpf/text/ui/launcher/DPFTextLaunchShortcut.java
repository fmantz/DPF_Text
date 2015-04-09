package no.hib.dpf.text.ui.launcher;

import java.util.ArrayList;
import java.util.List;

import no.hib.dpf.text.DPFConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;

/**
 * Own shortcut to directly run a "_Batch.tdpf" file in "Run as"
 */
public class DPFTextLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		final IFile file = getFile(selection);
		ILaunchConfiguration config = findLaunchConfiguration(file, getConfigurationType());
		if (config == null) {
			config = createConfiguration(file);
		}
		try {
			config.launch(mode, null);			
		} catch (Exception e) {
			//do nothing
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		final IFile file = getFile(editor);
		ILaunchConfiguration config = findLaunchConfiguration(file, getConfigurationType());
		if (config == null) {
			config = createConfiguration(file);
		}		
		try {
			config.launch(mode, null);
		} catch (Exception e) {
			//do nothing
		}
	}
	
	/**
	 * Finds and returns an <b>existing</b> configuration to re-launch for the given type,
	 * or <code>null</code> if there is no existing configuration.
	 * 
	 * @return a configuration to use for launching the given type or <code>null</code> if none
	 */
	protected ILaunchConfiguration findLaunchConfiguration(IFile file, ILaunchConfigurationType configType) {
		List<ILaunchConfiguration> candidateConfigs = new ArrayList<ILaunchConfiguration>();
		try {
			ILaunchConfiguration[] configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(configType);
			candidateConfigs = new ArrayList<ILaunchConfiguration>(configs.length);
			for (int i = 0; i < configs.length; i++) {
				ILaunchConfiguration config = configs[i];
				if (config.getAttribute(DPFConstants.LAUNCH_FILE, "").equals(file.getFullPath().toPortableString())) { //$NON-NLS-1$
					candidateConfigs.add(config);
				}
			}
		} catch (CoreException e) {
			//do nothing!
		}
		int candidateCount = candidateConfigs.size();
		if (0 < candidateCount) {
			return (ILaunchConfiguration) candidateConfigs.get(0);
		}
		return null;
	}
	
    protected ILaunchConfiguration createConfiguration(IFile file) {
       ILaunchConfiguration config = null;
        try {
            ILaunchConfigurationType configType = getConfigurationType();
            ILaunchConfigurationWorkingCopy wc = configType.newInstance(null, DebugPlugin.getDefault().getLaunchManager().generateLaunchConfigurationName(file.getName())); 
            wc.setAttribute(DPFConstants.LAUNCH_FILE, file.getFullPath().toPortableString());
            config = wc.doSave();           
        } catch (CoreException ce) {
        	//do nothing
        }
        return config;
    }

    protected ILaunchConfigurationType getConfigurationType() {
            ILaunchManager lm= DebugPlugin.getDefault().getLaunchManager();
            return lm.getLaunchConfigurationType("no.hib.dpf.text.Launcher.ID");         
    }

    /**
     * Get selected file from the projects navigator
     * @param selection
     * @return
     */
	private IFile getFile(ISelection selection) {
		try {
			if(selection instanceof StructuredSelection){
				final StructuredSelection ss = (StructuredSelection)selection;
				if(ss.getFirstElement() instanceof IFile){
					final IFile f = (IFile)ss.getFirstElement();
				    if(f.getName().endsWith(DPFConstants.LAUNCH_FILE_ENDING)){
				    	return f;
				    }else{
				    	return null;
				    }
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

    /**
     * Get the file directly from the editor
     * @param selection
     * @return
     */
	private IFile getFile(IEditorPart editorpart) {
		try {
			final IFile f = (IFile)editorpart.getAdapter(IFile.class);			
		    if(f.getName().endsWith(DPFConstants.LAUNCH_FILE_ENDING)){
		    	return f;
		    }else{
		    	return null;
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
