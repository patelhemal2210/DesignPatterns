package com.hemalpatel.behavioral.state.bean;

public interface Context {
	public State getState();
	public void setState(State state);
	
	public default void doAction() {
		getState().doAction();
	}
}
