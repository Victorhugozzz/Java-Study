package com.victor.maratonajava.aulas;

public class Aula008_Estruturas_Condicionais04 {
    public static void main(String[] args) {
        int days = 9;
        switch (days) {
            case 1, 7 -> System.out.println("Final de semana");
            case 2, 3, 4, 5, 6 -> System.out.println("Dias uteis");
            default -> System.out.println("Dia invalido");
        }
    }
}