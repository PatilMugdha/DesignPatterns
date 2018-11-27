package demo;

import classes.Polygon;
import implementation.FlyWeightShapeFactory;

public class FlyweightPatternDemo {
	private static final String colors[] = { "Red", "Green", "Yellow" };

	public static void main(String[] args) {
		for (int i = 0; i < 20; ++i) {
			Polygon polygon = (Polygon) FlyWeightShapeFactory.getCircle(getRandomColor());
			polygon.setX(10);
			polygon.setY(10);
			polygon.setRadius(100);
            polygon.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}
}
