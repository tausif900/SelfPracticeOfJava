package practice;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
//	Arithmetic Opeartors
		System.out.println("Welcome to do Arithmetic Calculations");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int a = input.nextInt();
		System.out.print("Enter num2: ");
		int b = input.nextInt();

		System.out.println("Addition is: " + (a + b));
		System.out.println("Subtraction is: " + (a - b));
		System.out.println("Multiplication  is: " + (a * b));
		System.out.println("Division is: " + (a / b));
		System.out.println("Modulus is: " + (a % b));
	}
}
