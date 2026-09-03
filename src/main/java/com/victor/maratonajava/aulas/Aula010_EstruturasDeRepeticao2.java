package com.victor.maratonajava.aulas;

public class Aula010_EstruturasDeRepeticao2 {
    public static void main(String[] args) {
        int totalOrders = 5;
        double revenue = 0;

        for (int i = 1; i <= totalOrders; i++) {
            double orderValue = i * 87.50;
            String tag = orderValue >= 300 ? "ALTO VALOR" : "PADRAO";
            revenue += orderValue;
            System.out.println("Pedido " + i + ":R$ " + orderValue + " [" + tag + "]");
        }
        System.out.println("Faturamento total: R$ " + revenue);
    }
}
