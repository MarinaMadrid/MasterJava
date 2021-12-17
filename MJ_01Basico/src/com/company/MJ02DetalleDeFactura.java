package com.company;

import java.util.Scanner;

public class MJ02DetalleDeFactura {
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

        //Cálculo del total bruto
        double totalBruto = primerPrecio + segundoPrecio;

        //Cálculo total con impuesto
        final double tasaImpuesto = 0.19;
        double calculoImpuesto = totalBruto*tasaImpuesto;
        double totalNeto = totalBruto + calculoImpuesto;

        //Resultado
        String resultado = "La factura " + nombreFactura
                + " tiene un total bruto de " + totalBruto
                + ", con un impuesto de " + calculoImpuesto
                + " y el monto después de impuesto es de " + totalNeto;
        System.out.println(resultado);
    }
}
