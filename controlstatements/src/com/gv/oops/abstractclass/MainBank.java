package com.gv.oops.abstractclass;

public class MainBank {
    public static void main(String[] args) {
        // Upcasting Savingacc to Bank
        Bank savingAcc = new Savingacc();
        savingAcc.setAcctype("Savings"); // Setting account type
        ((Savingacc) savingAcc).setInterestRate(5);    // Setting interest rate
        ((Savingacc) savingAcc).setDepositAmount(1000); // Setting deposit amount

        // Accessing methods from Bank class
        savingAcc.getAcctype(); // Assuming getAcctype() is a method in the Bank class
        
        // Accessing methods specific to Savingacc
        int interestRate = ((Savingacc) savingAcc).getInterestRate();
        int depositAmount = ((Savingacc) savingAcc).getDepositAmount();
        
        // Printing details of savings account
        System.out.println("Savings Account Details:");
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Deposit Amount: " + depositAmount);
        System.out.println();

        // Upcasting CurrentAcc to Bank
        Bank currentAcc = new CurrentAcc();
        currentAcc.setAcctype("Current"); // Setting account type
        ((CurrentAcc) currentAcc).setInterestRate(0);     // Setting interest rate
        ((CurrentAcc) currentAcc).setDepositAmount(2000); // Setting deposit amount

        // Accessing methods from Bank class
        currentAcc.getAcctype(); // Assuming getAcctype() is a method in the Bank class

        // Accessing methods specific to CurrentAcc
        int currentInterestRate = ((CurrentAcc) currentAcc).getInterestRate();
        int currentDepositAmount = ((CurrentAcc) currentAcc).getDepositAmount();
        
        // Printing details of current account
        System.out.println("Current Account Details:");
        System.out.println("Interest Rate: " + currentInterestRate);
        System.out.println("Deposit Amount: " + currentDepositAmount);
    }
}
