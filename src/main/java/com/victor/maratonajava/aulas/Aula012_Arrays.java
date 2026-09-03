package com.victor.maratonajava.aulas;

public class Aula012_Arrays {
    public static void main(String[] args) {
        int[] orderIds = { 101, 102, 103, 104, 105 };
        double[] prices = new double[5]; // criado vazio, com 5 posições

        prices[0] = 87.50;
        prices[1] = 120.00;
        prices[2] = 45.30;
        prices[3] = 300.00;
        prices[4] = 15.90;

        double total = 0;
        for (int i = 0; i < orderIds.length; i++) {
            total += prices[i];
            System.out.println("Pedido " + orderIds + ": R$ " + prices[i]);
        }
        for (double price : prices) {
            if (price >= 100) {
                System.out.println("Pedido de alto valor: R$ " + price);
            }
        }
        System.out.println("Total: R$ " + total);
    }
}
