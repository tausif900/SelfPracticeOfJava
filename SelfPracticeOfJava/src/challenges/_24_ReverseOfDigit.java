package challenges;

import java.util.Scanner;

public class _24_ReverseOfDigit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		int reverse = reverse(num);
		System.out.println("Reverse of number is " + reverse);
	}

//	Reverse Function
	public static int reverse(int num) {
		int rev = 0;
		for (int i = 0; i < num; i++) {
			rev = rev * 10 + (num % 10);
			num = num / 10;
		}
		return rev;
	}
}
