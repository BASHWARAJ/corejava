package com.gvacharya.casestudy.mmbankfactory;

import com.gvacharya.casestudy.bankfactory.BankFactory;
import com.gvacharya.casestudy.currentacc.CurrentAcc;
import com.gvacharya.casestudy.mmcurrentacc.MMCurrentAcc;
import com.gvacharya.casestudy.mmsavingacc.MMSavingAcc;
import com.gvacharya.casestudy.savingacc.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc() {
		
		return new MMSavingAcc();
	}

	@Override
	public CurrentAcc getNewCurrentAcc() {
		
		return new MMCurrentAcc();
	}

}
