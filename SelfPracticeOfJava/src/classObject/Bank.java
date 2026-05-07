package classObject;

public class Bank {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Tausif", 20000);
		BankAccount b2 = new BankAccount("Amit", 4000);

		b1.displayBalance();
		b1.withdraw(25000);

		b2.displayBalance();
		b2.withdraw(5000);
	}
}
