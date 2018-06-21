package uam.extremo.ui.wizards.dialogs.link;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.spi.RegistryContributor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import semanticmanager.AtomicSearchResult;
import semanticmanager.CompositeSearchConfiguration;
import semanticmanager.CustomSearch;
import semanticmanager.DataProperty;
import semanticmanager.ExtendedSemanticmanagerFactory;
import semanticmanager.ModelTypeParam;
import semanticmanager.ModelTypeParamValue;
import semanticmanager.NamedElement;
import semanticmanager.ObjectProperty;
import semanticmanager.PredicateBasedSearch;
import semanticmanager.PrimitiveTypeParam;
import semanticmanager.PrimitiveTypeParamValue;
import semanticmanager.Resource;
import semanticmanager.SearchConfiguration;
import semanticmanager.SearchParam;
import semanticmanager.SearchResult;
import semanticmanager.SemanticNode;
import semanticmanager.Service;
import semanticmanager.SimpleSearchConfiguration;
import uam.extremo.extensions.AssistantFactory;

public class LinkWizardDialog extends Wizard{
	public static final String SEARCH_EXTENSIONS_ID = "extremo.core.extensions.search";	
	
	LinkSearchConfigurationSelectorWizardPage searchPage = null;
	
	List<SimpleSearchConfiguration> searchConfigurations;
	List<Service> services;
	
	SearchResult searchResult;
	
	CompositeSearchConfiguration compositeSearchConfiguration;
	
	public LinkWizardDialog(CompositeSearchConfiguration compositeSearchConfiguration){
		super();
		setNeedsProgressMonitor(true);
		this.compositeSearchConfiguration = compositeSearchConfiguration;
		this.searchConfigurations = AssistantFactory.getInstance().getSearches()
											.stream().filter(ssc -> ssc instanceof SimpleSearchConfiguration)
										    .map (ssc -> (SimpleSearchConfiguration) ssc)
										    .collect(Collectors.toList());
		this.services = AssistantFactory.getInstance().getServices();		
		searchPage = new LinkSearchConfigurationSelectorWizardPage("Search", "Select a search configuration from the query catalogue", searchConfigurations, services);
	}
	
	@Override
	public String getWindowTitle() {
	    return "Searching...";
	}
	
	public void addPages(){
		addPage(searchPage);
	}
	
