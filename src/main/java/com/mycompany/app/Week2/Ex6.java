package com.mycompany.app.Week2;
import com.mycompany.app.Week2.MyClass;
import com.mycompany.app.Week2.AnotherClass;
public class Ex6 {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        AnotherClass anotherObj = new AnotherClass();

        // Accessing protected data through a method in another class
        anotherObj.modifyProtectedData(obj);
    }
}


    