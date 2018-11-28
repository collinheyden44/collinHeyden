package strings;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();


        int i;
        int j;
        for (i = 0; i <= sentence.length() - 1; i++){
            if (sentence.substring(i).startsWith(" ") || i == 0){

                for (j = i + 1; j <= sentence.length() - 1; j++){

                    if (sentence.substring(j).startsWith(" ") || j == sentence.length() - 1) {
                        System.out.println(sentence.substring(i, j));
                        i = j;

                    }
                }
            }
        }
			
		
		
	}
	
}
