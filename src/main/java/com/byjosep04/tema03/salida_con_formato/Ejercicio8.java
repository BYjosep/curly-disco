package com.byjosep04.tema03.salida_con_formato;

public class Ejercicio8 {
    public static void main(String[] args) {
        int colorTexto, colorFondo, negrita;
        String cadena;
        final String ESC = "\u001B[";
        for (int i = 0; i <= 1; i++) {
            negrita = i;

            for (int j = 30; j <= 37; j++) {
                colorTexto = j;

                for (int k = 40; k <= 47; k++) {
                    colorFondo = k;

                    cadena = " " + negrita + ";" + colorTexto + ";" + colorFondo + " ";

                    System.out.print(ESC + negrita + "m"+ ESC + colorTexto + "m"+ESC + colorFondo + "m");
                    System.out.print(cadena);
                    System.out.print(ESC + "0m");
                }
                System.out.println();
            }
        }
        System.out.print(ESC + "0m");

    }
}
