package Streams;

import java.util.List;

public class Stream1 {
	public static void main(String[] args) {
		List<String> names = List.of("Tausif", "Saif", "Khadija", "Faisal", "Kanuja", "Tanuja");
		names.stream().filter(n -> n.startsWith("S")).forEach(n -> System.out.println(n));
	}
}
