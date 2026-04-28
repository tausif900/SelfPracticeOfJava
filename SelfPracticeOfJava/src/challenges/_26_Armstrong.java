package challenges;

import java.util.Scanner;

public class _26_Armstrong {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		boolean isArmstrong = isArmstrong(num);
		System.out.println(isArmstrong);
		if (isArmstrong) {
			System.out.println(num + " is Armstrong");
		} else {
			System.out.println(num + " is not Armstrong");
		}
	}

//	Function
	public static boolean isArmstrong(int num) {
		int noOfDigits = noOfDigit(num);
		int numCopy = num;
		int finalNum = 0;
		for (int i = 0; i < noOfDigits; i++) {
			int lastDigit = num % 10;
			num = num / 10;
			finalNum = finalNum + power(lastDigit, noOfDigits);
		}
		return finalNum == numCopy;
	}

//	Function
	public static int noOfDigit(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

//	Function
	public static int power(int a, int b) {
		int result = 1;
		for (int i = 1; i <= b; i++) {
			result = result * a;
		}
		return result;
	}
}
