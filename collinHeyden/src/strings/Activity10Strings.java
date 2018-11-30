package strings;

import java.util.Scanner;

public class Activity10Strings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type a password:");
		String password1 = input.nextLine();
		
		System.out.println("Please retype your password:");
		String password2 = input.nextLine();
		
		while(!password1.equals(password2)) {
			System.out.println("Your passwords do not match. Please try again");
			System.out.println("Please type a password:");
			password1 = input.nextLine();
			System.out.println("Please retype your password:");
			password2 = input.nextLine();
		}
		
		System.out.println("Your passwrods match!");
		input.close();
		
	}

}
