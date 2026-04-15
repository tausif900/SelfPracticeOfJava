package challenges;

import java.util.Scanner;

public class Arithmetic_1 {

	public static void main(String[] args) {
		System.out.println("Welcome to solve Arithmetic Problems\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st num: ");
		int a = input.nextInt();
		System.out.print("Enter 2st num: ");
		int b = input.nextInt();

		System.out.println("Addidtion is: " + (a + b));
		System.out.println("Subtraction is: " + (a - b));
		System.out.println("Multiplication is: " + (a * b));
		System.out.println("Division is: " + (a / b));
		System.out.println("Modulus is: " + (a % b));
	}
}
