package com.mycompany.app.Week2;
import java.util.*;

// Step 1: Create a new subclass of Instrument
class Trumpet extends Instrument {
    public void play() {
        System.out.println("Playing trumpet...");
    }
}

// Step 3: Update randomInstrument() method
public static Instrument randomInstrument() {
    Random rand = new Random();
    int choice = rand.nextInt(4); // Increase the number to match the total number of instrument types

    switch (choice) {
        case 0:
            return new Guitar();
        case 1:
            return new Piano();
        case 2:
            return new Violin();
        case 3:
            return new Trumpet(); // Add the new instrument type
        default:
            return new Instrument(); // Default to base instrument
    }
}

// Step 4: Verify polymorphism
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
