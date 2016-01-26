package metaRDF.core.model;

public interface ISemanticElement{
	String getName();
	void setName(String name);
	
	Object getId();
	void setId(Object id);
	
	String getIdToString();
	
	String getDescription();
	void setDescription(String comment);
}
