package com.mycompany.app.Week2;

abstract class Rodent {
    abstract void eat();
    abstract void sleep();
}

class Mouse extends Rodent {
    @Override
    void eat() {
        System.out.println("Mouse is eating...");
    }

    @Override
    void sleep() {
        System.out.println("Mouse is sleeping...");
    }
}

class Gerbil extends Rodent {
    @Override
    void eat() {
        System.out.println("Gerbil is eating...");
    }

    @Override
    void sleep() {
        System.out.println("Gerbil is sleeping...");
    }
}

class Hamster extends Rodent {
    @Override
    void eat() {
        System.out.println("Hamster is eating...");
    }

    @Override
    void sleep() {
        System.out.println("Hamster is sleeping...");
    }
}

class RodentHierarchy {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

        for (Rodent rodent : rodents) {
            rodent.eat();   // Polymorphism: calls the appropriate eat() method for each Rodent
            rodent.sleep(); // Polymorphism: calls the appropriate sleep() method for each Rodent
        }
    }
}
