package uam.extremo.queries.predicatebasedsearch.types;

import org.eclipse.emf.common.util.EList;

import semanticmanager.ModelTypeParamValue;
import semanticmanager.NamedElement;
import semanticmanager.SearchParamValue;
import semanticmanager.SemanticNode;
import semanticmanager.impl.ExtensiblePredicateBasedSearchImpl;

public class SemanticNodeIsKindOf extends ExtensiblePredicateBasedSearchImpl {
	NamedElement descriptor = null;
	
	@Override
	public void init(EList<SearchParamValue> inputs) {
		ModelTypeParamValue modelTypeOption = (ModelTypeParamValue) getOptionValue("descriptor", inputs);
		descriptor = modelTypeOption.getValue();
	}
	
	@Override
	public boolean matches(NamedElement namedElement) {
		if((descriptor != null) 
					&& (descriptor instanceof SemanticNode)){
			return preorder((SemanticNode) namedElement, (SemanticNode) descriptor);
		}
		
		return false;
	}
	
	public synchronized boolean preorder(SemanticNode node, SemanticNode nodeToCompare){
        return preorderHelper(node, nodeToCompare);
    }
	
    private boolean preorderHelper(SemanticNode node, SemanticNode nodeToCompare){
        if(node == null)
            return false;
	
		if(node.equals(nodeToCompare)) return true;
        
        	for(NamedElement descriptor : node.getDescriptors()){
        		if(descriptor instanceof SemanticNode){
        			return preorderHelper((SemanticNode) descriptor, nodeToCompare);
        		}
        }
    
    		return false;
    }
}
