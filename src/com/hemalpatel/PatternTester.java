package com.hemalpatel;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.creational.singleton.SingletonExecutor;

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
		
		BaseExecutor executor = (SingletonExecutor) new SingletonExecutor();
		executor.run();

	}

}
