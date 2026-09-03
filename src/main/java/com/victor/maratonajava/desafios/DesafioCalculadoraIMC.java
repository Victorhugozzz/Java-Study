package com.victor.maratonajava.desafios;

/**
 * Calcula o Índice de Massa Corporal (IMC) a partir do peso e da altura.
 */
public class DesafioCalculadoraIMC {
    public static void main(String[] args) {
        double pesoEmQuilos = 70.0;
        double alturaEmMetros = 1.75;
        double imc = calcularImc(pesoEmQuilos, alturaEmMetros);

        System.out.printf("IMC: %.2f (%s)%n", imc, classificarImc(imc));
    }

    static double calcularImc(double pesoEmQuilos, double alturaEmMetros) {
        if (pesoEmQuilos <= 0 || alturaEmMetros <= 0) {
            throw new IllegalArgumentException(
                    "Peso e altura devem ser maiores que zero.");
        }

        return pesoEmQuilos / (alturaEmMetros * alturaEmMetros);
    }

    static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        }
        if (imc < 25.0) {
            return "Peso normal";
        }
        if (imc < 30.0) {
            return "Sobrepeso";
        }
        return "Obesidade";
    }
}
