package arrays;

import java.util.Scanner;

public class OneDArraysActivity2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Double max = 0.0;
		final int tests = 10;
		Double[] scores = new Double[tests];
		
		for(int i = 0; i <= scores.length; i++) {
			System.out.print("Type in tets scores");
			scores[i] = input.nextDouble();
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.print("Max Test Score: " + max);
		input.close();
	}

}
