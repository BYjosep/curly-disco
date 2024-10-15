package com.byjosep04.tema03.salida_con_formato;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int hora, minutos, segundos;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese la hora");
            hora = Integer.parseInt(scanner.nextLine());
        } while (hora > 24);
        do {
            System.out.println("Ingrese los minutos");
            minutos = Integer.parseInt(scanner.nextLine());
        } while (minutos > 60);

        do {
            System.out.println("Ingrese los segundos");
            segundos = Integer.parseInt(scanner.nextLine());
        } while (segundos > 60);

        System.out.printf("La hora es: %02d:%02d:%02d", hora, minutos, segundos);
    }
}
