package oOP;

public class IsoscelesTrapezoidTest {

	public static void main(String[] args) {

			IsoscelesTrapezoid bob = new IsoscelesTrapezoid();
			System.out.println("Base 1: "+bob.getBase1());
			System.out.println("Base 2: "+bob.getBase2());
			System.out.println("Leg:  "+bob.getLeg());
			System.out.println("Height: "+bob.getHeight());
			System.out.println("Area: "+bob.area());
			
			bob.setBase1(20);
			bob.setBase2(20);
			bob.setLeg(20);
			bob.setHeight(20);
			System.out.println("Base 1: "+bob.getBase1());
			System.out.println("Base 2: "+bob.getBase2());
			System.out.println("Leg: "+bob.getLeg());
			System.out.println("Height: "+bob.getHeight());
			System.out.println("Area: "+bob.area());
			
			IsoscelesTrapezoid jeff = new IsoscelesTrapezoid(10,12,12,10);
			System.out.println("Base 1: "+jeff.getBase1());
			System.out.println("Base 2: "+jeff.getBase2());
			System.out.println("Leg: "+jeff.getLeg());
			System.out.println("Height: "+jeff.getHeight());
			System.out.println("Area: "+jeff.area());

	}
}