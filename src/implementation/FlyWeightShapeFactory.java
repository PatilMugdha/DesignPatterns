package implementation;

import java.util.HashMap;

import classes.Polygon;
import interfaces.Shape;

public class FlyWeightShapeFactory {
	private static final HashMap<String, Shape> polygonMap = new HashMap<String, Shape>();

	public static Shape getCircle(String color) {

		Polygon polygon = (Polygon) polygonMap.get(color);

		if (polygon == null) {
			polygon = new Polygon(color);
			polygonMap.put(color, polygon);
			System.out.println("Returning polygon of color:" + color);
		}

		return polygon;

	}
}
