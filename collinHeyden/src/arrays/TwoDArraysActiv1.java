package arrays;

import java.util.Random;

public class TwoDArraysActiv1 {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		final int maxRows = 14;
		final int maxColumns = 9;
		final int max = 100;
		final int min = 0;
		
		int[][] tests = new int[maxRows][maxColumns];
		
		for(int row = 0; row < maxRows; row++) {
			for(int column = 0; column < maxColumns; column++) {
				tests[row][column] = min + generator.nextInt(max -  min + 1);
			}
		}
		
		for(int row = 0; row < maxRows; row++) {
			for(int column = 0; column < maxColumns; column++) {
				System.out.printf("%4d ", tests[row][column]);
			}
			System.out.println();
		}

	}

}
		
