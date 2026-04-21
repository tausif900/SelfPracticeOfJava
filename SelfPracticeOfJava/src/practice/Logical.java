package practice;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Ticket Discount Calculator");
		System.out.print("Enter your Age: ");
		int age = input.nextInt();
		System.out.print("Are you a female? (true/false): ");
		boolean isFemale = input.nextBoolean();
		if (age < 5) {
			System.out.println("You got 75% Discount");
		} else if (isFemale) {
			System.out.println("You got 50% Discount");
		} else if (age > 60 && !isFemale) {
			System.out.println("You got 25% Discount");
		} else {
			System.out.println("You got no Discount");
		}
	}
}
