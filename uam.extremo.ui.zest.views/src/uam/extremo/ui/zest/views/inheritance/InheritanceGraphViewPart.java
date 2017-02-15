package uam.extremo.ui.zest.views.inheritance;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.viewers.AbstractZoomableViewer;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IZoomableWorkbenchPart;
import org.eclipse.zest.core.viewers.ZoomContributionViewItem;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.GridLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import semanticmanager.NamedElement;
import uam.extremo.extensions.AssistantFactory;
import uam.extremo.ui.zest.views.Activator;
import uam.extremo.ui.zest.views.GraphViewPartFilter;

public class InheritanceGraphViewPart extends ViewPart implements IZoomableWorkbenchPart{
	public static final String ID = "uam.extremo.ui.zest.views.InheritanceGraphViewPart";
	
	private Action springLayoutAction;
	private Action treeLayoutAction;
	private Action radialLayoutAction;
	private Action gridLayoutAction;
	
	private GraphViewer viewer;
	private Graph graph;
		
	@Override
	public void createPartControl(Composite parent) {
		viewer = new GraphViewer(parent, SWT.BORDER);
		
		InheritanceGraphViewPartNodeContentProvider provider = new InheritanceGraphViewPartNodeContentProvider();
		viewer.setContentProvider(provider);
	    viewer.setLabelProvider(new InheritanceGraphPartViewLabelProvider());
	    viewer.setInput(getViewSite());
	    
	    GraphViewPartFilter filter = new GraphViewPartFilter();
		ViewerFilter[] filters = {filter};
		viewer.setFilters(filters);
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "extremo.ui.viewer");
		
		//connection with properties view
		getSite().setSelectionProvider(viewer);
		getViewSite().setSelectionProvider(viewer);
	    
	    setLayoutManager(3);
	    makeActions();
	    hookContextMenu();
	    contributeToActionBars();
	    invokeFilters();
	    
	    fillToolBar();
	    
