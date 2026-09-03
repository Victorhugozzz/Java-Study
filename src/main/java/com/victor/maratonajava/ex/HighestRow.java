package com.victor.maratonajava.ex;

public class HighestRow {
    public static void main(String[] args) {
        int[][] sales = { { 100, 200, 150 }, { 80, 90, 300 }, { 50, 30, 60 } };
        for (int i = 0; i < sales.length; i++) {
            int highestSales = sales[i][0];
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > highestSales) {
                    highestSales = sales[i][j];
                }
            }
            System.out.println(highestSales);
        }
    }
}
