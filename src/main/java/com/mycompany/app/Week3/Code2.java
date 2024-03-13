package com.mycompany.app.Week3;

abstract class Instrument {
    private String name;

    public Instrument(String name) {
        this.name = name;
    }

    public abstract void play();

    public String getName() {
        return name;
    }
}

class StringInstrument extends Instrument {
    private int numberOfStrings;

    public StringInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println(getName() + " with " + numberOfStrings + " strings is playing...");
    }
}

class WindInstrument extends Instrument {
    private String material;

    public WindInstrument(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public void play() {
        System.out.println(getName() + " made of " + material + " is playing...");
    }
}

class Percussion extends Instrument {
    private String type;

    public Percussion(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void play() {
        System.out.println(getName() + " of type " + type + " is playing...");
    }
}

class Woodwind extends Instrument {
    private String key;

    public Woodwind(String name, String key) {
        super(name);
        this.key = key;
    }

    @Override
    public void play() {
        System.out.println(getName() + " in the key of " + key + " is playing...");
    }
}

class Brass extends Instrument {
    private int numberOfValves;

    public Brass(String name, int numberOfValves) {
        super(name);
        this.numberOfValves = numberOfValves;
    }

    @Override
    public void play() {
        System.out.println(getName() + " with " + numberOfValves + " valves is playing...");
    }
}

public class Code2 {
    public static void main(String[] args) {
        StringInstrument violin = new StringInstrument("Violin", 4);
        WindInstrument flute = new WindInstrument("Flute", "Wood");
        Percussion drum = new Percussion("Drum", "Snare");
        Woodwind clarinet = new Woodwind("Clarinet", "Bb");
        Brass trumpet = new Brass("Trumpet", 3);

        violin.play();
        flute.play();
        drum.play();
        clarinet.play();
        trumpet.play();
    }
}