package challenges;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		System.out.println("Perimeter Calculations");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter all sides in cms: ");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double perimeter = a + b + c + d;

		System.out.println("\nPerimeter is: " + perimeter + "cm");
	}
}
