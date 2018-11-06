package com.hemalpatel.behavioral.command.bean;

import java.util.ArrayList;
import java.util.List;

public class FanInvoker implements Invoker{

private List<Command> history;
	
	public FanInvoker() {
		history = new ArrayList<>();
	}
	
	@Override
	public void invoke(Command command) {
		history.add(command);
		command.execute();
	}
	
	@Override
	public void printHistory() {
		for(Command c : history) {
			System.out.println(c.getName());
		}
	}
}
