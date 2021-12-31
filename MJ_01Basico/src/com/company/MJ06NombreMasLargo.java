package com.company;

import javax.swing.JOptionPane;

public class MJ06NombreMasLargo {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Escriba el primer nombre completo: ");
        String[] nombreSeparado1 = nombre1.split(" ");
        int longitudNombre1 = nombreSeparado1[0].length();

        String nombre2 = JOptionPane.showInputDialog("Escriba el segundo nombre completo: ");
        String[] nombreSeparado2 = nombre2.split(" ");
        int longitudNombre2 = nombreSeparado2[0].length();

        String nombre3 = JOptionPane.showInputDialog("Escriba el tercer nombre completo: ");
        String[] nombreSeparado3 = nombre3.split(" ");
        int longitudNombre3 = nombreSeparado3[0].length();

        if (longitudNombre1 > longitudNombre2) {
            JOptionPane.showMessageDialog(null, "El nombre más largo es: " + nombre1);
        } else if(longitudNombre2 > longitudNombre3) {
            JOptionPane.showMessageDialog(null, "El nombre más largo es: " + nombre2);
        } else {
            JOptionPane.showMessageDialog(null, "El nombre más largo es: " + nombre3);
        }
    }
}
