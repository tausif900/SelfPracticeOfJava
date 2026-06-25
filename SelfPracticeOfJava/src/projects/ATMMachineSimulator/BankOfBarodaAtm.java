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
		this.balance += amount;
		System.out.println("Your current balance is: " + balance);
	}

	public void withdrawMoney(int amount) {
		this.balance -= amount;
		System.out.println("Your current balance is: " + balance);
	}

}
