package com.hemalpatel.behavioral.chainofresponsibility.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.behavioral.chainofresponsibility.bean.ATM;

public class ChainOfResponsibilityPatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		printTitle();
		
		ATM machine = new ATM();
		
		int amount = 12;
		withdrawMoney(machine, amount);
		

		amount = 110;
		withdrawMoney(machine, amount);
		

		amount = 123;
		withdrawMoney(machine, amount);
		

		amount = 330;
		withdrawMoney(machine, amount);

		
		
		printFooter();
	}

	public void withdrawMoney(ATM machine, int amount) {
		System.out.println("User Entered amount : " + amount);
		if (amount % 10 != 0) {
			System.out.println("Amount should be in multiple of 10s.");
		}
		else {
			machine.dispenseMoney(amount);
		}
		System.out.println("");
	}
	
	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Behavioral Patterns");
		System.out.println("---- Chain Of Responsibility Pattern\n");
	}
	
	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Chain Of Responsibility Pattern --");
		System.out.println("*********************************\n");
	}

}
