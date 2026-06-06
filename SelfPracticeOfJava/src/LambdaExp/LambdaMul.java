package LambdaExp;

import java.util.function.BinaryOperator;

public class LambdaMul {
	public static void main(String[] args) {
		BinaryOperator<Integer> mul = (a, b) -> a * b;
		System.out.println(mul.apply(4, 5));
	}
}
