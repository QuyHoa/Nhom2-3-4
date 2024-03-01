package com.mycompany.app.Week2;

public class InitializationCleanupEx4 {
    public static class MessagePrinter {
        public MessagePrinter() {
            System.out.println("Xin chào! Đây là một tin nhắn từ đối tượng của lớp MessagePrinter.");
        }
        
        public MessagePrinter(String message) {
            System.out.println("Xin chào! Đây là một tin nhắn từ đối tượng của lớp MessagePrinter: " + message);
        }
    }

    public static void main(String[] args) {
        new MessagePrinter(); // Gọi constructor không đối số
        new MessagePrinter("Message"); // Gọi constructor có đối số
    }
}
