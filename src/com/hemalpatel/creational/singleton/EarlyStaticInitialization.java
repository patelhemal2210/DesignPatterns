package com.hemalpatel.creational.singleton;

/**
 * 
 * @author Hemal Patel
 */

/**
 * The only advantage we get in {@link EarlyStaticInitialization} over 
 * {@link EarlyInitialization} is that we get a chance to handle the exception if any
 * 
 * All other usability remains the same at @ EarlyInitialiation
 * 
 */
public class EarlyStaticInitialization {

	/**
	 * The only instance of the class which is returned when asked for the object
	 * from global access point method
	 */
	private static EarlyStaticInitialization instance;
	
	/**
	 * static block let us handle the exception if any while creating instance
	 */
	static {
		try {
			instance = new EarlyStaticInitialization();
		}
		catch(Exception e) {
			throw new RuntimeException("Exception encountered while creating instance of EarlyStaticInitialization");
		}
	}
	
	/**
	 * Private constructor prevents the direct instantiation from other classes
	 */
	private EarlyStaticInitialization() {}
	
	/**
	 * Static method that returns the instance, this is the global access point 
	 * to get the instance of this class
	 * @return {@link EarlyStaticInitialization}
	 */
	public static EarlyStaticInitialization getInstance() {
		return instance;
	}
}
