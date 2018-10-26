package inputExamples;

import java.util.Scanner;

public class AgeAndWeight {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int age = -999;
		int weight = -999;
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("How much do you weigh?");
		weight = input.nextInt();
		System.out.println("Your are " + age + " years old and weigh " + weight + " lbs");
		input.close();
		
	}

}
