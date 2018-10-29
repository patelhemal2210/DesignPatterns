package com.hemalpatel.behavioral.template.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.behavioral.template.bean.OnlineOrder;
import com.hemalpatel.behavioral.template.bean.OrderTemplate;
import com.hemalpatel.behavioral.template.bean.StoreOrder;

public class TemplatePatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		printTitle();

		OrderTemplate storeProduct = new StoreOrder();
		System.out.println("\n--- Store Gift Order ---");
		storeProduct.OrderProcess(true);
		System.out.println("\n--- Store Order ---");
		storeProduct.OrderProcess(false);
		
		
		OrderTemplate onlineProduct = new OnlineOrder();
		System.out.println("\n--- Online Gift Order ---");
		onlineProduct.OrderProcess(true);
		System.out.println("\n--- Online Order ---");
		onlineProduct.OrderProcess(false);
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Behavioral Patterns");
		System.out.println("---- Template Pattern\n");
	}
	
	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Template Pattern --");
		System.out.println("*********************************\n");
	}

}
