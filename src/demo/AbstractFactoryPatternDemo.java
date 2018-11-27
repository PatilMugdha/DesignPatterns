package demo;

import abstraction.AbstractFactory;
import implementation.FactoryProducer;
import interfaces.Color;
import interfaces.Shape;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color blue = colorFactory.getColor("blue");
		blue.fill();

		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape square = shapeFactory.getShape("square");
		square.draw();
	}
}
