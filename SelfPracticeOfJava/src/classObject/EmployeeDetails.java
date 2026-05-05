package classObject;

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee e1 = new Employee("Tausif", 50000);
		Employee e2 = new Employee("Saif", 25000);
		Employee e3 = new Employee("Khadija", 20000);

		e1.display();
		e2.display();
		e3.display();
	}
}
