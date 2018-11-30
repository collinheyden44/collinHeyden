package strings;

import java.util.Scanner;

public class Activity12Strings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a sentence");
		String sentence = input.nextLine();
            
		sentence.replaceAll(" ", "");
		sentence.replaceAll("a", "a");
		sentence.replaceAll("A", "");
		
		System.out.println(sentence);
		input.close();

	}

}
