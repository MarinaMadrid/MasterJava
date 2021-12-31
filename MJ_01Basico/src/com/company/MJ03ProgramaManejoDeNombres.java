package com.company;

public class MJ03ProgramaManejoDeNombres {
    public static void main(String[] args) {

        String[] Familiares = args;
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
        }
    }
}
