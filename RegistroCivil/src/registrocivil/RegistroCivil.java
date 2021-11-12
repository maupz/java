/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocivil;

/**
 *
 * @author Mauricio Jimenez
 */
public class RegistroCivil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear primera persona
        
        Persona p1 = new Persona("Wario", 35, 'H');
        System.out.println(p1.toString());
    }
    
}
