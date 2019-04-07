package org.startup.training.subject.impl;

import java.util.ArrayList;
import java.util.List;

import org.startup.training.observer.Observer;
import org.startup.training.subject.Subject;

public class ConcreteSubject implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private String state;
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.stream().forEach(observer -> observer.update(this));
	}

	@Override
	public String getState() {
		return state;
	}
	
	@Override
	public void setState(String state) {
		this.state = state;
		notifyObservers();
	}
}
