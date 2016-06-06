package metardf.ui.views.entities.model;

import org.eclipse.ui.views.properties.IPropertySource;

public class DataPropertyObject extends TreeObject {
	public DataPropertyObject(Object object){
		super(object);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter == IPropertySource.class)
			return new SemanticElementPropertySource(this);
		return null;
	}
}
