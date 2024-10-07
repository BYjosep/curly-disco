package com.byjosep04.tema03.bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numero, total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        numero = Integer.parseInt(scanner.nextLine());
        scanner.close();
        total = 1;
        System.out.print(numero + "! = " + numero);
        for (int i = numero; i > 1; i--) {
            total *= numero;
            numero--;
            System.out.print(" * " + numero);

        }
        System.out.print(" = " + total);
    }
}
