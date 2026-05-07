package classObject;

public class Book {
	String title;
	String author;
	int price;

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void displayDetails() {
		System.out.println(title + " " + author + " " + price);
	}
}
