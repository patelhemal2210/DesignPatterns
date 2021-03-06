package com.hemalpatel;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.behavioral.chainofresponsibility.executor.ChainOfResponsibilityPatternExecutor;
import com.hemalpatel.behavioral.command.executor.CommandPatternExecutor;
import com.hemalpatel.behavioral.interpreter.executor.InterpreterPatternExecutor;
import com.hemalpatel.behavioral.iterator.executor.IteratorPatternExecutor;
import com.hemalpatel.behavioral.mediator.executor.MediatorPatternExecutor;
import com.hemalpatel.behavioral.observer.executor.ObserverPatternExecutor;
import com.hemalpatel.behavioral.state.executor.StatePatternExecutor;
import com.hemalpatel.behavioral.strategy.executor.StrategyPatternExecutor;
import com.hemalpatel.behavioral.template.executor.TemplatePatternExecutor;
import com.hemalpatel.behavioral.visitor.executor.VisitorPatternExecutor;
import com.hemalpatel.creational.abstractfactorypattern.executor.AbstractFactoryPatternExecutor;
import com.hemalpatel.creational.builderpattern.executor.BuilderPatternExecutor;
import com.hemalpatel.creational.factorypattern.executor.FactoryPatternExecutor;
import com.hemalpatel.creational.prototypepattern.executor.PrototypePatternExecutor;
import com.hemalpatel.creational.singleton.executor.SingletonExecutor;
import com.hemalpatel.proxy.executor.ProxyPatternExecutor;
import com.hemalpatel.structural.adapter.executor.AdapterPatternExecutor;
import com.hemalpatel.structural.bridge.executor.BridgePatternExecutor;
import com.hemalpatel.structural.composite.executor.CompositePatternExecutor;
import com.hemalpatel.structural.decorator.executor.DecoratorPatternExecutor;
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
		
		/***
		 * Call to Facade Pattern executor
		 */
		executor = (BridgePatternExecutor) new BridgePatternExecutor();
		executor.run();
		
		/***
		 * Call to Decorator Pattern executor
		 */
		executor = (DecoratorPatternExecutor) new DecoratorPatternExecutor();
		executor.run();
		
		/***
		 * Call to Template Pattern executor
		 */
		executor = (TemplatePatternExecutor) new TemplatePatternExecutor();
		executor.run();
		
		/***
		 * Call to Mediator Pattern executor
		 */
		executor = (MediatorPatternExecutor) new MediatorPatternExecutor();
		executor.run();
		
		/***
		 * Call to Chain Of Responsibility Pattern executor
		 */
		executor = (ChainOfResponsibilityPatternExecutor) new ChainOfResponsibilityPatternExecutor();
		executor.run();
		
		/***
		 * Call to Observer Pattern executor
		 */
		executor = (ObserverPatternExecutor) new ObserverPatternExecutor();
		executor.run();
		
		/***
		 * Call to Strategy Pattern executor
		 */
		executor = (StrategyPatternExecutor) new StrategyPatternExecutor();
		executor.run();
		
		/***
		 * Call to Command Pattern executor
		 */
		executor = (CommandPatternExecutor) new CommandPatternExecutor();
		executor.run();
		
		/***
		 * Call to State Pattern executor
		 */
		executor = (StatePatternExecutor) new StatePatternExecutor();
		executor.run();
		
		/***
		 * Call to Visitor Pattern executor
		 */
		executor = (VisitorPatternExecutor) new VisitorPatternExecutor();
		executor.run();
		
		/***
		 * Call to Interpreter Pattern executor
		 */
		executor = (InterpreterPatternExecutor) new InterpreterPatternExecutor();
		executor.run();
		
		/***
		 * Call to Iterator Pattern executor
		 */
		executor = (IteratorPatternExecutor) new IteratorPatternExecutor();
		executor.run();
		
		

	}

}
