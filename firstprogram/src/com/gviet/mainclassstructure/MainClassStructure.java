package com.gviet.mainclassstructure;

import com.gviet.classstructure.ClassStructure; //shortcut to import ctrl+shift+o

public class MainClassStructure {
	
	public static void main (String[]args) {
		ClassStructure obj = new ClassStructure();
		obj.setPrice(500);
		obj.setBarcode(545765587);
		obj.setBrandname("milton");
		System.out.println(obj.getPrice());
		System.out.println(obj.getBarcode());
		System.out.println(obj.getBrandName());
	}

}
