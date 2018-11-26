package randomNums;

import java.util.Random;

public class FlipACoin {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		
		int heads = 0;
		double headsMax = 0.01;
		double headsMin = 1.00;
		
		
		for(int j = 1; j <= 1000; j++) {
			for(int k = 1; k <= 1000; k++) {
			
				int min = 1;
				int max = 0;
			
				int randomNum = min + generator.nextInt(max -  min + 1);
			
				if(randomNum > 0) {
					heads++;
					
				}
			
			}
			
			if(heads / 1000.00 < headsMin) {
				headsMin = heads / 1000.00;
			}
			else if(heads / 1000.00 > headsMax) {
				headsMax = heads / 1000.00;
			}
			
		}
		
		System.out.println("Maximum Heads Percentage: " + headsMax);
		System.out.println("Minimum Heads Percentage: " + headsMin);

	}

}
