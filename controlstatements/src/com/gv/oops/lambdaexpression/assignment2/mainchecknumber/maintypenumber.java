package com.gv.oops.lambdaexpression.assignment2.mainchecknumber;

import com.gv.oops.lambdaexpression.assignment2.checknumber.CalculateNumber;

public class maintypenumber {
    public static void main(String[] args) {
        CalculateNumber calc = new CalculateNumber();
        int number = 153; // Example number

        
        calc.evenOrOdd.check(number);
        calc.primeNumber.check(number);
        calc.armstrongNumber.check(number);
        calc.palindromeNumber.check(number);
    }
}
