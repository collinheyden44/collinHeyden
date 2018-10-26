package oOP;

public class BankAccount {

	private double balance;
	private int accountNum;
	private double interestRate;

	public BankAccount() {
	balance = 8000.0;
	accountNum = 826735;
	interestRate = 0.10;
	}

	public BankAccount(double newBalance, int newAccountNum, double newInterestRate) {
	balance = newBalance;
	accountNum = newAccountNum;
	interestRate = newInterestRate;
	}

	public double getBalance() {
	return balance;
	}

	public int getAccountNum() {
	return accountNum;
	}

	public double getRate() {
	return interestRate;
	}

	public void setBalance(double newBalance) {
	balance = newBalance;
	}

	public void setAccountNum(int newAccount) {
	accountNum = newAccount;
	}

	public void setInterestRate(double newInterestRate) {
	interestRate = newInterestRate;
	}

	public void deposit(double deposit) {
	balance += deposit;
	}

	public void withdraw(double withdraw) {
	balance -= withdraw;
	}

	public void addInterest() {
	balance += balance * interestRate;
	}

	public void financeCharge(double financeCharge) {
	balance -= financeCharge;
	}
	
}
