package challenges;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		if (n > 0) {
			System.out.println(n + " is Positive");
		} else if (n < 0) {
			System.out.println(n + " is Negative");
		} else {
			System.out.println(n + " is Neutral");
		}
	}
}
