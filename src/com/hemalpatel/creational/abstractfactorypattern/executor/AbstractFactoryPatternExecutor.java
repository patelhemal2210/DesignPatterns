package com.hemalpatel.creational.abstractfactorypattern.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.creational.abstractfactorypattern.bean.Mobile;
import com.hemalpatel.creational.abstractfactorypattern.factory.AppleFactory;
import com.hemalpatel.creational.abstractfactorypattern.factory.GoogleFactory;
import com.hemalpatel.creational.abstractfactorypattern.factory.MobileFactory;
import com.hemalpatel.creational.abstractfactorypattern.factory.SamsungFactory;;

public class AbstractFactoryPatternExecutor implements BaseExecutor {

	@Override
	public void run() {
		
		/**
		 * Visual prints for clear reading
		 */
		printTitle();
		
		
		Mobile appleMobile = MobileFactory.getMobile(new AppleFactory("Hexa-core", "iOS", "256 GB"));
		System.out.println("\nAPPLE Mobile details : ");
		System.out.println(appleMobile.getMobileDetails());
		
		Mobile samsungMobile = MobileFactory.getMobile(new SamsungFactory("Octa-core", "Android", "128 GB"));
		System.out.println("\nSAMSUNG Mobile details : ");
		System.out.println(samsungMobile.getMobileDetails());
		
		
		Mobile googleMobile = MobileFactory.getMobile(new GoogleFactory("Octa-core", "Android", "256 GB"));
		System.out.println("\nGOOGLE Mobile details : ");
		System.out.println(googleMobile.getMobileDetails());
		
		printFooter();
	}

	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Creational Patterns");
		System.out.println("---- Abstract Factory Pattern\n");
	}
	
	public void printFooter() {
		System.out.println("\n-- END OF Abstract Factory Pattern --");
		System.out.println("*********************************\n");
		
	}
}
