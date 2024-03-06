package com.mycompany.app.Week2;

class Base {
    public void overloadedMethod() {
        System.out.println("base implementation.");
    }

    public void overloadedMethod(String arg1) {
        System.out.println("the 1 overloaded implementation.");
    }

    public void overloadedMethod(String arg1, String arg2) {
        System.out.println("the 2 overloaded implementation.");
    }
}

class Derived extends Base {
    public void overloadedMethod(String arg1, String arg2, String arg3) {
        System.out.println("the new overloaded implementation.");
    }
}

public class Reusingex13 {
    public static void main(String[] args) {
        Derived obj = new Derived();

        obj.overloadedMethod();  
        obj.overloadedMethod("arg1"); 
        obj.overloadedMethod("arg1", "arg2");  
        obj.overloadedMethod("arg1", "arg2", "arg3"); 
    }
}