package com.hemalpatel;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.creational.factorypattern.executor.FactoryPatternExecutor;
import com.hemalpatel.creational.singleton.executor.SingletonExecutor;

/**
 * 
 * @author Hemal Patel
 */

/**
 * {@link PatternTester} is tester class to test the implementation of the different design pattern
 *
 */
public class PatternTester {

	public static void main(String[] args) {
		BaseExecutor executor = null;
		
		/***
		 * Call to Singleton executor
		 */
		executor = (SingletonExecutor) new SingletonExecutor();
		executor.run();
		
		/***
		 * Call to Factory Pattern executor
		 */
		executor = (FactoryPatternExecutor) new FactoryPatternExecutor();
		executor.run();
		

	}

}
