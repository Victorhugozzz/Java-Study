package com.victor.maratonajava.ex;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int number = 1; number <= 15; number++) {
            if (number % 3 == 0)
                continue;
            System.out.println(number);
        }
    }
}
