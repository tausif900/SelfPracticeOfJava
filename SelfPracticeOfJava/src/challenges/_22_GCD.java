package challenges;

import java.util.Scanner;

public class _22_GCD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int firstNum = input.nextInt();
		System.out.print("Enter Second Number: ");
		int secondNum = input.nextInt();
		int GCD = gcd(firstNum, secondNum);
		System.out.print("GCD of the two number is: " + GCD);
	}

//	Function
//	Logic ye hai ki gcd mtlb......... dono number konse same number se divide hoga
	public static int gcd(int num1, int num2) {
		int gcd = 1;
		for (int i = 1; i <= Math.min(num1, num2); i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
}
