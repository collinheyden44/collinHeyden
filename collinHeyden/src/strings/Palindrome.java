package strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String originalWord = "";
		String reversedWord = "";
		
		while(!originalWord.equals("Quit")) {
			
			reversedWord = "";
			System.out.println("\n" + "Please type a word (Type \"Quit\" to end the program)");
			originalWord = input.nextLine();
			
			if(originalWord.equals("Quit")) {
				
				input.close();
        		System.out.println("\n" + "* Program Ended *");
        		System.exit(0);
        		
			}
			
			originalWord = originalWord.toLowerCase();
			
			for (int i = originalWord.length() - 1; i >= 0; i--) {
			
				reversedWord += originalWord.charAt(i);

			}
		
			System.out.println("\n" + "Original Word: " + originalWord);
			System.out.println("Reversed Word: " + reversedWord);
			
			if (originalWord.equals(reversedWord)) {
			
				System.out.println("\n" + originalWord + " is a Palindrome" + "\n");

			} else {
			
				System.out.println("\n" + originalWord + " isn't a Palindrome" + "\n");

			}
	    
		}
		
		input.close();
		
	}

}
	
