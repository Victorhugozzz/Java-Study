package com.victor.maratonajava.desafios;

public class LoanEligibility {
    public static void main(String[] args) {
        int[] ages = { 17, 25, 40, 16, 35 };
        double[] incomes = { 0, 1800, 5200, 0, 2500 };

        for (int i = 0; i < ages.length; i++) {
            printStatus((i + 1), ages[i], incomes[i]);
        }
    }

    static boolean isEligible(int age, double income) {
        return age >= 18 && income >= 2000;
    }

    static void printStatus(int clientNumber, int age, double income) {
        boolean eligible = isEligible(age, income);
        String result = eligible ? "Elegível" : "Não elegível";
        System.out.println("Cliente " + clientNumber + ": idade " + age + ", renda R$ " + income + " -- " + result);
    }

}
