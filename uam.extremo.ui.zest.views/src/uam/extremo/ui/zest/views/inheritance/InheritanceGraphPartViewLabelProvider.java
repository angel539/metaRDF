package uam.extremo.ui.zest.views.inheritance;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import uam.extremo.ui.zest.views.Activator;

import semanticmanager.*;

public class InheritanceGraphPartViewLabelProvider implements ILabelProvider, IColorProvider/*, IFigureProvider*/{
    public Color BLACK = new Color(Display.getDefault(), 0, 0, 0);
    public Color WHITE = new Color(Display.getDefault(), 255, 255, 255);
    public Color YELLOW = new Color(Display.getDefault(), 225, 204, 79);
    public Color BLUE = new Color(Display.getDefault(), 0, 102, 204);
    public Color GREEN = new Color(Display.getDefault(), 0, 153, 0);
    
	@Override
	public String getText(Object element) {
		if(element instanceof IStructuredSelection) element = ((IStructuredSelection) element).getFirstElement();
		
		StringBuilder builder = new StringBuilder();
		
		if (element instanceof Repository) {
		      Repository repository = (Repository) element;
		      return repository.getName();
		}
		
		if (element instanceof Resource) {
		      Resource resource = (Resource) element;
		      return resource.getName();
		}
		
		if (element instanceof SemanticNode) {
		      SemanticNode semanticNode = (SemanticNode) element;
		      return semanticNode.getName();
		}
		
		if (element instanceof DataProperty) {
			  DataProperty dataProperty = (DataProperty) element;
		      return dataProperty.getName();
		}
		
		if (element instanceof EntityConnectionData) {
			EntityConnectionData conn = (EntityConnectionData) element;
		      if (conn.source instanceof SemanticNode)
		         builder.append("inherits");
		      else
		         builder.append("");
		}
		
		return builder.toString();
	}
	
	@Override
	public Image getImage(Object element) {
		if(element instanceof IStructuredSelection) element = ((IStructuredSelection) element).getFirstElement();
		
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		
		if(element instanceof Repository) return Activator.getImageDescriptor("icons/repo.png").createImage();
    	
		if(element instanceof Resource){
			Resource resource = (Resource) element;
			
			if((resource.getDescriptors() == null) || (resource.getDescriptors().isEmpty())){
				return Activator.getImageDescriptor("icons/descriptor.png").createImage();
			}
			else{
				if(((Resource) element).isAlive()) return Activator.getImageDescriptor("icons/description_on.png").createImage();
        		else{
        			return Activator.getImageDescriptor("icons/description.png").createImage();
        		}
			}
    	}
		
		if(element instanceof SemanticNode){
			SemanticNode semanticNode = (SemanticNode) element;
			
			if((semanticNode.getDescriptors() == null) || (semanticNode.getDescriptors().isEmpty())){
				return Activator.getImageDescriptor("icons/class_obj.png").createImage();
			}
			else{
        		return Activator.getImageDescriptor("icons/object.png").createImage();
			}
    	}
		
		if(element instanceof Constraint) return Activator.getImageDescriptor("icons/constraint.png").createImage();
		
		if(element instanceof ObjectProperty) return Activator.getImageDescriptor("icons/det_pane_right.png").createImage();
		if(element instanceof DataProperty) return Activator.getImageDescriptor("icons/attribute.png").createImage();
    	
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}
	
	@Override
	public Color getForeground(Object element) {
		return ColorConstants.black;
	}

	@Override
	public Color getBackground(Object element) {
		return YELLOW;
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub	
	}
}
