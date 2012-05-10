package com.example.e4.rcp.todo.ui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class TodoDetailsPart {
	private String value;
	private Text text;

	@PostConstruct
	public void createControls(Composite parent) {
		text = new Text(parent, SWT.BORDER);
		updateUserInter();
	}

	@PreDestroy
	public void dispose() {
		
	}
	
	@Inject 
	public void setName(@Named(IServiceConstants.ACTIVE_SELECTION)@Optional String s) {
		System.out.println("Selection " + s);
		value = s;
		updateUserInter();
	}

	private void updateUserInter() {
		if (text!=null & value != null) {
			text.setText(value);
		}
	
	}
}
