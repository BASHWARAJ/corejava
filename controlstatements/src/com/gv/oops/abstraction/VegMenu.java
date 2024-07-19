package com.gv.oops.abstraction;



public class VegMenu extends Hotelmenu {
    public String starter;
    public String mainCourse;
    public String dessert;

    public void printMenu() {
        System.out.println("Vegetarian Menu:");
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Menu Name: " + getMenuName());
        System.out.println("Starter: " + starter);
        System.out.println("Main Course: " + mainCourse);
        System.out.println("Dessert: " + dessert);
        
        System.out.println("Vegetarian Menu:");
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Menu Name: " + getMenuName());
        System.out.println("Starter: " + starter);
        System.out.println("Main Course: " + mainCourse);
        System.out.println("Dessert: " + dessert);
    }
}
