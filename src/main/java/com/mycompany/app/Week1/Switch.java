package com.mycompany.app.Week1;

public class Switch {

    public static void main(String[] args) {
        // Bai 1
        int day1 = 2;
        switch (day1) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Bai 2
        int day2 = 4;
        switch (day2) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Weekend");
        }

        System.out.println("Q");
    }
    
}
