package com.gvacharya.casestudy.bankacc;

public abstract class BankAcc {

	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc() {
		super();
	}

	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;	
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public abstract void withdraw(float amount);
	
	public void deposit(float amount) {
		setAccBal(getAccBal() + amount);
		System.out.println(getAccBal());
	}
	
	
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	
}
