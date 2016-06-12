package metardf.ui.views.repositories.model;

import metaRDF.core.model.IResource;

public class ResourceTreeObject extends TreeObject{
	IResource resource;

	public ResourceTreeObject(IResource resource) {
		super(resource.getName());
		this.resource = resource;
	}
	
	public IResource getResource() {
		return resource;
	}

	public void setResource(IResource resource) {
		this.resource = resource;
	}
	
	public boolean isAlive(){
		return this.resource.isAlive();
	}
	
	public void changed(){
		setName(resource.getName());
	}
}