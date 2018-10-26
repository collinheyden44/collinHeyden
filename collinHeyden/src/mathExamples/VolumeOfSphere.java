package mathExamples;

import java.util.Scanner;

public class VolumeOfSphere {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double radius = -999.9;
		double cubed = -999.9;
		double fourThirds = 1.33;
		double sphereVolume = -999.0;
		System.out.println("Volume of a Sphere Calculator\n");
		System.out.println("What is the radius of the sphere (in inches)? (ex. 12.3)");
		radius = input.nextDouble();
		cubed = radius * radius * radius;
		sphereVolume = fourThirds * Math.PI * cubed ;
		System.out.println("The volume of the sphere is " + sphereVolume + " cubic inches");
		System.out.println(4.0 / 3.0);
		
	}

}
	
