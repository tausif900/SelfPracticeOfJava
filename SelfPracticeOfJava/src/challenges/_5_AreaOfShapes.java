package challenges;

import java.util.Scanner;

public class _5_AreaOfShapes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Calculate the area of Shapes");
		System.out.print("Enter length: ");
		double b = input.nextDouble();
		System.out.print("Enter breadth: ");
		double h = input.nextDouble();
		double result = (b * h) / 2;
		System.out.println("Area of a Triangle: " + result + " sq.cm");
	}
}
