package optionalString;

import java.util.List;

public class MainEmployee {
	public static void main(String[] args) {
		List<Employees> employees = List.of(new Employees("Tausif", 45000), new Employees("Saif", 35000),
				new Employees("Khadija", 30000));
		List<Employees> sortedEmployees = employees.stream().sorted((o1, o2) -> o2.getSalary() - o1.getSalary())
				.toList();
		System.out.println(sortedEmployees);
	}
}