	    /*EAdapterList adapter = new EAdapter() {
            public void notifyChanged(Notification notification) {
           		 super.notifyChanged(notification);
           		 refresh();
            }
    	};
    	
    	AssistantFactory.getInstance().getRepositoryManager().eAdapters().add(adapter);*/
	}
	
	public void refresh() {
		Job job = new Job("Refreshing Inheritance Graph View") {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                doLongThing();
                syncWithUi();
                return Status.OK_STATUS;
            }
	    };
	    job.setUser(true);
	    job.schedule();
	}
	
	private void syncWithUi() {
        try {
        	Thread.sleep(1000);
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
	}

	private void doLongThing() {
		Display.getDefault().asyncExec(new Runnable() {
            public void run() {
            	NamedElement drawnElement = AssistantFactory.getInstance().getDrawnElement();
            	
            	if(drawnElement != null){
            		viewer.setInput(drawnElement);
            	}
            	
            	/*RepositoryManager repositoryManager = AssistantFactory.getInstance().getRepositoryManager();
            	
            	TreeIterator<EObject> iterator = repositoryManager.eAllContents();
        		EObject input = null;
            	
        		iteratorLoop:
        		while(iterator.hasNext()){
        			EObject eobject = iterator.next();
        			
        			if(eobject instanceof NamedElement && ((NamedElement) eobject).isDrawn()){
        				input = eobject;
        				break iteratorLoop;
        			}
        		}
        		
        		if(input != null){
        			viewer.setInput(input);
        		}*/
            }
		});
	}

	private void invokeFilters() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(Activator.FILTER_EXTENSIONS_ID);
		
		for(IConfigurationElement extension : extensions){
			if(extension.getName().compareTo("filter")==0){
				ViewerFilter filter;
				try{
					filter = (ViewerFilter) extension.createExecutableExtension("class");
					
					if((filter != null)){
						Action extensionFilterAction = new Action() {
							public void run() {
								ViewerFilter[] filters = {filter};
								viewer.setFilters(filters);
								viewer.refresh();
							}
						};
						
						extensionFilterAction.setText(extension.getAttribute("name"));
						extensionFilterAction.setToolTipText(extension.getAttribute("description"));
						
						String namespace = extension.getDeclaringExtension().getNamespaceIdentifier();
						ImageDescriptor descriptor = null;
						while((descriptor == null) && (!namespace.isEmpty())){
							descriptor = Activator.getImageDescriptor(namespace, extension.getAttribute("icon"));
							
							if(descriptor == null){
								if(namespace.contains(".")){
									namespace = namespace.substring(0, namespace.lastIndexOf("."));
								}
								else{
									namespace = "";
								}
							}
						}
						
						if(descriptor != null) extensionFilterAction.setImageDescriptor(descriptor);
						
						IActionBars bars = getViewSite().getActionBars();
						bars.getMenuManager().add(extensionFilterAction);
					}
				}
				catch(CoreException e){
				}
			}	
		}
	}
	
	
	public void setLayoutManager(int layout) {
		switch (layout) {
			case 1:
				viewer.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
				viewer.applyLayout();
			break;
			
			case 2:
				viewer.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
				viewer.applyLayout();
			break;
			
			case 3:
				viewer.setLayoutAlgorithm(new RadialLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
				viewer.applyLayout();
			break;
			
			case 4:
				viewer.setLayoutAlgorithm(new GridLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
				viewer.applyLayout();
			break;
		}
	}
	
	@Override
	public void setFocus() {
	}
	
	private void contributeToActionBars() {
		ZoomContributionViewItem toolbarZoomContributionViewItem = new ZoomContributionViewItem(this);		
		IActionBars bars = getViewSite().getActionBars();
		fillContextMenu(bars.getMenuManager());
		
	    bars.getMenuManager().add(toolbarZoomContributionViewItem);
	}
	
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				InheritanceGraphViewPart.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}
	
	private void fillContextMenu(IMenuManager manager) {
		manager.add(springLayoutAction);
		manager.add(treeLayoutAction);
		manager.add(radialLayoutAction);
		manager.add(gridLayoutAction);
	}
	
	private void makeActions() {		
		springLayoutAction = new Action() {
			public void run() {
				setLayoutManager(1);
			}
		};
		
		springLayoutAction.setText("Spring Layout");
		springLayoutAction.setToolTipText("");
		springLayoutAction.setImageDescriptor(Activator.getImageDescriptor("icons/leaf_dist.png"));
		
		treeLayoutAction = new Action() {
			public void run() {
				setLayoutManager(2);
			}
		};
		
		treeLayoutAction.setText("Tree Layout");
		treeLayoutAction.setToolTipText("");
		treeLayoutAction.setImageDescriptor(Activator.getImageDescriptor("icons/tree_dist.png"));
		
		
		radialLayoutAction = new Action() {
			public void run() {
				setLayoutManager(3);
			}
		};
		
		radialLayoutAction.setText("Radial Layout");
		radialLayoutAction.setToolTipText("");
		radialLayoutAction.setImageDescriptor(Activator.getImageDescriptor("icons/radio_dist.png"));
		
		
		gridLayoutAction = new Action() {
			public void run() {
				setLayoutManager(4);
			}
		};
		
		gridLayoutAction.setText("Grid Layout");
		gridLayoutAction.setToolTipText("");
		gridLayoutAction.setImageDescriptor(Activator.getImageDescriptor("icons/grid_dist.png"));
		
	}

	public Graph getGraph() {
		return graph;
	}

	public void setGraph(Graph graph) {
		this.graph = graph;
	}

	@Override
	public AbstractZoomableViewer getZoomableViewer() {
		return viewer;
	}
	
	private void fillToolBar() {
        ZoomContributionViewItem toolbarZoomContributionViewItem = new ZoomContributionViewItem(this);
        IActionBars bars = getViewSite().getActionBars();
        bars.getMenuManager().add(toolbarZoomContributionViewItem);
	}
}
