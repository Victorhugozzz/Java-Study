package com.victor.maratonajava.desafios;

public class OrderProcess {
    public static void main(String[] args) {
        int processedCount = 0;
        for (int orderId = 1; orderId <= 10; orderId++) {
            if (orderId == 9)
                break;
            if (orderId % 3 == 0)
                continue;
            double orderPrice;
            orderPrice = (orderId * 45.0);
            String classification = orderPrice >= 300 ? "ALTO VALOR" : "PADRAO";
            System.out.println("O pedido " + orderId + " ficou em R$ " + orderPrice + " " + classification);
            processedCount++;

        }
        System.out.println("O numero de pedidos e: " + processedCount);
    }
}
