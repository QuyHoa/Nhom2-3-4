package com.mycompany.app.Week2;

class Instrument {
    void play() {
        System.out.println("Instrument is playing...");
    }
}

class Piano extends Instrument {
    @Override
    void play() {
        System.out.println("Piano is playing...");
    }
}

class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("Guitar is playing...");
    }
}

// Add a new type of instrument
class Violin extends Instrument {
    @Override
    void play() {
        System.out.println("Violin is playing...");
    }
}

public class Music2 {
    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[3];
        orchestra[0] = new Piano();
        orchestra[1] = new Guitar();
        orchestra[2] = new Violin();

        for (Instrument instrument : orchestra) {
            instrument.play(); // Polymorphism: calls the appropriate play() method for each instrument
        }
    }
}