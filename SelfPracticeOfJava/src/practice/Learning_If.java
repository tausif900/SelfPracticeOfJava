package practice;

public class Learning_If {

	public static void main(String[] args) {
		System.out.println("Check Whether a person is Male of Female:");
		boolean isMale = true;
		String name = "Tausif";
		if (isMale) {
			System.out.println("Mr." + name + " is Male");
		} else {
			System.out.println("Ms." + name + " is Female");
		}

		System.out.println("==============================================");

		boolean isSeniorCitizen = false;
		boolean isAdult = true;
		if (isSeniorCitizen) {
			System.out.println("Hello Senior Citizen");
		} else if (isAdult) {
			System.out.println("Hello Adult");
		} else {
			System.out.println("Hello Child");
		}
	}
}
