package com.hemalpatel.behavioral.command.bean;

public class LightReceiver implements Receiver{

	@Override
	public void turnOn() {
		System.out.println("Light is turned ON");
	}

	@Override
	public void turnOff() {
		System.out.println("Light is turned OFF");
	}

}
