package com.byjosep04.tema03.salida_con_formato;

public class Ejercicio4 {
    public static void main(String[] args) {
        String cadena="";
        int numeros = 1;
        final int ESCALERA = 10;
        for (int i = numeros; i < ESCALERA; i++) {
            cadena=cadena + i;
            System.out.printf("%-9s\n",cadena);
        }
    }
}
