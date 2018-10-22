package com.hemalpatel.proxy.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.proxy.FileReaderProxy;

public class ProxyPatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		printTitle();
		
		FileReaderProxy reader = new FileReaderProxy("hemal", "word");
		try {
			reader.readFile("regular.txt");
			reader.readFile("imp-data.txt");
		} catch (Exception e) {
			System.out.println("Exception -- "+e.getMessage());
		}
		
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Structural Patterns");
		System.out.println("---- Proxy Pattern\n");
	}

	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Proxy Pattern --");
		System.out.println("*********************************\n");		
	}

}
