package mathExamples;

import java.util.Scanner;

public class DatePractice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int month = -999;
		int day = -999;
		int year = -999;
		System.out.println("What is the current month? (ex. 09)");
		month = input.nextInt();
		System.out.println("What is the current day? (ex. 26)");
		day = input.nextInt();
		System.out.println("What is the current year? (ex. 2018)");
		year = input.nextInt();
		System.out.println("The current date today is: " + month + "-" + day + "-" + year);
		
	}
	
}