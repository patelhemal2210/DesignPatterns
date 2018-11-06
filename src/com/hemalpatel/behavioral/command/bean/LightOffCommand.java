package com.hemalpatel.behavioral.command.bean;

public class LightOffCommand implements Command {

	private String name = "Light Off Command";
	private Receiver receiver;
	
	public LightOffCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.turnOff();
	}
	
	@Override
	public String getName() {
		return name;
	}

}
