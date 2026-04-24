package practice;

public class Function_Parameter {
	public static void main(String[] args) {
		int sum = sumOfTwoNumbers(4, 5);
		System.out.println(sum);
		System.out.println(sumOfTwoNumbers(2, 3));
		System.out.println(sumOfTwoNumbers(10, -10));
	}

	public static int sumOfTwoNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
