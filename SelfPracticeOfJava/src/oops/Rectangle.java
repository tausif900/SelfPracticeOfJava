package oops;

public class Rectangle {
	private int length;
	private int breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if (length > 0) {
			this.length = length;
		} else {
			System.out.println("Length cann't be negative");
		}
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		if (breadth > 0) {
			this.breadth = breadth;
		} else {
			System.out.println("Breadth cann't be negative");
		}
	}

	int areaOfRectangle() {
		return length * breadth;
	}

}
