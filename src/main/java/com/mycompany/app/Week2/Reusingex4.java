package com.mycompany.app.Week2;


public class Reusingex4 {
    public Reusingex4() {
        System.out.println("Reusingex4 constructor");
    }
}

class DerivedClass extends Reusingex4 {
    public DerivedClass() {
        System.out.println("DerivedClass constructor");
    }
}

class Main {
    public static void main(String[] args) {
        new DerivedClass();
    }
}