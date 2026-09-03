package com.victor.maratonajava.ex;

public class PaymentFeeCalculator {
    public static void main(String[] args) {
        double purchaseAmount = 500;
        String paymentMethod = "BOLETO";
        double totalAmount;

        switch (paymentMethod) {
            case "CREDIT_CARD", "DEBIT_CARD":
                totalAmount = purchaseAmount * 0.02;
                totalAmount += purchaseAmount;
                System.out.println("Valor do produto: R$ " + purchaseAmount + "\nMetodo de pagamento: " + paymentMethod
                        + "\nTaxa: 2%\nValor total: R$ " + totalAmount);
                break;
            case "PIX":
                System.out.println("Valor do produto: R$ " + purchaseAmount + "\nMetodo de pagamento: " + paymentMethod
                        + "\nTaxa: 0%\nValor total: R$ " + purchaseAmount);
                break;
            case "BOLETO":
                totalAmount = 2 + purchaseAmount;
                System.out.println("Valor do produto: R$ " + purchaseAmount + "\nMetodo de pagamento: " + paymentMethod
                        + "\nTaxa: R$ 2,00  " + "\nValor total: R$ " + totalAmount);
                break;
            default:
                System.out.println("Invalid payment method");
                break;
        }

    }
}
