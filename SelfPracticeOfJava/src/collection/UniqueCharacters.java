package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
	public static void main(String[] args) {
		Set<Character> unique = new HashSet<Character>();
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string:");
		String userString = input.next();

		for (Character character : userString.toCharArray()) {
			unique.add(character);
		}
		System.out.println(unique.size());
	}
}
