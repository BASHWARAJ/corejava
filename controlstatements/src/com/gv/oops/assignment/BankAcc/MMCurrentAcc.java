package com.gv.oops.assignment.BankAcc;

class MMCurrentAcc extends CurrentAcc {
    public MMCurrentAcc(String accountName, float accbal, int accountNumber, float creditLimit) {
        super(accountName,  accbal,  accountNumber, creditLimit);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + getCreditLimit()) >= amount) {
            double newBalance = getBalance() - amount;
            if (newBalance < 0) {
                // Handle the case where withdrawal dips into the credit limit
                System.out.println("Using credit limit: " + (-newBalance));
            }
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Cannot exceed credit limit of " + getCreditLimit());
        }
    }

    @Override
    public String toString() {
        return "MMCurrentAcc [CreditLimit=" + getCreditLimit() + ", toString()=" + super.toString() + "]";
    }

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		
	}
}
