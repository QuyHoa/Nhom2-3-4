package com.mycompany.app.Week2;

final class Ex22 {
    public void displayMessage() {
        System.out.println("This is a final class.");
    }
}

 class Main {
    public static void main(String[] args) {
        Ex22 ex22 = new Ex22();
        ex22.displayMessage();
    }
}