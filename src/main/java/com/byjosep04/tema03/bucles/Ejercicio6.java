package com.byjosep04.tema03.bucles;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numeroEntrada, validate, multiplicacion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero del 1-10");
        do {
            numeroEntrada = Integer.parseInt(scanner.nextLine());
            if (numeroEntrada > 10 || numeroEntrada < 1) {
                validate = 0;
                System.out.println("Solo numeros del 1 al 10");
            } else {
                validate = 1;
            }
        } while (validate == 0);
        scanner.close();
        for (int i = 0; i <= 10; i++) {
            multiplicacion = i * numeroEntrada;
            System.out.println(numeroEntrada + "X" + i + " es: " + multiplicacion);
        }


    }
}
