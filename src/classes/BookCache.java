package classes;

import java.util.Hashtable;

import abstraction.Book;

public class BookCache {

	private static Hashtable<String, Book> bookMap = new Hashtable<String, Book>();

	public static Book getBook(String bookId){
		
		Book myBook = bookMap.get(bookId);
		return (Book)myBook.clone();
		
	}
	
	//for each book, database query will run..prototype method used when database operations are costly	
	public static void loadCache() {
		implementation.Math mathBook = new implementation.Math();
		mathBook.setId("1");
		bookMap.put(mathBook.getId(), mathBook);

		implementation.Science scienceBook = new implementation.Science();
		scienceBook.setId("2");
		bookMap.put(scienceBook.getId(), scienceBook);
	}
}
