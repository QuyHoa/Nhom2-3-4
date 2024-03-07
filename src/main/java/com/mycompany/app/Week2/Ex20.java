package com.mycompany.app;

class WithFinals {
    final void f() {
        System.out.println("WithFinals.f()");
    }

    void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    
}

class OverridingPrivate2 extends OverridingPrivate {
    

    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

class Main {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        
        op2.f();
        op2.g();
    }
}
