package demo;

import abstraction.BridgeShape;
import classes.GreenCircle;
import classes.RedCircle;
import implementation.BridgeCircle;

public class BridgePatternDemo {
	public static void main(String[] args) {
		BridgeShape redCircle = new BridgeCircle(100, 10, 10, new RedCircle());
		BridgeShape greenCircle = new BridgeCircle(100, 10, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}

}
