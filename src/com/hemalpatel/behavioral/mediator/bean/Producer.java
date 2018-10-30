package com.hemalpatel.behavioral.mediator.bean;

public class Producer implements User{

	private String name = "Producer";
	
	public String getName() {
		return name;
	}
	
	public Producer(String name) {
		this.name = name;
	}
	
	@Override
	public String notifyUser(String message) {
		return getName() + " sent message";
	}

}
