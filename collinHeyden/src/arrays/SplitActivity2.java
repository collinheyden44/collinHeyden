package arrays;

import java.util.Scanner;

public class SplitActivity2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type a sentence");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		
		System.out.println("Please type a word you would like to look for");
		String keyWord = input.nextLine();
		
		int counter = 0;
		
		for(String array: words) {
			if(array.equals(keyWord)) {
				counter++;
			}
		}
		
		System.out.println("Your key word appear in your sentence " + counter + " times");		
		input.close();
		
	}

}
