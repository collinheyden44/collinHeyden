package arrays;

public class Santa {
	
	private String name;
	private int age;
	private boolean criminalRecord;

	public Santa(String newName, int newAge, boolean newCriminalRecord) {
		name = newName;
		age = newAge;
		criminalRecord = newCriminalRecord;
	}
	
	public void newName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean employable() {
		boolean employ;
		if(age <= 70 && age >= 50 && criminalRecord == false) {
			employ = true;
		}
		else {
			employ = false;
		}
		return employ;
	}
	
}

