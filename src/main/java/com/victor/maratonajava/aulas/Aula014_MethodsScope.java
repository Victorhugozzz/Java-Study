package com.victor.maratonajava.aulas;

public class Aula014_MethodsScope {
    public static void main(String[] args) {
        double total = calculateTotal(150.0, 0.1);
        System.out.println("Total com desconto: R$ " + total);

        double totalSemDesconto = calculateTotal(150.0);
        System.out.println("Total sem desconto: R$ " + totalSemDesconto);

        printReceipt(total);
    }

    // parâmetros + return
    static double calculateTotal(double price, double discountRate) {
        double discount = price * discountRate; // 'discount' só existe AQUI dentro
        return price - discount;
    }

    // overloading — mesmo nome, assinatura diferente
    static double calculateTotal(double price) {
        return calculateTotal(price, 0.0);
    }

    // void — executa ação, não devolve valor
    static void printReceipt(double total) {
        System.out.println("Recibo gerado para R$ " + total);
    }
}
