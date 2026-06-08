package optionalString;

import java.util.Optional;

public class Example1 {
	public static void main(String[] args) {
		System.out.println(optional(null));
		System.out.println(optional(""));
		System.out.println(optional("tausif"));
	}

	public static Optional<String> optional(String str) {
		if (str == null || str.isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(str.toUpperCase());
	}
}
