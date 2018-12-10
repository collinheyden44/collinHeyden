package arrays;

import java.util.Scanner;

public class OneDArraysActiv2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int maxStudents = 10;
		String[] scores = new String[maxStudents];
		
		for(int i = 0; i < maxStudents; i++) {
			System.out.println("Please type in your students");
			scores[i] = input.nextLine();
		}
		
		System.out.println("\n");
		System.out.println("Please type a letter");
		String letter = input.nextLine();
		
		System.out.println("\n" + "Names that end with the letter you typed in above:");
		for(int j = 0; j < maxStudents; j++) {
			if(scores[j].charAt(scores[j].length() - 1) == letter.charAt(0)) {
				System.out.println(scores[j]);
			}
			
			}
		
		input.close();
	
	}

}
