package classes;

import interfaces.DrawAPI;

public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing circle[color:GREEN, radius:" + radius + ", x:" + x + ",y:" + y + "]");

	}

}
