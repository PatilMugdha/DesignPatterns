package classes;

import interfaces.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "bottle";
	}

}
