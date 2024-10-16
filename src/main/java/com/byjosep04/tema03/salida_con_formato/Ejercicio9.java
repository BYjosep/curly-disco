package com.byjosep04.tema03.salida_con_formato;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //constantes de escape ANNSi
        final String ESC = "\u001B[";
        final String RESET = ESC + "0m";
        //Variables necesarias para el uso de este programa
        String ciudad;//para el nombre de la ciudad
        int dia, mes, ano;//Fecha
        int hora, minutos, segundos;//Hora
        float velocidad, temperatura, presionAtmosferica;//medidas que necesitan float
        int lluvia, radiacionUV;//medidas que son enteros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la ciudad");
        ciudad = scanner.nextLine();//ingresar la ciudad
        //ingresa la fecha
        do {
            System.out.println("Ingrese el dia");
            dia = Integer.parseInt(scanner.nextLine());
        } while (dia > 30);
        do {
            System.out.println("Ingrese el mes");
            mes = Integer.parseInt(scanner.nextLine());
        } while (mes > 12);
        do {
            System.out.println("Ingrese el año");
            ano = Integer.parseInt(scanner.nextLine());
        } while (ano > 2024);
        //ingresa la hora de medicion
        do {
            System.out.println("Ingrese el hora");
            hora = Integer.parseInt(scanner.nextLine());
        } while (hora > 30);
        do {
            System.out.println("Ingrese el los minutos");
            minutos = Integer.parseInt(scanner.nextLine());
        } while (minutos > 12);
        do {
            System.out.println("Ingrese los segundos");
            segundos = Integer.parseInt(scanner.nextLine());
        } while (segundos > 60);
        //Ingresar los datos medidios
        do {
            System.out.println("Ingrese la velocidad del viento(En Km/h)");
            velocidad = Float.parseFloat(scanner.nextLine());
        } while (velocidad < 0);
        System.out.println("Ingrese la temperatura(En grados centigrados)");
        temperatura = Float.parseFloat(scanner.nextLine());
        do {
            System.out.println("Ingrese la presion atmosferica (En hPa)");
            presionAtmosferica = Integer.parseInt(scanner.nextLine());
        } while (presionAtmosferica < 0);
        do {
            System.out.println("Ingrse la probabilidad de lluvia(como porcentaje del 1-100)");
            lluvia = Integer.parseInt(scanner.nextLine());
        } while (lluvia < 0);
        do {
            System.out.println("Ingrse la fadiacion UVI");
            radiacionUV = Integer.parseInt(scanner.nextLine());
        } while (radiacionUV < 0);
        scanner.close();
        //resultado
        System.out.printf(ESC + ";37;44m**DATOS ESTACIÓN METEOROLÓGICA **" + RESET + "\n");
        System.out.printf("%-24s %s\n", "Ciudad:", ciudad);
        System.out.printf("%-24s %02d/%02d/%02d\n", "Fecha", dia, mes, ano);
        System.out.printf("%-24s %02d/%02d/%02d\n", "Hora de la muestra", hora, minutos, segundos);

        //viento
        if (velocidad <= 29) {
            System.out.printf("%-24s " + ESC + "32m%.0f" + RESET + " Km/h\n" + RESET, "Velocidad viento", velocidad);
        } else if (velocidad <= 60) {
            System.out.printf("%-24s " + ESC + "33m%.0f" + RESET + " Km/h\n" + RESET, "Velocidad viento", velocidad);
        } else if (velocidad > 60) {
            System.out.printf("%-24s " + ESC + "31m%.0f" + RESET + " Km/h\n" + RESET, "Velocidad viento", velocidad);
        }
        //temperatura
        if (temperatura < 23) {
            System.out.printf("%-24s " + ESC + "34m%.02f" + RESET + " ºC\n", "Temperatura", temperatura);
        } else if (temperatura < 28) {
            System.out.printf("%-24s " + ESC + "32m%.02f" + RESET + " ºC\n", "Temperatura", temperatura);
        } else if (temperatura < 36) {
            System.out.printf("%-24s " + ESC + "33m%.02f" + RESET + " ºC\n", "Temperatura", temperatura);
        } else {
            System.out.printf("%-24s " + ESC + "31m%.02f" + RESET + " ºC\n", "Temperatura", temperatura);
        }
        //Preison atmosferica
        System.out.printf("%-24s %.1f hPa\n", "Presion atmosferica", presionAtmosferica);
        //lluvia
        if (lluvia >= 71) {
            System.out.printf("%-24s " + ESC + "31m%d" + RESET + " %s\n", "Probabilidad lluvia", lluvia, "%");
        } else if (/*lluvia <= 70&&*/ lluvia >= 35) {
            System.out.printf("%-24s " + ESC + "33m%d" + RESET + " %s\n", "Probabilidad lluvia", lluvia, "%");
        } else {
            System.out.printf("%-24s " + ESC + "32m%d" + RESET + " %s\n", "Probabilidad lluvia", lluvia, "%");
        }
        //uvi
        if (presionAtmosferica > 10) {
            System.out.printf("%-24s " + ESC + "35m%.0f" + RESET + " \n", "Presion atmosferica;", presionAtmosferica);
        } else if (presionAtmosferica >= 8) {
            System.out.printf("%-24s " + ESC + "31m%.0f" + RESET + " \n", "Presion atmosferica;", presionAtmosferica);
        } else if (presionAtmosferica >= 6) {
            System.out.printf("%-24s " + ESC + "33m%.0f" + RESET + " \n", "Presion atmosferica;", presionAtmosferica);
        } else if (presionAtmosferica >= 3) {
            System.out.printf("%-24s " + ESC + "34m%.0f" + RESET + " \n", "Presion atmosferica;", presionAtmosferica);
        } else if (presionAtmosferica <= 2) {
            System.out.printf("%-24s " + ESC + "32m%.0f" + RESET + " \n", "Presion atmosferica;", presionAtmosferica);
        }
    }
}

