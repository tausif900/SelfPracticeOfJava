package classObject;

import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of books array");
		int size = input.nextInt();
		Book books[] = new Book[size];

		System.out.println("Enter Book's title,author,price");
		for (int i = 0; i < books.length; i++) {
			String title = input.next();
			String author = input.next();
			int price = input.nextInt();

			books[i] = new Book(title, author, price);
			books[i].displayDetails();
		}
	}
}

/*
 * AliBaba tausif 400 
 * fairyTales saif 250 
 * Nice khadija 300
 */
