package com.victor.maratonajava.ex;

public class SimpleMethodWithReturn {
    public static void main(String[] args) {
        boolean isAdult1 = isAdult(15);
        boolean isAdult2 = isAdult(18);

        printReceipt(isAdult1);
        printReceipt(isAdult2);
    }

    static boolean isAdult(int age) {
        return age >= 18;
    }

    static void printReceipt(boolean isAdult) {
        if (isAdult) {
            System.out.println("Adulto");
        } else {
            System.out.println("Não adulto");
        }
    }
}
