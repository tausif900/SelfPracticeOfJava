package challenges;

import java.util.Scanner;

public class _21_LCM {
	public static void main(String[] args) {
//		LCM -> Least Common Multiple...........of two numbers

		Scanner input = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int firstNum = input.nextInt();
		System.out.print("Enter Second Number: ");
		int secondNum = input.nextInt();
		int LCM = LCM(firstNum, secondNum);
		System.out.println("LCM of two number is: " + LCM);
	}

//	Function
//	logic ye hai ki LCM......dono number ke common factors kya hai , dono number me konsa number common multiple hai
	public static int LCM(int first, int second) {
		for (int i = 1; i <= second; i++) {
			int commonFactor = first * i;
			if (commonFactor % second == 0)
				return commonFactor;
		}
		return 0;	// unreachable
	}
}
