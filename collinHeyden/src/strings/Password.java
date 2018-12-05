package strings;

import java.util.Scanner;

public class Password {
	Scanner input = new Scanner(System.in);
	private String password;
	
	public Password() {
		password = "1aaaaa!?";
	}

	public boolean setPassword() {
		String newPassword;
		boolean passwordWorks = false;
		
		do {
			System.out.println("Please type a new password 	*(Must include \"?\" and \"!\")*");
			System.out.println("				*(Must be at least 7 characters long and at most 22 characters long)*");
			System.out.println("				*(The fist letter of your password must be a digit 1-9)*");
			System.out.println("				*(Must not include spaces)*");
			newPassword = input.nextLine();
			
			if(newPassword.contains("!") && newPassword.contains("?") && !newPassword.contains(" ") && newPassword.length() >= 7 && newPassword.length() <= 22 && Character.isDigit(newPassword.charAt(0))) {
				passwordWorks = true;
			}
			else {
				passwordWorks = false;
			}
		} while(passwordWorks == false);
		
		password = newPassword;
		return passwordWorks;
	}
	
	public void match(){
		if(password.equals("1aaaaa!?")) {
			System.out.println("Your password matches the original password of: 1aaaaa!?");
		}
		else {
			System.out.println("Your password does not matches the original password of: 1aaaaa!?");
		}
	}
	
}
