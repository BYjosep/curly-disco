package com.byjosep04.tema03.bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        double numero, suma,media;
        int i;
        i = 0;
        suma = 0;
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero");
            numero= Double.parseDouble(scanner.nextLine());
            if(numero>= 0){
                suma= suma +numero;
                ++i;
            }
        }while (numero >0);
        media = suma / i;
        System.out.println("La media de los numeros introducidos es: " + media);
    }
}
