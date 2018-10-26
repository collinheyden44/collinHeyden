package oOP;

public class IsoscelesTrapezoid {

	private double base1;
	private double base2;
	private double height;
	private double leg;

	public IsoscelesTrapezoid() {
	base1 = 24;
	base2 = 10;
	height = 6;
	leg = 8;
	}

	public IsoscelesTrapezoid(double newBase1, double newBase2,double newLeg, double newHeight) {
	base1 = newBase1;
	base2 = newBase2;
	height = newHeight;
	leg = newLeg;
	}

	public double getBase1() {
	return base1;
	}

	public double getBase2() {
	return base2;
	}

	public double getHeight() {
	return height;
	}
	
	public double getLeg() {
	return leg;
	}

	public double perimiter() {
	return base1+base2+leg+leg;
	}
	
	public double area() {
	return ((base1+base2)/2)*height;
	}

	public void setBase1(double newBase1) {
	base1 = newBase1;
	}

	public void setBase2(double newBase2) {
	base2 = newBase2;
	}

	public void setLeg(double newLeg) {
	leg = newLeg;
	}

	public void setHeight(double newHeight) {
	height = newHeight;
	}
	
}
