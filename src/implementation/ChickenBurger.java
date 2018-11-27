package implementation;

import abstraction.Burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {

		return "chickenBurger";
	}

	@Override
	public float price() {

		return 50.0f;
	}

}