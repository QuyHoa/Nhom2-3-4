package com.mycompany.app.Week2;

interface FastFood {
    void serve();
}

class Sandwich implements FastFood {
    @Override
    public void serve() {
        System.out.println("Sandwich is served.");
    }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.serve();
    }
}
