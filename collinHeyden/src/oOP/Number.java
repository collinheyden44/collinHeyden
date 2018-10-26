package oOP;

public class Number {
	
	public Number() {
		
	}
	
	public void sayNumber(double num) {
		System.out.println("You sent " + num + " to the method");
	}
	
	public void sayNumberPart2(double num) {
		num = num + 2;
		System.out.println(num);
	}
	
	public void sayNum(double num, double num2) {
		System.out.println(num + num2);
	}
	
	public int returnRoundUp(double number) {
		return (int)Math.ceil(number);
	}
}
