package com.mycompany.app.Week2;
import com.mycompany.app.Week2.M;
import com.mycompany.app.Week2.AnotherClass;
public class Ex6 {
    public static void main(String[] args) {
        M obj = new M(10);
        AnotherClass anotherObj = new AnotherClass();

        // Accessing protected data through a method in another class
        anotherObj.modifyProtectedData(obj);
    }
}


    