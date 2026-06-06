package Streams;

import java.util.List;

public class Stream3 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(10, 3, 6, 9, 12, 11);
		numbers.stream().filter(num -> num % 2 == 1).forEach(num -> System.out.println(num));
	}
}
