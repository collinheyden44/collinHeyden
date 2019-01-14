package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class WrapperClassScores {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		System.out.println("How many test scores do you want to record?");
		int record = input.nextInt();
		
		for(int i = 0; i < record; i++) {
			
		}
		
		System.out.println("");
		for(int scoresList : scores) {
			System.out.println(scoresList);
		}
		
		input.close();
		
	}

}
