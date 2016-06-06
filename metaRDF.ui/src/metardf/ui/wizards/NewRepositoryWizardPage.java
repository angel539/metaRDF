package metardf.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import metardf.ui.Activator;

public class NewRepositoryWizardPage extends WizardPage {
	private Text name;
	private Text description;
	private Text path;
	private Composite container;
	
	public NewRepositoryWizardPage(String pageName, String pageDescription) {
		super(pageName);
		setTitle(pageName);
		setDescription(pageDescription);
		setImageDescriptor(Activator.getImageDescriptor("icons/folder.png"));
	}

	@Override
	public void createControl(Composite parent) {		
		container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 2;
	    
	    Label nameLabel = new Label(container, SWT.NONE);
	    nameLabel.setText("Name");
	    
	    name = new Text(container, SWT.BORDER | SWT.SINGLE);
	    name.setText("");
	    name.addKeyListener(new KeyListener() {
		      @Override
		      public void keyPressed(KeyEvent e) {
		      }
	
		      @Override
		      public void keyReleased(KeyEvent e) {
		    	  if ((!name.getText().isEmpty())) {
			          setPageComplete(true);
			        }
		      }
	    });
	    
	    Label descriptionLabel = new Label(container, SWT.NONE);
	    descriptionLabel.setText("Description");
	    
	    description = new Text(container, SWT.BORDER | SWT.SINGLE);
	    description.setText("");
	    description.addKeyListener(new KeyListener() {
		      @Override
		      public void keyPressed(KeyEvent e) {
		      }
	
		      @Override
		      public void keyReleased(KeyEvent e) {
		    	  if ((!description.getText().isEmpty())) {
			          setPageComplete(true);
			        }
		      }
	    });
	    
	    Button folderDialog = new Button(container, SWT.PUSH);
	    folderDialog.setText("Path or IRI");
	    folderDialog.addSelectionListener(new SelectionAdapter() {
	    	  @Override
	    	  public void widgetSelected(SelectionEvent e) {
	    		  DirectoryDialog pathSelection = new DirectoryDialog(getShell());
	    		  String pathString = pathSelection.open();
	    		  path.setText(pathString);
	    	  }
	    	}); 


	    path = new Text(container, SWT.BORDER | SWT.SINGLE);
	    path.setText("");
	    path.addKeyListener(new KeyListener() {
		      @Override
		      public void keyPressed(KeyEvent e) {
		      }
	
		      @Override
		      public void keyReleased(KeyEvent e) {
		    	  if ((!path.getText().isEmpty())) {
			          setPageComplete(true);
			        }
		      }
	    });
	    
	    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	    name.setLayoutData(gd);
	    description.setLayoutData(gd);
	    path.setLayoutData(gd);
	    setControl(container);
	    setPageComplete(false);
	}
	
	public String getRepositoryName() {
		 return name.getText();
	 }
	
	public String getRepositoryDescription() {
		 return description.getText();
	 }
	
	 public String getRepositoryUri() {
		 return path.getText();
	 }
}
