package com.hemalpatel.behavioral.state.bean;

public class TvOnState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is set to ON state");
	}

}
