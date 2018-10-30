package com.hemalpatel.behavioral.mediator.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.behavioral.mediator.bean.Consumer;
import com.hemalpatel.behavioral.mediator.bean.IndividualMessage;
import com.hemalpatel.behavioral.mediator.bean.Message;
import com.hemalpatel.behavioral.mediator.bean.Messenger;
import com.hemalpatel.behavioral.mediator.bean.MessengerImpl;
import com.hemalpatel.behavioral.mediator.bean.Producer;
import com.hemalpatel.behavioral.mediator.bean.User;

public class MediatorPatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		printTitle();
		
		Messenger messanger = new MessengerImpl();
		
		User john = new Producer("John");
		User johnny = new Consumer("Johnny");
		
		Message msg = new IndividualMessage(john, johnny);
		messanger.generateMessage(msg);
		System.out.println("Message Details ---");
		msg.printMessageDetails();
		System.out.println("\nMessage Received ---");
		messanger.sendMessage(msg);
		
		printFooter();
		
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Behavioral Patterns");
		System.out.println("---- Mediator Pattern\n");
	}
	
	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Mediator Pattern --");
		System.out.println("*********************************\n");
	}

}
