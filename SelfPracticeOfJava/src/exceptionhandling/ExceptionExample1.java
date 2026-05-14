package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = input.nextInt();
		int b = input.nextInt();

		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Cann't divide by Zero");
		} 
	}
}
