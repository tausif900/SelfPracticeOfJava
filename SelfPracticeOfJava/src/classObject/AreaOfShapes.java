package classObject;

public class AreaOfShapes {
	int length;
	int breadth;
	int radius;

	public AreaOfShapes(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public AreaOfShapes(int radius) {
		this.radius = radius;
	}

//	Method or functions

	int areaOfRectangle() {
		return this.length * this.breadth;
	}

	int areaOfSquare() {
		return this.radius * this.radius;
	}

	double areaOfCircle() {
		return (2 * Math.PI * this.radius * this.radius);
	}
}
