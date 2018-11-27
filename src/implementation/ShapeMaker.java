package implementation;

import java.awt.Rectangle;

import classes.Circle;
import classes.Square;
import interfaces.Shape;

public class ShapeMaker {

	private Shape circle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}
