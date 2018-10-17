package com.hemalpatel.creational.prototypepattern.executor;

import java.util.List;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.creational.prototypepattern.Mobiles;

public class PrototypePatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		
		printTitle();
		
		Mobiles mobiles = new Mobiles();
		mobiles.loadDatabase();
		
		try {
			
			Mobiles newMobileList = (Mobiles) mobiles.clone();
			List<String> newList =  newMobileList.getMobileDatabase();
			newList.add("iPhone 6s+");
			System.out.println("Updated Mobile List : ");
			System.out.println(newMobileList.getMobileDatabase());
			
			
			Mobiles androidMobileList = (Mobiles) mobiles.clone();
			List<String> androidList =  androidMobileList.getMobileDatabase();
			androidList.remove("iPhone X");
			androidList.remove("iPhone XS");
			System.out.println("\nAndroid Mobile List : ");
			System.out.println(androidMobileList.getMobileDatabase());
			
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Creational Patterns");
		System.out.println("---- Prototype Pattern\n");
	}

	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Prototype Pattern --");
		System.out.println("*********************************\n");
		
	}
}
