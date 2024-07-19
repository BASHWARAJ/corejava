package com.gv.oops.assignment.BankAcc;

abstract class SavingAcc extends BankAccount {
    private float minBalance;
    private boolean isSalaried;

    public SavingAcc(String accountName, float accbal, int accountNumber, float minBalance, boolean isSalaried) {
        super(accountName, accbal, accountNumber);
        this.minBalance = minBalance;
        this.isSalaried = isSalaried;
    }

    public float getMinBalance() {
        return minBalance;
    }

    public boolean isSalaried() {
        return isSalaried;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= minBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Balance cannot go below the minimum balance of " + minBalance);
        }
    }

    @Override
    public String toString() {
        return "SavingAcc [minBalance=" + minBalance + ", isSalaried=" + isSalaried + ", toString()=" + super.toString() + "]";
    }

    
}
