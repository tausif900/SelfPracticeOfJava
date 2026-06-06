package Streams;

import java.util.List;

public class Stream2 {
	public static void main(String[] args) {
		List<String> names = List.of("TausifurRehman", "SaifAnsari", "KhadijaBano", "FaisalQureshi", "Kanuja",
				"Tanuja");
		String name = names.stream().filter(n -> n.length() > 10).reduce("", (a, b) -> a + " " + b);
System.out.println(name);
	}
}
