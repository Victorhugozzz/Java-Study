package com.victor.maratonajava.aulas;

public class Aula011_BreakContinueNestedLoops {
    public static void main(String[] args) {
        continueBreakDemonstracion();
        nestedLoopsDemonstracion();
    }

    private static void continueBreakDemonstracion() {
        for (int orderId = 1; orderId <= 10; orderId++) {
            if (orderId % 3 == 0)
                continue;
            if (orderId == 9)
                break;
            System.out.println("Processando pedido " + orderId);
        }
    }

    private static void nestedLoopsDemonstracion() {
        for (int row = 1; row <= 3; row++) {
            for (int seat = 1; seat <= 4; seat++) {
                System.out.println("Fileira " + row + ", Assento " + seat);
            }
        }
    }
}
