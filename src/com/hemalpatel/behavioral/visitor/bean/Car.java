package com.hemalpatel.behavioral.visitor.bean;

import java.util.ArrayList;
import java.util.List;

public class Car implements CarComponent {

	private List<CarComponent> components;
	
	public Car() {
		components = new ArrayList<CarComponent>();
		components.add(new Engine());
		components.add(new Body());
		components.add(new Wheel());
		components.add(new Interior());
	}
	
	@Override
	public void accept(CarComponentVisitor visitor) {
		for(CarComponent component : components) {
			component.accept(visitor);
		}
		visitor.visit(this);
	}
}
