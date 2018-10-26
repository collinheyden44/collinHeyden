package oOP;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Mom's Car");
		System.out.println("MPG?");
		int mPG = input.nextInt();
		System.out.println("Fuel Tank Capacity?");
		int fuelTankCapacity = input.nextInt();
		System.out.println("Current Fuel In Tank?");
		int fuelInTank = input.nextInt();
		System.out.println("Odometer?");
		int odometer = input.nextInt();
		Car mom = new Car(mPG,fuelTankCapacity,fuelInTank,odometer);

		System.out.println("Dad's Car.");
		System.out.println("MPG?");
		mPG = input.nextInt();
		System.out.println("Fuel Tank Capacity?");
		fuelTankCapacity = input.nextInt();
		System.out.println("Current Fuel In Tank?");
		fuelInTank = input.nextInt();
		System.out.println("Odometer?");
		odometer = input.nextInt();
		Car dad = new Car(mPG,fuelTankCapacity,fuelInTank,odometer);

		System.out.println("Kid's Car.");
		System.out.println("MPG?");
		mPG = input.nextInt();
		System.out.println("Fuel Tank Capacity?");
		fuelTankCapacity = input.nextInt();
		System.out.println("Current Fuel In Tank?");
		fuelInTank = input.nextInt();
		System.out.println("Odometer?");
		odometer = input.nextInt();
		Car kid = new Car(mPG,fuelTankCapacity,fuelInTank,odometer);
		
		dad.driveCar(20.0);
		mom.addFuel(10.0);
		kid.driveCar(12.0);
		dad.addFuel(8.0);
		
		System.out.println("\n" + "Mom's Car:");
		System.out.println("MPG: " + mom.getMPG());
		System.out.println("Fuel Tank Capacity: " + mom.getFeulTankCapacity());
		System.out.println("Fuel In Tank: " + mom.getFuelInTank());
		System.out.println("Odometer: " + mom.getOdometer());
		
		System.out.println("\n" + "Dad's Car:");
		System.out.println("MPG: " + dad.getMPG());
		System.out.println("Fuel Tank Capacity: " + dad.getFeulTankCapacity());
		System.out.println("Fuel In Tank: " + dad.getFuelInTank());
		System.out.println("Odometer: " + dad.getOdometer());
		System.out.println("Kid's Car");
		
		System.out.println("\n" + "MPG: " + kid.getMPG());
		System.out.println("Fuel Tank Capacity: " + kid.getFeulTankCapacity());
		System.out.println("Fuel In Tank: " + kid.getFuelInTank());
		System.out.println("Odometer: " + kid.getOdometer());

	}

}
