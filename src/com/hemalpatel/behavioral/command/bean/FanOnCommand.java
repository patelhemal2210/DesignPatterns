package com.hemalpatel.behavioral.command.bean;

public class FanOnCommand implements Command{

	private String name = "Fan On Command";
	private Receiver receiver;
	
	public FanOnCommand(Receiver receiver) {
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
