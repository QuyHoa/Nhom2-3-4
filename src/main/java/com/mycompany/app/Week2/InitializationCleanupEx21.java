package com.mycompany.app.Week2;

import java.util.ArrayList;
import java.util.List;

public class InitializationCleanupEx21 {
    public static void main(String[] args) {
        // Tạo danh sách sáu loại tiền giấy
        List<String> currencyList = new ArrayList<>();
        currencyList.add("1 đồng");
        currencyList.add("2 đồng");
        currencyList.add("5 đồng");
        currencyList.add("10 đồng");
        currencyList.add("20 đồng");
        currencyList.add("50 đồng");

        // In từng giá trị và thứ tự của tiền giấy
        System.out.println("Danh sách các loại tiền giấy và thứ tự của chúng:");
        for (int i = 0; i < currencyList.size(); i++) {
            System.out.println("Tiền giấy " + currencyList.get(i) + " có giá trị thấp nhất và ở vị trí " + (i + 1));
        }
    }
}

