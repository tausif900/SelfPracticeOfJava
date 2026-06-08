package optionalString;

public class Employees {
	private String name;
	private int salary;

	public Employees(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees{name=" + ", salary=" + salary + "}";
	}

}
