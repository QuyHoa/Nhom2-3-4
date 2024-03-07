
package com.mycompany.app.Week2;

class Instrument {
    public String toString() {
        return "Instrument";
    }
    void play(String note) {
        System.out.println("Instrument.play() " + note);
    }
    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    public String toString() {
        return "Wind";
    }
    void play(String note) {
        System.out.println("Wind.play() " + note);
    }
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    public String toString() {
        return "Percussion";
    }
    void play(String note) {
        System.out.println("Percussion.play() " + note);
    }
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    public String toString() {
        return "Stringed";
    }
    void play(String note) {
        System.out.println("Stringed.play() " + note);
    }
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
    void play(String note) {
        System.out.println("Brass.play() " + note);
    }
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
    void play(String note) {
        System.out.println("Woodwind.play() " + note);
    }
}

public class PolymorphismEx6 {
    public static void tune(Instrument i, String note) {
        i.play(note);
    }
    public static void tuneAll(Instrument[] e, String note) {
        for (Instrument i : e)
            tune(i, note);
    }
    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        String note = "C#"; // Example note
        tuneAll(orchestra, note);

        // Printing Instrument objects using System.out.println() (without any casting)
        for (Instrument instrument : orchestra) {
            System.out.println(instrument);
        }
    }
}
