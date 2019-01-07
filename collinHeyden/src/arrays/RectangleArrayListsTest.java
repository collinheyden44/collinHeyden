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
		
		int maxNum = 0;
		for(int k = 0; k < rectangle.size(); k++) {
			if(rectangle.get(k).returnArea() > maxNum) {
				rectangle.add(0, rectangle.get(k));
			}
		}
		
		System.out.println(rectangle);
	
	}

}
