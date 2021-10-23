/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author mauricio.jimenez
 */
public class Persona {
    String Nombre;
    String Apellido;
    int Edad;
    
    
    
    public void desplegarInfo() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + Edad + "\n");
    }
}
