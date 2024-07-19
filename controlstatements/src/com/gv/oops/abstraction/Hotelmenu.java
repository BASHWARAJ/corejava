package com.gv.oops.abstraction;

public class Hotelmenu {
	    private String menuName;
	    private int serialNumber;

	    public String getMenuName() {
	        return menuName;
	    }

	    public void setMenuName(String menuName) {
	        this.menuName = menuName;
	    }

	    public int getSerialNumber() {
	        return serialNumber;
	    }

	    public void setSerialNumber(int serialNumber) {
	        this.serialNumber = serialNumber;
	    }

	    @Override
	    public String toString() {
	        return "HotelMenu [menuName=" + menuName + ", serialNumber=" + serialNumber + "]";
	    }
	}