package loops;

import java.util.Scanner;

public class Activity3Nested {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maxDivisors = 0;
		int num = 1;
		
		for(int counter1 = 1; counter1 <= num; counter1++) {
			int divisors = 0;
			for(int counter2 = 2; counter2 <= counter1/2; counter2++) {
				if(counter1 % counter2 == 0) {
					divisors++;	
				}
				if(divisors > maxDivisors) {
					maxDivisors = divisors;
					num = counter1;
					
				}
				
			}
			System.out.println(maxDivisors);
		}
			
	}

}
