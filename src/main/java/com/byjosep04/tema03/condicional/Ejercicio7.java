package com.byjosep04.tema03.condicional;

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
         float cuotaBase;
         int edad;
         boolean socio;
         float menorConSocio,menorSinSocio,jubilado ;
         //calculo de valor de variables
         cuotaBase= 500;
         jubilado= cuotaBase-(cuotaBase*50/100);
         menorSinSocio= cuotaBase-(cuotaBase*25/100);
         menorConSocio= cuotaBase-(cuotaBase*35/100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(scanner.nextLine());
        if (edad <18 ){
            System.out.println("Los padres som socios?(true/false)");
            socio = Boolean.parseBoolean(scanner.nextLine());
            scanner.close();
            if (socio == true){
                System.out.println("Su cuota es "+ menorConSocio);
            }else {
                System.out.println("Su cuota es "+ menorSinSocio);
            }
        } else if (edad >=65) {
            System.out.println("Su cuota es "+ jubilado);
        }else {
            System.out.println("Su cuota es "+ cuotaBase);
        }

        }


    }

