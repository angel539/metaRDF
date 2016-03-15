package metardf.ui.views.properties.entitytab;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import metardf.ui.views.entities.model.SemanticElementPropertySource;
import metardf.ui.views.entities.model.TreeObject;

public class NameSection extends AbstractPropertySection {
	TreeObject entityParent = null;
	private Text nameText;
	
	private ModifyListener listener = new ModifyListener() {
	    
        public void modifyText(ModifyEvent arg0) {
            SemanticElementPropertySource properties = (SemanticElementPropertySource) entityParent
                .getAdapter(IPropertySource.class);
            properties.setPropertyValue(SemanticElementPropertySource.PROPERTY_NAME,
                nameText.getText());
        }
    };
	
	public void createControls(Composite parent,
            TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);
        Composite composite = getWidgetFactory()
            .createFlatFormComposite(parent);
        FormData data;

        nameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(200, 0);
        data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
        nameText.setLayoutData(data);
        nameText.addModifyListener(listener);

        CLabel nameLabel = getWidgetFactory()
            .createCLabel(composite, "Name:"); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(nameText,
            -ITabbedPropertyConstants.HSPACE);
        data.top = new FormAttachment(nameText, 0, SWT.CENTER);
        nameLabel.setLayoutData(data);
    }
	
	public void setInput(IWorkbenchPart part, ISelection selection) {
		Object input = null;
        if(selection instanceof IStructuredSelection){
        	input = ((IStructuredSelection) selection).getFirstElement();
        }
        
        if((input != null) && (input instanceof TreeObject)){
        	this.entityParent = (TreeObject) input;
        }
    }

	public void refresh() {
        nameText.removeModifyListener(listener);
        
        SemanticElementPropertySource properties = (SemanticElementPropertySource) entityParent
            .getAdapter(IPropertySource.class);
        
        nameText.setText(properties.stringName);
        nameText.addModifyListener(listener);
    }
}