package com.byjosep04.tema03.salida_con_formato;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        float numero1, numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el primer numero");
        numero1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Escriba el segundo numero");
        numero2 = Float.parseFloat(scanner.nextLine());
        scanner.close();
        System.out.printf("El primer numero es: %.2f %nEl segundo numero es: %.2f", numero1, numero2);

    }
}
