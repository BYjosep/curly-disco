package com.byjosep04.tema03;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        float lado1, lado2, lado3;
        //Introduccion de variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado 1");
        lado1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Ingrese el lado 2");
        lado2 = Float.parseFloat(scanner.nextLine());
        System.out.println("Ingrese el lado 3");
        lado3 = Float.parseFloat(scanner.nextLine());
        scanner.close();
        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Triángulo equilátero");
        }else if(){
            
        }

    }
}
