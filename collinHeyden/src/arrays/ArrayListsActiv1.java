package arrays;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListsActiv1 {

	public static void main(String[] args) {
		
		Random generator = new Random();
		int min = 50;
		int max = 70;
		
		ArrayList<RectangleArrayLists> rectangle = new ArrayList<RectangleArrayLists>();
		
		for(int i = 0; i < 400; i++) {
			rectangle.add(new RectangleArrayLists((min + generator.nextInt(max - min + 1)), (min + generator.nextInt(max - min + 1))));
		}
		
		System.out.println("\n" + "Rectangle Areas in ArrayList in Order:");
		for(int j = 0; j < rectangle.size(); j++) {
			System.out.println(rectangle.get(j).returnArea());
		}
		
		System.out.println("\n" + "Rectangle Areas in ArrayList in Reverse Order:");
		for(int k = rectangle.size() - 1; k > 0; k--) {
			System.out.println(rectangle.get(k).returnArea());

		}

	}

}
