package com.mycompany.app.Week2;
class Cycle {
    public void ride() {
        System.out.println("Riding a cycle");
    }
}

class Unicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a unicycle");
    }
}

class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a bicycle");
    }
}

class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a tricycle");
    }
}

public class Ex1Cycle {
    public static void main(String[] args) {
        Cycle cycle1 = new Unicycle();
        Cycle cycle2 = new Bicycle();
        Cycle cycle3 = new Tricycle();

        rideCycle(cycle1);
        rideCycle(cycle2);
        rideCycle(cycle3);
    }

    public static void rideCycle(Cycle cycle) {
        cycle.ride();
    }
}
