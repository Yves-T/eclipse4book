package com.example.e4.rcp.todo.ui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class TodoDeletionPart {

	@PostConstruct
	public void createControls(Composite parent) {
		ComboViewer viewer = new ComboViewer(parent, SWT.DROP_DOWN| SWT.READ_ONLY);
	}

	@PreDestroy
	public void dispose() {

	}

}
