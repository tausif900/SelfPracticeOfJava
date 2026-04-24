package challenges;

import java.util.Scanner;

public class _16_OddEven_BitWise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = input.nextInt();
		if ((num & 1) == 1) {
			System.out.println("Your number is odd");
		} else {
			System.out.println("Your number is even");
		}
	}
}
