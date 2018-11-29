package strings;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first word");
		String word1 = input.nextLine();
		System.out.println("Please enter your second word");
		String word2 = input.nextLine();
		System.out.println("Please enter your third word");
		String word3 = input.nextLine();
		String password = "passwo";
		
		int min = 0;
		int max = 9;
		
		char pass1 = word1.charAt(0);
		char pass2 = ;
		String pass3 = ;
		String pass4 = min + generator.nextInt(max -  min + 1);
		String pass5 = min + generator.nextInt(max -  min + 1);
		String pass6 = min + generator.nextInt(max -  min + 1);
		
		
		
		
		
		System.out.println("Your password is: " +  password);

	}

}
