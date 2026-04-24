package challenges;

import java.util.Scanner;

public class _17_Multiplication_Table {
	public static void main(String[] args) {
		
//		Program to print table using user input.

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
		}
	}
}
