package com.byjosep04.tema03;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int edad;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        edad = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
