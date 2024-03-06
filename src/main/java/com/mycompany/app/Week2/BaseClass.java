package com.mycompany.app.Week2;
class BaseClass {
    public BaseClass(int value) {
        System.out.println("BaseClass constructor called");
    }
}

class DerivedClass extends BaseClass {
    public DerivedClass() {
        super(42);
        System.out.println("DerivedClass constructor called");
    }

    public DerivedClass(int value) {
        super(value);
        System.out.println("DerivedClass constructor called");
    }
}

 class Main {
    public static void main(String[] args) {
        
        new DerivedClass();
                new DerivedClass(100);
        
    }
}