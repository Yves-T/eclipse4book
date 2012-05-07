package com.example.e4.rcp.todo.ui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class TodoOverviewPart {

	@PostConstruct
	public void createControls(Composite parent) {
		RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
		parent.setLayout(rowLayout);
		Button button = new Button(parent, SWT.PUSH);
		button.setText("Load Data");
		final Label label = new Label(parent, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				label.setText("Number of Todo items: 7");
			}
		});
		RowData data = new RowData();
		data.width=200;
		label.setLayoutData(data);
	}

	@PreDestroy
	public void dispose() {

	}

}
