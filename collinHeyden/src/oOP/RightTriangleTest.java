package oOP;

public class RightTriangleTest {

	public static void main(String[] args) {
		RightTriangle bob = new RightTriangle();
		System.out.println("Base = " + bob.getBase());
		System.out.println("Height = " + bob.getHeight());
		System.out.println("Hypotenuse = " + bob.hypotenuse());
		System.out.println("Perimeter = " + bob.perimeter());
		System.out.println("Area = " + bob.area());
		bob.setBase(10);
		bob.setHeight(4);
		System.out.println("\n" + "Base = " + bob.getBase());
		System.out.println("Height = " + bob.getHeight());
		System.out.println("Hypotenuse = " + bob.hypotenuse());
		System.out.println("Perimeter = " + bob.perimeter());
		System.out.println("Area = " + bob.area());
		bob = new RightTriangle(18, 14);
		System.out.println("\n" + "Base = " + bob.getBase());
		System.out.println("Height = " + bob.getHeight());
		System.out.println("Hypotenuse = " + bob.hypotenuse());
		System.out.println("Perimeter = " + bob.perimeter());
		System.out.println("Area = " + bob.area());
	}

}
