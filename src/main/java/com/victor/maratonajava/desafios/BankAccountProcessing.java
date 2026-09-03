package com.victor.maratonajava.desafios;

public class BankAccountProcessing {
    public static void main(String[] args) {
        int totalAccounts = 5;
        double maintenanceFee = 15;
        int activeCount = 0;
        int blockedCount = 0;

        for (int i = 1; i <= totalAccounts; i++) {
            String status;

            double balance = (1000 + (i * 150)) - maintenanceFee;
            if (balance <= 0) {
                status = "Conta Bloqueada";
                blockedCount++;
            } else {
                status = "Conta Ativa";
                activeCount++;
            }
            System.out.println("Saldo da conta " + i + ": R$ " + balance + " [" + status + "] ");
        }
        System.out.println("\nContas Ativas: " + activeCount + "\nContas Bloqueadas: " + blockedCount);
    }
}
