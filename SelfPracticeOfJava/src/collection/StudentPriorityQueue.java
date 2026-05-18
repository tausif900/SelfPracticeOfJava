package collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Student> queue = new PriorityQueue<StudentPriorityQueue.Student>(
				(a, b) -> a.getGrade() - b.getGrade());
		queue.offer(new Student("Tausif", 'A'));
		queue.offer(new Student("Saif", 'B'));
		queue.offer(new Student("Tonny", 'A'));
		queue.offer(new Student("Khatija", 'C'));
		queue.offer(new Student("Nimra", 'D'));

		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

	private static class Student {
		private final String name;
		private final char grade;

		public String getName() {
			return name;
		}

		public char getGrade() {
			return grade;
		}

		public Student(String name, char grade) {
			super();
			this.name = name;
			this.grade = grade;
		}

		@Override
		public String toString() {
			return "[name=" + name + ", grade=" + grade + "]";
		}

	}

}
