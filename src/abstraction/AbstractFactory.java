package abstraction;

import interfaces.Color;
import interfaces.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String colorName);

	public abstract Shape getShape(String getShape);
}
