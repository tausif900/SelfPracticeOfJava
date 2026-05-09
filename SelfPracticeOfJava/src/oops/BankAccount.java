package oops;

public class BankAccount {
	private String accountHolderName;
	private String accountNumber;
	private double accountbalance;

	public BankAccount(String accountHolderName, String accountNumber) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
	}

	public void depositAmount(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Deposit");
		} else {
			accountbalance += amount;
			System.out.println("Amount Deposited");
		}
	}

	public double withdrawAmount(double amount) {
		if (amount >= accountbalance) {
			System.out.println("Insufficient balance");
		} else {
			accountbalance -= amount;
			System.out.println("Amount withdrawl");
		}
		return amount;
	}

	void balance() {
		System.out.println("Your current balance is: " + accountbalance);
	}
}
