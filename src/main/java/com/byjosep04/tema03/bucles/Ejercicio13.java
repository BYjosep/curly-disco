package com.byjosep04.tema03.bucles;

import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        boolean moneda;
        int cara = 0;
        int cruz = 0;
        double porcentajeCara, porcentajeCruz;
        final double PORCENTAJE = (double) 100 / 1000000;

        Random random = new Random();

        for (int i = 0; i < 1_000_000; i++) {
            moneda = random.nextBoolean();
            if (moneda) {
                cara++;
            } else {
                cruz++;
            }
        }
        porcentajeCara = (double) cara * PORCENTAJE;
        porcentajeCruz = (double) cruz * PORCENTAJE;
        System.out.println("El porcentaje de veces que ha salido cara es:" + porcentajeCara);
        System.out.println("El porcentaje de veces que ha salido cruz es:" + porcentajeCruz);
    }
}
