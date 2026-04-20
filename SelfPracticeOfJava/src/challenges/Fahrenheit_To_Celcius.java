package challenges;

import java.util.Scanner;

public class Fahrenheit_To_Celcius {
	public static void main(String[] args) {
		System.out.println("Welcome to Converting Fahrenheit to Celcius");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Temp in F: ");
		float F = input.nextFloat();
		float C = (F - 32) * 5 / 9;
		System.out.println("Your Temperature is: " + C + "C");
	}
}
