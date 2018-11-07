package com.hemalpatel.behavioral.state.bean;

public class TvContext implements Context{

	private State state;
	
	
	public TvContext(State state) {
		super();
		setState(state);
	}

	@Override
	public State getState() {
		return state;
	}

	@Override
	public void setState(State state) {
		this.state = state;
	}

}
