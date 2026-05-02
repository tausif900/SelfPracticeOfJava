package challenges;

import java.util.Scanner;

public class _35_PalindromeArray {
	public static void main(String[] args) {
//		Scanner to take inputs
		Scanner input = new Scanner(System.in);

//		Input taken...
		System.out.print("Enter the size of an array you want to insert: ");
		int size = input.nextInt();
		int array[] = new int[size];

//		To take elements of an array from the user
		System.out.println("Enter the elements os an array");
		int i = 0;
		while (i < array.length) {
			array[i] = input.nextInt();
			i++;
		}

		boolean isPalindrome = isPalindromeArray(array);
		if (isPalindrome) {
			System.out.println("Your array is Palindrome");
		} else {
			System.out.println("Your array is not Palindrome");
		}
	}

//	Function
	public static boolean isPalindromeArray(int array[]) {
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] != array[array.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}
