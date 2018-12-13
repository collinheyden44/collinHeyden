package arrays;

import java.util.Scanner;

public class OneDArraysActiv3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final int maxStudents = 10;
		String[] scores = new String[maxStudents];
		
		for(int i = 0; i < maxStudents; i++) {
			System.out.println("Please type in your students");
			scores[i] = input.nextLine();
		}
		
		System.out.println("\n");
		System.out.println("Please type the length you would like to check");
		int check = input.nextInt();
		
		System.out.println("\n" + "Names that are " + check + " letters long:");
		
		for(int j = 0; j < maxStudents; j++) {
			if(check == scores[j].length()) {
				System.out.println(scores[j]);
			}
			
			}
		
		input.close();

	}

}
