package com.mycompany.app.Week2;

class Insect {

    private int i = 9;
    protected int j;

    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }

    static int printInit(String s) {
        print(s);
        return 47;
    }

    static void print(String s) {
        System.out.println(s);
    }
}

class Beetle extends Insect {
    private int k = printInit("khởi tạo Beetle.k ");

    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    public static void main(String[] args) {
        print("Beetle constructor");
        new Beetle();

        print("SpecificBeetle constructor");
        new SpecificBeetle();
    }
}

class SpecificBeetle extends Beetle {
    private int m = printInit("khởi tạo SpecificBeetle.m ");

    public SpecificBeetle() {
        print("m = " + m);
        print("j = " + j);
    }
}