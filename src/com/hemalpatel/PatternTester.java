package com.hemalpatel;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.creational.abstractfactorypattern.executor.AbstractFactoryPatternExecutor;
import com.hemalpatel.creational.builderpattern.executor.BuilderPatternExecutor;
import com.hemalpatel.creational.factorypattern.executor.FactoryPatternExecutor;
import com.hemalpatel.creational.prototypepattern.executor.PrototypePatternExecutor;
import com.hemalpatel.creational.singleton.executor.SingletonExecutor;
import com.hemalpatel.proxy.executor.ProxyPatternExecutor;
import com.hemalpatel.structural.adapter.executor.AdapterPatternExecutor;
import com.hemalpatel.structural.composite.executor.CompositePatternExecutor;
import com.hemalpatel.structural.facade.executor.FacadePatternExecutor;
import com.hemalpatel.structural.flyweight.executor.FlyWeightPatternExecutor;

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
		
		/***
		 * Call to Prototype Pattern executor
		 */
		executor = (PrototypePatternExecutor) new PrototypePatternExecutor();
		executor.run();
		
		
		/***
		 * Call to Adapter Pattern executor
		 */
		executor = (AdapterPatternExecutor) new AdapterPatternExecutor();
		executor.run();
		
		/***
		 * Call to Composite Pattern executor
		 */
		executor = (CompositePatternExecutor) new CompositePatternExecutor();
		executor.run();
		
		/***
		 * Call to Proxy Pattern executor
		 */
		executor = (ProxyPatternExecutor) new ProxyPatternExecutor();
		executor.run();
		
		
		/***
		 * Call to FlyWeight Pattern executor
		 */
		executor = (FlyWeightPatternExecutor) new FlyWeightPatternExecutor();
		executor.run();
		
		/***
		 * Call to Facade Pattern executor
		 */
		executor = (FacadePatternExecutor) new FacadePatternExecutor();
		executor.run();
		
		

	}

}
