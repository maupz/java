/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caja;

/**
 *
 * @author Mauricio Jimenez
 */
public class Caja {
    // Atributos
    private double alto = 0;
    private double ancho = 0;
    private double profundo = 0;
    // Constructor vacío
    public Caja() {
        System.out.println("Ejecutando constructor simple");
    }
    // Constructor con parámetros
    public Caja(double alto, double ancho, double profundo) {
        System.out.println("Ejecutando constructor con 3 atributos");
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    // Métodos
    public double calcularVolumen() {
        double volumen = this.alto * this.ancho * this.profundo;
        System.out.println("El volume de la caja es: " + volumen);
        return volumen;
    }
}
