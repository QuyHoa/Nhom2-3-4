package com.mycompany.app.Week2;

public class InitializationCleanupEx15 {
    public static class StringArrayExample {
        public static void main(String[] args) {
            // Tạo một mảng String có độ dài là 5
            String[] stringArray = new String[5];

            // Gán một chuỗi cho mỗi phần tử của mảng
            stringArray[0] = "Hello";
            stringArray[1] = "World";
            stringArray[2] = "Java";
            stringArray[3] = "Programming";
            stringArray[4] = "Language";

            // In mảng bằng cách sử dụng vòng lặp for
            for (int i = 0; i < stringArray.length; i++) {
                System.out.println("Element at index " + i + ": " + stringArray[i]);
            }
        }
    }
}
