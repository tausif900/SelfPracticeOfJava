package challenges;

import java.util.Scanner;

public class FloatMultiplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter 1st floating number:");
		double a = input.nextDouble();
		System.out.println("Now,Please Enter 2nd floating number:");
		double b = input.nextDouble();
		System.out.println("\nMultiplication is: " + (a * b));
	}
}
