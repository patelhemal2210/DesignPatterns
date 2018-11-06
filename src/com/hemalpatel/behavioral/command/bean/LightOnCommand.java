package com.hemalpatel.behavioral.command.bean;

public class LightOnCommand implements Command{

	private String name = "Light On Command";
	private Receiver receiver;
		
	public LightOnCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.turnOn();
	}
	
	@Override
	public String getName() {
		return name;
	}

}
