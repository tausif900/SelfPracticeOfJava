package classObject;

public class Car {
	String brand;
	int price;

	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	void displayCar() {
		System.out.println("Car brand is " + brand + " and price is " + price);
	}
}
