package oOP;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle() {
		length = 4.0;
		width = 5.0;
	}
	
	public Rectangle(double newLength, double newWidth) {
		length = newLength;
		width = newWidth;
	}			
	
	public double returnLength() {
		return length;
	}
	
	public double returnWidth() {
		return width;
	}
	
	public double perimeter() {
		return (length * 2) + (width * 2);
		
	}
	
	public double area() {
		return length * width;
	}
	
	public void changeLength(double newLength) {
		length = newLength;
	}
	
	public void changeWidth(double newWidth) {
		width = newWidth;
	}
}