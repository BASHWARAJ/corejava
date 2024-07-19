package com.gviet.classstructure;

public class ClassStructure {
	//instance variable or fields
	int price;
	int barcode;
	String brandName;
	
	//default constructor
	public ClassStructure() {} // can also be private , protected
	
	
	//parameterized constructure
	public ClassStructure(int newPrice, String newBrandName, int newBarcode ) {
		price = newPrice;
		barcode = newBarcode;
		brandName = newBrandName;
	}
	//behavior or methods
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	public void setBarcode(int newBarcode) {
		barcode = newBarcode;
	}
	public void setBrandname(String newBrandName) {
		brandName = newBrandName;
	}
	//get price
	public int getPrice() {
		return price;
	}
	
	public int getBarcode() {
		return barcode;
	}
	
	public String getBrandName() {
		return brandName;
	}



	
}
