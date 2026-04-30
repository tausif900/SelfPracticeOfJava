package challenges;

import java.util.Scanner;

public class _29_ArraySumAvg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int size = input.nextInt();
		int num[] = new int[size];

		System.out.print("Please enter element no: ");
		for (int i = 0; i < size; i++) {
			num[i] = input.nextInt();
		}
		

		long sum = sum(num);
		long average = average(num);

		System.out.println("Sum of an element of an array is: " + sum);
		System.out.println("Average of an element of an array is: " + average);
	}

	public static long sum(int num[]) {
		int sum = 0;
		for (int i : num) {
			sum = sum + i;
		}
		return sum;
	}

	public static long average(int num[]) {
		int average = 0;
		average = (int) (sum(num) / num.length);
		return average;
	}
}
