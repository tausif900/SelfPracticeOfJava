package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyMethod {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2, 4, 5, 4, 2, 1);
		System.out.println(Collections.frequency(numList, 4));
		System.out.println(Collections.frequency(numList, 2));
		System.out.println(Collections.frequency(numList, 5));
	}
}
