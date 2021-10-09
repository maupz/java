/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Byte size
        byte numeroByte = 1;
        System.out.println("Valor Byte: " + numeroByte);
        System.out.println("Valor Mínimo de un BYTE: " + Byte.MIN_VALUE);
        System.out.println("Valor Máximo de un BYTE: " + Byte.MAX_VALUE);
        // Short size
        short numeroShort = 2;
        System.out.println("Valor Short: " + numeroShort);
        System.out.println("Valor Mínimo de un SHORT: " + Short.MIN_VALUE);
        System.out.println("Valor Máximo de un SHORT: " + Short.MAX_VALUE);
        // Int size
        int numeroInt = 100;
        System.out.println("Valor Integer: " + numeroInt);
        System.out.println("Valor Mínimo de un INT: " + Integer.MIN_VALUE);
        System.out.println("Valor Máximo de un INT: " + Integer.MAX_VALUE);
        // Long size
        long numeroLong = 1000;
        System.out.println("Valor Long: " + numeroLong);
        System.out.println("Valor Mínimo de un LONG: " + Long.MIN_VALUE);
        System.out.println("Valor Máximo de un LONG: " + Long.MAX_VALUE);
        // Float size
        float numeroFloat = 3.1416F;
        System.out.println("Valor Float: " + numeroFloat);
        System.out.println("Valor Mínimo de un FLOAT: " + Float.MIN_VALUE);
        System.out.println("Valor Máximo de un FLOAT: " + Float.MAX_VALUE);
        // Double size
        double numeroDouble = 2.7114;
        System.out.println("Valor Double: " + numeroDouble);
        System.out.println("Valor Mínimo de un DOUBLE: " + Double.MIN_VALUE);
        System.out.println("Valor Máximo de un DOUBLE: " + Double.MAX_VALUE);
        
        // Crear 3 Var
        // Asignar valores int, double, float y ver como los reconoce java
        var debugInt = 1;
        var debugDouble = 3.14;
        var debugFloat = 5.567223F;
        System.out.println("Debug int: " + debugInt);
        System.out.println("Debug double: " + debugDouble);
        System.out.println("Debug float: " + debugFloat);
        // Laboratorio 5
        Laboratorio5();        
    }

    private static void Laboratorio5() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduzca la edad: ");
        String edadString = consola.nextLine();
        var edadInt = Integer.parseInt(edadString);
        System.out.println("La edad es: " + edadInt);
    }
    
}
