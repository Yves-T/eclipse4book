package com.example.e4.rcp.todo.ui.parts;

import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;

public class PlaygroundPart {
	@Inject
	public void setEventBrooker(IEventBroker eventBrooker) {
		System.out.println("Setting the EventBroker");
		System.out.println(eventBrooker.toString());
	}

}
