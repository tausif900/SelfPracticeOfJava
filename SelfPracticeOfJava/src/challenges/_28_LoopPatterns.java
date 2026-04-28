package challenges;

import java.util.Iterator;
import java.util.Scanner;

public class _28_LoopPatterns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of rows: ");
		int rows = input.nextInt();
		printFirstPatterns(rows);
	}

	public static void printFirstPatterns(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
