package classObject;

public class StudentDetails {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

		s1.name = "Tausif";
		s1.age = 24;
		s1.marks = 85;
		s1.displatDetails();

		s2.name = "Saif";
		s2.age = 18;
		s2.marks = 70;
		s2.displatDetails();
	}
}
