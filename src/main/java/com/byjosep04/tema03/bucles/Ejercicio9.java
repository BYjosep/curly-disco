package com.byjosep04.tema03.bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int numero;
        int primario = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique el numero");
        numero = Integer.parseInt(scanner.nextLine());
        scanner.close();
        for (int i = numero; i > 0; i--) {
            if (numero % i == 0 || 1 % i == 0) {
                if (i != numero && 1 % i != 0) {
                    primario = 1;
                    System.out.println("El numero no es primo");
                    break;
                }

            }
        }
        if (primario == 0) {
            System.out.println("El numero es primario");
        }


    }
}
