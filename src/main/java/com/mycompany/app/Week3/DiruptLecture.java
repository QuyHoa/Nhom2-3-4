package com.mycompany.app.Week3;

class CellPhone {
    CellPhone() {
       
    }

    public void ring(Tune t) {
        t.play();
    }
}

class Tune {
    public void play() {
        System.out.println("Tune.play()");
    }
}

class ObnoxiousTune extends Tune {
    ObnoxiousTune() {
        
    }
}

 class DisruptLecture {
    public static void main(String[] args) {
        CellPhone noiseMaker = new CellPhone();
        ObnoxiousTune ot = new ObnoxiousTune();
        noiseMaker.ring(ot);
    }
}

class TestDisruptLecture {
    public static void main(String[] args) {
        CellPhone noiseMaker = new CellPhone();
        Tune t = new Tune();
        noiseMaker.ring(t);

        ObnoxiousTune ot = new ObnoxiousTune();
        noiseMaker.ring(ot); 
    }
}
