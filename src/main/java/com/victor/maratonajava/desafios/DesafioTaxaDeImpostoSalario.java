package com.victor.maratonajava.desafios;

public class DesafioTaxaDeImpostoSalario {
    public static void main(String[] args) {
        double salarioBruto = 70_000.0;
        double aliquota;

        if (salarioBruto < 0) {
            System.out.println("Salário inválido: informe um valor maior ou igual a zero.");
            return;
        }

        if (salarioBruto <= 34_712.0) {
            aliquota = 0.097;
        } else if (salarioBruto <= 68_507.0) {
            aliquota = 0.3735;
        } else {
            aliquota = 0.495;
        }

        double imposto = salarioBruto * aliquota;
        double salarioLiquido = salarioBruto - imposto;

        System.out.printf(
                "Alíquota: %.2f%%%nImposto: %.2f euros%nSalário líquido: %.2f euros%n",
                aliquota * 100,
                imposto,
                salarioLiquido);
    }
}
