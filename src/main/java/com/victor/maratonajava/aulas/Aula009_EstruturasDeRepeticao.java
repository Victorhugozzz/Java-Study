package com.victor.maratonajava.aulas;

public class Aula009_EstruturasDeRepeticao {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        
        // while (count <= 10) {
        //     System.out.println(count);
        //     count ++;
        // }

        do{
            System.out.println(count ++);
        }while (count <= 10);
    }
}
