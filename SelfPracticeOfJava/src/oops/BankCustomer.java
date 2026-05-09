package oops;

public class BankCustomer {
	public static void main(String[] args) {
		BankAccount c1 = new BankAccount("3601", "Tausif");
		c1.depositAmount(5000);
		c1.balance();
		c1.withdrawAmount(4000);
		c1.balance();
	}
}
