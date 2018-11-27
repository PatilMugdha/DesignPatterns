package implementation;

import abstraction.Book;

public class Science extends Book {

	public Science() {
		type = "science";
	}

	@Override
	public void draw() {

		System.out.println("Opening science book");

	}

}
