package classObject;

public class Shapes {

	public static void main(String[] args) {
		
		AreaOfShapes rectangle1 = new AreaOfShapes(20, 30);
		System.out.println("Area of a Rectangle is " + rectangle1.areaOfRectangle());

		AreaOfShapes square1 = new AreaOfShapes(4);
		System.out.println("Area of a Square is " + square1.areaOfSquare());

		AreaOfShapes circle1 = new AreaOfShapes(5);
		System.out.println("Area of a Circle is " + circle1.areaOfCircle());

	}
}
