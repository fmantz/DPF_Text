package no.hib.dpf.text.ui.wizard;


/**
 * New DPF Text File Creation Wizard 
 */
public class NewFileCreationWizard extends CustomProjectNewFile {

    private static final String WIZARD_NAME = "New DPF Text Artifact";
    
    public NewFileCreationWizard() {
        super(WIZARD_NAME);
    }

    @Override
    public void addPages() {
        super.addPages();
        _pageOne = new NewFileCreationPage(_selection);
        addPage(_pageOne);
    }

}
