package optionalString;

import java.util.List;
import java.util.Optional;

public class Example3 {
	public static void main(String[] args) {
		List<String> numbers = List.of("1", "2", "3","4","5");
		Optional<Double> optional = numbers.stream().map(str -> Integer.parseInt(str)).map(num -> Math.pow(num, 2))
				.reduce((a, b) -> a + b);
		System.out.println(optional);
	}
}
