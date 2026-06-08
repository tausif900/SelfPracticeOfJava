package optionalString;

import java.util.List;


public class Example2 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 2, 5, 3, 4, 6, 2);

		List<Integer> distinct = numbers.stream().distinct().toList();
		System.out.println(distinct);
	}
}
