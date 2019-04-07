package org.startup.training.observer.impl;

import org.startup.training.observer.Observer;
import org.startup.training.subject.Subject;

public class ConcreteObserver implements Observer {
	private String state;

	@Override
	public void update(Subject subject) {
		state = subject.getState();
	}

	@Override
	public String getState() {
		return state;
	}
	
}
