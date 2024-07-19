package com.gvacharya.casestudy.bankfactory;

import com.gvacharya.casestudy.currentacc.CurrentAcc;
import com.gvacharya.casestudy.savingacc.SavingAcc;

public abstract class BankFactory {

	public abstract  SavingAcc getNewSavingAcc();
	
	public abstract  CurrentAcc getNewCurrentAcc();
}
