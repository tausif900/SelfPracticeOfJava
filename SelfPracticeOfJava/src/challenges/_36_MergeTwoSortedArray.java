package challenges;

import java.util.Scanner;

public class _36_MergeTwoSortedArray {
	public static void main(String[] args) {
		int arr1[] = inputArray();
		int arr2[] = inputArray();

		int mergeArr[] = mergeArray(arr1, arr2);
		System.out.println("Your merge array is:");

		_33_DeleteFromArray.displayArray(mergeArr);
	}

	public static int[] inputArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of an array you want to insert: ");
		int size = input.nextInt();
		int array[] = new int[size];

		System.out.println("Enter the elements os an array");
		int i = 0;
		while (i < array.length) {
			array[i] = input.nextInt();
			i++;
		}
		return array;
	}

	public static int[] mergeArray(int arr1[], int arr2[]) {
		int newSize = arr1.length + arr2.length;
		int mergeArray[] = new int[newSize];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length || j < arr2.length) {
			if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
				mergeArray[k] = arr1[i];
				i++;
				k++;
			} else {
				mergeArray[k] = arr2[j];
				j++;
				k++;
			}
		}
		return mergeArray;
	}
}
