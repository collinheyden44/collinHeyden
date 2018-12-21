package arrays;

import java.util.Random;
import java.util.Scanner;

public class TwoDArraysLengthConstants {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Random generator = new Random();
		
		final int max = 100;
		final int min = 0;
		
		System.out.println("Number of Rows:");
		int maxRows = input.nextInt();
		System.out.println("Number of Columns:");
		int maxColumns = input.nextInt();
		
		Double tests[][] = new Double[maxRows][maxColumns];
		
		for(int row = 0; row < tests.length; row++) {
			for(int column = 0; column < tests[0].length; column++) {
				tests[row][column] = (double) (min + generator.nextInt(max -  min + 1));
			}
		}
		
		for(int row = 0; row < tests.length; row++) {
			for(int column = 0; column < tests[0].length; column++) {
				System.out.println(tests[row][column]);
			}
			System.out.println();
		}
		
		input.close();

	}

}
