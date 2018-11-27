package implementation;

import abstraction.Burger;

public class VegBurger extends Burger {

	@Override
	public String name() {

		return "vegBurger";
	}

	@Override
	public float price() {

		return 25.0f;
	}

}
