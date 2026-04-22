package challenges;

import java.util.Scanner;

public class Age_Categorise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = input.nextInt();
		if (age >= 65) {
			System.out.println("You are a Senior Citizen");
		} else if (age >= 20) {
			System.out.println("You are an Adult");
		} else if (age >= 13) {
			System.out.println("You are a teenager");
		} else {
			System.out.println("You are a Child");
		}
	}
}
