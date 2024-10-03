package com.byjosep04.tema03.condicional;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float primerNumero, segundoNumero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique el primer numero");
        primerNumero = Float.parseFloat(scanner.nextLine());
        System.out.println("Indique el segundo numero");
        segundoNumero = Float.parseFloat(scanner.nextLine());
        scanner.close();
        if (primerNumero == segundoNumero){
            System.out.println("El primer numero es igual que el segundo");
        } else if (primerNumero<segundoNumero){
            System.out.println("El primer numero es menor que el segundo");
        }else if (primerNumero>segundoNumero){
            System.out.println("El primer numero es mayor que el segundo");
        }

    }

}
