package implementation;

import abstraction.AbstractFactory;
import classes.Blue;
import classes.Green;
import classes.Red;
import interfaces.Color;
import interfaces.Shape;

public class ColorFactory extends AbstractFactory{
	
	@Override
	public Color getColor(String colorName) {

		if (colorName == null) {
			return null;
		} else if (colorName.equalsIgnoreCase("red")) {
			return new Red();
		} else if (colorName.equalsIgnoreCase("blue")) {
			return new Blue();
		} else if (colorName.equalsIgnoreCase("green")) {
			return new Green();
		}
		return null;
	}

	@Override
	public Shape getShape(String getShape) {
		// TODO Auto-generated method stub
		return null;
	}
}
