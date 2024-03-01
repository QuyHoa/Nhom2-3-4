package com.mycompany.app.Week2;

public class NameNumber {
    private String lastName;
    private String telNumber;
    
    public NameNumber() {}
    
    public NameNumber(String name, String num) {
        lastName = name;
        telNumber = num;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getTelNumber() {
        return telNumber;
    }
}

class Main {
    public static void main(String[] args) {
   
        NameNumber person = new NameNumber("Nguyen", "123456789");

        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Telephone Number: " + person.getTelNumber());
    }
}
