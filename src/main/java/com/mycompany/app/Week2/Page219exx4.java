package com.mycompany.app.Week2;

abstract class Base {
    abstract void method();
}

class Derived extends Base {
    @Override
    void method() {
        System.out.println("Method called in Derived class");
    }
    
    static void callMethod(Base base) {
        base.method(); // No need for downcasting
    }
}

public class Main {
    public static void main(String[] args) {
        Derived derivedObj = new Derived();
        
        // Using static method callMethod to call method in Derived class
        Derived.callMethod(derivedObj);
    }
}
