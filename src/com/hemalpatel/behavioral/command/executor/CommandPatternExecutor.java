package com.hemalpatel.behavioral.command.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.behavioral.command.bean.Command;
import com.hemalpatel.behavioral.command.bean.FanInvoker;
import com.hemalpatel.behavioral.command.bean.FanOffCommand;
import com.hemalpatel.behavioral.command.bean.FanOnCommand;
import com.hemalpatel.behavioral.command.bean.FanReceiver;
import com.hemalpatel.behavioral.command.bean.Invoker;
import com.hemalpatel.behavioral.command.bean.LightInvoker;
import com.hemalpatel.behavioral.command.bean.LightOffCommand;
import com.hemalpatel.behavioral.command.bean.LightOnCommand;
import com.hemalpatel.behavioral.command.bean.LightReceiver;
import com.hemalpatel.behavioral.command.bean.Receiver;

public class CommandPatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		printTitle();
		
		// Generate receiver
		Receiver fan = new FanReceiver();
		
		// Generate Command
		Command fanOn = new FanOnCommand(fan);
		Command fanOff = new FanOffCommand(fan);
		
		// Generate Ivoker
		Invoker fanInvoker = new FanInvoker();
		fanInvoker.invoke(fanOn);
		fanInvoker.invoke(fanOff);
		
		System.out.println("Fan command History : -  ");
		fanInvoker.printHistory();
		
		System.out.println("-------------------------");
		// Generate receiver
		Receiver light = new LightReceiver();
		
		// Generate Command
		Command lightOn = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);
		
		// Generate Ivoker
		Invoker lightInvoker = new LightInvoker();
		lightInvoker.invoke(lightOn);
		lightInvoker.invoke(lightOff);
		
		System.out.println("Light command History : ");
		lightInvoker.printHistory();
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Behavioral Patterns");
		System.out.println("---- Command Pattern\n");
		
	}

	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Command Pattern --");
		System.out.println("*********************************\n");
		
	}

}
