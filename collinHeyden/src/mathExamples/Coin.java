package mathExamples;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int doller = 100;
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        int amount = -999;
        System.out.println("How much do I owe you?");
        amount = input.nextInt();
        doller = amount/100;
        quarter = (amount%100)/25;
        dime = ((amount%100)%25)/10;
        nickel = (((amount%100)%25)%10)/5;
        penny = ((((amount%100)%25)%10)%5)/1;
        System.out.println(doller + " Dollers");
        System.out.println(quarter + " Quarters");
        System.out.println(dime + " Dimes");
        System.out.println(nickel+ " Nickels");
        System.out.println(penny + " Pennies");
        input.close();
        
	}

}
        
        
        
        
        
        
        

        
        
        
        
        