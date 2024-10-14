package com.byjosep04.tema03.salida_con_formato;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeros = 1;
        final int ESCALERA = 10;
        for (int i = numeros; i < ESCALERA; i++) {
            for (int recorido = numeros; recorido <= i; recorido++) {
                System.out.printf("%d", recorido);
            }
            System.out.println();
        }
    }
}
