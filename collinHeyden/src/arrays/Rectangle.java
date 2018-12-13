package arrays;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle( ) {
		length = 10;
		width = 5;	
	}

	public Rectangle(double newL, double newW) {
		length = newL;
		width = newW;	
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double perimeter( ) {
		return 2 * length + 2 * width;
	}

	public double area( ) {
		return length * width;	
	}

	public void setlength(double newL) {
		length = newL;
	}

	public void setWidth(double newW) {
		width = newW;	
	}

}
