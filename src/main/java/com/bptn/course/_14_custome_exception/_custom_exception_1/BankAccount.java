package com.bptn.course._14_custome_exception._custom_exception_1;

public class BankAccount {
	
// ? 	private double balance;
// ? 	private String accountNumber;
	
	
	public BankAccount(double balance, String accountNumber) {
	// ? 	this.balance = balance;
	// ? 	this.accountNumber = accountNumber;
// ? 	}
	
	
	// ? public void withdraw(double amount) throws InsufficientFundsException {
		
	// ?	if (amount > balance) {
			
		// ? 	double needs = amount - balance;
			
		// ? 	throw new InsufficientFundsException(needs);
	// ? 	}
	
// ? 		balance -= amount;   // balance = balance - amount;
		
	// ? 	System.out.println("Withdrawl of $" + amount + " successful. New blance $" + balance);
	}
	
	

}