
package semanticmanager.queries;

import semanticmanager.dataModel.DataProperty;
import semanticmanager.dataModel.NamedElement;
import semanticmanager.dataModel.ObjectProperty;
import semanticmanager.dataModel.Resource;
import semanticmanager.dataModel.SemanticNode;

public interface ExtensibleGroupedSearchResult extends GroupedSearchResult {
	SemanticGroup createSemanticGroup(String name, String description);
	void addSemanticNodeToSemanticGroup(SemanticGroup semanticGroup, SemanticNode semanticNode);
	void addDataPropertyToSemanticGroup(SemanticGroup semanticGroup, DataProperty dataProperty);
	void addObjectPropertyToSemanticGroup(SemanticGroup semanticGroup, ObjectProperty objectProperty);
	Object getOptionValue(String key);
	void addNamedElementToSemanticGroup(SemanticGroup semanticGroup, NamedElement namedElement);
	void addResourceToSemanticGroup(SemanticGroup semanticGroup, Resource resource);
	
	SearchConfiguration getConfiguration();
	void setConfiguration(SearchConfiguration value);
}
