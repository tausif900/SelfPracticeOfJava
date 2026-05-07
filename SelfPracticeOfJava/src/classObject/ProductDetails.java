package classObject;

public class ProductDetails {
	public static void main(String[] args) {

		Product p1 = new Product("T-Shirt", 500);
		Product p2 = new Product("Jeans", 1000);
		Product p3 = new Product("Shirt", 600);
		Product p4 = new Product("Shirt", 700);

		System.out.println(p1.applyDiscount("T-shirt"));
		System.out.println(p2.applyDiscount("Jeans"));
		System.out.println(p3.applyDiscount("Shirt"));
		System.out.println(p4.applyDiscount("Shirt"));
	}
}
