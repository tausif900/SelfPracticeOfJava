package practice;

public class UnaryOperator {

	public static void main(String[] args) {
//	Unary Operators
		int x = 5;
		int y = -x;
		int z = -y;
		System.out.println(z);
//	Increment
		int p = 10;
//		Post Increment
		System.out.println(p++);
		System.out.println(p);
//		Pre Increment
		System.out.println(++p);
		System.out.println(p);

//		Decrement
		int q = 20;
//		Post Decrement
		System.out.println(q--);
		System.out.println(q);
//		Pre Decrement
		System.out.println(--q);
		System.out.println(q);
	}

}
