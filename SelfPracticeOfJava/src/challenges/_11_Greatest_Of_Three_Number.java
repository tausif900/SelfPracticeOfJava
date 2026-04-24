package challenges;

import java.util.Scanner;

public class _11_Greatest_Of_Three_Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = input.nextInt();
		System.out.println("Enter second number: ");
		int b = input.nextInt();
		System.out.println("Enter third number: ");
		int c = input.nextInt();
		if (a >= b && a >= c) {
			System.out.println("first number is Greater");
		} else if (b >= c) {
			System.out.println("Second number is Greater");
		} else {
			System.out.println("Third number is Greater");
		}
	}
}
