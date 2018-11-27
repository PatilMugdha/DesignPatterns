package abstraction;

import interfaces.DrawAPI;

public abstract class BridgeShape {

	protected DrawAPI drawAPI;

	protected BridgeShape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
