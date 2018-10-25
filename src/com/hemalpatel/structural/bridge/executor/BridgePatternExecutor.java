package com.hemalpatel.structural.bridge.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.structural.bridge.beans.BlueColor;
import com.hemalpatel.structural.bridge.beans.Color;
import com.hemalpatel.structural.bridge.beans.Hexagon;
import com.hemalpatel.structural.bridge.beans.RedColor;
import com.hemalpatel.structural.bridge.beans.Shape;
import com.hemalpatel.structural.bridge.beans.Triangle;

public class BridgePatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		printTitle();
		
		Color redColor = new RedColor();
		Color blueColor = new BlueColor();
		
		Shape triangleBox = new Triangle(redColor);
		triangleBox.paint();
		
		Shape hexagonContainer = new Hexagon(blueColor);
		hexagonContainer.paint();
		
		System.out.println("");
		triangleBox.changePaint(blueColor);
		System.out.println("");
		hexagonContainer.changePaint(redColor);
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Structural Patterns");
		System.out.println("---- Bridge Pattern\n");
	}

	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Bridge Pattern --");
		System.out.println("*********************************\n");		
	}

}
