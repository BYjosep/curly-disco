package com.byjosep04.tema03.bucles;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero1, numero2, producto;
        int signo1, signo2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el segundo numero");
        numero2 = Integer.parseInt(scanner.next());
        scanner.close();
        producto = 0;
        /*while (numero2 != 0) {
            if (numero2 < 0) {
                ++numero2;
                producto = producto + numero1;
                if (numero2 == 0) {
                    producto = -1 * producto;
                }

            } else if (numero2 > 0) {
                --numero2;
                producto = producto + numero1;
            }*/
        //En algun punto del codigo falla
        signo1 = numero1 < 0 ? -1 : 1;
        signo2 = numero2 < 0 ? -1 : 1;
        for (int i = 1; i <= numero1; i++) {
            producto = producto + numero2;
        }
        producto = producto * signo1 * signo2;

        //}
        System.out.println(producto);
    }
}
