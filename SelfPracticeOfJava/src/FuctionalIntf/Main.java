package FuctionalIntf;

public class Main {
	public static void main(String[] args) {
		FunctionalInf functionalInf = new FunctionalInf() {

			@Override
			public boolean isPrime(int num) {
				if (num % 2 == 0) {
					return true;
				}
				return false;
			}
		};
		System.out.println(functionalInf.isPrime(5));
	}
}
