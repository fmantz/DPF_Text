package no.hib.dpf.text.ui.launcher;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

/**
 * Own tab group in "Run as" configurations
 */
public class DPFTextLauncherTabGroup extends AbstractLaunchConfigurationTabGroup{

    public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
        		new DPFTextLauncherTab(),
    			new CommonTab(),
        };
        setTabs(tabs);
     }
	 	
}
