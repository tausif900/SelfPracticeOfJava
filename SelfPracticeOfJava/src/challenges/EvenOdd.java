package challenges;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		if (n % 2 == 0) {
			System.out.println("Your number is an Even number");
		} else {
			System.out.println("Your number is an Odd number");
		}
	}
}
