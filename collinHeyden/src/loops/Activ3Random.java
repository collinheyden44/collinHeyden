package loops;

import java.util.Random;

public class Activ3Random {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		int greaterThan3Feet = 0;
		
		for(int j = 1; j <= 248; j++) {
			
			int min = 26;
			int max = 43;
			
			int randomNum = min + generator.nextInt(max -  min + 1);
			
			if(randomNum > 36) {
				greaterThan3Feet++;
			}
			
		}
		
		System.out.println("Number of people who are greater than 3 feet tall: " + greaterThan3Feet);


	}

}
