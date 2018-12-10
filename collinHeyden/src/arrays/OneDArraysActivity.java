package arrays;

import java.util.Scanner;

public class OneDArraysActivity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int maxStudents = 10;
		double[] scores = new double[maxStudents];
		
		for(int i = 0; i < maxStudents; i++) {
			System.out.println("Please type in your students");
			scores[i] = input.nextDouble();
		}
	
		for(int j = 0; j < maxStudents; j++) {
			System.out.println(scores[j]);
			}
		input.close();
	}

}
