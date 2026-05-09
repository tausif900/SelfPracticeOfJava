package oops;

public class Circle {
	private double radius;

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.out.println("radius cann't negative");
		}
	}

	double areaOfCircle() {
		return Math.PI * this.radius * this.radius;
	}
}