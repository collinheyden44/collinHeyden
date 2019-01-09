package arrays;

import java.util.ArrayList;
import java.util.Random;

public class RectangleArrayListsTest {

	public static void main(String[] args) {
		
		Random generator = new Random();
		int min = 1;
		int max = 50;
		
		ArrayList<RectangleArrayLists> rectangle = new ArrayList<RectangleArrayLists>();
		
		for(int i = 0; i < 20; i++) {
			rectangle.add(new RectangleArrayLists((min + generator.nextInt(max - min + 1)), (min + generator.nextInt(max - min + 1))));
		}
		
		int minNum = 2500;
		for(int l = 0; l < rectangle.size(); l++) {
			if(rectangle.get(l).returnArea() < minNum) {
				minNum = (int) rectangle.get(l).returnArea();
				rectangle.add(19, rectangle.get(l)); 
				rectangle.remove(l);
			}
		}
		
		int maxNum = 0;
		for(int k = 0; k < rectangle.size(); k++) {
			if(rectangle.get(k).returnArea() > maxNum) {
				maxNum = (int) rectangle.get(k).returnArea();
				rectangle.add(0, rectangle.get(k)); 
				rectangle.remove(k);
			}
		}
		
		for(int j = 0; j < rectangle.size(); j++) {
				System.out.println(rectangle.get(j).returnArea());
		}
	
	}

}
