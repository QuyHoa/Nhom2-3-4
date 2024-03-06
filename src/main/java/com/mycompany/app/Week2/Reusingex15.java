package com.mycompany.app.Week2;

public class Reusingex15 {
    
public class MyClass {
    protected void protectedMethod() {
        System.out.println("This is a protected method");
       

 class DerivedClass extends MyClass {
    public void callProtectedMethod() {
        protectedMethod(); 
    }
    package com.othercompany.app;

import com.mycompany.app.DerivedClass;

public class Main {
    public static void main(String[] args) {
        DerivedClass derivedObject = new DerivedClass();
        derivedObject.callProtectedMethod(); 
       
    }
}
}
    }
}
}
