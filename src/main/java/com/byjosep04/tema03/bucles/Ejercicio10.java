package com.byjosep04.tema03.bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        double numero, suma;
        suma = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero;");
            numero = Double.parseDouble(scanner.nextLine());
            suma += numero;
        } while (numero != 0);
        scanner.close();
        System.out.println(suma);
    }
}
