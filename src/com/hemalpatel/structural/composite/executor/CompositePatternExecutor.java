package com.hemalpatel.structural.composite.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.structural.composite.beans.Developer;
import com.hemalpatel.structural.composite.beans.Employee;
import com.hemalpatel.structural.composite.beans.Manager;

public class CompositePatternExecutor implements BaseExecutor {

	@Override
	public void run() {
		printTitle();
		
		Employee director = new Manager("Mark", "Director");
		
		Employee generalManager = new Manager("John", "Manager");
		Employee qaManager = new Manager("Alisa", "Manager");
		Employee itManager = new Manager("Brian", "Manager");
		
		director.add(generalManager);
		
		generalManager.add(qaManager);
		generalManager.add(itManager);
		
		Employee qaDeveloper1 = new Developer("Clark", "Developer");
		Employee qaDeveloper2 = new Developer("David", "Developer");
		Employee qaDeveloper3 = new Developer("Frank", "Developer");
		
		qaManager.add(qaDeveloper1);
		qaManager.add(qaDeveloper2);
		qaManager.add(qaDeveloper3);
		
		
		Employee itDeveloper1 = new Developer("Glen", "Developer");
		Employee itDeveloper2 = new Developer("Helin", "Developer");
		Employee itDeveloper3 = new Developer("Lisa", "Developer");
		
		itManager.add(itDeveloper1);
		itManager.add(itDeveloper2);
		itManager.add(itDeveloper3);
		
		director.printSelfAndChild();
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Structural Patterns");
		System.out.println("---- Composite Pattern\n");
	}

	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Composite Pattern --");
		System.out.println("*********************************\n");		
	}
	
}
