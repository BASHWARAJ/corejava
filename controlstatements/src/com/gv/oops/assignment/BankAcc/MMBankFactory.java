package com.gv.oops.assignment.BankAcc;

public class MMBankFactory extends BankFactory {
    @Override
    public MMSavingAcc getNewSavingAcc(String accountName, float accbal, int accountNumber, float minBalance, boolean isSalaried) {
    	return new MMSavingAcc(  accountName,  accbal,  accountNumber,  minBalance, isSalaried);
    }

    @Override
    public MMCurrentAcc getNewCurrentAcc(String accountName, float accbal, int accountNumber, float creditLimit) {
        return new MMCurrentAcc( accountName,  accbal, accountNumber,  creditLimit);
    }
}
