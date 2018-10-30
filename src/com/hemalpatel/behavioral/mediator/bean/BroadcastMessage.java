package com.hemalpatel.behavioral.mediator.bean;

public class BroadcastMessage implements Message {

	@Override
	public MessageType getMessageType() {
		return Message.MessageType.BROADCAST;
	}
	
	private User sender;
	private User receiver;
	private String message;

	public BroadcastMessage(User sender, User receiver, String message) {
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
	}
	@Override
	public User getSender() {
		return this.sender;
	}

	@Override
	public User getReceiver() {
		return this.receiver;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
	}
	
}
