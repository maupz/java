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
public class Carro {
    String Marca;
    String Modelo;
    int a_n;
    int kilometraje;
    
    
    
    public void desplegarInfo() {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Año: " + a_n);
        System.out.println("Kilometraje: " + kilometraje);
    }
}
