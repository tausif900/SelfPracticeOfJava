package challenges;

import java.net.Socket;
import java.util.Scanner;

public class _27_Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		if (isPalidrome(num)) {
			System.out.println("Number is Palidrome");
		} else {
			System.out.println("Number is not Palidrome");
		}
	}

//	Function
	public static boolean isPalidrome(int num) {
		int og = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + (num % 10);
			num = num / 10;
		}
		return rev == og;
	}
}
