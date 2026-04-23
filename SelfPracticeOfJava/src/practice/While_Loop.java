package practice;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		int n = 1;
		while (n <= 10) {
			System.out.println(n);
			n++;
		}

//		Reverse a number using Loop
		int a = 500;
		while (a >= 200) {
			System.out.println(a);
			a--;
		}

//		taking input 
		Scanner input = new Scanner(System.in);
		int b = 0;
		while (b < 5) {
			System.out.print("Enter a number");
			int c = input.nextInt();
			System.out.println(c);
			b++;
		}
	}
}
