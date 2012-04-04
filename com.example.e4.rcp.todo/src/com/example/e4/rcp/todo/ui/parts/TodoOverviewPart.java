package com.example.e4.rcp.todo.ui.parts;

import javax.inject.Inject;

import org.eclipse.swt.widgets.Composite;

public class TodoOverviewPart {

	@Inject
	public TodoOverviewPart(Composite parent) {
		if (parent != null) {
			// Print the layout to the console
			System.out.println("Got Composite via DI.");
			System.out.println("Layout: " + parent.getLayout().getClass());
		} else {
			System.out.println("No Composite available.");
		}
	}
}
