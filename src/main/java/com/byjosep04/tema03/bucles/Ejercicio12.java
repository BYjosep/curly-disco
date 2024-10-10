package com.byjosep04.tema03.bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int intentos, numero, aleatorio;
        boolean ganador = false;
        Random random = new Random();
        aleatorio = random.nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cuantos intentos desea");
        intentos = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < intentos; i++) {//bucle para pedir el numero y comprobarlo
            System.out.println("Ingrese un numero");
            numero = Integer.parseInt(scanner.nextLine());
            if (numero == aleatorio) {//si es el numero correcto ganador pasa a ser  verdadero,
                ganador = true;      //rompe el bucle y pasa a la comprobacion
                break;              //de si ganador es verdadero o es falso
            } else if (numero > aleatorio) {//si el numero es mayor que aleatori indicara que el
                System.out.println("El numero es menor");//numero que se esta buscando es menor
            } else {                        //si el numero es menor que aleatori indicara que el
                System.out.println("El numero es mayor");//numero que se esta buscando es mayor
            }
        }
        if (ganador) {
            System.out.println("Enorabuena Has ganado");
        } else {
            System.out.println("Has perdido.\nEl numero era " + aleatorio);
        }

    }
}

