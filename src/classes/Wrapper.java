package classes;

import interfaces.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "wrapper";
	}

}
