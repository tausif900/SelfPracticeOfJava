package FuctionalIntf;

import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
//		FunctionalInf functionalInf = new FunctionalInf() {
//
//			@Override
//			public boolean isPrime(int num) {
//				if (num % 2 == 0) {
//					return true;
//				}
//				return false;
//			}
//		};
//		System.out.println(functionalInf.isPrime(5));

		FunctionalInf prime = num -> {
			if (num % 2 == 0) {
				return true;
			}
			return false;
		};
		System.out.println(prime.isPrime(200));
		System.out.println("----------------------------------------");
		TestingFactorial factorial = (num) -> {
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			return fact;
		};
		System.out.println("Fctorial is:" + factorial.factorial(5));
		System.out.println("----------------------------------------");
		IntStream.rangeClosed(1, 5).reduce((a, b) -> a * b).ifPresent(System.out::println);
	}
}
