package com.mycompany.app.Week2;

public class InitializationCleanupEx9 {
    
    public static class MyClass {
        public MyClass() {
            this("Hello"); // Gọi hàm tạo có tham số từ hàm tạo không đối số
            System.out.println("Đây là hàm tạo không đối số.");
        }
    
        public MyClass(String message) {
            System.out.println("Đây là hàm tạo với đối số: " + message);
        }
        
        // Định nghĩa phương thức someMethod()
        public void someMethod() {
            System.out.println("Đây là phương thức someMethod().");
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        // Sử dụng biến obj để gọi phương thức someMethod()
        obj.someMethod();
    }
}
