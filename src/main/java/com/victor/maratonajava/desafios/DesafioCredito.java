package com.victor.maratonajava.desafios;

public class DesafioCredito {
    public static void main(String[] args) {
        int idade = 16;
        int score = 750;
        double rendaMensal = 5000;
        double valorSolicitado = 10000;

        if (idade < 18) {
            System.out.println("Reprovado: menor de idade");
        } else if (score < 500) {
            System.out.println("Reprovado: score baixo");
        } else if (rendaMensal < valorSolicitado * 0.3) {
            System.out.println("Reprovado: renda insuficiente");
        } else if (score < 700) {
            System.out.println("Aprovado: juros mais altos");
        } else {
            System.out.println("Aprovado: taxa preferencial");
        }
    }
}