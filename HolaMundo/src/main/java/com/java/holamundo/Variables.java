/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.holamundo;

/**
 *
 * @author solid
 */
public class Variables {
    public static void main (String[] args) {
        int variableEntera = 10;
        System.out.println("Variable Entera Original" + variableEntera);
        // Modificar el valor de la variable
        variableEntera = 20;
        System.out.println("Variable Entera modificada" + variableEntera);
        String cadena = "Hola";
        System.out.println(cadena);
        String usuario = "Mauricio";
        String titulo = "Estudiante";
        String union = usuario + titulo;
        System.out.println("Union = " + union);
    }
}
