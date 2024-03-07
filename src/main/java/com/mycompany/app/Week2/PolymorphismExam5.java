package com.mycompany.app.Week2;
class Cycle {
    public int wheels() {
        return 0;
    }
    
    public void ride() {
        System.out.println("Riding a " + getClass().getSimpleName() + " with " + wheels() + " wheels");
    }
}

class Unicycle extends Cycle {
    public int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    public int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    public int wheels() {
        return 3;
    }
}
public class PolymorphismExam5 {
    public static void main(String[] args) {
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();
        
        Cycle[] cycles = {unicycle, bicycle, tricycle};
        
        for (Cycle cycle : cycles) {
            cycle.ride();
        }
    }
}
