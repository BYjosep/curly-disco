package com.byjosep04.tema03;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int  nota;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota en formato numerico");
        nota = Integer.parseInt(scanner.nextLine());
        scanner.close();
        switch (nota) {
            case 0: case 1: case 2: case 3: case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7: case 8:
                System.out.println("NOTABLE");
                break;

            case 9: case 10:
                System.out.println("EXELENTE");
                break;
            default:
                System.out.println("ERROR");
                break;
        }

    }
}
