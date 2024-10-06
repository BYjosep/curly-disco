package com.byjosep04.tema03.bucles;

public class Ejercicio2 {
    public static void main(String[] args) {
        int total, i;
        total = 0;
        for (i = 1000; i >= 1; i--) {
            total = total + i;
        }
        System.out.println("La suma total del 1 al 1000" + total);
    }
}
