package com.byjosep04.tema03.bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        double numero, suma,media;
        Scanner scanner =new Scanner(System.in);
        suma =0;
        do {
            System.out.println("Ingrese un numero");
            numero= Double.parseDouble(scanner.nextLine());
            suma= suma +numero;
        }while (numero >0);

    }
}
