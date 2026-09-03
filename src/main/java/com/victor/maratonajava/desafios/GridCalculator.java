package com.victor.maratonajava.desafios;

public class GridCalculator {
    public static void main(String[] args) {
        double[] grades = { 7.5, 4.0, 9.2, 5.5, 3.0, 8.8 };
        double average = calculateAverage(grades);
        for (int i = 0; i < grades.length; i++) {
            printStatusOfStudent((i + 1), grades[i]);
        }
        System.out.println("\nA media da turma e: " + String.format("%.2f", average));
    }

    static double calculateAverage(double[] grades) {
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    static String classify(double grade) {
        String classification = grade >= 6 ? "Aprovado" : "Reprovado";
        return classification;
    }

    static void printStatusOfStudent(int studentNumber, double grade) {
        String result = classify(grade);
        System.out.println("Aluno " + studentNumber + ": nota " + grade + " -- " + result);
    }
}
