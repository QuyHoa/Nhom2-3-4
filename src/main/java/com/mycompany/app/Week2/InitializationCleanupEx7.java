package com.mycompany.app.Week2;

public class InitializationCleanupEx7 {
    public static void main(String[] args) {
        // Tạo một đối tượng của lớp MyClass
        new MyClass();

        // In ra thông báo để xác minh rằng đối tượng đã được tạo thành công
        System.out.println("Đối tượng của lớp MyClass đã được tạo thành công.");
    }
}

class MyClass {
    // Không có hàm tạo được khai báo
}
