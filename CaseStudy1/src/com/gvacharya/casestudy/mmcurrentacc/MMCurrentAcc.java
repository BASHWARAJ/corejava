package com.gvacharya.casestudy.mmcurrentacc;

import com.gvacharya.casestudy.currentacc.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc() {
		super();

	}

	public MMCurrentAcc(float creditLimit) {
		super(creditLimit);
		
	}

	public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}

}
