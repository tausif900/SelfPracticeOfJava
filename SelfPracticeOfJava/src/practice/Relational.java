package practice;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Age:");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible for License");
		} else {
			System.out.println("Ride a bicycle");
		}
	}
}
