/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Mauricio Jimenez
 */

// Clase Lavadora hereda de Electrodomestico
public class Lavadora extends Electrodomestico{
    private double carga = 5;
    
    // Constructores
    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = carga;
    }

    public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }
    
    // Get 
    public double getCarga() {
        return carga;
    }
    
    // precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 , sino es así no se incrementara el precio. 
    // Llama al método padre y añade el código necesario. 
    // Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
    @Override
    public double precioFinal() {
        if (carga > 30) {
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }

    @Override
    public String toString() {
        return super.toString() + " Lavadora{" + "carga=" + carga + '}';
    }
    
}
