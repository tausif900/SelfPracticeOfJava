package challenges;

import java.util.Scanner;

public class _30_NoOfOccurance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int arrSize = input.nextInt();
		int array[] = new int[arrSize];

		System.out.print("Enter the elements of an array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		System.out.print("Enter a number you want to find: ");
		int num = input.nextInt();

		int count = noOfOccurance(array, num);
		System.out.println("Your number occurs " + count + " times");
	}

	public static int noOfOccurance(int array[], int num) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				count++;
			}
		}
		return count;
	}
}
