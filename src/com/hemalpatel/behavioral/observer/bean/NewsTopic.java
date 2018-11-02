package com.hemalpatel.behavioral.observer.bean;

import java.util.ArrayList;
import java.util.List;

public class NewsTopic implements Subject {

	private List<Observer> observers;
	private String message;
	private boolean isNewUpdate = false;
	private final Object MUTEX= new Object();
	
	public NewsTopic() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer observer) {
		
		if(observer == null) {
			throw new NullPointerException("Observer can not be null");
		}
		
		synchronized (MUTEX) {
		if(!observers.contains(observer))
			observers.add(observer);
		}
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		
		List<Observer> tempList;
		if(isNewUpdate) {
			
			synchronized (MUTEX) {
				tempList = new ArrayList<>(observers);
			}
		
			for(Observer o : tempList) {
				o.update();
			}
			isNewUpdate = false;
		}
		else {
			System.out.println("No updates yet. Please check later.");
		}
	}

	@Override
	public void setMessageAndNotify(String msg) {
		System.out.println("NewsTopic Message : " + msg);
		this.message = msg;
		isNewUpdate = true;
		notifyObservers();
	}

	@Override
	public String getUpdate() {
		return this.message;
		
	}

}
