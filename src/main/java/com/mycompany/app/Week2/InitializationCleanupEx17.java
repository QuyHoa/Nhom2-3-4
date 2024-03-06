package com.mycompany.app.Week2;

public class InitializationCleanupEx17 {
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

            for (int i = 0; i < myObjects.length; i++) {
                // Gán các tham chiếu cho đối tượng mới tạo
                myObjects[i] = new MyClass("Object " + (i + 1));
                // In giá trị của trường message của mỗi đối tượng
                System.out.println("Message of object " + (i + 1) + ": " + myObjects[i].getMessage());
            }
        }
    }
}
