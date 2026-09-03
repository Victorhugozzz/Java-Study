package com.victor.maratonajava.desafios;

public class OrderStatusTracker {
    public static void main(String[] args) {
        String statusOrder = "CANCELLED";
        String status = "";
        switch (statusOrder) {
            case "PENDING":
                status = "Pedido ainda aguardando confirmação de pagamento";
                break;
            case "PAID":
                status = "Pagamento confirmado, pedido sendo preparado para envio";
                break;
            case "SHIPPED":
                status = "Pedido já está a caminho";
                break;
            case "DELIVERED":
                status = "Pedido já chegou ao destino, processo encerrado";
                break;
            case "CANCELLED": 
                status = "Pedido foi cancelado";
                break;
            default:
                status = "Opção inválida"; 
                break;
        }
        System.out.println(status);
    }
}
