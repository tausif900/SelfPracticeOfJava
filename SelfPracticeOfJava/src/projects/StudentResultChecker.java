package projects;

import java.util.Scanner;

public class StudentResultChecker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student name: ");
		String studentName = input.nextLine();
		System.out.println("Name of the student is " + studentName);
		int totalMarks = 150;
		boolean backLog = false;
		String result;

		System.out.println("Enter Marks of 3 subjects:");
		int marksArray[] = new int[3];
		for (int i = 0; i < marksArray.length; i++) {
			System.out.println("Enter Marks: ");
			marksArray[i] = input.nextInt();
			if (marksArray[i] < 35) {
				backLog = true;
			}
		}

		if (backLog) {
			System.out.println("Result: Fail(BackLog)");
		} else {
			int calculateMarks = 0;
			for (int m : marksArray) {
				calculateMarks += m;
			}
			System.out.println("Total Marks are: " + calculateMarks);

			int percentage = calculateMarks * 100 / totalMarks;
			System.out.println("Percentage is: " + percentage);

			if (percentage >= 90 && percentage < 100) {
				result = "Distinct";
			} else if (percentage >= 70 && percentage <= 89) {
				result = "Good";
			} else if (percentage >= 40 && percentage <= 69) {
				result = "Pass";
			} else {
				result = "Fail";
			}

			System.out.println("Result: " + result);
		}
	}
}
