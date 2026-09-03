package com.victor.maratonajava.ex;

public class Countforeach {
    public static void main(String[] args) {
        int[] ages = { 17, 22, 15, 30, 19, 16, 45 };
        int maxages = 0;
        for (int i : ages) {
            if (i >= 18) {
                maxages++;
            }
        }
        System.out.println(maxages);
    }
}
