package com.victor.maratonajava.desafios;

public class StoreSales {
    public static void main(String[] args) {
        int[][] dailySales = { { 320, 450, 210, 600 }, { 150, 800, 400, 275 }, { 500, 300, 350, 620 } };
        int maxSales = 0;
        int betterStores = 0;
        int sumStore = 0;

        for (int row = 0; row < dailySales.length; row++) {
            for (int i = 0; i < dailySales[row].length; i++) {
                sumStore += dailySales[row][i];
            }
            System.out.println("Loja " + (row + 1) + ": Total de vendas R$ " + sumStore);
            if (sumStore > maxSales) {
                maxSales = sumStore;
                betterStores = row + 1;
            }
            sumStore = 0;
        }
        System.out.println("A loja com maior vendas foi a " + betterStores + " com : R$ " + maxSales);
    }
}
