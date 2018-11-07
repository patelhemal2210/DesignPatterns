package com.hemalpatel.behavioral.state.bean;

public class TvOffState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is set to OFF state");
	}

}
