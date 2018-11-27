package implementation;

import abstraction.AbstractFactory;
import classes.Circle;
import classes.Rectangle;
import classes.Square;
import interfaces.Color;
import interfaces.Shape;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("square")) {
			return new Square();
		}

		return null;
	}

	@Override
	public Color getColor(String colorName) {
		// TODO Auto-generated method stub
		return null;
	}
}
