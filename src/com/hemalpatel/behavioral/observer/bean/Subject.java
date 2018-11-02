package com.hemalpatel.behavioral.observer.bean;

public interface Subject {
	
	public void register(Observer observer);
	public void unregister(Observer observer);
	
	public void notifyObservers();
	
	public void setMessageAndNotify(String msg);
	
	public String getUpdate();
}
