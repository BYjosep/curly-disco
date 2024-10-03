package com.byjosep04.tema03.condicional;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    float numeroIntroduciodo;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Escriba un numero");
        numeroIntroduciodo = Float.parseFloat(scaner.nextLine());
        scaner.close();
        if (numeroIntroduciodo % 2 == 0) {
            System.out.println("El numero "+numeroIntroduciodo+" es par");
        }else {
            System.out.println("El numero "+numeroIntroduciodo+" es impar");
        }
    }
}
