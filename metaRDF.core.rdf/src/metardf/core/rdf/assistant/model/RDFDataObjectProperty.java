package metardf.core.rdf.assistant.model;

import metaRDF.core.model.ISemanticClass;
import metaRDF.core.model.impl.ObjectProperty;

public class RDFDataObjectProperty extends ObjectProperty {
	private static final long serialVersionUID = -1946425009450890738L;
	RDFDataSemanticClass range;
	
	@Override
	public ISemanticClass getRange() {
		// TODO Auto-generated method stub
		return this.range;
	}

	@Override
	public void setRange(ISemanticClass range) {
		this.range = (RDFDataSemanticClass) range;
	}
}
