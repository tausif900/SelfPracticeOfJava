package challenges;

import java.util.Scanner;

public class _20_SumOfDigit {
	public static void main(String[] args) {
		System.out.println("Welcome to Calculate sum of the digits");
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		System.out.println("sum of digit of is " + sum);
	}
}