	@Override
	public boolean performFinish() {
		SimpleSearchConfiguration searchConfigurationSelected = searchPage.getSearchConfigurationSelected();
		
		if (searchConfigurationSelected instanceof PredicateBasedSearch) {
			PredicateBasedSearch predicateBasedSearch = (PredicateBasedSearch) searchConfigurationSelected;
			searchResult = ExtendedSemanticmanagerFactory.eINSTANCE.createAtomicSearchResult();
			searchResult.setConfiguration(predicateBasedSearch);
		}
		else{
			// Custom Search
			CustomSearch customSearch = (CustomSearch) searchConfigurationSelected;
			
			if(customSearch.isGrouped()){
				searchResult = ExtendedSemanticmanagerFactory.eINSTANCE.createGroupedSearchResult();
				searchResult.setConfiguration(customSearch);
			}
			else{
				searchResult = ExtendedSemanticmanagerFactory.eINSTANCE.createAtomicSearchResult();
				searchResult.setConfiguration(customSearch);
			}
		}
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					Map<SearchParam, Object> searchOptionStringValues = searchPage.getValues();
					Map<SearchParam, Service> searchOptionServiceCalling = searchPage.getServiceCalls();
					
					for(java.util.Map.Entry<SearchParam, Object> entry : searchOptionStringValues.entrySet()){
						if (entry.getKey() instanceof PrimitiveTypeParam) {
							PrimitiveTypeParam primitiveTypeSearchOption = (PrimitiveTypeParam) entry.getKey();
							
							PrimitiveTypeParamValue primitiveTypeSearchResultOptionValue = ExtendedSemanticmanagerFactory.eINSTANCE.createPrimitiveTypeParamValue();
							primitiveTypeSearchResultOptionValue.setOption(primitiveTypeSearchOption);
							primitiveTypeSearchResultOptionValue.setValue(entry.getValue().toString());
							
							Service service = searchOptionServiceCalling.get(entry.getKey());
							primitiveTypeSearchResultOptionValue.setCalls(service);
							
							searchResult.getValues().add(primitiveTypeSearchResultOptionValue);
						}
						
						if (entry.getKey() instanceof ModelTypeParam) {
							ModelTypeParam dataModelTypeSearchOption = (ModelTypeParam) entry.getKey();
							
							ModelTypeParamValue dataModelTypeSearchResultOptionValue = ExtendedSemanticmanagerFactory.eINSTANCE.createModelTypeParamValue();
							dataModelTypeSearchResultOptionValue.setOption(dataModelTypeSearchOption);
							dataModelTypeSearchResultOptionValue.setValue((NamedElement) entry.getValue());
							searchResult.getValues().add(dataModelTypeSearchResultOptionValue);
						}
					}
					
					doFinish(monitor, searchResult, searchConfigurationSelected);									
				}
				finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		}
		catch (InterruptedException e) {
			return false;
		}
		catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		
		return true;
	}
	
	public void doFinish(IProgressMonitor monitor, 
			SearchResult searchResult, 
			SearchConfiguration searchConfigurationSelected){
		
		if (searchConfigurationSelected instanceof CustomSearch) {
			CustomSearch customSearch = (CustomSearch) searchConfigurationSelected;
			CustomSearch customSearchBundle = callCustomSearchExtension(customSearch.getId());
			
			composeApplyOnElementsList(customSearch.getFilterBy().getLiteral(), searchResult);
			customSearchBundle.search(searchResult);
			
			compositeSearchConfiguration.getResults().add(searchResult);
		}
			
		if (searchConfigurationSelected instanceof PredicateBasedSearch) {
			PredicateBasedSearch predicateBasedSearch = (PredicateBasedSearch) searchConfigurationSelected;
			
			if (searchResult instanceof AtomicSearchResult) {
				AtomicSearchResult atomicSearchResult = (AtomicSearchResult) searchResult;
				PredicateBasedSearch predicateBasedSearchBundle = callPredicateBasedSearchExtension(predicateBasedSearch.getId());
				
				composeApplyOnElementsList(predicateBasedSearch.getFilterBy().getLiteral(), searchResult);
				predicateBasedSearchBundle.init(atomicSearchResult.getValues());
				
				for(NamedElement namedElement : atomicSearchResult.getApplyOnElements()){
					boolean matches = predicateBasedSearchBundle.matches(namedElement);
					
					if(matches){
						atomicSearchResult.getElements().add(namedElement);
					}
				}
				
				compositeSearchConfiguration.getResults().add(atomicSearchResult);
			}	
		}
	}
	
	private void composeApplyOnElementsList(String filterBy, SearchResult searchResult){		
		AssistantFactory.getInstance().getRepositoryManager().eAllContents().forEachRemaining(
	    		element -> {
	    			if(element instanceof NamedElement){
	    				NamedElement namedElement = (NamedElement) element;
	    				
    					if((filterBy.compareTo("Resource") == 0) && namedElement instanceof Resource){
    						searchResult.getApplyOnElements().add(namedElement);
    					}
    					
    					if((filterBy.compareTo("SemanticNode") == 0) && namedElement instanceof SemanticNode){
    						searchResult.getApplyOnElements().add(namedElement);
    					}
    					
    					if((filterBy.compareTo("DataProperty") == 0) && namedElement instanceof DataProperty){
    						searchResult.getApplyOnElements().add(namedElement);
    					}
    					
    					if((filterBy.compareTo("ObjectProperty") == 0) && namedElement instanceof ObjectProperty){
    						searchResult.getApplyOnElements().add(namedElement);
    					}
	    			}
	    		}
		    );
	}
	
	private PredicateBasedSearch callPredicateBasedSearchExtension(String idPredicateBasedSearch){
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(SEARCH_EXTENSIONS_ID);
		
		for(IConfigurationElement extension : extensions){
			Bundle bundle = null;
			IContributor contributor = extension.getContributor();
			
			if (contributor instanceof RegistryContributor) {
				long id = Long.parseLong(((RegistryContributor) contributor).getActualId());
				Bundle thisBundle = FrameworkUtil.getBundle(getClass());
				bundle = thisBundle.getBundleContext().getBundle(id);
			}
			else {
				bundle = Platform.getBundle(contributor.getName());          
			}
			
            if (extension.getAttribute("id").equals(idPredicateBasedSearch)) {
            	Object o;
				try {
					o = extension.createExecutableExtension("class");
					if (o instanceof PredicateBasedSearch) {
	                    PredicateBasedSearch predicateBasedSearch = (PredicateBasedSearch) o;
	                    return predicateBasedSearch;
	                }
				} catch (CoreException e) {
					return null;
				}
            }
		}
		
		return null;
	}
	
	private CustomSearch callCustomSearchExtension(String idCustomSearch){
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(SEARCH_EXTENSIONS_ID);
		
		for(IConfigurationElement extension : extensions){
			Bundle bundle = null;
			IContributor contributor = extension.getContributor();
			
			if (contributor instanceof RegistryContributor) {
				long id = Long.parseLong(((RegistryContributor) contributor).getActualId());
				Bundle thisBundle = FrameworkUtil.getBundle(getClass());
				bundle = thisBundle.getBundleContext().getBundle(id);
			}
			else {
				bundle = Platform.getBundle(contributor.getName());          
			}
			
            if (extension.getAttribute("id").equals(idCustomSearch)) {
            	Object o;
				try {
					o = extension.createExecutableExtension("class");
					if (o instanceof CustomSearch) {
	                    CustomSearch customSearch = (CustomSearch) o;
	                    return customSearch;
	                }
				} catch (CoreException e) {
					return null;
				}
            }
		}
		
		return null;
	}
}