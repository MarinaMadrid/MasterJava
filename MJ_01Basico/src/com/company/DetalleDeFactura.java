package com.company;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //Nombre de la factura
        System.out.println("Introduzca un nombre para la factura: ");
        String nombreFactura = teclado.nextLine();

        //Primer precio
        System.out.println("Introduzca un precio: ");
        double primerPrecio = teclado.nextDouble();

        //Segundo precio
        System.out.println("Introduzca otro precio: ");
        double segundoPrecio = teclado.nextDouble();

        //Cálculo total
        double suma = primerPrecio + segundoPrecio;

        //Cálculo total con impuesto
        final double impuesto = 0.19;
        double calculoImpuesto = suma*impuesto;
        double sumaImpuesto = suma + calculoImpuesto;

        //Resultado
        String resultado = "La factura " + nombreFactura
                + " tiene un total bruto de " + suma
                + ", con un impuesto de " + calculoImpuesto
                + " y el monto después de impuesto es de " + sumaImpuesto;
        System.out.println(resultado);
    }
}
