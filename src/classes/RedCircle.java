package classes;

import interfaces.DrawAPI;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing circle[color:RED, radius:" + radius + ", x:" + x + ",y:" + y + "]");

	}

}
