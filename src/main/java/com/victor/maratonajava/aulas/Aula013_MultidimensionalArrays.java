package com.victor.maratonajava.aulas;

public class Aula013_MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] stockByWarehouse = { { 10, 5 }, { 0, 8 }, { 20, 3 } };

        for (int product = 0; product < stockByWarehouse.length; product++) {
            int totalProduct = 0;
            for (int warehouse = 0; warehouse < stockByWarehouse[product].length; warehouse++) {
                totalProduct += stockByWarehouse[product][warehouse];
                System.out.println("Produtos " + (product + 1) + " - Armazem " + (warehouse + 1) + ": "
                        + stockByWarehouse[product][warehouse]);
            }
            System.out.println("Total de produtos " + (product + 1) + ": " + totalProduct);
        }
    }
}