package com.hemalpatel.creational.singleton;

/**
 * 
 * @author Hemal Patel
 *
 */

/**
 * {@link AdvancedThreadSafeInitialization} is less expensive than {@link ThreadSafeInitialization}
 * because synchronization is performed only when the object is created for the 
 * first time. After that no synchronization is performed which is good for the
 * overall performance of the application
 */
public class AdvancedThreadSafeInitialization {

	/**
	 * The only instance of the class which is returned when asked for the object
	 * from global access point method
	 */
	private static AdvancedThreadSafeInitialization instance;
	
	/**
	 * Private constructor prevents the direct instantiation from other classes
	 */
	private AdvancedThreadSafeInitialization() {}
	
	/**
	 * Static method that returns the instance, this is the global access point 
	 * to get the instance of this class
	 * @return {@link AdvancedThreadSafeInitialization}
	 */
	public static AdvancedThreadSafeInitialization getInstance() {
		if(instance == null) {
			synchronized(AdvancedThreadSafeInitialization.class) {
				if(instance == null) {
					instance = new AdvancedThreadSafeInitialization();
				}
			}
		}
		return instance;
	}
}
