package com.gvacharya.casestudy.bankapp;

import com.gvacharya.casestudy.bankfactory.BankFactory;
import com.gvacharya.casestudy.currentacc.CurrentAcc;
import com.gvacharya.casestudy.mmbankfactory.MMBankFactory;
import com.gvacharya.casestudy.savingacc.SavingAcc;

public class BankApp {

	public static void main(String[] args) {
		
		BankFactory bankFactory = new MMBankFactory();
		
		SavingAcc savingAccount = bankFactory.getNewSavingAcc();
		
		
		savingAccount.setAccBal(5000);
		savingAccount.setAccNm("Jatin");
		savingAccount.setAccNo(445264759);
		savingAccount.setSalary(true);
		
		
		System.out.println(savingAccount.toString());
		savingAccount.withdraw(100.f);
		System.out.println(savingAccount.getAccBal());
		
		
		CurrentAcc currentAccount = bankFactory.getNewCurrentAcc();
		
		currentAccount.setAccBal(5000);
		currentAccount.setAccNm("Jaiswal");
		currentAccount.setAccNo(445264762);
		currentAccount.setCreditLimit(400f);
		
		System.out.println(currentAccount.toString());
		currentAccount.withdraw(200.f);
		System.out.println(currentAccount.getAccBal());
	}
}
