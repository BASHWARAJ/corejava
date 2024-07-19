package com.gv.oops.assignment.BankAcc;


abstract class BankFactory  {
    public abstract SavingAcc getNewSavingAcc(String accountName, float accbal, int accountNumber, float minBalance, boolean isSalaried);
    public abstract CurrentAcc getNewCurrentAcc(String accountName, float accbal, int accountNumber, float creditLimit);
}

