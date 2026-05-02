package challenges;

import java.util.Scanner;

public class _34_ReverseArray {
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

		reverse(array);
		System.out.println("Your reversed array is:");
		_33_DeleteFromArray.displayArray(array);
	}

	public static void reverse(int array[]) {
		for (int i = 0; i < (array.length / 2); i++) {
			int swap = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = swap;
		}
	}
}
