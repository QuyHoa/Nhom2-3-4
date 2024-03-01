package com.mycompany.app.Week2;
import net.mindview.simple.*;
import java.util.*;
class ex2 {
    public static void main(String[] args) {
        // Try to create a Vector
        Vector v = new Vector(); // Collision occurs here

        // To specify which Vector class to use, you must be explicit
        java.util.Vector utilVector = new java.util.Vector();
        utilVector.add("Hello");

        // This will print "Hello" from the java.util.Vector
        System.out.println(utilVector.get(0));

       
    }
}

