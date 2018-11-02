package com.hemalpatel.behavioral.observer.bean;

public interface Observer {
	public void update();
	
	public void setSubject(Subject sub);
}
