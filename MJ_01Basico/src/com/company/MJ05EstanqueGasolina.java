package com.company;

import java.util.Scanner;

public class MJ05EstanqueGasolina {
    public static void main(String[] args) {
        //Variables
        final int cantidadMaximaEstanque = 70;

        String estanqueLleno = "Estanque lleno";
        String estanqueCasiLleno = "Estanque casi lleno";
        String estanqueTresCuartos = "Estanque 3/4";
        String estanqueMedio = "Medio estanque";
        String estanqueSuficiente = "Estanque suficiente";
        String estanqueInsuficiente = "Estanque insuficiente";

        Scanner scanner = new Scanner(System.in);

        //Procedimiento
        System.out.println("Ingrese los litros de gasolina actuales:");
        int cantidadActualGasolina = scanner.nextInt();

        if (cantidadActualGasolina == cantidadMaximaEstanque) {
            System.out.println(estanqueLleno);
        } else if(cantidadActualGasolina >= 60) {
            System.out.println(estanqueCasiLleno);
        } else if(cantidadActualGasolina >= 40) {
            System.out.println(estanqueTresCuartos);
        } else if(cantidadActualGasolina >= 35) {
            System.out.println(estanqueMedio);
        } else if(cantidadActualGasolina >= 20) {
            System.out.println(estanqueSuficiente);
        } else {
            System.out.println(estanqueInsuficiente);
        }
    }
}
