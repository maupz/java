/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mauriciojimenez;

import dominio.Electrodomestico;

/**
 *
 * @author Mauricio Jimenez
 */
public class PruebaElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Electrodomestico[] electrodomesticos;
        electrodomesticos = new Electrodomestico[3];
        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Electrodomestico(1000, "Negro", 'B', 10);
        electrodomesticos[2] = new Electrodomestico(2000, "Rojo", 'C', 20);
        
        for (int i=0; i < electrodomesticos.length; i++) {
            System.out.println("Electrodomestico #" + i + "= " + electrodomesticos[i].toString());
        }
        
    }
    
}
