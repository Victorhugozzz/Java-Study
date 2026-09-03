package com.victor.maratonajava.aulas;

/*
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a mensagem:
 *
 * Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de
 * <salário>, na data <data>.
 */
public class Aula003_TiposPrimitivosEx {
    public static void main(String[] args) {
        String nome = "Victor";
        String endereco = "Av. João das Galileias";
        double salario = 2_000.0;
        String dataRecebimento = "05/09/2025";

        System.out.println(
                "Eu " + nome
                        + ", morando no endereço " + endereco
                        + ", confirmo que recebi o salário de R$ " + salario
                        + ", na data " + dataRecebimento + ".");
    }
}
