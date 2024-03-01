package com.mycompany.app.Week2;

public class InitializationCleanupEx2 {
    // Trường String được khởi tạo tại điểm định nghĩa
    private String str1 = "Initialized at definition";

    // Hàm tạo khởi tạo trường String
    private String str2;

    public InitializationCleanupEx2(String value) {
        // Trường String được khởi tạo bởi hàm tạo
        str2 = value;
    }

    public void printStrings() {
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }

    public static void main(String[] args) {
        InitializationCleanupEx2 obj1 = new InitializationCleanupEx2("Initialized by constructor");
        obj1.printStrings();

        InitializationCleanupEx2 obj2 = new InitializationCleanupEx2("Different value");
        obj2.printStrings();
    }
}
