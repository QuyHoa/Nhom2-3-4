package com.mycompany.app.Week2;

public class InitializationCleanupEx14 {
    static String staticString = "Initialized at definition";

    static {
        staticString += " and initialized in static block";
    }

    static void printStaticFields() {
        System.out.println("Static String: " + staticString);
    }

    public static void main(String[] args) {
        printStaticFields();
    }
}
