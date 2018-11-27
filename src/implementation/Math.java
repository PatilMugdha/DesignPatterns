package implementation;

import abstraction.Book;

public class Math extends Book {

	public Math() {
		type = "math";
	}

	@Override
	public void draw() {

		System.out.println("Opening math book");

	}

}
