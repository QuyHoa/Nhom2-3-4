package com.mycompany.app.Week2;

public class InitializationCleanupEx18 {
    public static class MyClass {
        private String message;

        public MyClass(String message) {
            this.message = message;
            System.out.println("Initializing MyClass with message: " + message);
        }

        // Thêm một phương thức getter cho trường message
        public String getMessage() {
            return message;
        }

        public static void main(String[] args) {
            // Tạo một mảng các tham chiếu đối tượng cho lớp MyClass
            MyClass[] myObjects = new MyClass[5];

            // Tạo và gắn các đối tượng vào mảng tham chiếu
            for (int i = 0; i < myObjects.length; i++) {
                // Tạo đối tượng mới và gắn vào mảng
                myObjects[i] = new MyClass("Object " + (i + 1));
            }

            // In giá trị của trường message của mỗi đối tượng
            for (int i = 0; i < myObjects.length; i++) {
                System.out.println("Message of object " + (i + 1) + ": " + myObjects[i].getMessage());
            }
        }
    }
}

