package com.victor.maratonajava.ex;

public class NestedLoop {
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int seat = 1; seat <= 5; seat++) {
                System.out.println("Fileira: " + row + ", Assento: " + seat);
            }
        }
    }
}
