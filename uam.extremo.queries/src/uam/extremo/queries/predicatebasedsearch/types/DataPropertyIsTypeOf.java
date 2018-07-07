package uam.extremo.queries.predicatebasedsearch.types;

import org.eclipse.emf.common.util.EList;

import uam.extremo.core.DataProperty;
import uam.extremo.core.ModelTypeParamValue;
import uam.extremo.core.NamedElement;
import uam.extremo.core.SearchParamValue;
import uam.extremo.core.impl.ExtensiblePredicateBasedSearchImpl;

public class DataPropertyIsTypeOf extends ExtensiblePredicateBasedSearchImpl {
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
			for (NamedElement d : namedElement.getDescriptors()) {
				if(d.equals(descriptor)) return true;
			}
		}
		
		return false;
	}
}
