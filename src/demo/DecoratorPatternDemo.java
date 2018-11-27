package demo;

import classes.Circle;
import classes.Square;
import implementation.RedShapeDecorator;
import interfaces.Shape;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redSquare = new RedShapeDecorator(new Square());

		System.out.println("Circle of normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nSquare of red border");
		redSquare.draw();

	}
}
