package oops;

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee name = new Employee(101, "Tausif", 23, 27000);
		System.out.println(name.employeeDetails());
		name.setId(102);
		System.out.println(name.getId());
		name.setName("Saif");
		System.out.println(name.getName());
		System.out.println(name.employeeDetails());
	}
}
