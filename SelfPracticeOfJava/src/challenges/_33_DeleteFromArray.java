package challenges;

import java.util.Scanner;

public class _33_DeleteFromArray {

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

//		Number taken from the user that he wants to delete
		System.out.print("Enter a number you want to delete from an array: ");
		int numToDelete = input.nextInt();

//		After Deleting number , the new array stored in the variable
		int newArray[] = deleteNumber(array, numToDelete);

//		To Display new Array
		System.out.println("Your new Array is: ");
		displayArray(newArray);

	}

//	Function to display array
	public static void displayArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

//	Function to delete a number and return a new array
	public static int[] deleteNumber(int array[], int numToDelete) {
		int occ = _30_NoOfOccurance.noOfOccurance(array, numToDelete);
		if (occ == 0) {
			return array;
		}
		int newSize = array.length - occ;
		int newArr[] = new int[newSize];

		int i = 0, j = 0;
		while (i < array.length) {
			if (array[i] != numToDelete) {
				newArr[j] = array[i];
				j++;
			}
			i++;
		}
		return newArr;
	}
}
