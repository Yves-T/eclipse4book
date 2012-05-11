package com.example.e4.rcp.todo.contribute.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class OpenMapHandler {

	@Execute
	public void run(Shell shell) {
		MessageDialog.openInformation(shell, "Just testing",
				"This is just a test");
	}
}
