package com.gv.oops.assignment.BankAcc;

abstract class CurrentAcc extends BankAccount {
    private final float creditLimit;

    public CurrentAcc(String accountName, float accbal, int accountNumber, float creditLimit) {
        super(accountName, accbal, accountNumber);
        this.creditLimit = creditLimit;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + creditLimit) >= amount) {
            double newBalance = getBalance() - amount;
            if (newBalance < 0) {
                // Handle the case where withdrawal dips into the credit limit
                System.out.println("Using credit limit: " + (-newBalance));
            }
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Cannot exceed credit limit of " + creditLimit);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Credit Limit: " + creditLimit;
    }

    // Abstract method to be implemented by subclasses
    public abstract void calculateInterest();
}

