package com.hemalpatel;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.creational.abstractfactorypattern.executor.AbstractFactoryPatternExecutor;
import com.hemalpatel.creational.builderpattern.executor.BuilderPatternExecutor;
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
		
		/***
		 * Call to Factory Pattern executor
		 */
		executor = (AbstractFactoryPatternExecutor) new AbstractFactoryPatternExecutor();
		executor.run();
		
		/***
		 * Call to Builder Pattern executor
		 */
		executor = (BuilderPatternExecutor) new BuilderPatternExecutor();
		executor.run();
		

	}

}
