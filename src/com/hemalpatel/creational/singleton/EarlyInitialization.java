package com.hemalpatel.creational.singleton;

/**
 * 
 * @author Hemal Patel
 * 
 * In @see EarlyInitialization, the instance is created when the class is loaded
 * and that is the disadvantage of this method. 
 * 
 * Even if your application does not require the instance it is created into the
 * memory.
 * 
 * This approach is fair to use only if the class is not using too many resources
 * becuase of the performance is high in this method.
 * 
 * However, in most cases singleton is used to handle resource heavy mechanism.
 * like, database connection, filesystem access etc,.
 *
 * 
 */
public class EarlyInitialization {

	/**
	 * The only instance of the class which is returned when asked for the object
	 * from global access point method
	 */
	private static EarlyInitialization instance = new EarlyInitialization();
	
	
	/**
	 * Private constructor prevents the direct instantiation from other classes
	 */
	private EarlyInitialization() {}
	
	/**
	 * Static method that returns the instance, this is the global access point 
	 * to get the instance of this class
	 * @return @see EarlyInitialization
	 */
	public static EarlyInitialization getInstance() {
		return instance;
	}
}
