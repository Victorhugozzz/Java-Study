package com.victor.maratonajava.desafios;

public class ProcessOfOrder {
    public static void main(String[] args) {
        double[] orderValues = { 120.0, 450.0, 89.90, 310.0, 55.0 };

        for (int i = 0; i < orderValues.length; i++) {
            printOrderSummary((i + 1), orderValues[i]);
        }
    }

    static boolean isHighValue(double value) {
        return value >= 300;
    }

    static void printOrderSummary(int orderNumber, double value) {
        boolean highValue = isHighValue(value);
        String classification = highValue ? "ALTO VALOR" : "PADRÃO";
        System.out.println("O pedido " + orderNumber + " : R$ " + value + " " + classification);
    }
}