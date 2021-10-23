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
public class UsoPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.Nombre = "Luigi";
        persona1.Apellido = "Bros";
        persona1.Edad = 25;  
        
        persona1.desplegarInfo();
        
        Persona persona2 = new Persona();
        persona2.Nombre = "Mario";
        persona2.Apellido = "Bros";
        persona2.Edad = 28;  
        
        persona2.desplegarInfo();
        
        Persona persona3 = new Persona();
        persona3.Nombre = "Donkey";
        persona3.Apellido = "Kong";
        persona3.Edad = 20;  
        
        persona3.desplegarInfo();
    }
    
}
