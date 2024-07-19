package com.gv.oops.assignment.BankAcc;

public class main {
    public static void main(String[] args) {
        // Assign instance of MMBankFactory to BankFactory reference
        BankFactory factory = new MMBankFactory();

        // Instantiate MMSavingAcc and refer it through reference SavingAcc
        SavingAcc savingAccount = factory.getNewSavingAcc( "raj", 12345, 2333, 1000.0f, true);

        // Instantiate MMCurrentAcc and refer it through reference CurrentAcc
        CurrentAcc currentAccount = factory.getNewCurrentAcc( "Jane Doe", 6789, 1500, 500.0f);

        // Invoke withdraw() method on saving account
        savingAccount.deposit(200);
        savingAccount.withdraw(100);
        savingAccount.withdraw(700); // This should be denied because it would go below the minimum balance

        // Invoke toString() method on saving account
        System.out.println(savingAccount);

        // Invoke withdraw() method on current account
        currentAccount.deposit(300);
        currentAccount.withdraw(1000);
        currentAccount.withdraw(1200); // This should be allowed because it uses the credit limit

        // Invoke toString() method on current account
        System.out.println(currentAccount);
    }
}
