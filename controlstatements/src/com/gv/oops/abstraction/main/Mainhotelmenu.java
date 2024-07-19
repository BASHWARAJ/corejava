package com.gv.oops.abstraction.main;

import com.gv.oops.abstraction.NonVegMenu;
import com.gv.oops.abstraction.VegMenu;

public class Mainhotelmenu {
    public static void main(String[] args) {
        // VegMenu instances
        VegMenu vegMenu1 = new VegMenu();
        vegMenu1.setSerialNumber(1);
        vegMenu1.setMenuName("Continental Veg Menu");
        vegMenu1.starter = "Tomato Soup";
        vegMenu1.mainCourse = "Vegetable Biryani";
        vegMenu1.dessert = "Gulab Jamun";

        VegMenu vegMenu2 = new VegMenu();
        vegMenu2.setSerialNumber(2);
        vegMenu2.setMenuName("Indian Veg Menu");
        vegMenu2.starter = "Spring Rolls";
        vegMenu2.mainCourse = "Paneer Butter Masala with Naan";
        vegMenu2.dessert = "Ras Malai";

        // NonVegMenu instances
        NonVegMenu nonVegMenu1 = new NonVegMenu();
        nonVegMenu1.setSerialNumber(3);
        nonVegMenu1.setMenuName("Continental Non-Veg Menu");
        nonVegMenu1.starter = "Chicken Soup";
        nonVegMenu1.mainCourse = "Grilled Chicken";
        nonVegMenu1.dessert = "Chocolate Mousse";

        NonVegMenu nonVegMenu2 = new NonVegMenu();
        nonVegMenu2.setSerialNumber(4);
        nonVegMenu2.setMenuName("Indian Non-Veg Menu");
        nonVegMenu2.starter = "Chicken Tikka";
        nonVegMenu2.mainCourse = "Butter Chicken with Naan";
        nonVegMenu2.dessert = "Gajar Ka Halwa";

        System.out.println("Menu 1:");
        vegMenu1.printMenu();

        System.out.println("\nMenu 2:");
        vegMenu2.printMenu();

        System.out.println("\nMenu 3:");
        nonVegMenu1.printMenu();

        System.out.println("\nMenu 4:");
        nonVegMenu2.printMenu();
    }
}
