package com.mycompany.app.Week2;

public class InitializationCleanupEx19 {
    public static void printStrings(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        // Chuyển danh sách các chuỗi phân tách bằng dấu phẩy vào phương thức
        printStrings("Hello", "World", "Java");

        // Chuyển một mảng chuỗi vào phương thức
        String[] array = {"One", "Two", "Three"};
        printStrings(array);
    }
}

