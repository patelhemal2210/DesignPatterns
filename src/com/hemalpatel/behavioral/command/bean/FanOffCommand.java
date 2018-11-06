package com.hemalpatel.behavioral.command.bean;

public class FanOffCommand implements Command{

	private String name = "Fan Off Command";
	private Receiver receiver;
		
	public FanOffCommand(Receiver receiver) {
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
