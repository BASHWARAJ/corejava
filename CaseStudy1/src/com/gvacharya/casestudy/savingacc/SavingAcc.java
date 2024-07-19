package com.gvacharya.casestudy.savingacc;

import com.gvacharya.casestudy.bankacc.BankAcc;

public abstract class SavingAcc extends BankAcc{

	public boolean isSalaried;
	private static final float min_bal = 1000;

	public SavingAcc(boolean isSalary) {
		super();
		this.isSalaried = isSalary;
	}

	public SavingAcc() {
		super();
	}

	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
	}

	public boolean isSalary() {
		return isSalaried;
	}

	public void setSalary(boolean isSalary) {
		this.isSalaried = isSalary;
	}

	@Override 
	public void withdraw(float amount) {
		if(getAccBal() - amount >= min_bal) {
			setAccBal(getAccBal() - amount);
		}else {
			System.out.println("Insufficient balance!");
		}
	}
	@Override
	public String toString() {
		return super.toString()  + ", Salaried: " +isSalaried;
	}
	
	
	
	
}
