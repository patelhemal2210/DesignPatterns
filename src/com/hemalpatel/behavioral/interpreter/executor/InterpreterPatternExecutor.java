package com.hemalpatel.behavioral.interpreter.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.behavioral.interpreter.bean.Interpreter;
import com.hemalpatel.behavioral.interpreter.bean.ToBinanryExpression;
import com.hemalpatel.behavioral.interpreter.bean.ToHexExpression;

public class InterpreterPatternExecutor implements BaseExecutor {

	@Override
	public void run() {
		printTitle();
		
		interpret("10 to Binary");
		interpret("12 to Hex");
		
		interpret("16 to BINARY");
		interpret("27 to HEX");
		
		interpret("34 to Octane");
		
		printFooter();
	}
	
	
	// 10 to Binary
	// 12 to Hex
	private void interpret(String input) {
		int number = 0;
		Interpreter ip = new Interpreter();
		if(input.toLowerCase().contains("binary")) {
			number = Integer.parseInt(input.substring(0, input.indexOf(" ")));
			
			ToBinanryExpression binary = new ToBinanryExpression(number);
			String output = binary.interpret(ip);
			System.out.println(input + " : " + output);
			
		}
		else if(input.toLowerCase().contains("hex")) {
			number = Integer.parseInt(input.substring(0, input.indexOf(" ")));
			
			ToHexExpression hex = new ToHexExpression(number);
			String output = hex.interpret(ip);
			System.out.println(input + " : " + output);
		}
		else {
			System.out.println("Wrong format of input : " + input);
		}
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Behavioral Patterns");
		System.out.println("---- Interpreter Pattern\n");
	}
	
	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Interpreter Pattern --");
		System.out.println("*********************************\n");
	}

}
