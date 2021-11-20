/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglos2;

import dominio.Persona;

/**
 *
 * @author Mauricio Jimenez
 */
public class Arreglos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Lab 2
        String Nombres[] = {"Luigi", "Mario", "Toad" , "Peach"};
        for (int i=0; i < Nombres.length; i++) {
            System.out.println("Posicion " + i + "= " + Nombres[i]);
        }
        
        // Lab 3
        Persona personas[] ;
        personas = new Persona[2];
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");
        System.out.println(personas[0].toString());
        System.out.println(personas[1]);
        
        // Lab 4
        for (int i=0; i < personas.length; i++) {
            System.out.println("Persona #" + i + "= " + personas[i]);
        }
        // Arr frutas
        String[] frutas = {"Fresa", "Banano", "Uva"};
        for (int i=0; i < frutas.length; i++) {
            System.out.println("Fruta #" + i + "= " + frutas[i]);
        }
    }
    

}
