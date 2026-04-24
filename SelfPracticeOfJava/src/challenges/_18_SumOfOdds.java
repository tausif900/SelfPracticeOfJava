package challenges;

import java.util.Scanner;

public class _18_SumOfOdds {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
