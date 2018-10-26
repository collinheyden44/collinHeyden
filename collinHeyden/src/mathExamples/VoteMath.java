package mathExamples;

import java.util.Scanner;

public class VoteMath {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int age = -999;
		System.out.println("How old are you?");
		age = 21 - input.nextInt();
		
		
		if (age <= 0)
			System.out.println("You can vote now!");
		else if (age >= 21)
			System.out.println("You aren't born yet!");
		else
			System.out.println("You will be able to vote in the United States in about " + age + " years");
		
		
		input.close();
		
	}

}
