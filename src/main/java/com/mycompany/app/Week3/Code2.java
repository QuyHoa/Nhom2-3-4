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

public class Code2 {
    public static void main(String[] args) {
        StringInstrument violin = new StringInstrument("Violin", 4);
        WindInstrument flute = new WindInstrument("Flute", "Wood");
        
        violin.play();
        flute.play();
    }
}
