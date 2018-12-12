package arrays;

import java.util.Scanner;

public class SplitActivity {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type a sentence");
		String sentence = input.nextLine();
		String[] words = sentence.split("2");
		
		for(String array: words) {
			System.out.println(array);
		}
				
		input.close();

	}

}
