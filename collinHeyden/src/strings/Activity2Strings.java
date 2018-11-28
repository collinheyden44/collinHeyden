package strings;

import java.util.Scanner;

public class Activity2Strings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type a sentence:");
		String sentence = input.nextLine();
		
		System.out.println(sentence.contains("bob"));
		System.out.println(sentence.contains("phil"));
		System.out.println(sentence);

		input.close();
		
	}

}
