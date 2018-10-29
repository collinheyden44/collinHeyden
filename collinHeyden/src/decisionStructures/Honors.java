package decisionStructures;

import java.util.Scanner;

public class Honors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your GPA?");
		double gPA = input.nextDouble();
		System.out.println("\n" + "What grade are you in? (type 9 for freshman, 10 for sophomore, 11 for junior, and 12 for senior)");
		int gradeLevel = input.nextInt();
		
		
		
		if(gPA >= 3.5 && gradeLevel == 12) {
			System.out.println("\n" + "You can graduate with honors!");
		}
		
		else {
			System.out.println("\n" + "You cannot graduate with honors");
		}
		
		input.close();
		
	}
}
