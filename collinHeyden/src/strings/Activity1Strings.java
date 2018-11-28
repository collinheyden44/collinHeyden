package strings;

import java.util.Scanner;

public class Activity1Strings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type a sentence:");
		String sentence = input.nextLine();
		
		System.out.println(sentence.charAt(0));
		System.out.println(sentence.charAt(2));
		System.out.println(sentence);

		input.close();
		
	}

}
