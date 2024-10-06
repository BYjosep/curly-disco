package com.byjosep04.tema03.bucles;

public class Ejercicio5 {
    public static void main(String[] args) {
        int i;
        int countPar = 0, sumaPar = 0, countImpar = 0, sumaImpar = 0, count5 = 0, suma5 = 0;

        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " Par");
                countPar++;
                sumaPar = sumaPar + i;
            } else {
                System.out.print(i + " Impar");
                countImpar++;
                sumaImpar = sumaImpar + i;
            }
            if (i % 5 == 0) {
                System.out.println(" Multipo de 5");
                count5++;
                suma5 = suma5 + i;
            } else {
                System.out.println();
            }

        }
        System.out.println("Hay " + countPar + " La suma es " + sumaPar);
        System.out.println("Hay " + countImpar + " La suma es " + sumaImpar);
        System.out.println("Hay " + count5 + " La suma es " + suma5);
    }
}
