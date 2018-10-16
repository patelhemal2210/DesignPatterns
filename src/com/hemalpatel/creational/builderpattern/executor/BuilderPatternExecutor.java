package com.hemalpatel.creational.builderpattern.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.creational.builderpattern.beans.Mobile;
import com.hemalpatel.creational.builderpattern.beans.Mobile.MobileBuilder;

public class BuilderPatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		
		printTitle();
		
		System.out.println("Outdated Mobile details : ");
		Mobile outdatedMobile = new MobileBuilder("dual-core", "Android", "16 GB").build();
		System.out.println(outdatedMobile.printDetails());
		
		System.out.println("\nSAMSUNG Mobile details : ");
		Mobile samsungMobile = new MobileBuilder("Octa-core", "Android", "128 GB").setWaterProofEnabled(true).build();
		System.out.println(samsungMobile.printDetails());
		
		System.out.println("\nAPPLE Mobile details : ");
		Mobile appleMobile = new MobileBuilder("Hexa-core", "iOS", "256 GB").setWaterProofEnabled(true).setDustProofEnabled(true).build();
		System.out.println(appleMobile.printDetails());
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Creational Patterns");
		System.out.println("---- Builder Pattern\n");
	}
	
	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Builder Pattern --");
		System.out.println("*********************************\n");
		
	}

}
