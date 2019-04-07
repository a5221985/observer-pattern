package org.startup.training.subject;

import org.startup.training.observer.Observer;

public interface Subject {
	void attach(Observer observer);
	void detach(Observer observer);
	void notifyObservers();
	String getState();
	void setState(String state);
}
