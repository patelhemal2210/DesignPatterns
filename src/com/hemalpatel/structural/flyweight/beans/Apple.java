package com.hemalpatel.structural.flyweight.beans;

public class Apple implements Mobile{
	private final static double BASE_PRICE = 1200;

	@Override
	public double calculatePrice(CustomSpecification custom) {
		return BASE_PRICE + getPriceBasedOnCustom(custom);
	}
	
	@Override
	public void printFullSpecification(CustomSpecification custom) {
		
		System.out.println("Mobile Type : Apple");
		System.out.println("Oprating System : iOS");
		custom.printCustomisations();
		System.out.println("Base Price : " + BASE_PRICE);
		System.out.println("Total price with customisation : " + calculatePrice(custom));	
	}
	
	private double getPriceBasedOnCustom(CustomSpecification custom) {
		
		double totalCustomPrice = 0;
		
		/***
		 * Based on storage size
		 */
		switch(custom.getStorage())
		{
		case "128GB":
			totalCustomPrice += 350;
			break;
		case "256GB":
			totalCustomPrice +=500;
		}
		
		/**
		 * Based on memory size
		 */
		switch(custom.getMemory())
		{
		case "3GB":
			totalCustomPrice += 550;
			break;
		case "4GB":
			totalCustomPrice +=750;
		}
		
		
		return totalCustomPrice;
	}	
}
