package com.byjosep04.tema03.bucles;

import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        int dado;
        final int INTENTOS = 1_000_000;
        int cara1 = 0;
        int cara2 = 0;
        int cara3 = 0;
        int cara4 = 0;
        int cara5 = 0;
        int cara6 = 0;
        double porcentaje1, porcentaje2, porcentaje3, porcentaje4, porcentaje5, porcentaje6;

        Random random = new Random();

        for (int i = 0; i < INTENTOS; i++) {
            dado = random.nextInt(1, 7);
            switch (dado) {
                case 1 -> cara1++;
                case 2 -> cara2++;
                case 3 -> cara3++;
                case 4 -> cara4++;
                case 5 -> cara5++;
                case 6 -> cara6++;
                default -> System.err.println("ERROR");
            }
        }
        porcentaje1 = (double) cara1 * 100 / INTENTOS;
        porcentaje2 = (double) cara2 / INTENTOS * 100;
        porcentaje3 = (double) cara3 / INTENTOS * 100;
        porcentaje4 = (double) cara4 / INTENTOS * 100;
        porcentaje5 = (double) cara5 / INTENTOS * 100;
        porcentaje6 = (double) cara6 / INTENTOS * 100;
        System.out.println("El porcentaje de la cara 1 ha sido de: " + porcentaje1);
        System.out.println("El porcentaje de la cara 2 ha sido de: " + porcentaje2);
        System.out.println("El porcentaje de la cara 3 ha sido de: " + porcentaje3);
        System.out.println("El porcentaje de la cara 4 ha sido de: " + porcentaje4);
        System.out.println("El porcentaje de la cara 5 ha sido de: " + porcentaje5);
        System.out.println("El porcentaje de la cara 6 ha sido de: " + porcentaje6);
    }
}
