package inputExamples;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean vote = false;
		System.out.println("You voted... Type true or false");
		vote = input.nextBoolean();
		System.out.println("You Voted... " + vote);
		input.close();
		
	}

}
