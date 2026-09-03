package com.victor.maratonajava.aulas;

public class Aula002_TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long e boolean
        int idade = 10;
        long numeroGrande = 100_000L;
        double salarioDouble = 2_000.0;
        float salarioFloat = 2_500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        String nome = "Goku";

        System.out.println("A idade é: " + idade + " anos");
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println("Oi, meu nome é " + nome + ". Muito prazer!");
    }
}
