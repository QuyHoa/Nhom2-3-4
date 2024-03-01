package com.mycompany.app.Week2;

public class NNCollection {
    public static class InnerNNCollection {
        private NameNumber[] nnArray = new NameNumber[100];
        private int free;

        public InnerNNCollection() {
            free = 0;
        }

        public void insert(NameNumber n) {
            int index = 0;
            for (int i = free; i != 0 && nnArray[i - 1].getLastName().compareTo(n.getLastName()) > 0; i--) {
                nnArray[i] = nnArray[i - 1];
                index = i;
            }
            nnArray[index] = n;
            free++;
        }

        public String findNumber(String lName) {
            for (int i = 0; i < free; i++) {
                if (nnArray[i].getLastName().equals(lName)) {
                    return nnArray[i].getTelNumber();
                }
            }
            return "Name not found";
        }
    }

    public static void main(String[] args) {
        InnerNNCollection collection = new InnerNNCollection();

        NameNumber nn1 = new NameNumber("John Doe", "0352828699");
        NameNumber nn2 = new NameNumber("Jane Smith", "22010474123");
        collection.insert(nn1);
        collection.insert(nn2);

   
        String phoneNumber1 = collection.findNumber("John Doe");
        System.out.println("Phone number for John Doe: " + phoneNumber1);

        String phoneNumber2 = collection.findNumber("Jane Smith");
        System.out.println("Phone number for Jane Smith: " + phoneNumber2);

        String phoneNumber3 = collection.findNumber("Invalid Name");
        System.out.println("Phone number for Invalid Name: " + phoneNumber3);
    }
}
