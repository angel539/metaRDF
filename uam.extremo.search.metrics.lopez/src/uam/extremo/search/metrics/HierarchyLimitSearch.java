package uam.extremo.search.metrics;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.MessageDialog;

import semanticmanager.Resource;
import semanticmanager.SearchResult;
import semanticmanager.SearchResultOptionStringValue;
import semanticmanager.SearchResultOptionValue;
import semanticmanager.SemanticGroup;
import semanticmanager.SemanticNode;
import semanticmanager.impl.SearchConfigurationImpl;

public class HierarchyLimitSearch extends SearchConfigurationImpl {
	int maxDepth;
	
	@Override
	public void resolveOptions(EList<SearchResultOptionValue> values) {
		for(SearchResultOptionValue value : values){
			if (value instanceof SearchResultOptionStringValue) {
				SearchResultOptionStringValue stringValue = (SearchResultOptionStringValue) value;
				
				try{
					switch(stringValue.getOption().getId()){
						case "maxdepth":
							maxDepth = Integer.getInteger(stringValue.getValue());
							break;
							
						default:
							break;
					}
				}
				catch(Exception e){
					MessageDialog.openError(null, "Option Validation", "Options couldn't be validated for the search: " + e.getMessage());
				}
			}
			
		}
	}
	
	@Override
	public void search(SearchResult search) {
		SemanticGroup semanticGroup = search.createSemanticGroup("no_class_too_deep", "No hierarchy is too deep.");
	
		for(Resource resource : search.getResources()){
			if(resource.isActive()){
				
				for(SemanticNode semanticNode : resource.getNodes()){
					int depthcount = depth(semanticNode);
					
					if(maxDepth > depthcount){
						search.addSemanticNodeToSemanticGroup(semanticGroup, semanticNode);
					}
				}
			}
		}
	}
	
	private int depth(SemanticNode node){
		if (node.getSupers() == null) {
			return 1;
		}
		else {
			Optional optionalInteger = node.getSupers().stream().collect(
					Collectors.maxBy(
						new Comparator<SemanticNode>() {
							public int compare(SemanticNode node1, SemanticNode node2) {
								int depth1 = (depth(node1) + 1);
								int depth2 = (depth(node2) + 1);
								
								if(depth1 > depth2) 
									return depth1;
								else 
									return depth2;
							}
						}
					)
			);
			
			Integer resultInteger = optionalInteger.isPresent() ? (int) optionalInteger.get() : 0;
			
			return resultInteger;
		}
	}	
}
