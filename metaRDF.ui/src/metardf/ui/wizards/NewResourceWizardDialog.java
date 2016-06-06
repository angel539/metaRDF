package metardf.ui.wizards;

import org.eclipse.jface.wizard.Wizard;

import metaRDF.core.model.IRepository;

public class NewResourceWizardDialog extends Wizard {
	NewResourceWizardPage resourcePage;
	IRepository repository;
	
	public NewResourceWizardDialog(IRepository repository) {
		super();
		setNeedsProgressMonitor(true);
		this.repository = repository;
	}
	
	@Override
	public String getWindowTitle() {
	    return "New Semantic Repository";
	}
	
	public void addPages(){	
		resourcePage = new NewResourceWizardPage("New Resource", "Create one resource link");	
		addPage(resourcePage);			
	}

	@Override
	public boolean performFinish() {
		repository.createResource(resourcePage.getResourceName(), resourcePage.getResourceDescription(), resourcePage.getResourceUri());
		return true;
	}
}
