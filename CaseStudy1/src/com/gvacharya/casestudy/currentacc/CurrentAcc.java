package com.gvacharya.casestudy.currentacc;

import com.gvacharya.casestudy.bankacc.BankAcc;

public abstract class CurrentAcc extends BankAcc{

	public float creditLimit;
	private static final int min_bal = 1000;

	public CurrentAcc() {
		super();
	}

	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
	}

	public CurrentAcc(float creditLimit) {
		super();
		this.creditLimit = creditLimit;
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
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
		return super.toString() + "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
	
	
	
	
}
