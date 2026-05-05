package classObject;

public class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee: " + name + "; Salary: " + salary);
	}
}
