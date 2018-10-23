package com.hemalpatel.structural.flyweight.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.structural.flyweight.beans.CustomSpecification;
import com.hemalpatel.structural.flyweight.beans.Mobile;
import com.hemalpatel.structural.flyweight.beans.MobileCustomSpecification;
import com.hemalpatel.structural.flyweight.factory.MobileFlyWeightFactory;

public class FlyWeightPatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		printTitle();
		
		MobileFlyWeightFactory factory = new MobileFlyWeightFactory();
		
		Mobile iPhone6 = factory.getMobile(MobileFlyWeightFactory.Model.Apple);
		Mobile iPhone6s = factory.getMobile(MobileFlyWeightFactory.Model.Apple);
		
		System.out.println("Compare iphone6 and iphone6s:" + (iPhone6 == iPhone6s));
		
		Mobile s6 = factory.getMobile(MobileFlyWeightFactory.Model.Samsung);
		Mobile galaxyS6 = factory.getMobile(MobileFlyWeightFactory.Model.Samsung);
		
		System.out.println("Compare s6 and galaxyS6:" + (s6 == galaxyS6));
		
		CustomSpecification iPhoneCustom = new MobileCustomSpecification("256GB", "4GB");
		System.out.println("\nUpgraded iPhone6s specification : " );
		iPhone6s.printFullSpecification(iPhoneCustom);
		
		CustomSpecification samsungCustom = new MobileCustomSpecification("256GB", "3GB");
		System.out.println("\nUpgraded Samsung specification : " );
		galaxyS6.printFullSpecification(samsungCustom);
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Structural Patterns");
		System.out.println("---- Fly Weight Pattern\n");
	}

	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Fly Weight Pattern --");
		System.out.println("*********************************\n");		
	}

}
