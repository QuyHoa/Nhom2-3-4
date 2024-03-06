package com.mycompany.app.Week2;

public class InitializationCleanupEx15 {
    public static class StringInitializationExample {
        private String message;

        // Constructor khởi tạo đối tượng với chuỗi được cung cấp
        public StringInitializationExample(String message) {
            this.message = message;
        }

        // Phương thức in ra thông điệp
        public void printMessage() {
            System.out.println("Message: " + message);
        }

        public static void main(String[] args) {
            // Tạo một đối tượng của lớp StringInitializationExample với chuỗi được cung cấp
            StringInitializationExample example = new StringInitializationExample("Hello, World!");

            // Gọi phương thức in thông điệp
            example.printMessage();
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
>>>>>>> eae7de9c92f861b99bdcd2aedbd9d72aec40288e
        }
    }
}
