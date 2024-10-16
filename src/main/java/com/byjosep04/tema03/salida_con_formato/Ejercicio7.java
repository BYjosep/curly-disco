package com.byjosep04.tema03.salida_con_formato;

public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena = "";
        //String cadena2="";
        //int recorido=8;
        //int numeros = 1;


        //Version 1
        /*for (int i = numeros; i < ESCALERA; i++) {
            cadena = cadena + i;
            cadena2= i+cadena2;
            System.out.printf("%9s%s\n", cadena,cadena2);
            for (int j = 0; j < 1; j++) {

            }
        }*/

        for (int i = 1; i < 10; i++) {
            cadena = cadena + i;
            System.out.printf("%9s", cadena);
            for (int j = i-1; j >=0; j--) {
                System.out.print(cadena.charAt(j));
            }
            System.out.println();
        }


    }
}
