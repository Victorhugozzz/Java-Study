package com.victor.maratonajava.ex;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7;

        for (int i = 1; i <= 10; i++) {
            int product = i * number;
            System.out.println(i + " X " + number + " = " + product);
        }
    }
}
