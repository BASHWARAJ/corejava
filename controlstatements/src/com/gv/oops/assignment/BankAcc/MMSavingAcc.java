package com.gv.oops.assignment.BankAcc;



class MMSavingAcc extends SavingAcc {
    private static final float MINBAL = 500.0f;

    public MMSavingAcc(String accountName, float accbal, int accountNumber, float minBalance, boolean isSalaried) {
        super( accountName,  accbal,  accountNumber,  minBalance,  isSalaried);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= MINBAL) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Balance cannot go below the minimum balance of " + MINBAL);
        }
    }

    @Override
    public String toString() {
        return "MMSavingAcc [MINBAL=" + MINBAL + ", toString()=" + super.toString() + "]";
    }
}

