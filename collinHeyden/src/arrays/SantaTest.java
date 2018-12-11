package arrays;

import java.util.Random;

public class SantaTest {

	public static void main(String[] args) {
		
		Random generator = new Random();
		int counter = 0;
		
		int min = 21;
		int max = 90;
		
		String[] mallSantas = new String[100000];
		
		for(int i = 0; i < 100000; i++) {
			int randomAge = min + generator.nextInt(max -  min + 1);
			boolean randomCriminalRecord = generator.nextBoolean();
			Santa bob = new Santa("Chris", randomAge, randomCriminalRecord);
			mallSantas[i] = bob.getName();
			if(bob.employable() == true) {
				System.out.print("\n" + bob.getName());
				counter++;
			}
		}
		
		System.out.println("\n" + "Number of Mall Santas who are Employable: " + counter);

	}

}
