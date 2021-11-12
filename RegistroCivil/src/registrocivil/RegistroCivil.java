/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocivil;

import java.util.Scanner;

/**
 *
 * @author Mauricio Jimenez
 */
public class RegistroCivil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("REGISTRO DE PERSONAS");
        
        // Pedir datos de primera persona
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        String nombre = consola.nextLine();
        System.out.println("Proporciona la edad: ");
        int edad = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el sexo: ");
        char sexo = Persona.comprobarSexo(consola.nextLine().charAt(0));
        int cedula = Persona.generaCedula();
        System.out.println("Proporciona el peso: ");
        double peso = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona la altura: ");
        double altura = Double.parseDouble(consola.nextLine());
        
        // Crear primera persona
        Persona p1 = new Persona(nombre, edad, sexo, cedula, peso, altura);
        p1.calcularIMC();
        p1.esMayorDeEdad();
        System.out.println(p1.toString());
        
        // Crear segunda persona
        Persona p2 = new Persona("Luigi", 30, 'H');
        p2.setCedula(Persona.generaCedula());
        p2.calcularIMC();
        p2.esMayorDeEdad();
        System.out.println(p2.toString());
        
        // Crear tercera persona 
        Persona p3 = new Persona();
        p3.setNombre("Peach");
        p3.setEdad(20);
        p3.setSexo('M');
        p3.setCedula(Persona.generaCedula());
        p3.setPeso(60);
        p3.setAltura(1.7);
        p3.calcularIMC();
        p3.esMayorDeEdad();
        System.out.println(p3.toString());
    }
    
}
