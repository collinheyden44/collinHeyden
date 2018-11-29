package strings;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String sentence = "hello";


		int i;
        int j;
        int countLetters = 0;
        
        while(!sentence.equals("Quit")) {
        	
        	countLetters = 0;    
        	System.out.println("Please enter a sentence (Type \"Quit\" to end program)");
            sentence = input.nextLine();
        	System.out.println("\n");
        	
        	if(sentence.equals("Quit") ) {
        		
        		input.close();
        		System.out.println("\n" + "* Program Ended *");
        		System.exit(0);
        	
        	}
        	
        	for(i = 0; i <= sentence.length() - 1; i++){
        		
        		if (sentence.substring(i).startsWith(" ") || i == 0){
        		
        			for (j = i + 1; j <= sentence.length() - 1; j++){

        				if (sentence.substring(j).startsWith(" ") || j == sentence.length() - 1) {
        					
        					System.out.println(sentence.substring(i, j + 1));
        					i = j;
        					countLetters++;
        				}
        			
        			}
        			
        			System.out.println("\n" + "Number of Words in Your Sentence: " + countLetters + "\n\n");

        		}
        	
            }
       
        }
        
	}

}
