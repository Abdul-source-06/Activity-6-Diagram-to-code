package associationAndDependency;

import java.util.List;

public class Patron {

	private String name; 
	private List<Book> borrowedBooks;
	
    public Patron(String name, List<Book> borrowedBooks) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }
	
}
