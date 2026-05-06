package classObject;

public class BankAccount {
	String accountHolder;
	int balance;

	public BankAccount(String accountHolder, int balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	int deposit(int amount) {
		this.balance = this.balance + amount;
		System.out.println("Balance after deposit " + amount + " is " + this.balance);
		return this.balance;
	}

	int withdraw(int amount) {

		if (amount > this.balance) {
			System.out.println("Entered amount is more than a Balance amount");
		} else {
			this.balance = this.balance - amount;
			System.out.println("Balance after removing " + amount + " is " + this.balance);
		}
		return this.balance;
	}

	void displayBalance() {
		System.out.println("Balanace is: " + this.balance);
	}
}
