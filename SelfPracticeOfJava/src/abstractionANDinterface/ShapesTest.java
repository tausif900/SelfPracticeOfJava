package abstractionANDinterface;

public class ShapesTest {
	public static void main(String[] args) {
		Circle1 c = new Circle1();
		c.setRadius(5);
		System.out.println(c.getRadius());
		System.out.println(c.calculateArea());
		Square1 s = new Square1();
		s.setSide(10.3);
		System.out.println(s.getSide());
		System.out.println(s.calculateArea());
	}
}
