package com.hemalpatel.behavioral.command.bean;

public class FanReceiver implements Receiver{

	@Override
	public void turnOn() {
		System.out.println("Fan is turned ON");
	}

	@Override
	public void turnOff() {
		System.out.println("Fan is turned OFF");
	}

}
