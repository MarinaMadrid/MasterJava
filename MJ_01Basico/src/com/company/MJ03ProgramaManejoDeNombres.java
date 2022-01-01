package com.company;

import java.util.Scanner;

public class MJ03ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre de un familiar:");
        String nombre1 = scanner.nextLine();
        String modificadoNombre1 = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2);

        System.out.println("Ingrese el segundo nombre de un familiar:");
        String nombre2 = scanner.nextLine();
        String modificadoNombre2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombre3 = scanner.nextLine();
        String modificadoNombre3 = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);

        String resultado = modificadoNombre1 + "_" + modificadoNombre2 + "_" + modificadoNombre3;

        System.out.println(resultado);


        /*String[] Familiares = args;
        final int numNombres = 3;

        if(args.length == numNombres) {
            for (int i = 0; i < args.length; i++) {
                String segundoCaracter = Familiares[i].substring(1, 2).toUpperCase();
                String nombreGenerado = segundoCaracter.concat(".").concat(Familiares[i].substring(Familiares[i].length()-2));
                StringBuilder nombresGeneradosFamiliares = new StringBuilder(nombreGenerado);
                System.out.println(nombresGeneradosFamiliares);
            }
        } else {
            System.out.println("Se debe introducir 3 argumentos.");
        }*/
    }
}
