package oops;

public class ArrayTest {
	public static void main(String[] args) {
		ArrayOperations array = new ArrayOperations(new int[] { 1, 3, 5, 9 });
		ArrayOperations.Statistics statistics = array.new Statistics();
		System.out.println(statistics.mean());
	}
}
