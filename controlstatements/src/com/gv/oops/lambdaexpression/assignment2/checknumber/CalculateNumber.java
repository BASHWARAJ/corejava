package com.gv.oops.lambdaexpression.assignment2.checknumber;

public class CalculateNumber {
    

    public NumberChecker primeNumber = (n) -> {
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number.");
                return;
            }
        }
        System.out.println(n + " is a prime number.");
    };

    public NumberChecker armstrongNumber = (n) -> {
        int originalNumber = n;
        int result = 0;
        int digits = String.valueOf(n).length();
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }
        if (result == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    };

    public NumberChecker palindromeNumber = (n) -> {
        int originalNumber = n;
        int reversedNumber = 0;
        int tempNumber = n;
        while (tempNumber != 0) {
            int remainder = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            tempNumber /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    };

    public NumberChecker evenOrOdd = (n) -> {
        if (n % 2 == 0) {
            System.out.println(n + " is an even number.");
        } else {
            System.out.println(n + " is an odd number.");
        }
    };
}
