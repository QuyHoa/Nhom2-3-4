package com.mycompany.app.Week2;

public class Recursion {
    long factorial(long number) {
        if (number <= 1) // base case
            return 1;
        else
            return number * factorial(number - 1);
    }

    void printFactorial(long number) {
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        long number = 7; 
        recursion.printFactorial(number);
    }
}
