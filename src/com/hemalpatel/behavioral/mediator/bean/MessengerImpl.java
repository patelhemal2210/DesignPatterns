package com.hemalpatel.behavioral.mediator.bean;

public class MessengerImpl implements Messenger{

	public void sendMessage(Message msg) {
		msg.getReceiver().notifyUser(msg.getMessage());
	}
	
	public void generateMessage(Message msg) {
		msg.setMessage(msg.getSender().notifyUser(""));
	}
}
