package arrays;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 		
		
		final int numAutos = 50;
		Car[] autos= new Car[numAutos];
		
		for(int k = 0; k < autos.length; k++) {
			autos[k] = new Car();
		}
		
		for(int i = 0; i < autos.length; i++) {
			System.out.println("Enter the cars MPG:");
			autos[i].setMPG(input.nextDouble());
		}
		
		input.close();

	}

}
