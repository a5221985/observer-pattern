package org.startup.training;

import org.startup.training.observer.Observer;
import org.startup.training.observer.impl.ConcreteObserver;
import org.startup.training.subject.Subject;
import org.startup.training.subject.impl.ConcreteSubject;

public class App {

	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer observerOne = new ConcreteObserver();
		Observer observerTwo = new ConcreteObserver();

		subject.attach(observerOne);
		subject.attach(observerTwo);

		subject.setState("Subhanallah");

		System.out.println(observerOne.getState());
		System.out.println(observerTwo.getState());
		
		subject.setState("Alhamdulillah");

		System.out.println(observerOne.getState());
		System.out.println(observerTwo.getState());

		subject.setState("La ilaha illa ALLAH");

		System.out.println(observerOne.getState());
		System.out.println(observerTwo.getState());
		
		subject.setState("ALLAHu Akbar");

		System.out.println(observerOne.getState());
		System.out.println(observerTwo.getState());
	}

}
