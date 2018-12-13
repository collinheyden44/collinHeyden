package arrays;

import java.util.Random;

public class RectangleTest2 {

	public static void main(String[] args) {
		
		Rectangle [ ] boxes = new Rectangle[100];
		
		Random generator = new Random();
		
		for(int i = 0; i < boxes.length; i++) {
			boxes[i]=new Rectangle((generator.nextInt(47)+10),(generator.nextInt(47)+10));	
		}
		
		double smallestArea = boxes[0].area();
		int smallestIndex = 0;

		for(int j = 1; j < boxes.length; j++) {
			if (boxes[j].area() < smallestArea) {
				smallestArea = boxes[j].area();
				smallestIndex = j;		
			}
			
		}
		
		Rectangle temp = boxes[smallestIndex];
		boxes[smallestIndex] = boxes[0];
		boxes[0] = temp;
		
		for (int k = 0; k < boxes.length; k++) {
			System.out.println(boxes[k]);
		}
	
	}

}
