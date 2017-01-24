package uam.extremo.search.metrics;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.MessageDialog;

import semanticmanager.DataProperty;
import semanticmanager.Resource;
import semanticmanager.SearchResult;
import semanticmanager.SearchResultOptionStringValue;
import semanticmanager.SearchResultOptionValue;
import semanticmanager.SemanticGroup;
import semanticmanager.SemanticNode;
import semanticmanager.impl.SearchConfigurationImpl;

public class TooManyAttrsSearch extends SearchConfigurationImpl {
	int morethanattrs; 
	
	@Override
	public void resolveOptions(EList<SearchResultOptionValue> values) {
		for(SearchResultOptionValue value : values){
			if (value instanceof SearchResultOptionStringValue) {
				SearchResultOptionStringValue stringValue = (SearchResultOptionStringValue) value;
				
				try{
					switch(stringValue.getOption().getId()){
						case "morethanattrs":
							morethanattrs = Integer.getInteger(stringValue.getValue());
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
		SemanticGroup semanticGroup = search.createSemanticGroup("class_with_more_than_a_number_attrs", "A class with more than a number of attributes");

		for(Resource resource : search.getResources()){
			if(resource.isActive()){
				for(SemanticNode semanticNode : resource.getNodes()){
					long count = semanticNode.getProperties().stream().
							filter(p -> p instanceof DataProperty).count();
					
					if(count > morethanattrs){
						search.addSemanticNodeToSemanticGroup(semanticGroup, semanticNode);
					}
				}
			}
		}
	}
}
