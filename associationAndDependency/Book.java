package associationAndDependency;

import java.util.List;

public class Book {
	
	private String title;
	private int num_pages;
	private String category;
	private List<Page> pages;
	
	public Book(String title,int num_pages, String category, List<Page> pages) {
		this.title=title;
		this.num_pages=num_pages;
		this.category=category;
		this.pages = pages;
	}

}
