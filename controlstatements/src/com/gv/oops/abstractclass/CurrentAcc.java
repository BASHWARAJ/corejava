package com.gv.oops.abstractclass;

public class CurrentAcc extends Bank {
    private int interestRate;
    private int depositAmount;

    // Getter and setter for interestRate
    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    // Getter and setter for depositAmount
    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    // Static method to get the interest rate for current account
    public static int interestRate() {
        return 0; // Placeholder for actual implementation
    }

    // Static method to handle deposits in current account
    public static int deposit() {
        return 0; // Placeholder for actual implementation
    }

    @Override
    public String toString() {
        return "CurrentAcc [interestRate=" + interestRate + ", depositAmount=" + depositAmount + "]";
    }
    @Override
    public void Accdetails() {
    	System.out.println("Acctype"+getAcctype()+"accounttype interesrate"+getInterestRate()+"deposit"+getDepositAmount());
    }
}
