package oOP;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle bob = new Rectangle();
		System.out.println("Length: " + bob.returnLength());
		System.out.println("Width: " + bob.returnWidth());
		System.out.println("Perimeter: " + bob.perimeter());
		System.out.println("Area: " + bob.area());
		
		bob = new Rectangle(10.0, 12.0);
		System.out.println("\n" + "Length: " + bob.returnLength());
		System.out.println("Width: " + bob.returnWidth());
		System.out.println("Perimeter: " + bob.perimeter());
		System.out.println("Area: " + bob.area());
		
		bob.changeLength(12);
		System.out.println("\n" + "Length: " + bob.returnLength());
		System.out.println("Width: " + bob.returnWidth());
		System.out.println("Perimeter: " + bob.perimeter());
		System.out.println("Area: " + bob.area());
		
		bob.changeWidth(20);
		System.out.println("\n" + "Length: " + bob.returnLength());
		System.out.println("Width: " + bob.returnWidth());
		System.out.println("Perimeter: " + bob.perimeter());
		System.out.println("Area: " + bob.area());
	}

}
