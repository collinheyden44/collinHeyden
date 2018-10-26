package oOP;

public class Circle {


	private double radius;
	
	public Circle() {
		radius = 4.0;
	}
	
	public Circle(double newRadius) {
		radius = newRadius;
	}	
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double circumference() {
		return 2 * radius * Math.PI;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
}
