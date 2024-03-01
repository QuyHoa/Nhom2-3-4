package com.mycompany.app.Week2;

public class InitializationCleanupEx3 {
    public static class MessagePrinter {
        public MessagePrinter() {
            System.out.println("Xin chào! Đây là một tin nhắn từ đối tượng của lớp MessagePrinter.");
        }
    }

    public static void main(String[] args) {
       new MessagePrinter();
    }
}
