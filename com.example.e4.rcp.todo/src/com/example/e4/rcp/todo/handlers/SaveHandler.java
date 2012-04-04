package com.example.e4.rcp.todo.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;

public class SaveHandler {
	@Execute
	public void execute(MHandledItem item) {
		MCommand command = item.getCommand();
		System.out.println(command.getElementId());
	}

	@CanExecute
	public boolean canExecute() {
		return true;
	}

}