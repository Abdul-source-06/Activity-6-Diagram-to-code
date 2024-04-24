package associationAndDependency;

public class Shelf {
	
    private int capacity;
    private List<Book> books;
    
    public Shelf(int capacity, List<Book> books) {
        this.capacity = capacity;
	this.books = books;
    }
}
