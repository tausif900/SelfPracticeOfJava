package ClassObject;

public class Book {
	static int totalNoOfBooks;
	String title;
	String author;
	String isbn;
	boolean isBorrowed;

	static {
		totalNoOfBooks = 0;
	}
	{
		totalNoOfBooks++;
	}


	public Book(String title, String author, String isbn, boolean isBorrowed) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowed = isBorrowed;
	}
	
}
