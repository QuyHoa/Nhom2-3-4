package com.mycompany.app.Week2;






package interfaces.music5;

import polymorphism.music.Note;
import static net.mindview.util.Print.*;

// Abstract class containing common methods for Wind, Percussion, and Stringed
abstract class AbstractInstrument implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public abstract String toString();

    public void adjust() {
        print(this + ".adjust()");
    }
}

// Wind class
class Wind extends AbstractInstrument {
    public String toString() {
        return "Wind";
    }
}

// Percussion class
class Percussion extends AbstractInstrument {
    public String toString() {
        return "Percussion";
    }
}

// Stringed class
class Stringed extends AbstractInstrument {
    public String toString() {
        return "Stringed";
    }
}

// Brass class
class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

// Woodwind class
class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Musics {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
