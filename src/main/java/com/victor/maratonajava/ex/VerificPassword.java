package com.victor.maratonajava.ex;

import java.util.Scanner;

public class VerificPassword {
    private static final String SENHA_CORRETA = "1234";
    private static final int MAXIMO_TENTATIVAS = 3;

    public static void main(String[] args) {
        boolean loginSuccessful = false;

        try (Scanner scanner = new Scanner(System.in)) {
            for (int tentativa = 1; tentativa <= MAXIMO_TENTATIVAS; tentativa++) {
                System.out.printf(
                        "Digite a senha (tentativa %d de %d): ",
                        tentativa,
                        MAXIMO_TENTATIVAS
                );
                if (!scanner.hasNextLine()) {
                    break;
                }

                String senhaInformada = scanner.nextLine();
                if (SENHA_CORRETA.equals(senhaInformada)) {
                    loginSuccessful = true;
                    System.out.println("Acesso liberado");
                    break;
                }

                System.out.println("Senha incorreta, tente novamente.");
            }
        }

        if (!loginSuccessful){
            System.out.println("Conta bloqueada.");
        }
    }
}
