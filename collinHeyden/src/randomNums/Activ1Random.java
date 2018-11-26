package randomNums;

import java.util.Random;

public class Activ1Random {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		int heads = 0;
		int tails = 0;
		
		for(int j = 1; j <= 100000; j++) {
			
			int min = 0;
			int max = 1;
			
			int randomNum = min + generator.nextInt(max -  min + 1);
			
			if(randomNum == 1) {
				tails++;
			}
			else {
				heads++;
			}
			
		}
		
		System.out.println("Heads: " + heads);
		System.out.println("Tails: " + tails);


	}

}