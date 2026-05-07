package classObject;

public class Product {
	String name;
	int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	double applyDiscount(String name) {
		switch (name) {
		case "T-shirt":
			System.out.println("You got 90% discount");
			return this.price * 0.9;
		case "Jeans":
			System.out.println("You got 80% discount");
			return this.price * 0.8;
		case "Shirt":
			System.out.println("You got 50% discount");
			return this.price * 0.5;
		}
		return 0;
	}
}
