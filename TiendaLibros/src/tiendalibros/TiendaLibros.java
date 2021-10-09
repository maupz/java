/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendalibros;

import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class TiendaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println(".:Tienda de Libros:.");
        // Leer nombre
        System.out.println("Proporciona el nombre: ");
        String nombre = consola.nextLine();
        // Leer ID
        System.out.println("Proporciona el ID: ");
        var id = Integer.parseInt(consola.nextLine());
        // Leer precio, extraer simbolo y valor
        System.out.println("Proporciona el precio: ");
        String precioString = consola.nextLine();
        var precioFloat = Float.parseFloat(precioString.replaceAll("[^\\d.]", ""));
        var simbolo = precioString.charAt(0);
        // Asignar envio gratuito
        System.out.println("Proporciona el envío gratuito: ");
        boolean envio = Boolean.valueOf(consola.nextLine());
        System.out.println("-> Nombre: " + nombre + " Id #" + id);
        System.out.println("-> Precio: " + simbolo + precioFloat);
        System.out.println("-> Envío gratis: " + envio);
    }
    
}
