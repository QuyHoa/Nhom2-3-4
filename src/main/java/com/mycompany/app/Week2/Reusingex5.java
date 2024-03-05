package com.mycompany.app.Week2;

class Quyen {
    Quyen() {
        System.out.println("Constructor của lớp Quyen");
    }
}

class Duyen {
    Duyen() {
        System.out.println("Constructor của lớp Duyen");
    }
}

class C extends Quyen {
    Duyen b_object;

    C() {
        super();
        b_object = new Duyen();
    }
}

public class Reusingex5 {
    public static void main(String[] args) {
        new C(); 
    }
}
