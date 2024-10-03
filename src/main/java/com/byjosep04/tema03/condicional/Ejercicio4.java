package com.byjosep04.tema03.condicional;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double primerNumero, segundoNumero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        primerNumero = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese el segundo numero");
        segundoNumero = Double.parseDouble(scanner.nextLine());

        scanner.close();

        if (primerNumero < segundoNumero) {
            System.out.println("El orden es "+ segundoNumero+", "+ primerNumero);
        }else if (primerNumero >= segundoNumero) {
            System.out.println("El orden es "+ primerNumero+", "+segundoNumero);
        }

    }
}
