package com.mycompany.app.Week2;

public class InitializationCleanupEx1 {
    private String str; 

    // Nested class không thể có cùng tên với lớp bên ngoài, hãy đổi tên lớp này
    public class NestedInitializationCleanupEx1 {
        private String str; // Tham chiếu String chưa được khởi tạo

        public NestedInitializationCleanupEx1() {
            // Không có mã khởi tạo tham chiếu String ở đây
        }

        public String getStr() {
            return str;
        }
    }

    public static void main(String[] args) {
        InitializationCleanupEx1 example = new InitializationCleanupEx1();

        if (example.getStr() == null) {
            System.out.println("Tham chiếu String đã được khởi tạo thành null.");
        } else {
            System.out.println("Tham chiếu String không được khởi tạo thành null.");
        }
    }

    public String getStr() {
        return str;
    }
}
