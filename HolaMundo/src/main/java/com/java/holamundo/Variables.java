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
        System.out.println("Variable Entera Original: " + variableEntera);
        // Modificar el valor de la variable
        variableEntera = 20;
        System.out.println("Variable Entera Modificada: " + variableEntera);
        String cadena = "Hola";
        System.out.println(cadena);
        String usuario = "Mauricio";
        String titulo = "Estudiante";
        String union = usuario + titulo;
        System.out.println("Union = " + union);
        
        int a= 8; int b= 3; int c=-5;
        int result12 = 2 * (a / 5 + (4 - b *3)) % (a + c - 2);
        System.out.println("Result 12 = " + result12);
        int result = a - b - c * 2;
        System.out.println("Result 13 = " + result);
        int result14 = (3 * a - 2 * b) % (2 * a - c);
        System.out.println("Result 14 = " + result14);
        int result15 =  a - b - c * 2;
        System.out.println("Result 15 = " + result15);
        
        String color;
        //System.out.println(color);
        //color = “Rojo”;

        String nombre = "Juan";
        System.out.println(nombre);
        nombre = "Carlos";
        System.out.println(nombre);
        
        // a = "A";
        //System.out.println(a);
        // a = "B";
        // System.out.println(b);
    }
}
