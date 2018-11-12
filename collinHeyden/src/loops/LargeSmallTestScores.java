package loops;

import java.util.Scanner;

public class LargeSmallTestScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double test = 0;
		double testHigh = 0.0;
		double testLow = 100.0;
		while(test != 9999 && test >= 0) {
			System.out.println("What is your test score? (ex. 0.97) - 9999 to quit");
			test = input.nextDouble();
			
			if(test > testHigh && test != 9999) {
				testHigh = test;
			}
			
			if(test < testLow) {
				testLow = test;
			}
		}
		
		System.out.println("Your Highest Test Score Was: " + testHigh);
		System.out.println("Your Lowest Test Score Was: " + testLow);
		input.close();
	}

}
