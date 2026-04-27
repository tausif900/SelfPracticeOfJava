package challenges;

import java.util.Scanner;

public class _25_Fibonacci {
	
//	 fibonacci series:- 0 1 1 2 3 5 8 ..........
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = input.nextInt();
		fibonacci(num);
	}

//	Function
	public static void fibonacci(int num1) {
		int first = 0, second = 1;
		for (int i = 1; i < num1; i++) {
			System.out.print(first + " ");
			int third = first + second;
			first = second;
			second = third;
		}
	}
}
