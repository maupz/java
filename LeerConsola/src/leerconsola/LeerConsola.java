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
        System.out.println("Proporciona el título: ");
        String titulo = consola.nextLine();
        System.out.println("Proporciona el autor: ");
        String autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
    
}
