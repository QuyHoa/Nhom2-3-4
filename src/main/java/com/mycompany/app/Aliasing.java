package com.mycompany.app;

public class Aliasing {
    static void f(Number m) {
    m.i = 15;
    }
    public static void main(String[] args) {
    Number n = new Number();
    n.i = 14;
    f(n); // what is n.i now?

    System.out.println(n.i);
    
    }
   }