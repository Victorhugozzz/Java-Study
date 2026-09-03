package com.victor.maratonajava.ex;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] sales = { { 100, 200, 150 }, { 80, 90, 300 }, { 400, 120, 60 } };
        int totalProduct = 0;
        for (int row = 0; row < sales.length; row++) {
            for (int warehouse = 0; warehouse < sales[row].length; warehouse++) {
                totalProduct += sales[row][warehouse];
            }
        }
        System.out.println("Vendas total: " + totalProduct);
    }
}
