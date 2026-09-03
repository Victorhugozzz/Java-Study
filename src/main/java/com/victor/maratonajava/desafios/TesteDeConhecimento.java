package com.victor.maratonajava.desafios;

public class TesteDeConhecimento {
    public static void main(String[] args) {
        double amountRequested = 300;
        double freight = 25.9;
        double totalAmount = amountRequested;

        String message;
        if (amountRequested >= 200) {
            message = "Você ganhou frete grátis. Total do pedido: R$ " + totalAmount;
        } else {
            totalAmount += freight;
            message = "Total do pedido com frete: R$ " + totalAmount;
        }

        System.out.println(message);
    }
}
