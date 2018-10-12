package com.hemalpatel.creational.singleton;

import com.hemalpatel.base.BaseExecutor;

/**
 * 
 * @author Hemal Patel
 *
 */
/**
 * Singleton executor to execute Singleton patterns
 *
 */
public class SingletonExecutor implements BaseExecutor {
	
	public void run() {
		/**
		 * Visual prints for clear reading
		 */
		printTitle();
		
		/**
		 * {@link EarlyInitialization} instance creation test
		 */
		
		earlyInitializationTest();
		earlyStaticInitializationTest();
		lazyInitializationTest();
		threadSafeInitializationTest();
		advancedThreadSafeInitializationTest();
		billPughInitializationTest();

	}
	

	private void printTitle() {
		System.out.println("-- Creational Patterns");
		System.out.println("---- Singleton Pattern\n");
	}

	private void earlyInitializationTest() {
		/**
		 * {@link EarlyInitialization} instance creation
		 */
		System.out.println("------ Early Initialization");
		EarlyInitialization object = EarlyInitialization.getInstance();
		System.out.println("\tObject 1 hascode : " + object.hashCode());
		
		EarlyInitialization object2 = EarlyInitialization.getInstance();
		System.out.println("\tObject 2 hascode : " + object2.hashCode());
		System.out.println("\n");
	}
	
	private void earlyStaticInitializationTest() {

		/**
		 * {@link EarlyStaticInitialization} instance creation
		 */
		System.out.println("------ Early Static Initialization");
		EarlyStaticInitialization object = EarlyStaticInitialization.getInstance();
		System.out.println("\tObject 1 hascode : " + object.hashCode());
		
		EarlyStaticInitialization object2 = EarlyStaticInitialization.getInstance();
		System.out.println("\tObject 2 hascode : " + object2.hashCode());
		System.out.println("\n");
	}
	
	private void lazyInitializationTest() {

		/**
		 * {@link LazyInitialization} instance creation
		 */
		System.out.println("------ Lazy Initialization");
		LazyInitialization object = LazyInitialization.getInstance();
		System.out.println("\tObject 1 hascode : " + object.hashCode());
		
		LazyInitialization object2 = LazyInitialization.getInstance();
		System.out.println("\tObject 2 hascode : " + object2.hashCode());
		System.out.println("\n");
	}
	
	private void threadSafeInitializationTest() {

		/**
		 * {@link ThreadSafeInitialization} instance creation
		 */
		System.out.println("------ Thread Safe Initialization");
		ThreadSafeInitialization object = ThreadSafeInitialization.getInstance();
		System.out.println("\tObject 1 hascode : " + object.hashCode());
		
		ThreadSafeInitialization object2 = ThreadSafeInitialization.getInstance();
		System.out.println("\tObject 2 hascode : " + object2.hashCode());
		System.out.println("\n");
	}
	
	private void advancedThreadSafeInitializationTest() {

		/**
		 * {@link AdvancedThreadSafeInitialization} instance creation
		 */
		System.out.println("------ Advanced Thread Safe Initialization");
		AdvancedThreadSafeInitialization object = AdvancedThreadSafeInitialization.getInstance();
		System.out.println("\tObject 1 hascode : " + object.hashCode());
		
		AdvancedThreadSafeInitialization object2 = AdvancedThreadSafeInitialization.getInstance();
		System.out.println("\tObject 2 hascode : " + object2.hashCode());
		System.out.println("\n");
	}
	
	private void billPughInitializationTest() {

		/**
		 * {@link BillPughSingleton} instance creation
		 */
		System.out.println("------ Bill Pugh Initialization");
		BillPughSingleton object = BillPughSingleton.getInstance();
		System.out.println("\tObject 1 hascode : " + object.hashCode());
		
		BillPughSingleton object2 = BillPughSingleton.getInstance();
		System.out.println("\tObject 2 hascode : " + object2.hashCode());
		System.out.println("\n");
	}
	
	
}
