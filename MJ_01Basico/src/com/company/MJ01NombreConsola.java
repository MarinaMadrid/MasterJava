package com.company;

public class MJ01NombreConsola {

    public static void main(String[] args) {
        //Forma sencilla
        System.out.println("Mi nombre es: Marina Madrid García");

        //Forma con variables
        String rotulo = "Mi nombre es: ";
        String nombre = "Marina ";
        String apellidos = "Madrid García";
        System.out.println(rotulo + nombre + apellidos);

        //Forma con concat()
        String mostrarNombre = rotulo.concat(nombre.concat(apellidos));
        System.out.println(mostrarNombre);
    }
}
