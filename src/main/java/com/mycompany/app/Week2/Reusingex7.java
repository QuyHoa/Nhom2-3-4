package com.mycompany.app.Week2;

public class Reusingex7 {
    class Duyen {
        Duyen(int i) {
            System.out.println("Duyen constructor with argument: " + i);
        }
    }

    class Quyen {
        Quyen(int i) {
            System.out.println("Quyen constructor with argument: " + i);
        }
    }

    class C extends Duyen {
        Quyen b;

        C(int i, int j) {
            super(i); 
            b = new Quyen(j); 
        }
    }

    public static void main(String[] args) {
        Reusingex7 reusingex7 = new Reusingex7();
        reusingex7.new C(1, 2);
    }
}