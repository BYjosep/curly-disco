package com.byjosep04.tema03.bucles;

public class Ejercicio4 {
    public static void main(String[] args) {
        int i, impares;
        impares=0;
        for (i = 1; i <= 100; i++)
            if (i % 2 == 1) {
                System.out.println(i);
                impares++;
            }
        System.out.println("Hay "+impares+" impares");
    }
}
