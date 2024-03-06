package com.mycompany.app.Week2;

public class InitializationCleanupEx12 {
    public static class Tank {
        private boolean isEmpty;

        public Tank() {
            this.isEmpty = true;
        }

        public void fillTank() {
            System.out.println("Tank đã được lấp đầy.");
            isEmpty = false;
        }

        public void emptyTank() {
            System.out.println("Tank đã được làm trống.");
            isEmpty = true;
        }

        public boolean isFinished() {
            if (isEmpty) {
                System.out.println("Đối tượng Tank đã được dọn sạch.");
                return true;
            } else {
                System.out.println("Đối tượng Tank chưa được dọn sạch.");
                return false;
            }
        }

        public static void main(String[] args) {
            // Tạo một đối tượng Tank mới
            Tank tank = new Tank();

            // Kiểm tra trạng thái ban đầu của Tank
            tank.isFinished(); // In ra: "Đối tượng Tank đã được dọn sạch."

            // Lấp đầy Tank
            tank.fillTank();

            // Kiểm tra lại trạng thái của Tank
            tank.isFinished(); // In ra: "Đối tượng Tank chưa được dọn sạch."

            // Làm trống Tank
            tank.emptyTank();

            // Kiểm tra trạng thái cuối cùng của Tank
            tank.isFinished(); // In ra: "Đối tượng Tank đã được dọn sạch."
        }
    }
}
