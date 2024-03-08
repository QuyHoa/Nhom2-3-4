package com.mycompany.app.Week2;
package com.mycompany.app.Week2;

interface Rodent {
    void eat();
    void run();
}

class Mouse implements Rodent {
    @Override
    public void eat() {
        System.out.println("Mouse is eating.");
    }

    @Override
    public void run() {
        System.out.println("Mouse is running.");
    }
}

class Gerbil implements Rodent {
    @Override
    public void eat() {
        System.out.println("Gerbil is eating.");
    }

    @Override
    public void run() {
        System.out.println("Gerbil is running.");
    }
}

class Hamster implements Rodent {
    @Override
    public void eat() {
        System.out.println("Hamster is eating.");
    }

    @Override
    public void run() {
        System.out.println("Hamster is running.");
    }
}

public class Music2 {
    public static void main(String[] args) {
        Rodent[] rodents = { new Mouse(), new Gerbil(), new Hamster() };

        for (Rodent rodent : rodents) {
            rodent.eat();
            rodent.run();
        }
    }
}
