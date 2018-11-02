package com.hemalpatel.behavioral.observer.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.behavioral.observer.bean.NewsTopic;
import com.hemalpatel.behavioral.observer.bean.Observer;
import com.hemalpatel.behavioral.observer.bean.Subject;
import com.hemalpatel.behavioral.observer.bean.Subscriber;

public class ObserverPatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		printTitle();
		
		Subject topic = new NewsTopic();
		
		Observer observer1 = new Subscriber("John", topic);
		Observer observer2 = new Subscriber("Johnny", topic);
		Observer observer3 = new Subscriber("Jordon");
		Observer observer4 = new Subscriber("Mick");
		
		observer3.setSubject(topic);
		observer4.setSubject(topic);
		
		topic.register(observer1);
		topic.register(observer2);
		topic.register(observer3);
		topic.register(observer4);
		
		topic.notifyObservers();
		System.out.println("");
		topic.setMessageAndNotify("Breaking News");
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Behavioral Patterns");
		System.out.println("---- Observer Pattern\n");
		
	}

	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Observer Pattern --");
		System.out.println("*********************************\n");
		
	}

}
