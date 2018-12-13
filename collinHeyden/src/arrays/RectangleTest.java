package arrays;

import java.util.Random;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle[] boxes = new Rectangle[100];
		
		Random generator = new Random();
		
		for(int i = 0; i < boxes.length; i++) {
			boxes[i] = new Rectangle((generator.nextInt(47)+1), (generator.nextInt(47)+10)); 
		}
		
		for(int k = 0; k < 100; k++) {
			System.out.println("\n");
			System.out.println("Rectangle " + (k+1) + ":");
			System.out.println("Length: " + boxes[k].getLength());
			System.out.println("Width: " + boxes[k].getWidth());
			System.out.println("Area: " + boxes[k].area());
		}

	}

}
