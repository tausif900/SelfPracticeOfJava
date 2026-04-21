package challenges;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Calculate Leap Year");
		System.out.print("Please Enter a Year that you want to check: ");
		int year = input.nextInt();
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Your year is a Leap Year");
		} else {
			System.out.println("Your year is not a Leap Year");
		}
	}
}
