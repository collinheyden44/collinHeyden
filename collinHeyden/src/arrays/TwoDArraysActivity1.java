package arrays;

import java.util.Scanner;
import java.util.Random;

public class TwoDArraysActivity1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Random generator = new Random();
		
		int[][][] numbers = new int[3][7][9];
		
		int sum = 0;
		
		for(int dim1 = 0; dim1 < numbers.length; dim1++) {
			for(int dim2 = 0; dim2 < numbers[0].length; dim2++) {
				for(int dim3 = 0; dim3 < numbers[0][0].length; dim3++) {
					numbers[dim1][dim2][dim3] = generator.nextInt(51);
				}
			}
		}
		
		for(int dim1 = 0; dim1 < numbers.length; dim1++) {
			for(int dim2 = 0; dim2 < numbers[0].length; dim2++) {
				for(int dim3 = 0; dim3 < numbers[0][0].length; dim3++) {
					sum += numbers[dim1][dim2][dim3];
				}
			}
		}
		
		System.out.println("Sum of Numbers: " + sum);
		input.close();

	}

}
