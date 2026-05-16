package collection;

public class VarArgs {
	public static void main(String[] args) {
		System.out.println(concatenate("Tausif", "is", "a", "nice", "boy"));
	}

	public static String concatenate(String... strs) {
		StringBuilder sb = new StringBuilder();
		for (String string : strs) {
			sb.append(string).append(" ");
		}
		return sb.toString();
	}
}
