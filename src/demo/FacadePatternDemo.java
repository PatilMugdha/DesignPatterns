package demo;

import implementation.ShapeMaker;

public class FacadePatternDemo {
	public static void main(String[] args) {

		ShapeMaker maker = new ShapeMaker();
		maker.drawCircle();
		maker.drawSquare();
	}
}
