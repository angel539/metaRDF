package uam.extremo.search.metrics;

import semanticmanager.impl.ExtensibleCustomSearchImpl;
import semanticmanager.SearchResult;

public class InRefsOverloadedSearch extends ExtensibleCustomSearchImpl {	
	@Override
	public void search(SearchResult search) {
		/*int maxRefs = (int) search.getOptionValue("maxrefs");
		
		SemanticGroup semanticGroup = search.createSemanticGroup("no_class_in_refs_overloaded", "No class is referred from too many others.");
	
		for(Resource resource : search.getResources()){
			if(resource.isActive()){
				
				for(SemanticNode semanticNode : resource.getNodes()){
					long counter = 0;
					
					for(SemanticNode pointer : resource.getNodes()){
						counter += semanticNode.getProperties().stream().
													filter(p -> p instanceof ObjectProperty && Objects.equals(((ObjectProperty) p).getRange(), pointer)).
													count();
					}
					
					if(maxRefs <= counter){
						search.addSemanticNodeToSemanticGroup(semanticGroup, semanticNode);
					}
				}
			}
		}*/
	}

}
