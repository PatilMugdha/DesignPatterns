package implementation;

import abstraction.BridgeShape;
import interfaces.DrawAPI;

public class BridgeCircle extends BridgeShape {

	private int x, y, radius;

	public BridgeCircle(int radius, int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.radius = radius;
		this.x = x;
		this.y = y;

	}

	@Override
	public void draw() {
      drawAPI.drawCircle(radius, x, y);
	}

}
