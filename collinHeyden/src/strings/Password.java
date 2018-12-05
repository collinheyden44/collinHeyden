package strings;

import java.util.Scanner;

public class Password {
	Scanner input = new Scanner(System.in);
	private String password;
	
	public Password() {
		password = "1aaaaa!?";
	}

	public boolean setPassword() {
		
		System.out.println("New Password");
		String newPassword = input.nextLine();
		
		
		boolean passwordWorks = false;
		
		while(passwordWorks == false) {
			if(newPassword.contains("!") && newPassword.contains("?") && !newPassword.contains(" ") && newPassword.length() >= 7 && newPassword.length() <= 22 && newPassword.charAt(0) >= 0 && newPassword.charAt(0) <= 9) {
				passwordWorks = true;
			}
			else {
				passwordWorks = false;
			}
		}
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
