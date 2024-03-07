package com.mycompany.app.Week2;
class Instrument {
    public void play() {
        System.out.println("Instrument is playing");
    }
}

class Wind extends Instrument {
    public void play() {
        System.out.println("Wind instrument is playing");
    }
}

class Percussion extends Instrument {
    public void play() {
        System.out.println("Percussion instrument is playing");
    }
}

class Stringed extends Instrument {
    public void play() {
        System.out.println("Stringed instrument is playing");
    }
}

class NewInstrument extends Instrument {
    public void play() {
        System.out.println("New instrument is playing");
    }
}
public class PolymorphismEXample7 {
    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[4];
        orchestra[0] = new Wind();
        orchestra[1] = new Percussion();
        orchestra[2] = new Stringed();
        orchestra[3] = new NewInstrument(); // New instrument added

        for (Instrument instrument : orchestra) {
            instrument.play();
        }
    }
}
