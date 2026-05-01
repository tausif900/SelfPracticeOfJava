package challenges;

import java.util.Scanner;

public class _31_MaxMinArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int array[] = new int[5];

		System.out.print("Enter an element 5 times:");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		int max = maximum(array);
		System.out.println("Maximum number from an array is " + max);

		int min = minimum(array);
		System.out.println("Minimum number from an array is " + min);
	}

//	Function
	public static int maximum(int array[]) {
		int max = array[0];
		for (int n : array) {
			if (n > max) {
				max = n;
			}
		}
		return max;
	}

//	Function
	public static int minimum(int array[]) {
		int min = array[0];
		for (int n : array) {
			if (n < min) {
				min = n;
			}
		}
		return min;
	}

}
