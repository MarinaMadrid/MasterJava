package com.company;

import java.util.Scanner;

public class MJ04MostrarNumerosOrdenados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        Float num1  = scanner.nextFloat();

        System.out.println("Ingrese otro número:");
        Float num2  = scanner.nextFloat();

        Float max = (num1 > num2)? num1 : num2;
        Float min = (num1 > num2)? num2 : num1;

        String resultado = "Los números ordenados de mayor a menor son: \n" + max + "\n" + min;
        System.out.println(resultado);

        //String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;
        //System.out.println("El orden es: " + resultado);
    }
}
