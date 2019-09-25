/**
 */
package semanticmanager.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import semanticmanager.util.SemanticmanagerAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticmanagerItemProviderAdapterFactory extends SemanticmanagerAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticmanagerItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.RepositoryManager} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryManagerItemProvider repositoryManagerItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.RepositoryManager}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryManagerAdapter() {
		if (repositoryManagerItemProvider == null) {
			repositoryManagerItemProvider = new RepositoryManagerItemProvider(this);
		}

		return repositoryManagerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.Constraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintItemProvider constraintItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this);
		}

		return constraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.ConstraintResult} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintResultItemProvider constraintResultItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.ConstraintResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintResultAdapter() {
		if (constraintResultItemProvider == null) {
			constraintResultItemProvider = new ConstraintResultItemProvider(this);
		}

		return constraintResultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.CompositeSearchConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSearchConfigurationItemProvider compositeSearchConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.CompositeSearchConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeSearchConfigurationAdapter() {
		if (compositeSearchConfigurationItemProvider == null) {
			compositeSearchConfigurationItemProvider = new CompositeSearchConfigurationItemProvider(this);
		}

		return compositeSearchConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.AtomicSearchResult} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicSearchResultItemProvider atomicSearchResultItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.AtomicSearchResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomicSearchResultAdapter() {
		if (atomicSearchResultItemProvider == null) {
			atomicSearchResultItemProvider = new AtomicSearchResultItemProvider(this);
		}

		return atomicSearchResultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.GroupedSearchResult} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupedSearchResultItemProvider groupedSearchResultItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.GroupedSearchResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupedSearchResultAdapter() {
		if (groupedSearchResultItemProvider == null) {
			groupedSearchResultItemProvider = new GroupedSearchResultItemProvider(this);
		}

		return groupedSearchResultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.SemanticGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticGroupItemProvider semanticGroupItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.SemanticGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSemanticGroupAdapter() {
		if (semanticGroupItemProvider == null) {
			semanticGroupItemProvider = new SemanticGroupItemProvider(this);
		}

		return semanticGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.Repository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryItemProvider repositoryItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryAdapter() {
		if (repositoryItemProvider == null) {
			repositoryItemProvider = new RepositoryItemProvider(this);
		}

		return repositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceItemProvider resourceItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAdapter() {
		if (resourceItemProvider == null) {
			resourceItemProvider = new ResourceItemProvider(this);
		}

		return resourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.SemanticNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticNodeItemProvider semanticNodeItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.SemanticNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSemanticNodeAdapter() {
		if (semanticNodeItemProvider == null) {
			semanticNodeItemProvider = new SemanticNodeItemProvider(this);
		}

		return semanticNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.ObjectProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectPropertyItemProvider objectPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.ObjectProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectPropertyAdapter() {
		if (objectPropertyItemProvider == null) {
			objectPropertyItemProvider = new ObjectPropertyItemProvider(this);
		}

		return objectPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.DataProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyItemProvider dataPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataPropertyAdapter() {
		if (dataPropertyItemProvider == null) {
			dataPropertyItemProvider = new DataPropertyItemProvider(this);
		}

		return dataPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.MetaData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaDataItemProvider metaDataItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.MetaData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetaDataAdapter() {
		if (metaDataItemProvider == null) {
			metaDataItemProvider = new MetaDataItemProvider(this);
		}

		return metaDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.PrimitiveTypeParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeParamItemProvider primitiveTypeParamItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.PrimitiveTypeParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveTypeParamAdapter() {
		if (primitiveTypeParamItemProvider == null) {
			primitiveTypeParamItemProvider = new PrimitiveTypeParamItemProvider(this);
		}

		return primitiveTypeParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.ModelTypeParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeParamItemProvider modelTypeParamItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.ModelTypeParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelTypeParamAdapter() {
		if (modelTypeParamItemProvider == null) {
			modelTypeParamItemProvider = new ModelTypeParamItemProvider(this);
		}

		return modelTypeParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.ModelTypeParamValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeParamValueItemProvider modelTypeParamValueItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.ModelTypeParamValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelTypeParamValueAdapter() {
		if (modelTypeParamValueItemProvider == null) {
			modelTypeParamValueItemProvider = new ModelTypeParamValueItemProvider(this);
		}

		return modelTypeParamValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link semanticmanager.PrimitiveTypeParamValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeParamValueItemProvider primitiveTypeParamValueItemProvider;

	/**
	 * This creates an adapter for a {@link semanticmanager.PrimitiveTypeParamValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveTypeParamValueAdapter() {
		if (primitiveTypeParamValueItemProvider == null) {
			primitiveTypeParamValueItemProvider = new PrimitiveTypeParamValueItemProvider(this);
		}

		return primitiveTypeParamValueItemProvider;
	}
	
	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}
	
	/**
	 * This keeps track of the one adapter used for all {@link uam.extremo.core.ConstraintInterpreter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ConstraintInterpreterItemProvider constraintInterpreterItemProvider;

	/**
	 * This creates an adapter for a {@link uam.extremo.core.ConstraintInterpreter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Adapter createConstraintInterpreterAdapter() {
		if (constraintInterpreterItemProvider == null) {
			constraintInterpreterItemProvider = new ConstraintInterpreterItemProvider(this);
		}

		return constraintInterpreterItemProvider;
	}
	
	/**
	 * This keeps track of the one adapter used for all {@link uam.extremo.core.CustomSearch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected CustomSearchItemProvider customSearchItemProvider;

	/**
	 * This creates an adapter for a {@link uam.extremo.core.CustomSearch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Adapter createCustomSearchAdapter() {
		if (customSearchItemProvider == null) {
			customSearchItemProvider = new CustomSearchItemProvider(this);
		}

		return customSearchItemProvider;
	}
	
	/**
	 * This keeps track of the one adapter used for all {@link uam.extremo.core.CustomSearch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PredicateBasedSearchItemProvider predicateBasedSearchItemProvider;

	/**
	 * This creates an adapter for a {@link uam.extremo.core.CustomSearch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Adapter createPredicateBasedSearchAdapter() {
		if (predicateBasedSearchItemProvider == null) {
			predicateBasedSearchItemProvider = new PredicateBasedSearchItemProvider(this);
		}

		return predicateBasedSearchItemProvider;
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void dispose() {
		if (repositoryManagerItemProvider != null) repositoryManagerItemProvider.dispose();
		if (constraintItemProvider != null) constraintItemProvider.dispose();
		if (constraintInterpreterItemProvider != null) constraintInterpreterItemProvider.dispose();
		if (constraintResultItemProvider != null) constraintResultItemProvider.dispose();
		if (compositeSearchConfigurationItemProvider != null) compositeSearchConfigurationItemProvider.dispose();
		if (atomicSearchResultItemProvider != null) atomicSearchResultItemProvider.dispose();
		if (groupedSearchResultItemProvider != null) groupedSearchResultItemProvider.dispose();
		if (semanticGroupItemProvider != null) semanticGroupItemProvider.dispose();
		if (repositoryItemProvider != null) repositoryItemProvider.dispose();
		if (resourceItemProvider != null) resourceItemProvider.dispose();
		if (semanticNodeItemProvider != null) semanticNodeItemProvider.dispose();
		if (objectPropertyItemProvider != null) objectPropertyItemProvider.dispose();
		if (dataPropertyItemProvider != null) dataPropertyItemProvider.dispose();
		if (metaDataItemProvider != null) metaDataItemProvider.dispose();
		if (primitiveTypeParamItemProvider != null) primitiveTypeParamItemProvider.dispose();
		if (modelTypeParamItemProvider != null) modelTypeParamItemProvider.dispose();
		if (modelTypeParamValueItemProvider != null) modelTypeParamValueItemProvider.dispose();
		if (primitiveTypeParamValueItemProvider != null) primitiveTypeParamValueItemProvider.dispose();
		if (customSearchItemProvider != null) customSearchItemProvider.dispose();
		if (predicateBasedSearchItemProvider != null) predicateBasedSearchItemProvider.dispose();
	}

}
