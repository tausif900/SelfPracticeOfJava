package abstractionANDinterface;

public class Square1 extends Shapes {

	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	double calculateArea() {
		return Math.pow(side, 2);
	}

}
