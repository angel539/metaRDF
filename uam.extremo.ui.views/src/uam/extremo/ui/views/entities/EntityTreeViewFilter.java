package uam.extremo.ui.views.entities;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import semanticmanager.DataProperty;
import semanticmanager.ObjectProperty;
import semanticmanager.Property;
import semanticmanager.Repository;
import semanticmanager.RepositoryManager;
import semanticmanager.Resource;
import semanticmanager.Search;
import semanticmanager.SemanticGroup;
import semanticmanager.SemanticNode;

public class EntityTreeViewFilter extends ViewerFilter {
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return element instanceof RepositoryManager || 
				element instanceof Search || 
				element instanceof SemanticGroup;
			//	element instanceof Repository ||
			//	element instanceof Resource || 
			//	element instanceof SemanticNode;
			//	element instanceof DataProperty || 
			//	element instanceof ObjectProperty;
	}
}
