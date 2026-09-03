package com.victor.maratonajava.desafios;

public class InventoryProcessing {
    public static void main(String[] args) {
        int[] stockQuantities = { 12, 0, 45, 3, 0, 20 };
        int count = 0;
        for (int i = 0; i < stockQuantities.length; i++) {
            if (stockQuantities[i] == 0) {
                System.out.println("Produto " + (i + 1) + ": SEM ESTOQUE");
                count++;
            } else if (stockQuantities[i] <= 5) {
                System.out.println("Produto " + (i + 1) + ": ESTOQUE BAIXO");
            } else {
                System.out.println("Produto " + (i + 1) + ": ESTOQUE OK");
            }
        }
        System.out.println("A quatidade de itens sem     e: " + count);
    }
}
