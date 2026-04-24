package challenges;

import java.util.Scanner;

public class _15_Bitwise_Op {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = input.nextInt();
		System.out.println("Enter second number");
		int num2 = input.nextInt();
		System.out.println("Bitwise And: " + (num1 & num2));
		System.out.println("Bitwise OR: " + (num1 | num2));
		System.out.println("Bitwise XOR: " + (num1 ^ num2));
		System.out.println("Bitwise NOT: " + (~num1));
		System.out.println("Bitwise LEFT SHIFT: " + (num1 << 1));
		System.out.println("Bitwise RIGHT SHIFT: " + (num1 >> 1));
	}
}
