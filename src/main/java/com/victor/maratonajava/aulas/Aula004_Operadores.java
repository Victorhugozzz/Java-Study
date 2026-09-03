package com.victor.maratonajava.aulas;

public class Aula004_Operadores {
    public static void main(String[] args) {
        demonstrarOperadoresAritmeticos();
        demonstrarOperadoresRelacionais();
        demonstrarOperadoresLogicos();
        demonstrarOperadoresAtribuicao();
    }

    private static void demonstrarOperadoresAritmeticos() {
        int numero1 = 10;
        int numero2 = 20;

        System.out.println("Operadores aritméticos (+ - / *):");
        System.out.println("Soma: " + (numero2 + numero1));
        System.out.println("Subtração: " + (numero2 - numero1));
        System.out.println("Multiplicação: " + (numero2 * numero1));
        System.out.println("Divisão: " + (numero2 / numero1));
        System.out.println("Resto da divisão: " + (numero2 % numero1));
    }

    private static void demonstrarOperadoresRelacionais() {
        int numero1 = 10;
        int numero2 = 20;

        System.out.println("\nOperadores relacionais (> < >= <= == !=):");
        System.out.println("numero1 é maior que numero2: " + (numero1 > numero2));
        System.out.println("numero1 é menor que numero2: " + (numero1 < numero2));
        System.out.println("numero1 é maior ou igual a numero2: " + (numero1 >= numero2));
        System.out.println("numero1 é menor ou igual a numero2: " + (numero1 <= numero2));
        System.out.println("numero1 é igual a numero2: " + (numero1 == numero2));
        System.out.println("numero1 é diferente de numero2: " + (numero1 != numero2));
    }

    private static void demonstrarOperadoresLogicos() {
        int idade = 25;
        double salario = 3_500.0;

        boolean atendePrimeiraCondicao = idade >= 30 && salario >= 4_612.0;
        boolean atendeSegundaCondicao = idade < 30 && salario >= 3_381.0;

        System.out.println("\nOperadores lógicos (&&, || e !):");
        System.out.println("Tem pelo menos 30 anos e salário de pelo menos R$ 4.612: " + atendePrimeiraCondicao);
        System.out.println("Tem menos de 30 anos e salário de pelo menos R$ 3.381: " + atendeSegundaCondicao);
        System.out.println("Não atende à primeira condição: " + !atendePrimeiraCondicao);

        double saldoContaCorrente = 200.0;
        double saldoContaPoupanca = 10_000.0;
        double valorPlayStation = 5_000.0;
        boolean podeComprarPlayStation = saldoContaCorrente >= valorPlayStation || saldoContaPoupanca >= valorPlayStation;
        System.out.println("Pode comprar um PlayStation 5: " + podeComprarPlayStation);
    }

    private static void demonstrarOperadoresAtribuicao() {
        float bonus = 1_800.0F;
        bonus += 1_000.0F;
        bonus -= 1_000.0F;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println("\nOperadores de atribuição (=, +=, -=, *=, /=, %=, ++ e --):");
        System.out.println("Bônus: " + bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;

        System.out.println("Contador: " + contador);
    }
}
