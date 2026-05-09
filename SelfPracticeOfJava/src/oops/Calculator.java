
package oops;

public class Calculator {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(-2);
		System.out.println(circle.getRadius());
		System.out.println(circle.areaOfCircle());

		Rectangle rectangle = new Rectangle();
		rectangle.setLength(5);
		System.out.println(rectangle.getLength());
		rectangle.setBreadth(6);
		System.out.println(rectangle.getBreadth());
		System.out.println(rectangle.areaOfRectangle());
	}
}
