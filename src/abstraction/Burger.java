package abstraction;

import classes.Wrapper;
import interfaces.Item;
import interfaces.Packing;

public abstract class Burger implements Item {

	// name will be overwritten by class which "extends" Burger
	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
