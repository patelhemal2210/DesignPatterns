package com.hemalpatel.behavioral.visitor.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.behavioral.visitor.bean.Car;
import com.hemalpatel.behavioral.visitor.bean.CarComponent;
import com.hemalpatel.behavioral.visitor.bean.CarComponentCleanupVisitor;
import com.hemalpatel.behavioral.visitor.bean.CarComponentRunVisitor;

public class VisitorPatternExecutor implements BaseExecutor {

	@Override
	public void run() {
		printTitle();
		
		CarComponent car = new Car();
		
		System.out.println("Clean up the car for race : ---");
		car.accept(new CarComponentCleanupVisitor());
		System.out.println("");
		System.out.println("Lets get ready for race : ---");
		car.accept(new CarComponentRunVisitor());
		System.out.println("");
		printFooter();
	}

	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Behavioral Patterns");
		System.out.println("---- Visitor Pattern\n");
	}
	
	public void printFooter() {
		System.out.println("\n-- END OF Visitor Pattern --");
		System.out.println("*********************************\n");
	}

}
