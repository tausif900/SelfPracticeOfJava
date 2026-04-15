package practice;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {

//		Swapping of two numbers..............................

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Swapping Station");
		System.out.print("Enter first numer: ");
		int a = input.nextInt();
		System.out.print("Enter second number:");
		int b = input.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("Swapping is done");
		System.out.println("Value of first number is: " + a);
		System.out.println("Value of second number is: " + b);
	}
}
