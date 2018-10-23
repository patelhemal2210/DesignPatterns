package com.hemalpatel.structural.flyweight.beans;

public class Samsung implements Mobile{
	private final static double BASE_PRICE = 1000;

	@Override
	public double calculatePrice(CustomSpecification custom) {
		return BASE_PRICE + getPriceBasedOnCustom(custom);
	}
	
	@Override
	public void printFullSpecification(CustomSpecification custom) {
		
		System.out.println("Mobile Type : Google");
		System.out.println("Oprating System : Android");
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
			totalCustomPrice += 300;
			break;
		case "256GB":
			totalCustomPrice +=450;
		}
		
		/**
		 * Based on memory size
		 */
		switch(custom.getStorage())
		{
		case "3GB":
			totalCustomPrice += 400;
			break;
		case "4GB":
			totalCustomPrice +=550;
		}
		
		
		return totalCustomPrice;
	}
}
