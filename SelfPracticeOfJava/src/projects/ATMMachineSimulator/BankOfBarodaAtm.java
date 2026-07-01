package projects.ATMMachineSimulator;

public class BankOfBarodaAtm {

	private double balance;

	public BankOfBarodaAtm() {

	}

	public BankOfBarodaAtm(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void checkBalance() {
		System.out.println("Your current balance is: " + balance);
	}

	public boolean depositMoney(int amount) {
		if (amount > 0) {
			this.balance += amount;
			return true;
		}
		return false;
	}

	public boolean withdrawMoney(int amount) {
		if (balance == 0) {
			System.out.println("You have 0 balance left!!!");
		} else if (amount > balance) {
			System.out.println("Entered Amount is more than balance amount");
		} else if (amount <= 0) {
			System.out.println("Entered amount is invalid");
		} else {
			this.balance -= amount;
			return true;
		}
		return false;
	}
}
