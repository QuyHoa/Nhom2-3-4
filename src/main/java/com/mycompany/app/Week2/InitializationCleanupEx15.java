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
        }
    }
}
