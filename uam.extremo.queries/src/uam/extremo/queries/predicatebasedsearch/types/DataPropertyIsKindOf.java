package uam.extremo.queries.predicatebasedsearch.types;

import org.eclipse.emf.common.util.EList;

import semanticmanager.DataProperty;
import semanticmanager.ModelTypeParamValue;
import semanticmanager.NamedElement;
import semanticmanager.SearchParamValue;
import semanticmanager.impl.ExtensiblePredicateBasedSearchImpl;

public class DataPropertyIsKindOf extends ExtensiblePredicateBasedSearchImpl {
	NamedElement descriptor = null;
	
	@Override
	public void init(EList<SearchParamValue> inputs) {
		ModelTypeParamValue modelTypeOption = (ModelTypeParamValue) getOptionValue("descriptor", inputs);
		descriptor = modelTypeOption.getValue();
	}
	
	@Override
	public boolean matches(NamedElement namedElement) {
		if((descriptor != null) 
					&& (descriptor instanceof DataProperty)){
			return preorder((DataProperty) namedElement, (DataProperty) descriptor);
		}
		
		return false;
	}
	
	public synchronized boolean preorder(DataProperty node, DataProperty nodeToCompare){
        return preorderHelper(node, nodeToCompare);
    }
	
    private boolean preorderHelper(DataProperty node, DataProperty nodeToCompare){
        if(node == null)
            return false;
	
		if(node.equals(nodeToCompare)) return true;
        
        	for(NamedElement descriptor : node.getDescriptors()){
        		if(descriptor instanceof DataProperty){
        			return preorderHelper((DataProperty) descriptor, nodeToCompare);
        		}
        }
    
    		return false;
    }
}
