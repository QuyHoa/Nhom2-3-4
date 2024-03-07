package com.mycompany.app.Week2;
import java.util.*;

// Step 1: Base Instrument class
class Instrument {
    public void play() {
        System.out.println("Playing instrument...");
    }
}

// Step 2: Subclasses of Instrument
class Guitar extends Instrument {
    public void play() {
        System.out.println("Strumming guitar...");
    }
}

class Piano extends Instrument {
    public void play() {
        System.out.println("Playing piano...");
    }
}

class Violin extends Instrument {
    public void play() {
        System.out.println("Playing violin...");
    }
}

// Step 3: Modify Music3.java
public class Music3 {
    // Method to generate random instruments
    public static Instrument randomInstrument() {
        Random rand = new Random();
        int choice = rand.nextInt(3); // Change this number to match the number of instrument types

        switch (choice) {
            case 0:
                return new Guitar();
            case 1:
                return new Piano();
            case 2:
                return new Violin();
            default:
                return new Instrument(); // Default to base instrument
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[10];

        // Generating random instruments and storing them in the array
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = randomInstrument();
        }

        // Playing each instrument in the orchestra
        for (Instrument instrument : orchestra) {
            instrument.play();
        }
    }
}
