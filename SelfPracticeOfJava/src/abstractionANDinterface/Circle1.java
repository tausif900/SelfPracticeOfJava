package abstractionANDinterface;

public class Circle1 extends Shapes {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
