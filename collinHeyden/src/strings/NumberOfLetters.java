package strings;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a sentence");
		String sentence = input.nextLine();
		sentence = sentence.toLowerCase();
		
		int vowels = 0;
		int consonants = 0;
		int punctuationMarks = 0;
		
		for(int j = 0; j < sentence.length(); j++) {
            
			if (sentence.charAt(j) == 'a' || sentence.charAt(j) == 'e' || sentence.charAt(j) == 'i' || sentence.charAt(j) == 'o' || sentence.charAt(j) == 'u') {
				vowels++;
            }
			else if(sentence.charAt(j) >= 'a' && sentence.charAt(j) <= 'z') {
				consonants++;
			}
			else if(sentence.charAt(j) == '!' || sentence.charAt(j) == '@' || sentence.charAt(j) == '#' || sentence.charAt(j) == '$' || sentence.charAt(j) == '%' || sentence.charAt(j) == '^' || sentence.charAt(j) == '&' || sentence.charAt(j) == '*' || sentence.charAt(j) == '(' || sentence.charAt(j) == ')' || sentence.charAt(j) == '-' || sentence.charAt(j) == '_' || sentence.charAt(j) == '`' || sentence.charAt(j) == '~' || sentence.charAt(j) == '+' || sentence.charAt(j) == '=' || sentence.charAt(j) == '[' || sentence.charAt(j) == ']' || sentence.charAt(j) == '{' || sentence.charAt(j) == '}' || sentence.charAt(j) == '|' || sentence.charAt(j) == ':' || sentence.charAt(j) == ';' || sentence.charAt(j) == '"' || sentence.charAt(j) == '<' || sentence.charAt(j) == '>' || sentence.charAt(j) == ',' || sentence.charAt(j) == '.' || sentence.charAt(j) == '?' || sentence.charAt(j) == '/') {
				punctuationMarks++;
			}
			
			
			
        }
		
		System.out.println("Number of vowels in your sentence: " + vowels);
		System.out.println("Number of consonants in your sentence: " + consonants);
		System.out.println("Number of punctuation marks in your sentence: " + punctuationMarks);

		input.close();
		
	}

}
