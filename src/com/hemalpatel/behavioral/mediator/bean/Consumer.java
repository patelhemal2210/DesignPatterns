package com.hemalpatel.behavioral.mediator.bean;

public class Consumer implements User{

	private String name = "Consumer";
	
	public String getName() {
		return name;
	}
	
	public Consumer(String name) {
		this.name = name;
	}
	
	@Override
	public String notifyUser(String msg) {
		System.out.println("Received Message : " + msg);
		return "";
	}

}
