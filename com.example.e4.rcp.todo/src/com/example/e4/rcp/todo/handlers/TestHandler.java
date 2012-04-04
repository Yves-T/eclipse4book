package com.example.e4.rcp.todo.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.menu.MItem;

public class TestHandler {
	@Execute
	public void execute(MItem item) {
		System.out.println(item.getElementId());
	}

	@CanExecute
	public boolean canExecute() {
		return true;
	}

}