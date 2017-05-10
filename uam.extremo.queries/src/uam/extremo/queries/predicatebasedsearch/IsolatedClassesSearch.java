package uam.extremo.queries.predicatebasedsearch;

import semanticmanager.impl.ExtensiblePredicateBasedSearchImpl;

import org.eclipse.emf.common.util.EList;
import semanticmanager.NamedElement;
import semanticmanager.ObjectProperty;
import semanticmanager.Resource;
import semanticmanager.SearchResultOptionValue;
import semanticmanager.SemanticNode;

public class IsolatedClassesSearch extends ExtensiblePredicateBasedSearchImpl {
	@Override
	public boolean matches(NamedElement namedElement, EList<SearchResultOptionValue> inps) {
		if (namedElement instanceof Resource) {
			Resource resource = (Resource) namedElement;
			
			for(SemanticNode semanticNode : resource.getNodes()){
				long count = semanticNode.getProperties().stream().
						filter(p -> p instanceof ObjectProperty).count();
				
				long incommingRefs = incommingReferencesCounter(resource, semanticNode);
				int supers = semanticNode.getSupers().size();
				
				if(count == 0 && incommingRefs == 0 && supers == 0){
					return true;
				}
			}
		}
		
		return false;
	}
	
	private long incommingReferencesCounter(Resource resource, SemanticNode node){
		int counter = 0;
		
		for(SemanticNode semanticNode : resource.getNodes()){
			counter += semanticNode.getProperties().stream().
					filter(p -> p instanceof ObjectProperty && ((ObjectProperty) p).getRange().equals(node)).count();
		}
		
		return counter;
	}
}
