package practice;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Calculator");
		System.out.println("Enter First Number: ");
		int firstInput = input.nextInt();
		System.out.println("Enter Ssecond Number: ");
		int secondInput = input.nextInt();
		int sum = firstInput + secondInput;
		System.out.println("Addition is " + sum);
	}
}
