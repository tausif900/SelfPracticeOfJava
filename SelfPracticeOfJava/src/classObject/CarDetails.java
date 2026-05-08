package classObject;

public class CarDetails {
	public static void main(String[] args) {
		
		Car car[] = new Car[3];
		car[0] = new Car("Awdi", 2500000);
		car[1] = new Car("BMW", 5000000);
		car[2] = new Car("Creata", 4000000);

		for (int i = 0; i < car.length; i++) {
			car[i].displayCar();
		}
	}
}
