package loops;

import java.util.Scanner;

public class LargeSmallTestScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double test = 0.0;
		double testHigh = 100.0;
		double testLow = 0.0;
		while(test != 9999) {
			System.out.println("What is your test score? (ex. 0.97)");
			test = input.nextDouble();
			
			if(test)
		}
		
		System.out.println("Your Highest Test Score was: " + testHigh);
		System.out.println("Your Lowest Test Score Was: " + testLow);

	}

}
