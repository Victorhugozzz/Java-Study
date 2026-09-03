package com.victor.maratonajava.desafios;

public class DesafioMenuBanco {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int option = 5;
        String name = "[nome da pessoa]";
        double bankBalance = 235022;
        boolean condition = true;
        do {
            System.out.println("Seja Bem-vido ao Banco do Sicredi(escolha uma das opcoes abaixo)");
            System.out.println("1. Consutar saldo");
            System.out.println("2. Sacar");
            System.out.println("3. Sair");

            if (option == 1) {
                System.out.println("\nOla " + name + " o saldo da sua conta e de R$ " + bankBalance);
            } else if (option == 2) {
                System.out.println("\nOla " + name + " o saldo da sua conta e de R$ " + bankBalance
                        + " quanto voce deseja sacar ?");
                double withdraw = 2000;
                bankBalance -= withdraw;
                System.out.println("\nSeu saldo apos sacar R$ " + withdraw + " ficou em R$ " + bankBalance);
            } else if (option == 3) {
                System.out.println("Saindo do sistema ... ");
                break;
            } else {
                System.out.println("Opcao invalida");
                condition = false;
                break;
            }
        } while (!condition);
    }
}
