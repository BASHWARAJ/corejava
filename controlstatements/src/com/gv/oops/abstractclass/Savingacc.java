package com.gv.oops.abstractclass;

public class Savingacc extends Bank {
	private int interestRate;
    private int depositAmount;
		  public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public int getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}
		static int interestrate() {
			return 0;
		  }
			static int deposite() {
				return 0;
		}
			
			@Override
			public String toString() {
				return "Savingacc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
						+ super.toString() + "]";
			}
			@Override
		    public void Accdetails() {
		    	System.out.println("Acctype"+getAcctype()+"accounttype interesrate"+getInterestRate()+"deposit"+getDepositAmount());
		    }
}
