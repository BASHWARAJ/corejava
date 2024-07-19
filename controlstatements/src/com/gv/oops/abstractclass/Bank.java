package com.gv.oops.abstractclass;

public abstract class Bank {
	String Acctype;
	
	public Bank(String acctype) {
		super();
		Acctype = acctype;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public String getAcctype() {
		return Acctype;
	}

	public void setAcctype(String acctype) {
		Acctype = acctype;
	}

	public  abstract void Accdetails();

	@Override
	public String toString() {
		return "Bank [Acctype=" + Acctype + ", getAcctype()=" + getAcctype() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
