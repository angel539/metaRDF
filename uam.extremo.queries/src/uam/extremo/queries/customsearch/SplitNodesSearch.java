package uam.extremo.queries.customsearch;

import uam.extremo.core.GroupedSearchResult;
import uam.extremo.core.NamedElement;
import uam.extremo.core.Resource;
import uam.extremo.core.ResourceElement;
import uam.extremo.core.SearchResult;
import uam.extremo.core.SemanticGroup;
import uam.extremo.core.SemanticNode;
import uam.extremo.core.SemanticmanagerFactory;
import uam.extremo.core.impl.ExtensibleCustomSearchImpl;

import java.util.ArrayList;
import java.util.List;

public class SplitNodesSearch extends ExtensibleCustomSearchImpl {
	@Override
	public void search(SearchResult result) {
		if (result instanceof GroupedSearchResult) {
			GroupedSearchResult groupedSearchResult = (GroupedSearchResult) result;
			Object option = groupedSearchResult.getOptionValue("resource");
			if(option instanceof Resource){
				Resource resource = (Resource) option;
				for(NamedElement namedElement : groupedSearchResult.getApplyOnElements()){
					if (namedElement instanceof Resource && namedElement.equals(resource)) {
						preorder(groupedSearchResult, (Resource) namedElement);
					}
				}
			}
		}	
	}
	
	public List<NamedElement> getAllSubs(NamedElement node){
		List<NamedElement> nonvisited = new ArrayList<NamedElement>();
		List<NamedElement> subs = new ArrayList<NamedElement>();
			
		nonvisited.addAll(node.getSubs());
			
		while(!nonvisited.isEmpty()){
			NamedElement sn = nonvisited.get(0);
			
			if(!subs.contains(sn)){
				subs.add(sn);
				nonvisited.addAll(sn.getSubs());
			}
			nonvisited.remove(sn);
		}
			
		return subs;
	}
	
	public synchronized void preorder(GroupedSearchResult result, Resource resource){
        preorderHelper(result, resource);
    }
     
    private void preorderHelper(GroupedSearchResult result, ResourceElement node)
    {
        if(node == null)
            return;
        
        if(node instanceof SemanticNode){
        	SemanticNode semanticNode = (SemanticNode) node;
			if(semanticNode.getSupers() == null || semanticNode.getSupers().size() == 0){
				if((semanticNode.getSubs() != null) && (semanticNode.getSubs().size() > 0)){
					SemanticGroup group = SemanticmanagerFactory.eINSTANCE.createSemanticGroup();
					group.getElements().addAll(getAllSubs(semanticNode));
					result.getGroups().add(group);
				}
			}
        }
        
        if(node instanceof Resource){
        	for(ResourceElement resourceElement : ((Resource) node).getResourceElements())
        		preorderHelper(result, resourceElement);
        }
    }

}
