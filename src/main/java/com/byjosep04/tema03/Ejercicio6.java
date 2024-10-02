package com.byjosep04.tema03;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double dineroDecimal;
        int dinero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte el dinero");
        dineroDecimal = Double.parseDouble(scanner.nextLine());
        dineroDecimal=dineroDecimal * 100;
        dinero = (int) dineroDecimal;

        if (dinero >= 200) {
            System.out.println("Necesitas monedas de 2 euros: " + dinero / 200);
            dinero %= 200;
        }
        if (dinero >= 100) {
            System.out.println("Necesitas monedas de 1 euro: " + dinero / 100);
            dinero %= 100;
        }
        if (dinero >= 50) {
            System.out.println("Necesitas monedas de 50 centimos: " + dinero / 50);
            dinero %= 50;
        }
        if (dinero >= 20) {
            System.out.println("Necesitas monedas de 20 centimos: " + dinero / 20);
            dinero %= 20;
        }
        if (dinero >= 10) {
            System.out.println("Necesitas monedas de 10 centimos: "+ (dinero / 10));
            dinero %= 10;
        }
        if (dinero >= 5) {
            System.out.println("Necesitas monedas de 5 centimos: " + dinero / 5);
            dinero %= 5;
        }
        if (dinero >= 2) {
            System.out.println("Necesitas monedas de 2 centimos: " + dinero / 2);
            dinero %= 2;
        }
        if (dinero >= 1) {
            System.out.println("Necesitas monedas de 1 centimo: " + dinero);
            dinero = 0;
        }

        scanner.close();

    }
}
