package oOP;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Savings Account");
		System.out.println("Account number?");
		int accountNum = input.nextInt();
		System.out.println("Interest rate?");
		double interestRate = input.nextDouble();
		System.out.println("Balance?");
		double balance = input.nextDouble();
		BankAccount savings = new BankAccount(balance, accountNum, interestRate);
		
		System.out.println("\n" + "Checking Account");
		System.out.println("Account number?");
		accountNum=input.nextInt();
		System.out.println("Interest rate?");
		interestRate=input.nextDouble();
		System.out.println("Balance?");
		balance=input.nextInt();
		BankAccount checking = new BankAccount(balance, accountNum, interestRate);
		
		savings.deposit(100);
		checking.setInterestRate(.18);
		checking.withdraw(1000);
		savings.addInterest();
		checking.financeCharge(20);
		
		System.out.println("Savings Account");
		System.out.println("Balance :" + savings.getBalance());
		System.out.println("Interest Rate :" + savings.getRate());
		System.out.println("Account Number :" + savings.getAccountNum());
		
		System.out.println("\n" + "Checking Account ");
		System.out.println("Balance: " + checking.getBalance());
		System.out.println("Interest Rate: " + checking.getRate());
		System.out.println("Account Number: " + checking.getAccountNum());
		

		

	}

}
