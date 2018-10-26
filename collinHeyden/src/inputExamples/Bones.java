package inputExamples;

import java.util.Scanner;

public class Bones {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int bones = -999;
		System.out.println("How many bones have you broken?");
		bones = input.nextInt();
		System.out.println("Your broke " + bones + " bones!");
		input.close();
		
	}

}	
	
