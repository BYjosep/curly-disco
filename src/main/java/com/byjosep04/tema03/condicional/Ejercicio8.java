package com.byjosep04.tema03.condicional;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int dado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de la cara");
        dado = Integer.parseInt(scanner.nextLine());
        switch (dado) {
            case 1 -> System.out.println(6);
            case 2 -> System.out.println(5);
            case 3 -> System.out.println(4);
            case 4 -> System.out.println(3);
            case 5 -> System.out.println(2);
            case 6 -> System.out.println(1);
            default -> {
                System.err.println("ERROR: número incorrecto");
                System.exit(-1);
            }
        }
    }
}
