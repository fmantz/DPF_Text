package no.hib.dpf.text.ui.launcher;

import java.util.ArrayList;
import java.util.List;

import no.hib.dpf.text.DPFConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Own tab in "Run as" configurations
 */
public class DPFTextLauncherTab extends AbstractLaunchConfigurationTab{

	//Project UI widgets
	protected Text fileText;
	protected Button fileButton;
	
	@Override
	public void createControl(Composite parent) {
		Composite projComp = createComposite(parent, parent.getFont(), 1, 1, GridData.FILL_BOTH); 
		((GridLayout)projComp.getLayout()).verticalSpacing = 0;
		createProjectEditor(projComp);
		createVerticalSpacer(projComp, 1);
		setControl(projComp);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "Dialog Applet");
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(DPFConstants.LAUNCH_FILE,"");
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(DPFConstants.LAUNCH_FILE,fileText.getText());
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		try {
			final Path path = new Path(launchConfig.getAttribute(DPFConstants.LAUNCH_FILE,""));
		    final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			return (null != file);			
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
	    try {
	    fileText.setText(configuration.getAttribute(DPFConstants.LAUNCH_FILE, ""));
	   } catch(Exception ex) {
	    fileText.setText("");
	   }
	}
	
	@Override
	public String getName() {
		return "DPF-Text";
	}

	/**
	 * Creates the widgets for specifying a main type.
	 * 
	 * @param parent the parent composite
	 */
	protected void createProjectEditor(Composite parent) {
		Group group = createGroup(parent, "DPF-Text", 2, 1, GridData.FILL_HORIZONTAL);
		fileText = createSingleText(group, 1);
		fileButton = createPushButton(group, "Select File", null); 
		fileButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				IWorkbench wb = PlatformUI.getWorkbench();
				IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
				Shell shell = win.getShell();
				List<ViewerFilter> viewerFilters = new ArrayList<ViewerFilter>();
				viewerFilters.add(new ViewerFilter() {					
					@Override
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (!(element instanceof IFile) || isDPFFile(element));
					}					
					private boolean isDPFFile(Object element){
						final IFile f = (IFile)element;
						return f.getName().endsWith(DPFConstants.LAUNCH_FILE_ENDING);
					}
				});
				IFile[] file = WorkspaceResourceDialog.openFileSelection(shell,"DPF-Text", "Select DPF-Text File", false, new Object[0], viewerFilters);
				if(1 == file.length){
					fileText.setText(file[0].getFullPath().toPortableString());
				}
				updateLaunchConfigurationDialog();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		}
		);
	}	

	/**
	 * Creates vertical space in the parent <code>Composite</code>
	 * @param comp the parent to add the vertical space to
	 * @param colSpan the number of line of vertical space to add
	 */
	protected void createVerticalSpacer(Composite comp, int colSpan) {
		DPFTextLauncherTab.myCreateVerticalSpacer(comp, colSpan);
	}	
			
	/**
	 * Creates a vertical spacer for separating components. If applied to a 
	 * <code>GridLayout</code>, this method will automatically span all of the columns of the parent
	 * to make vertical space
	 * 
	 * @param parent the parent composite to add this spacer to
	 * @param numlines the number of vertical lines to make as space
	 * @since 3.3
	 */
	private static void myCreateVerticalSpacer(Composite parent, int numlines) {
		Label lbl = new Label(parent, SWT.NONE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		Layout layout = parent.getLayout();
		if(layout instanceof GridLayout) {
			gd.horizontalSpan = ((GridLayout)parent.getLayout()).numColumns;
		}
		gd.heightHint = numlines;
		lbl.setLayoutData(gd);
	}
	
	/**
	 * Creates a Composite widget
	 * @param parent the parent composite to add this composite to
	 * @param font the font to set on the control
	 * @param columns the number of columns within the composite
	 * @param hspan the horizontal span the composite should take up on the parent
	 * @param fill the style for how this composite should fill into its parent
	 * @return the new group
	 * @since 3.3
	 */
	private static Composite createComposite(Composite parent, Font font, int columns, int hspan, int fill) {
    	Composite g = new Composite(parent, SWT.NONE);
    	g.setLayout(new GridLayout(columns, false));
    	g.setFont(font);
    	GridData gd = new GridData(fill);
		gd.horizontalSpan = hspan;
    	g.setLayoutData(gd);
    	return g;
    }

	/**
	 * Creates a Group widget
	 * @param parent the parent composite to add this group to
	 * @param text the text for the heading of the group
	 * @param columns the number of columns within the group
	 * @param hspan the horizontal span the group should take up on the parent
	 * @param fill the style for how this composite should fill into its parent
	 * @return the new group
	 * @since 3.2
	 * 
	 */
	private static Group createGroup(Composite parent, String text, int columns, int hspan, int fill) {
    	Group g = new Group(parent, SWT.NONE);
    	g.setLayout(new GridLayout(columns, false));
    	g.setText(text);
    	g.setFont(parent.getFont());
    	GridData gd = new GridData(fill);
		gd.horizontalSpan = hspan;
    	g.setLayoutData(gd);
    	return g;
    }
	
	/**
	 * Creates a new text widget 
	 * @param parent the parent composite to add this text widget to
	 * @param hspan the horizontal span to take up on the parent composite
	 * @return the new text widget
	 * @since 3.2
	 * 
	 */
	private static Text createSingleText(Composite parent, int hspan) {
    	Text t = new Text(parent, SWT.SINGLE | SWT.BORDER);
    	t.setFont(parent.getFont());
    	GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    	gd.horizontalSpan = hspan;
    	t.setLayoutData(gd);
    	return t;
    }
	
	@Override
	public String getId() {
		return "no.hib.dpf.text.ui.DPFTextLauncherTab"; 
	}
	
	
}
