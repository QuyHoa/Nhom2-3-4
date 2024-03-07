package com.mycompany.app.Week2;
abstract class Base {
    Base() {
        print();
    }
    abstract void print();
}

class Derived extends Base {
    private int value = 42; // Define the int variable with a nonzero value

    @Override
    void print() {
        System.out.println("Value in Derived class: " + value);
    }
}

class Main {
    public static void main(String[] args) {
        Derived derivedObj = new Derived();
        derivedObj.print();
    }
}
