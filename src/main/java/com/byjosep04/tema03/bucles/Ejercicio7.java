package com.byjosep04.tema03.bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int a, b;
        int positivoB;
        double total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el exponente");
        b = Integer.parseInt(scanner.nextLine());
        scanner.close();
        positivoB = b > 0 ? 1 : -1;
        b *= positivoB;
        if (a == 0) {
            total = 0;
        } else if (b == 0) {
            total = 1;
        } else {
            total = 1;
            if (positivoB > 0) {
                for (int i = b; i >= 1; i--) {
                    total = total * a;

                }
            } else {
                for (int i = b; i >= 1; i--) {
                    total = total / a;
                }
            }
        }
        System.out.println("El resultado es: " + total);

    }
}
