package com.mycompany.app.Week2;

public class InitializationCleanupEx8 {
    public static class MyClass {
        public void method1() {
            System.out.println("Gọi phương thức method2 lần đầu tiên không sử dụng đối tượng này:");
            method2(); // Gọi method2 lần đầu tiên không sử dụng 'this'
    
            System.out.println("\nGọi phương thức method2 lần thứ hai sử dụng đối tượng này:");
            this.method2(); // Gọi method2 lần thứ hai sử dụng 'this'
        }
    
        public void method2() {
            System.out.println("Phương thức method2 được gọi.");
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1(); // Gọi method1 để kiểm tra phương thức method2
    }
}
