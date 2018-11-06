package com.hemalpatel.behavioral.command.bean;

public interface Invoker {

	public  void invoke(Command command);
	public void printHistory();
}
