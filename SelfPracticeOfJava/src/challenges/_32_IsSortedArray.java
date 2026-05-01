package challenges;

import java.util.Scanner;

public class _32_IsSortedArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int arrSize = input.nextInt();
		int array[] = new int[arrSize];

		System.out.print("Enter the elements of an array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		boolean isInc = isIncreasing(array);
		boolean isDec = isDecreasing(array);

		if (isInc || isDec) {
			System.out.println("Your array is sorted");
		} else {
			System.out.println("Your array is not sorted");
		}
	}

	public static boolean isIncreasing(int array[]) {
		int i = 1;
		while (i < array.length) {
			if (array[i] < array[i - 1]) {				//agar mera element e.g.....array[2]<array[2-1]se to false return krdo
				return false;
			}
			i++;
		}
		return true;
	}

	public static boolean isDecreasing(int array[]) {
		int i = 1;
		while (i < array.length) {
			if (array[i] > array[i - 1]) {				//agar mera element e.g.....array[2]>array[2-1]se to false return krdo
				return false;
			}
			i++;
		}
		return true;
	}
}
