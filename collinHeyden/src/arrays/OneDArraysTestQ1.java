package arrays;

import java.util.Arrays;
import java.util.Random;

public class OneDArraysTestQ1 {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		int[] dice = new int[487];
		
		
		int max = 6;
		int min = 1;
		
		for(int k = 0; k < dice.length; k++) {
			dice[k] = min + generator.nextInt(max - min + 1);
		}
		
		System.out.println(Arrays.toString(dice));
	}

}
