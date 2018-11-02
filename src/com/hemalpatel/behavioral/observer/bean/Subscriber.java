package com.hemalpatel.behavioral.observer.bean;

public class Subscriber implements Observer{

	private Subject subject;
	private String name;
	
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	public Subscriber(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
	}
	
	@Override
	public void update() {
		String message = subject.getUpdate();
		System.out.println(name + " received : " + message);
	}

	@Override
	public void setSubject(Subject sub) {
		this.subject = sub;
	}

}
