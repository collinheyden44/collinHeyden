package arrays;

import java.util.Random;

public class TwoDArraysActiv1DifferentWay {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		final int maxRows = 14;
		final int maxColumns = 9;
		final int max = 100;
		final int min = 0;
		
		int[][] tests = new int[maxRows][maxColumns];
		
		for(int column = 0; column < maxColumns; column++) {
			for(int row = 0; row < maxRows; row++) {
				tests[row][column] = min + generator.nextInt(max -  min + 1);
			}
		}
		
		for(int column = 0; column < maxColumns; column++) {
			for(int row = 0; row < maxRows; row++) {
				System.out.printf("%4d ", tests[row][column]);			
			}
			System.out.println();
		}

	}

}
		
