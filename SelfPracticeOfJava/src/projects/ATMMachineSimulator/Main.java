package projects.ATMMachineSimulator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		BankOfBarodaAtm user1 = new BankOfBarodaAtm(5000);

		System.out.println("========Bank Of Baroda Welcomes You========");
		while (true) {

			System.out.println("1.Check Balance");
			System.out.println("2.Deposit Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Exit");

			int choice = input.nextInt();

			switch (choice) {
			case 1:
				user1.checkBalance();
				break;
			case 2:
				System.out.print("Enter amount to deposit: ");
				int depositAmount = input.nextInt();
				user1.depositMoney(depositAmount);
				break;
			case 3:
				System.out.print("Enter amount to withdraw: ");
				int withdrawAmount = input.nextInt();
				user1.withdrawMoney(withdrawAmount);
				break;
			case 4:
				System.out.println("Thanks for visiting!!!!...Visit Again!!...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid request...");
				break;
			}
		}
	}
}
