package com.victor.maratonajava.desafios;

public class MultiplePaymentMethods {
    public static void main(String[] args) {
        double[] saleValues = { 150.0, 320.0, 89.90, 500.0 };
        String[] paymentMethods = { "PIX", "CREDIT_CARD", "BOLETO", "DEBIT_CARD" };
        double sum = 0;
        for (int i = 0; i < saleValues.length; i++) {
            double finalValue = printSale((i + 1), saleValues[i], paymentMethods[i]);
            sum += finalValue;
        }
        System.out.println("\nTotal do dia: R$ " + sum);
    }

    static double calculateFee(double value, String method) {
        // switch decide a taxa, retorna valor + taxa
        switch (method) {
            case "PIX":
                break;
            case "BOLETO":
                value += 2;
                break;
            case "CREDIT_CARD", "DEBIT_CARD":
                value += (value * 0.02);
                break;
            default:
                break;
        }
        return value;
    }

    static String classify(double value) {
        String rating = value >= 300 ? "ALTO VALOR" : "PADRÃO";
        return rating;
    }

    static double printSale(int saleNumber, double value, String method) {
        double finalValue = calculateFee(value, method);
        String result = classify(finalValue);
        System.out.println("Venda " + saleNumber + ": " + method + " -- R$ " + finalValue + " -- " + result);
        return finalValue;
    }
}
