package demo;

import abstraction.Book;
import classes.BookCache;

public class PrototypePatternDemo {
public static void main(String[] args) {
	BookCache.loadCache();
	
	Book newMathBook = BookCache.getBook("1");
	System.out.println("Book: "+newMathBook.getType());
	
	Book newScienceBook =(Book) BookCache.getBook("2");
	System.out.println("Book: "+newScienceBook.getType());

}
}
