package com.gv.oops.assignment.BankAcc;

abstract class BankAccount {
    private String accountName;
    private float accbal;
    private int accountNumber;

    public BankAccount(String accountName, float accbal,int accountNumber) {
        this.accountNumber = accountNumber;
        this.accbal = accbal;
        this.accountName=accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return accbal;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accbal+= amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + accbal);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accbal) {
        	accbal-= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + accbal);
        } else {
            System.out.println("Invalid withdraw amount or insufficient funds.");
        }
    }

	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accbal=" + accbal + ", accountNumber=" + accountNumber
				+ ", getAccountNumber()=" + getAccountNumber() + ", getBalance()=" + getBalance() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    

    
}