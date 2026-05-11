package oops;

public class ArrayOperations {
	private int arr[];

	public ArrayOperations(int[] arr) {
		super();
		this.arr = arr;
	}

	public class Statistics {
		double mean() {
			double sum = 0;
			for (int i : arr) {
				sum += i;
			}
			return sum / arr.length;
		}

		double median() {
			return 0;
		}
	}
}
