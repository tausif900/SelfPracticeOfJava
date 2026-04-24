package challenges;

import java.util.Scanner;

public class _7_Compound_Interest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Calculate the Compound Interest");
		System.out.print("Principle Amount Rs");
		int P = input.nextInt();
		System.out.print("For how many Years");
		float T = input.nextFloat();
		System.out.print("Rate of Interest");
		float R = input.nextFloat();
		double compoundInterest = P * Math.pow((1 + R / 100), T);
		System.out.println("Your Compund Interest is Rs:" + compoundInterest);
	}
}
