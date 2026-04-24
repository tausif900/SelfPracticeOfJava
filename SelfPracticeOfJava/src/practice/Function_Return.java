package practice;

import java.util.Scanner;

public class Function_Return {

	public static void main(String[] args) {
		greeting();
		int first = readNumbers();
		int second = readNumbers();
		int sum = first + second;
		System.out.println(sum);
	}

//	Created a function called greeting
	public static void greeting() {
		System.out.println("Welcome to Calculate");
	}

//	Created a function called readNumber with return keyword that is returning int from the function 
	public static int readNumbers() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		return number;
	}
}
