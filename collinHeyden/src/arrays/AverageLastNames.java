package arrays;

import java.util.Scanner;

public class AverageLastNames {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String [] names = new String[10];
		
		for(int j = 0; j < names.length; j++) {
			System.out.println("Enter a full name:");
			names[j] = input.nextLine();
		}
		
		double sum = 0;
		
		for(int j = 0; j < names.length; j++) {
			sum += (names[j].length() - names[j].indexOf(" ") - 1);	
		}
		
		System.out.println("Average length of the last names:" + (sum / 10));
		input.close();
		
	}

}
