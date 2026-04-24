package challenges;

import java.util.Scanner;

public class _13_Grade_Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Percentage: ");
		float percentage = input.nextFloat();
		if (percentage >= 90) {
			System.out.println("Great, You have got A");
		} else if (percentage >= 75) {
			System.out.println("Great,You have got B");
		} else if (percentage >= 60) {
			System.out.println("You have got C,work harder next time");
		} else if (percentage >= 30) {
			System.out.println("You have got D, do more hardwork");
		} else {
			System.out.println("You have failed in Exam");
		}
	}
}
