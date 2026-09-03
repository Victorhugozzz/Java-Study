package com.victor.maratonajava.ex;

public class Overloading {
    public static void main(String[] args) {
        double total = calculateDiscount(150, 0.3);

        double totalSemDesconto = calculateDiscount(150.0);
        System.out.println("Total sem desconto: R$ " + totalSemDesconto);

        printReceipt(total);
    }

    static double calculateDiscount(double price, double discountRate) {
        double discount = price * discountRate;
        return price - discount;
    }

    static double calculateDiscount(double price) {
        return calculateDiscount(price, 0.0);
    }

    static void printReceipt(double total) {
        System.out.println("O produto esta com um desconto de 30% e esta saindo por R$ " + total);
    }
}
