package com.hemalpatel.behavioral.mediator.bean;

public interface Message {
	
	public enum MessageType {
		BROADCAST,
		INDIVIDUAL
	}
	public MessageType getMessageType();
	public User getSender();
	public User getReceiver();
	public String getMessage();
	void setMessage(String message);
	
	public default void printMessageDetails() {
		System.out.println("Type : " + getMessageType());
		System.out.println("Sender : " + getSender().getName());
		System.out.println("Receiver : " + getReceiver().getName());
		System.out.println("Message  : " + getMessage());
	}
}
