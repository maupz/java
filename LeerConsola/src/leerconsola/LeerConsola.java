/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerconsola;

import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class LeerConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola = new Scanner(System.in);
        /*System.out.println("Proporciona el título: ");
        String titulo = consola.nextLine();
        System.out.println("Proporciona el autor: ");
        String autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
        */
        // Preg Examen 8
        /*int num1, num2;
        do {
            System.out.println("Proporciona el Número 1: ");
            num1 = Integer.parseInt(consola.nextLine());
            System.out.println("Proporciona el Número 2: ");
            num2 = Integer.parseInt(consola.nextLine());
        } while (num1 != num2);
        */
        // Preg 16 Examen
        /*int i=1, numero=0, suma=0, positivos=0, negativos=0;
        do {
            System.out.println("Proporciona el Número " + i);
            numero = Integer.parseInt(consola.nextLine());
            suma += numero;
            
            if (numero > 0) {positivos++;}
            else {negativos++;}
            
            i++;
        } while (i<=10);
        System.out.println("La suma es: " + suma);
        System.out.println("El número de positivos es: " + positivos);
        System.out.println("El número de negativos es: " + negativos);
        */
        // Preg 25 Examen
        double num;
        //do {
        System.out.println("Proporciona un número entre 0 y 10: ");
        num = Double.parseDouble(consola.nextLine());
        if (num >=9 && num <=10) {System.out.println("A");}
        else if(num >=8 && num < 9){System.out.println("B");}
        else if(num >=7 && num < 8){System.out.println("C");}
        else if(num >=6 && num < 7){System.out.println("D");}
        else if(num >=0 && num < 6){System.out.println("F");}
        else {System.out.println("Valor desconocido");}
        //} while (num != -1);
    }
    
}
