package com.mycompany.app.Week2;

public class InitializationCleanupEx22 {
    // Khai báo enum để đại diện cho các loại tiền giấy
    enum CurrencyType {
        ONE_DONG,
        TWO_DONG,
        FIVE_DONG,
        TEN_DONG,
        TWENTY_DONG,
        FIFTY_DONG
    }

    public static void main(String[] args) {
        CurrencyType currency = CurrencyType.TEN_DONG;

        // Sử dụng câu lệnh switch cho enum
        switch (currency) {
            case ONE_DONG:
                System.out.println("Loại tiền này có giá trị là 1 đồng.");
                break;
            case TWO_DONG:
                System.out.println("Loại tiền này có giá trị là 2 đồng.");
                break;
            case FIVE_DONG:
                System.out.println("Loại tiền này có giá trị là 5 đồng.");
                break;
            case TEN_DONG:
                System.out.println("Loại tiền này có giá trị là 10 đồng.");
                break;
            case TWENTY_DONG:
                System.out.println("Loại tiền này có giá trị là 20 đồng.");
                break;
            case FIFTY_DONG:
                System.out.println("Loại tiền này có giá trị là 50 đồng.");
                break;
            default:
                System.out.println("Loại tiền này không hợp lệ.");
                break;
        }
    }
}
