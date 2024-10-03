package com.byjosep04.tema03.condicional;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int anyo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el año");
        anyo = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if (anyo % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            if (anyo % 4 == 0 && anyo % 100 != 0) {
                System.out.println("El año es bisiesto");

            } else {
                System.out.println("El año no es bisiesto");
            }
        }
    }
}
