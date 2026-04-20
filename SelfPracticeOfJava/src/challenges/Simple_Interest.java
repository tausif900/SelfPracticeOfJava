package challenges;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		System.out.println("Calculate the Simple Interest");
		Scanner input = new Scanner(System.in);
		System.out.print("Principle Amount Rs");
		int P = input.nextInt();
		System.out.print("For how many Years");
		float T = input.nextFloat();
		System.out.print("Rate of Interest");
		float R = input.nextFloat();
		float interest = (P * T * R) / 100;
		System.out.println("\n\nInterest Of Your Amount will be Rs" + interest);
	}

}
