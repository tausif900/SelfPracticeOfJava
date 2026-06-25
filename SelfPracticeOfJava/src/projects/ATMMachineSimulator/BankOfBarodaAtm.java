package projects.ATMMachineSimulator;

public class BankOfBarodaAtm {

	private double balance;

	public BankOfBarodaAtm() {

	}

	public BankOfBarodaAtm(double balance) {
		this.balance = balance;
	}

	public void checkBalance() {
		System.out.println("Your current balance is: " + balance);
	}

	public void depositMoney(int amount) {
		if (amount != 0 && amount > 0) {
			this.balance += amount;
			System.out.println("Your current balance is: " + balance);
		} else {
			System.out.println("Entered amount is invalid");
		}
	}

	public void withdrawMoney(int amount) {
		if (balance == 0) {
			System.out.println("You have 0 balance left!!!");
		} else if (amount > balance) {
			System.out.println("Entered Amount is more than balance amount");
		} else if (amount < 0) {
			System.out.println("Entered amount is invalid");
		} else {
			this.balance -= amount;
			System.out.println("Your current balance is: " + balance);
		}
	}
}
