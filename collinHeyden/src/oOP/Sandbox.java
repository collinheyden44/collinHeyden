package oOP;

import java.util.Scanner;

public class Sandbox {
Scanner input = new Scanner(System.in);

	
	
	public Sandbox() {
		
	}
	
	public void sandboxV1() {
		double length = -999.9;
		double width = -999.9;
		double depth = -999.9;
		double sandPerHour = -999.9;
		double time = -999.9;
		System.out.println("What is the length (In feet) of the sandbox?");
		length = input.nextDouble();
		System.out.println("What is the width (In feet) of the sandbox?");
		width = input.nextDouble();
		System.out.println("What is the depth (In feet) of the sandbox?");
		depth = input.nextDouble();
		System.out.println("What is the amount of sand (in cubic feet) that you can transport per hour?");
		sandPerHour = input.nextDouble();
		time = (length * width * depth) / sandPerHour;
		System.out.println("It will take you approximately " + time + " hours to fill the sandbox");
	}
	
	public void sandboxV2() {
		
	}
	public void sandboxV3() {
	
	}
	
}
