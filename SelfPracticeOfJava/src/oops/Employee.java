package oops;

public class Employee {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	String employeeDetails() {
		return "Employee Details: Name: " + name + ", Id: " + id + ", Age: " + age + ", Salary: " + salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		} else {
			System.out.println("Employee id cann't be negative");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		} else {
			System.out.println("Name cann't be empty");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
