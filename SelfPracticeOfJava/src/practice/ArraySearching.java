package practice;

import java.util.Scanner;

public class ArraySearching {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = { 10, 35, 64, 52, 24, 79 };
		System.out.print("Enter a number you want to search: ");
		int num = input.nextInt();
		boolean isFound = isfound(array, num);
		if (isFound) {
			System.out.println("Your number is found");
		} else {
			System.out.println("Your number is not found");
		}
	}

	public static boolean isfound(int array[], int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return true;
			}
		}
		return false;
	}
}
