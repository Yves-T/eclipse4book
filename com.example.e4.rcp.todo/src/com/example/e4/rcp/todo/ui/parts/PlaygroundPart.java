package com.example.e4.rcp.todo.ui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class PlaygroundPart {

	// Declare a field label, required for @Focus
	Label label;
	
	@PostConstruct
	public void createControls(Composite parent) {
		label = new Label(parent,SWT.NONE);
		label.setText("Hello");
	}
	
	@PreDestroy
	public void dispose(){
		
	}
	
	@Focus
	private void setFocus() {
		label.setFocus();
	}
}
