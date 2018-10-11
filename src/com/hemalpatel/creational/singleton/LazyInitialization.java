package com.hemalpatel.creational.singleton;

/**
 * 
 * @author Hemal Patel
 */

/**
 * 
 * If your singleton class is resource heavy, then lazy initialization is best
 * suited since the object is only created when needed unlike {@link EarlyInitialization}
 * 
 * However, this method is not thread safe. To make this approach thread safe, 
 * please refer {@link ThreadSafeInitialization} implementation
 * 
 */

public class LazyInitialization {

	/**
	 * The only instance of the class which is returned when asked for the object
	 * from global access point method
	 */
	private static LazyInitialization instance;
	
	/**
	 * Private constructor prevents the direct instantiation from other classes
	 */
	private LazyInitialization() {}
	
	/**
	 * Static method that returns the instance, this is the global access point 
	 * to get the instance of this class
	 * @return {@link LazyInitialization}
	 */
	public static LazyInitialization getInstance() {
		if(instance == null) {
			instance = new LazyInitialization();
		}
		return instance;
	}
}
