/*******************************************************************************
 * Copyright (c) 2018 Universidad Autónoma de Madrid (Spain).
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 3.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-3.0
 *
 * Contributors:
 * 				Ángel Mora Segura - implementation
 ******************************************************************************/
package uam.extremo.ui.views.constraints;

import org.eclipse.jface.viewers.Viewer;

import org.eclipse.jface.viewers.ViewerFilter;

import semanticmanager.*;
import semanticmanager.Constraint;
import semanticmanager.ConstraintInterpreter;
import semanticmanager.ConstraintResult;
import semanticmanager.DataProperty;
import semanticmanager.ObjectProperty;
import semanticmanager.Property;
import semanticmanager.RepositoryManager;
import semanticmanager.Resource;
import semanticmanager.SemanticNode;

public class ConstraintValidationViewFilter extends ViewerFilter {
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return element instanceof RepositoryManager
				|| element instanceof ConstraintInterpreter
				|| element instanceof ConstraintResult
				|| element instanceof Constraint
				|| element instanceof Resource
				|| element instanceof SemanticNode 
				|| element instanceof Property
				|| element instanceof ObjectProperty
				|| element instanceof DataProperty;
	}
}
