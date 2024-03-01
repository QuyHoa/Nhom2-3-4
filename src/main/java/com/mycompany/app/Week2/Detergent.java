package com.mycompany.app.Week2;

class Detergent {
    public void scrub() {
        System.out.println("Scrubbing.");
    }
    
    public void foam() {
        System.out.println("Creating foam.");
    }
}

class SterilizingDetergent extends Detergent {
    @Override
    public void scrub() {
        System.out.println("Scrubbing vigorously.");
    }
    
    public void sterilize() {
        System.out.println("Sterilizing.");
    }
}

 class Main {
    public static void main(String[] args) {
        SterilizingDetergent sterilizingDetergent = new SterilizingDetergent();
        
        sterilizingDetergent.scrub();
        sterilizingDetergent.foam();  
        sterilizingDetergent.sterilize(); 
    }
}