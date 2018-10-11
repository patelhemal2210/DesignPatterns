package com.hemalpatel.creational.singleton;

/**
 * 
 * @author Hemal Patel
 *
 */

/**
 * 
 * In Bill Pugh's approch, instance of the object is created in the inner helper
 * class so that it is not loaded when the main class is loaded and object is only created
 * when helper class is called from global access method
 *
 */
public class BillPughSingleton {
	
	/**
	 * Private constructor prevents the direct instantiation from other classes
	 */
	private BillPughSingleton() {}
	

	/**
	 * Inner helper class to hold the instance of the singleton object
	 */
	private static class Helper {
		/**
		 * The only instance of the class which is returned when asked for the object
		 * from global access point method
		 */
		private static final BillPughSingleton instance = new BillPughSingleton();
	}
	
	/**
	 * Static method that returns the instance, this is the global access point 
	 * to get the instance of this class
	 * @return {@link AdvancedThreadSafeInitialization}
	 */
	public static BillPughSingleton getInstance() {
		return Helper.instance;
	}
}
