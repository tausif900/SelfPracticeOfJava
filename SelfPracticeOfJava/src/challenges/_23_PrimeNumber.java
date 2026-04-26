package challenges;

import java.util.Scanner;

public class _23_PrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		if (isPrime(num)) {
			System.out.println(num+" is Prime");
		}else {
			System.out.println(num+" is not Prime");
		}
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
