package com.mycompany.app.Week2;

public class InitializationCleanupEx10 {
    public static class FinalizeExample {
        public void finalize() {
            System.out.println("Đối tượng đã được hủy bởi Garbage Collector.");
        }
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        obj = null; // Gán null cho biến obj để không còn tham chiếu đến đối tượng

        // Kích hoạt Garbage Collector bằng cách gọi phương thức System.gc()
        System.gc();

        System.out.println("Kết thúc chương trình.");

        // Sử dụng biến obj để tránh lỗi "The value of the local variable obj is not used"
        System.out.println("Biến obj được sử dụng: " + obj);
    }
}
