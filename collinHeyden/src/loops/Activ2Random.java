package loops;

import java.util.Random;

public class Activ2Random {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		int multipleOf3 = 0;
		
		for(int j = 1; j <= 87; j++) {
			
			int min = 1;
			int max = 13;
			
			int randomNum = min + generator.nextInt(max -  min + 1);
			
			if(randomNum % 3 == 0) {
				multipleOf3++;
			}
			
		}
		
		System.out.println("Numbers rolled that are multiples of 3: " + multipleOf3);


	}

}
