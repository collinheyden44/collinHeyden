package oOP;

public class Employee {

	private double wage;
	private int experience;

	public Employee() {
		wage = 10.5;
		experience = 0;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double newWage) {
		wage = newWage;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public void setExperience(int newExperience) {
		experience = newExperience;
	}
	
	public void raise() {
		wage = wage * 1.1;
	}

}
