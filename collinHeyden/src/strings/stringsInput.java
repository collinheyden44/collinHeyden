package strings;

import java.util.Scanner;

public class StringsInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your age?");
		String age = input.nextLine();
		System.out.println("\n" + "What is your full name?");
		String fullName = input.nextLine();

		System.out.println("\n" + "Your age is: " + age);
		System.out.println("Your full name is: " + fullName);

		input.close();
	}

}
