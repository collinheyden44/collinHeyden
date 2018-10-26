package oOP;

public class RightTriangle {

	private double base;
	private double height;

	public RightTriangle() {
	base = 4;
	height = 3;
	}

	public RightTriangle(double newBase, double newHeight) {
	base = newBase;
	height = newHeight;
	}

	public double getBase() {
	return base;
	}

	public double getHeight() {
	return height;
	}

	public double hypotenuse() {
	return Math.hypot(base, height);
	}

	public double perimeter() {
	return base + height + Math.hypot(base, height);
	}

	public double area() {
	return (base * height) * 0.5;
	}

	public void setBase(double newBase) {
	base = newBase;
	}

	public void setHeight(double newHeight) {
	height = newHeight;
	}

}
