package oOP;

public class Car {

	private double mPG;
	private double fuelTankCapacity;
	private double fuelInTank;
	private double odometer;
	
	public Car() {
		mPG = 20.0;
		fuelTankCapacity = 20.0;
		fuelInTank = 20.0;
		odometer = 0;
	}	
	
	public Car (double newMPG, double newFuelTankCapacity, double newFuelInTank, double newOdometer) {
		mPG = newMPG; 
		fuelTankCapacity = newFuelTankCapacity;
		fuelInTank = newFuelInTank;
		odometer = newOdometer;
	}
	
	public double getMPG() {
		return mPG;
	}

	public double getFeulTankCapacity() {
		return fuelTankCapacity;
	}

	public double getFuelInTank() {
		return fuelInTank;
	}

	public double getOdometer() {
		return odometer;
	}
	public void setMPG(double newMpg) {
		mPG = newMpg;
	}

	public void setFuelTankCapacity(double newFuelTankCapacity) {
		fuelTankCapacity = newFuelTankCapacity;
	}

	public void setFuelInTank(double newFuelInTank) {
		fuelInTank = newFuelInTank;
	}

	public void setOdometer(double newOdometer) {
		odometer = newOdometer;
	}
	
	public void addFuel(double addFuel) {
		fuelInTank = fuelInTank + addFuel;
	}
	
	public void driveCar(double milesTraveled) {
		fuelInTank = fuelInTank - (milesTraveled/mPG);
		odometer = odometer + milesTraveled;
	}
	
}	

