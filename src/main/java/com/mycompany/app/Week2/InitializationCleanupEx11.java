package com.mycompany.app.Week2;

public class InitializationCleanupEx11 {
    public static class FinalizeExample {
        public void finalize() {
            System.out.println("Đối tượng đã được hủy bởi Garbage Collector.");
        }

        public void destroy() {
            finalize();
        }
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();

        // Gọi phương thức destroy() thay vì gán null cho biến obj
        obj.destroy();

        // Kích hoạt Garbage Collector bằng cách gọi phương thức System.gc()
        System.gc();
        System.out.println("Kết thúc chương trình.");
    }
}
