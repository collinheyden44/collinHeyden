package designingClasess;

import java.util.ArrayList;

public class HardDrive {

	private String name = " ";
	private ArrayList files = new ArrayList(); 
	private double totalCapacity = 0;
	private double freeSpace = 0;
	
	public HardDrive(String newName, double newTotalCapacity, double newFreeSpace) {
		name = newName;
		
		totalCapacity = newTotalCapacity;
		freeSpace = newFreeSpace;
	}

}
