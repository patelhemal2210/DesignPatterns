package com.hemalpatel.creational.singleton;

/**
 * 
 * @author Hemal Patel
 *
 */

/**
 * Since synchronization is performed for each call to global access method,
 * performace of the application is affected.
 * This can be improved my synchronizing the call only once when new object is
 * created. Refer {@link AdvancedThreadSafeInitialization} implementation 
 */

public class ThreadSafeInitialization {

	/**
	 * The only instance of the class which is returned when asked for the object
	 * from global access point method
	 */
	private static ThreadSafeInitialization instance;
	
	/**
	 * Private constructor prevents the direct instantiation from other classes
	 */
	private ThreadSafeInitialization() {}
	
	/**
	 * Static method that returns the instance, this is the global access point 
	 * to get the instance of this class
	 * @return {@link ThreadSafeInitialization}
	 */
	public static synchronized ThreadSafeInitialization getInstance() {
		if(instance == null) {
			instance = new ThreadSafeInitialization();
		}
		return instance;
	}
}
