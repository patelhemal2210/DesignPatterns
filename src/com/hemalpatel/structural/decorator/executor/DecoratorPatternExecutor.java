package com.hemalpatel.structural.decorator.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.structural.decorator.beans.BasicCarModel;
import com.hemalpatel.structural.decorator.beans.Car;
import com.hemalpatel.structural.decorator.beans.LuxuryCar;
import com.hemalpatel.structural.decorator.beans.SportsCar;

public class DecoratorPatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		printTitle();
		
		Car basicCar = new BasicCarModel();
		
		SportsCar sportsCar = new SportsCar(basicCar);
		sportsCar.modify();
		
		LuxuryCar luxuryCar = new LuxuryCar(basicCar);
		luxuryCar.modify();
		
		printFooter();
	}

	@Override
	public void printTitle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printFooter() {
		// TODO Auto-generated method stub
		
	}

}
