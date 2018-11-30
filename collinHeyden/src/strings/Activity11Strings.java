package strings;

import java.util.Scanner;

public class Activity11Strings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = "";


		int i;
        
        while(!sentence.equals("Quit")) {
        	   
        	System.out.println("\n" + "Please enter a sentence (Type \"Quit\" to end program)");
            sentence = input.nextLine();
        	System.out.println("\n");
        	
        	if(sentence.equals("Quit") ) {
        		
        		input.close();
        		System.out.println("\n" + "* Program Ended *");
        		System.exit(0);
        	
        	}
        	
        	for(i = 0; i <= sentence.length() -1; i+=4){
        		
        		System.out.println(sentence.charAt(i));
	
        	}
        	
        }
	
	}

}
