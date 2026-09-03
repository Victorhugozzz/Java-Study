package com.victor.maratonajava.ex;

public class MaxValue {
    public static void main(String[] args) {
        int[] scores = { 68, 92, 74, 55, 88 };
        int highestScore = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
            }
        }

        System.out.println(highestScore);
    }
}
