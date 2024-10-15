package com.byjosep04.tema03.salida_con_formato;

public class Ejercici7 {
    public static void main(String[] args) {
        String cadena = "";
        String cadena2="";
        int numeros = 1;
        final int ESCALERA = 10;
        for (int i = numeros; i < ESCALERA; i++) {
            cadena = cadena + i;
            cadena2= i+cadena2;
            System.out.printf("%9s%s\n", cadena,cadena2);

        }
    }
}
