package org.startup.training.observer;

import org.startup.training.subject.Subject;

public interface Observer {
	void update(Subject subject);
	String getState();
}
