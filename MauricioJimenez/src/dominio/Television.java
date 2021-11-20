/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Mauricio Jimenez
 */
public class Television extends Electrodomestico {
    private double pulgadas = 20;
    private boolean sintonizador = false;

    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumo, double peso, double pulgadas, boolean sintonizador) {
        super(precioBase, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    
    
    // Gets
    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }
    
    
}
